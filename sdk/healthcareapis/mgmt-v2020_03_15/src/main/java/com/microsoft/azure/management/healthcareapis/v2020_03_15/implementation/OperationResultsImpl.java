/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.healthcareapis.v2020_03_15.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.healthcareapis.v2020_03_15.OperationResults;
import rx.functions.Func1;
import rx.Observable;

class OperationResultsImpl extends WrapperImpl<OperationResultsInner> implements OperationResults {
    private final HealthcareApisManager manager;

    OperationResultsImpl(HealthcareApisManager manager) {
        super(manager.inner().operationResults());
        this.manager = manager;
    }

    public HealthcareApisManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Object> getAsync(String locationName, String operationResultId) {
        OperationResultsInner client = this.inner();
        return client.getAsync(locationName, operationResultId)
    ;}

}
