/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation.SynapseManager;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation.IntegrationRuntimeNodeIpAddressInner;

/**
 * Type representing IntegrationRuntimeNodeIpAddress.
 */
public interface IntegrationRuntimeNodeIpAddress extends HasInner<IntegrationRuntimeNodeIpAddressInner>, HasManager<SynapseManager> {
    /**
     * @return the ipAddress value.
     */
    String ipAddress();

}
