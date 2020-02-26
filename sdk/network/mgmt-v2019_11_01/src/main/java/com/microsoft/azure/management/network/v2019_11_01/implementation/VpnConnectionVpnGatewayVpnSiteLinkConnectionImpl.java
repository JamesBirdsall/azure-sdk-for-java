/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_11_01.implementation;

import com.microsoft.azure.management.network.v2019_11_01.VpnConnectionVpnGatewayVpnSiteLinkConnection;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.network.v2019_11_01.VpnConnectionStatus;
import java.util.List;
import com.microsoft.azure.management.network.v2019_11_01.IpsecPolicy;
import com.microsoft.azure.management.network.v2019_11_01.ProvisioningState;
import com.microsoft.azure.management.network.v2019_11_01.VirtualNetworkGatewayConnectionProtocol;
import com.microsoft.azure.SubResource;

class VpnConnectionVpnGatewayVpnSiteLinkConnectionImpl extends IndexableRefreshableWrapperImpl<VpnConnectionVpnGatewayVpnSiteLinkConnection, VpnSiteLinkConnectionInner> implements VpnConnectionVpnGatewayVpnSiteLinkConnection {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String gatewayName;
    private String connectionName;
    private String linkConnectionName;

    VpnConnectionVpnGatewayVpnSiteLinkConnectionImpl(VpnSiteLinkConnectionInner inner,  NetworkManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.gatewayName = IdParsingUtils.getValueFromIdByName(inner.id(), "vpnGateways");
        this.connectionName = IdParsingUtils.getValueFromIdByName(inner.id(), "vpnConnections");
        this.linkConnectionName = IdParsingUtils.getValueFromIdByName(inner.id(), "vpnLinkConnections");
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<VpnSiteLinkConnectionInner> getInnerAsync() {
        VpnSiteLinkConnectionsInner client = this.manager().inner().vpnSiteLinkConnections();
        return client.getAsync(this.resourceGroupName, this.gatewayName, this.connectionName, this.linkConnectionName);
    }



    @Override
    public Integer connectionBandwidth() {
        return this.inner().connectionBandwidth();
    }

    @Override
    public VpnConnectionStatus connectionStatus() {
        return this.inner().connectionStatus();
    }

    @Override
    public Long egressBytesTransferred() {
        return this.inner().egressBytesTransferred();
    }

    @Override
    public Boolean enableBgp() {
        return this.inner().enableBgp();
    }

    @Override
    public Boolean enableRateLimiting() {
        return this.inner().enableRateLimiting();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Long ingressBytesTransferred() {
        return this.inner().ingressBytesTransferred();
    }

    @Override
    public List<IpsecPolicy> ipsecPolicies() {
        return this.inner().ipsecPolicies();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public Integer routingWeight() {
        return this.inner().routingWeight();
    }

    @Override
    public String sharedKey() {
        return this.inner().sharedKey();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public Boolean useLocalAzureIpAddress() {
        return this.inner().useLocalAzureIpAddress();
    }

    @Override
    public Boolean usePolicyBasedTrafficSelectors() {
        return this.inner().usePolicyBasedTrafficSelectors();
    }

    @Override
    public VirtualNetworkGatewayConnectionProtocol vpnConnectionProtocolType() {
        return this.inner().vpnConnectionProtocolType();
    }

    @Override
    public SubResource vpnSiteLink() {
        return this.inner().vpnSiteLink();
    }

}
