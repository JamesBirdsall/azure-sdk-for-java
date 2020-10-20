/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_07_01.implementation;

import com.microsoft.azure.management.compute.v2019_07_01.LocationVirtualMachineSize;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;

class LocationVirtualMachineSizeImpl extends WrapperImpl<VirtualMachineSizeInner> implements LocationVirtualMachineSize {
    private final ComputeManager manager;

    LocationVirtualMachineSizeImpl(VirtualMachineSizeInner inner,  ComputeManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ComputeManager manager() {
        return this.manager;
    }



    @Override
    public Integer maxDataDiskCount() {
        return this.inner().maxDataDiskCount();
    }

    @Override
    public Integer memoryInMB() {
        return this.inner().memoryInMB();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Integer numberOfCores() {
        return this.inner().numberOfCores();
    }

    @Override
    public Integer osDiskSizeInMB() {
        return this.inner().osDiskSizeInMB();
    }

    @Override
    public Integer resourceDiskSizeInMB() {
        return this.inner().resourceDiskSizeInMB();
    }

}
