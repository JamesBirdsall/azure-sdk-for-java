/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_10_01.implementation;

import com.microsoft.azure.management.resources.v2019_10_01.ErrorResponse;
import com.microsoft.azure.management.resources.v2019_10_01.DeploymentPropertiesExtended;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information from validate template deployment response.
 */
public class DeploymentValidateResultInner {
    /**
     * The deployment validation error.
     */
    @JsonProperty(value = "error", access = JsonProperty.Access.WRITE_ONLY)
    private ErrorResponse error;

    /**
     * The template deployment properties.
     */
    @JsonProperty(value = "properties")
    private DeploymentPropertiesExtended properties;

    /**
     * Get the deployment validation error.
     *
     * @return the error value
     */
    public ErrorResponse error() {
        return this.error;
    }

    /**
     * Get the template deployment properties.
     *
     * @return the properties value
     */
    public DeploymentPropertiesExtended properties() {
        return this.properties;
    }

    /**
     * Set the template deployment properties.
     *
     * @param properties the properties value to set
     * @return the DeploymentValidateResultInner object itself.
     */
    public DeploymentValidateResultInner withProperties(DeploymentPropertiesExtended properties) {
        this.properties = properties;
        return this;
    }

}
