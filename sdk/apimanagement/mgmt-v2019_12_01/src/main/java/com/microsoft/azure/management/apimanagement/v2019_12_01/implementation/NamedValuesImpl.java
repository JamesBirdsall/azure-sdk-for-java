/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.apimanagement.v2019_12_01.NamedValues;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.apimanagement.v2019_12_01.NamedValueContract;
import com.microsoft.azure.management.apimanagement.v2019_12_01.PropertyValueContract;

class NamedValuesImpl extends WrapperImpl<NamedValuesInner> implements NamedValues {
    private final ApiManagementManager manager;

    NamedValuesImpl(ApiManagementManager manager) {
        super(manager.inner().namedValues());
        this.manager = manager;
    }

    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public NamedValueContractImpl define(String name) {
        return wrapModel(name);
    }

    private NamedValueContractImpl wrapModel(NamedValueContractInner inner) {
        return  new NamedValueContractImpl(inner, manager());
    }

    private NamedValueContractImpl wrapModel(String name) {
        return new NamedValueContractImpl(name, this.manager());
    }

    @Override
    public Observable<NamedValueContract> listByServiceAsync(final String resourceGroupName, final String serviceName) {
        NamedValuesInner client = this.inner();
        return client.listByServiceAsync(resourceGroupName, serviceName)
        .flatMapIterable(new Func1<Page<NamedValueContractInner>, Iterable<NamedValueContractInner>>() {
            @Override
            public Iterable<NamedValueContractInner> call(Page<NamedValueContractInner> page) {
                return page.items();
            }
        })
        .map(new Func1<NamedValueContractInner, NamedValueContract>() {
            @Override
            public NamedValueContract call(NamedValueContractInner inner) {
                return new NamedValueContractImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable getEntityTagAsync(String resourceGroupName, String serviceName, String namedValueId) {
        NamedValuesInner client = this.inner();
        return client.getEntityTagAsync(resourceGroupName, serviceName, namedValueId).toCompletable();
    }

    @Override
    public Observable<NamedValueContract> getAsync(String resourceGroupName, String serviceName, String namedValueId) {
        NamedValuesInner client = this.inner();
        return client.getAsync(resourceGroupName, serviceName, namedValueId)
        .map(new Func1<NamedValueContractInner, NamedValueContract>() {
            @Override
            public NamedValueContract call(NamedValueContractInner inner) {
                return new NamedValueContractImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serviceName, String namedValueId, String ifMatch) {
        NamedValuesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serviceName, namedValueId, ifMatch).toCompletable();
    }

    @Override
    public Observable<PropertyValueContract> listValueAsync(String resourceGroupName, String serviceName, String namedValueId) {
        NamedValuesInner client = this.inner();
        return client.listValueAsync(resourceGroupName, serviceName, namedValueId)
        .map(new Func1<PropertyValueContractInner, PropertyValueContract>() {
            @Override
            public PropertyValueContract call(PropertyValueContractInner inner) {
                return new PropertyValueContractImpl(inner, manager());
            }
        });
    }

}
