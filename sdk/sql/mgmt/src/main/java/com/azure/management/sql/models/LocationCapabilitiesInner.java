// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.management.sql.CapabilityStatus;
import com.azure.management.sql.ManagedInstanceVersionCapability;
import com.azure.management.sql.ServerVersionCapability;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The LocationCapabilities model. */
@Fluent
public final class LocationCapabilitiesInner {
    /*
     * The location name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The list of supported server versions.
     */
    @JsonProperty(value = "supportedServerVersions", access = JsonProperty.Access.WRITE_ONLY)
    private List<ServerVersionCapability> supportedServerVersions;

    /*
     * The list of supported managed instance versions.
     */
    @JsonProperty(value = "supportedManagedInstanceVersions", access = JsonProperty.Access.WRITE_ONLY)
    private List<ManagedInstanceVersionCapability> supportedManagedInstanceVersions;

    /*
     * The status of the capability.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private CapabilityStatus status;

    /*
     * The reason for the capability not being available.
     */
    @JsonProperty(value = "reason")
    private String reason;

    /**
     * Get the name property: The location name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the supportedServerVersions property: The list of supported server versions.
     *
     * @return the supportedServerVersions value.
     */
    public List<ServerVersionCapability> supportedServerVersions() {
        return this.supportedServerVersions;
    }

    /**
     * Get the supportedManagedInstanceVersions property: The list of supported managed instance versions.
     *
     * @return the supportedManagedInstanceVersions value.
     */
    public List<ManagedInstanceVersionCapability> supportedManagedInstanceVersions() {
        return this.supportedManagedInstanceVersions;
    }

    /**
     * Get the status property: The status of the capability.
     *
     * @return the status value.
     */
    public CapabilityStatus status() {
        return this.status;
    }

    /**
     * Get the reason property: The reason for the capability not being available.
     *
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason property: The reason for the capability not being available.
     *
     * @param reason the reason value to set.
     * @return the LocationCapabilitiesInner object itself.
     */
    public LocationCapabilitiesInner withReason(String reason) {
        this.reason = reason;
        return this;
    }
}
