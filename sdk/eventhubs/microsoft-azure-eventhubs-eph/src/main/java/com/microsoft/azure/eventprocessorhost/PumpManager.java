// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.microsoft.azure.eventprocessorhost;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.channels.SocketChannel;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentHashMap.KeySetView;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;


class PumpManager extends Closable implements BiConsumer<String, Integer> {
    private static final Logger TRACE_LOGGER = LoggerFactory.getLogger(PumpManager.class);
    protected final HostContext hostContext;
    protected PumpMap pumpStates;
    //protected ConcurrentHashMap<String, PartitionPump> pumpStates; // protected for testability

    PumpManager(HostContext hostContext, Closable parent) {
        super(parent);

        this.hostContext = hostContext;

        this.pumpStates = new PumpMap(); // ConcurrentHashMap<String, PartitionPump>();
    }

    public HashMap<String, List<SocketChannel>> getSocketsByPartition() {
        HashMap<String, List<SocketChannel>> socketMap = new HashMap<String, List<SocketChannel>>();

        for (Entry<String, PartitionPump> e : this.pumpStates.entrySet()) {
            socketMap.put(e.getKey(), e.getValue().getSockets());
        }

        return socketMap;
    }

    public void addPump(CompleteLease lease) {
        if (getIsClosingOrClosed()) {
            TRACE_LOGGER.info(this.hostContext.withHostAndPartition(lease, "Shutting down, not creating new pump"));
            return;
        }

        PartitionPump capturedPump = this.pumpStates.get(lease.getPartitionId()); // CONCURRENTHASHTABLE
        if (capturedPump != null) {
            // There already is a pump. This should never happen and it's not harmless if it does. If we get here,
            // it implies that the existing pump is a zombie which is not renewing its lease.
            TRACE_LOGGER.error(this.hostContext.withHostAndPartition(lease, "throwing away zombie pump"));
            // Shutdown should remove the pump from the hashmap, but we don't know what state this pump is in so
            // remove it manually. ConcurrentHashMap specifies that removing an item that doesn't exist is a safe no-op.
            this.pumpStates.remove(lease.getPartitionId(), capturedPump.getSerial());
            // Call shutdown to try to clean up, but do not wait.
            capturedPump.shutdown(CloseReason.Shutdown);
        }

        TRACE_LOGGER.info(this.hostContext.withHostAndPartition(lease, "creating new pump"));
        PartitionPump newPartitionPump = createNewPump(lease);
        this.pumpStates.put(lease.getPartitionId(), newPartitionPump);
        newPartitionPump.startPump();
    }

    // Callback used by pumps during pump shutdown. 
    @Override
    public void accept(String partitionId, Integer serial) {
        // These are fast, non-blocking actions.
        this.pumpStates.remove(partitionId, serial);
        removingPumpTestHook(partitionId);
    }

    // Separated out so that tests can override and substitute their own pump class.
    protected PartitionPump createNewPump(CompleteLease lease) {
        return new PartitionPump(this.hostContext, lease, this, this);
    }

    public CompletableFuture<Void> removePump(String partitionId, final CloseReason reason) {
        CompletableFuture<Void> retval = CompletableFuture.completedFuture(null);
        PartitionPump capturedPump = this.pumpStates.get(partitionId); // CONCURRENTHASHTABLE
        if (capturedPump != null) {
            TRACE_LOGGER.info(this.hostContext.withHostAndPartition(partitionId,
                    "closing pump for reason " + reason.toString()));
            retval = capturedPump.shutdown(reason);
        } else {
            // Shouldn't get here but not really harmful, so just trace.
            TRACE_LOGGER.debug(this.hostContext.withHostAndPartition(partitionId,
                    "no pump found to remove for partition " + partitionId));
        }
        return retval;
    }

    public CompletableFuture<Void> removeAllPumps(CloseReason reason) {
        setClosing();

        CompletableFuture<?>[] futures = new CompletableFuture<?>[this.pumpStates.size()];
        int i = 0;
        for (String partitionId : this.pumpStates.keySet()) {
            futures[i++] = removePump(partitionId, reason);
        }

        return CompletableFuture.allOf(futures).whenCompleteAsync((empty, e) -> {
            setClosed();
        }, this.hostContext.getExecutor());
    }

    protected void removingPumpTestHook(String partitionId) {
        // For test use. MUST BE FAST, NON-BLOCKING.
    }

    static protected class PumpMap {
        private static AtomicInteger serial = new AtomicInteger(0);
        private final ConcurrentHashMap<String, PartitionPump> pumps = new ConcurrentHashMap<String, PartitionPump>();

        public PartitionPump get(final String partitionId) {
            return this.pumps.get(partitionId);
        }

        public int size() {
            return this.pumps.size();
        }

        public Set<Entry<String, PartitionPump>> entrySet() {
            return this.pumps.entrySet();
        }

        public KeySetView<String, PartitionPump> keySet() {
            return this.pumps.keySet();
        }

        public PartitionPump put(final String partitionId, final PartitionPump pump) {
            pump.setSerial(PumpMap.serial.getAndIncrement());
            System.out.println("PLUGH adding partition: " + partitionId + " serial: " + pump.getSerial());
            return this.pumps.put(partitionId, pump);
        }

        public PartitionPump remove(final String partitionId, final int serial) {
            PartitionPump inMap = this.pumps.get(partitionId);
            if (inMap != null) {
                if (serial < inMap.getSerial()) {
                    // Avoid race: remove with lower serial number does not affect entry with higher serial number
                    System.out.println("PLUGH race avoided partition: " + partitionId + " serial: " + serial + " inmap serial: " + inMap.getSerial());
                    return null;
                } else {
                    System.out.println("PLUGH removing partition: " + partitionId + " serial: " + serial + " inmap serial: " + inMap.getSerial());
                }
            }
            return this.pumps.remove(partitionId);
        }
    }
}
