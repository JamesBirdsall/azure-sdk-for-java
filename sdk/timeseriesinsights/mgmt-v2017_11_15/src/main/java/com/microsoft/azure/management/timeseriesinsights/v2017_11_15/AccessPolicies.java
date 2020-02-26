/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.timeseriesinsights.v2017_11_15;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.implementation.AccessPoliciesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing AccessPolicies.
 */
public interface AccessPolicies extends SupportsCreating<AccessPolicyResource.DefinitionStages.Blank>, HasInner<AccessPoliciesInner> {
    /**
     * Lists all the available access policies associated with the environment.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AccessPolicyListResponse> listByEnvironmentAsync(String resourceGroupName, String environmentName);

    /**
     * Gets the access policy with the specified name in the specified environment.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource group.
     * @param accessPolicyName The name of the Time Series Insights access policy associated with the specified environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AccessPolicyResource> getAsync(String resourceGroupName, String environmentName, String accessPolicyName);

    /**
     * Deletes the access policy with the specified name in the specified subscription, resource group, and environment.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param environmentName The name of the Time Series Insights environment associated with the specified resource group.
     * @param accessPolicyName The name of the Time Series Insights access policy associated with the specified environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String environmentName, String accessPolicyName);

}
