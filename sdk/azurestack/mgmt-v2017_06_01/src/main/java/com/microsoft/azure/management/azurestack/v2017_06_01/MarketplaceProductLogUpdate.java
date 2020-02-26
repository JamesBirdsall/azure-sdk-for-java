/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azurestack.v2017_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Update details for product log.
 */
public class MarketplaceProductLogUpdate {
    /**
     * Operation to log.
     */
    @JsonProperty(value = "operation", access = JsonProperty.Access.WRITE_ONLY)
    private String operation;

    /**
     * Operation status to log.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /**
     * Error related to the operation.
     */
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private String error;

    /**
     * Error details related to operation.
     */
    @JsonProperty(value = "details", access = JsonProperty.Access.WRITE_ONLY)
    private String details;

    /**
     * Get operation to log.
     *
     * @return the operation value
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Get operation status to log.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Get error related to the operation.
     *
     * @return the error value
     */
    public String error() {
        return this.error;
    }

    /**
     * Get error details related to operation.
     *
     * @return the details value
     */
    public String details() {
        return this.details;
    }

}
