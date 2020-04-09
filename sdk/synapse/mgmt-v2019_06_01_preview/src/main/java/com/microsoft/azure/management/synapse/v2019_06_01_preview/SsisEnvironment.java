/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Ssis environment.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = SsisEnvironment.class)
@JsonTypeName("Environment")
public class SsisEnvironment extends SsisObjectMetadata {
    /**
     * Folder id which contains environment.
     */
    @JsonProperty(value = "folderId")
    private Long folderId;

    /**
     * Variable in environment.
     */
    @JsonProperty(value = "variables")
    private List<SsisVariable> variables;

    /**
     * Get folder id which contains environment.
     *
     * @return the folderId value
     */
    public Long folderId() {
        return this.folderId;
    }

    /**
     * Set folder id which contains environment.
     *
     * @param folderId the folderId value to set
     * @return the SsisEnvironment object itself.
     */
    public SsisEnvironment withFolderId(Long folderId) {
        this.folderId = folderId;
        return this;
    }

    /**
     * Get variable in environment.
     *
     * @return the variables value
     */
    public List<SsisVariable> variables() {
        return this.variables;
    }

    /**
     * Set variable in environment.
     *
     * @param variables the variables value to set
     * @return the SsisEnvironment object itself.
     */
    public SsisEnvironment withVariables(List<SsisVariable> variables) {
        this.variables = variables;
        return this;
    }

}
