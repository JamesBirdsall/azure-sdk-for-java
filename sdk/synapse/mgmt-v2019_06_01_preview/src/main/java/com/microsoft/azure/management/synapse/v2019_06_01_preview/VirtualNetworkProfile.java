/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Virtual Network Profile.
 */
public class VirtualNetworkProfile {
    /**
     * Subnet ID used for computes in workspace.
     */
    @JsonProperty(value = "computeSubnetId")
    private String computeSubnetId;

    /**
     * Get subnet ID used for computes in workspace.
     *
     * @return the computeSubnetId value
     */
    public String computeSubnetId() {
        return this.computeSubnetId;
    }

    /**
     * Set subnet ID used for computes in workspace.
     *
     * @param computeSubnetId the computeSubnetId value to set
     * @return the VirtualNetworkProfile object itself.
     */
    public VirtualNetworkProfile withComputeSubnetId(String computeSubnetId) {
        this.computeSubnetId = computeSubnetId;
        return this;
    }

}
