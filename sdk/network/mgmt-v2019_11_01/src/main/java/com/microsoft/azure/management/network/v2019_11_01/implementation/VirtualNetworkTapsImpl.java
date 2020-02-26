/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.network.v2019_11_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.network.v2019_11_01.VirtualNetworkTaps;
import com.microsoft.azure.management.network.v2019_11_01.VirtualNetworkTap;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;

class VirtualNetworkTapsImpl extends GroupableResourcesCoreImpl<VirtualNetworkTap, VirtualNetworkTapImpl, VirtualNetworkTapInner, VirtualNetworkTapsInner, NetworkManager>  implements VirtualNetworkTaps {
    protected VirtualNetworkTapsImpl(NetworkManager manager) {
        super(manager.inner().virtualNetworkTaps(), manager);
    }

    @Override
    protected Observable<VirtualNetworkTapInner> getInnerAsync(String resourceGroupName, String name) {
        VirtualNetworkTapsInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        VirtualNetworkTapsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<VirtualNetworkTap> listByResourceGroup(String resourceGroupName) {
        VirtualNetworkTapsInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<VirtualNetworkTap> listByResourceGroupAsync(String resourceGroupName) {
        VirtualNetworkTapsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<VirtualNetworkTapInner>, Iterable<VirtualNetworkTapInner>>() {
            @Override
            public Iterable<VirtualNetworkTapInner> call(Page<VirtualNetworkTapInner> page) {
                return page.items();
            }
        })
        .map(new Func1<VirtualNetworkTapInner, VirtualNetworkTap>() {
            @Override
            public VirtualNetworkTap call(VirtualNetworkTapInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<VirtualNetworkTap> list() {
        VirtualNetworkTapsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<VirtualNetworkTap> listAsync() {
        VirtualNetworkTapsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<VirtualNetworkTapInner>, Iterable<VirtualNetworkTapInner>>() {
            @Override
            public Iterable<VirtualNetworkTapInner> call(Page<VirtualNetworkTapInner> page) {
                return page.items();
            }
        })
        .map(new Func1<VirtualNetworkTapInner, VirtualNetworkTap>() {
            @Override
            public VirtualNetworkTap call(VirtualNetworkTapInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public VirtualNetworkTapImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected VirtualNetworkTapImpl wrapModel(VirtualNetworkTapInner inner) {
        return  new VirtualNetworkTapImpl(inner.name(), inner, manager());
    }

    @Override
    protected VirtualNetworkTapImpl wrapModel(String name) {
        return new VirtualNetworkTapImpl(name, new VirtualNetworkTapInner(), this.manager());
    }

}
