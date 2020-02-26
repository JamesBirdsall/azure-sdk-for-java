/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Transformation for data flow sink.
 */
public class DataFlowSink extends Transformation {
    /**
     * Dataset reference.
     */
    @JsonProperty(value = "dataset")
    private DatasetReference dataset;

    /**
     * Get dataset reference.
     *
     * @return the dataset value
     */
    public DatasetReference dataset() {
        return this.dataset;
    }

    /**
     * Set dataset reference.
     *
     * @param dataset the dataset value to set
     * @return the DataFlowSink object itself.
     */
    public DataFlowSink withDataset(DatasetReference dataset) {
        this.dataset = dataset;
        return this;
    }

}
