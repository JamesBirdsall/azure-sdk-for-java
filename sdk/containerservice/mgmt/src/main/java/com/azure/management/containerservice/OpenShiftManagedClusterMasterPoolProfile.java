// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerservice;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The OpenShiftManagedClusterMasterPoolProfile model. */
@Fluent
public final class OpenShiftManagedClusterMasterPoolProfile {
    /*
     * Unique name of the master pool profile in the context of the
     * subscription and resource group.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Number of masters (VMs) to host docker containers. The default value is
     * 3.
     */
    @JsonProperty(value = "count", required = true)
    private int count;

    /*
     * Size of agent VMs.
     */
    @JsonProperty(value = "vmSize", required = true)
    private OpenShiftContainerServiceVMSize vmSize;

    /*
     * Subnet CIDR for the peering.
     */
    @JsonProperty(value = "subnetCidr")
    private String subnetCidr;

    /*
     * OsType to be used to specify os type. Choose from Linux and Windows.
     * Default to Linux.
     */
    @JsonProperty(value = "osType")
    private OSType osType;

    /**
     * Get the name property: Unique name of the master pool profile in the context of the subscription and resource
     * group.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Unique name of the master pool profile in the context of the subscription and resource
     * group.
     *
     * @param name the name value to set.
     * @return the OpenShiftManagedClusterMasterPoolProfile object itself.
     */
    public OpenShiftManagedClusterMasterPoolProfile withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the count property: Number of masters (VMs) to host docker containers. The default value is 3.
     *
     * @return the count value.
     */
    public int count() {
        return this.count;
    }

    /**
     * Set the count property: Number of masters (VMs) to host docker containers. The default value is 3.
     *
     * @param count the count value to set.
     * @return the OpenShiftManagedClusterMasterPoolProfile object itself.
     */
    public OpenShiftManagedClusterMasterPoolProfile withCount(int count) {
        this.count = count;
        return this;
    }

    /**
     * Get the vmSize property: Size of agent VMs.
     *
     * @return the vmSize value.
     */
    public OpenShiftContainerServiceVMSize vmSize() {
        return this.vmSize;
    }

    /**
     * Set the vmSize property: Size of agent VMs.
     *
     * @param vmSize the vmSize value to set.
     * @return the OpenShiftManagedClusterMasterPoolProfile object itself.
     */
    public OpenShiftManagedClusterMasterPoolProfile withVmSize(OpenShiftContainerServiceVMSize vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Get the subnetCidr property: Subnet CIDR for the peering.
     *
     * @return the subnetCidr value.
     */
    public String subnetCidr() {
        return this.subnetCidr;
    }

    /**
     * Set the subnetCidr property: Subnet CIDR for the peering.
     *
     * @param subnetCidr the subnetCidr value to set.
     * @return the OpenShiftManagedClusterMasterPoolProfile object itself.
     */
    public OpenShiftManagedClusterMasterPoolProfile withSubnetCidr(String subnetCidr) {
        this.subnetCidr = subnetCidr;
        return this;
    }

    /**
     * Get the osType property: OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     *
     * @return the osType value.
     */
    public OSType osType() {
        return this.osType;
    }

    /**
     * Set the osType property: OsType to be used to specify os type. Choose from Linux and Windows. Default to Linux.
     *
     * @param osType the osType value to set.
     * @return the OpenShiftManagedClusterMasterPoolProfile object itself.
     */
    public OpenShiftManagedClusterMasterPoolProfile withOsType(OSType osType) {
        this.osType = osType;
        return this;
    }
}
