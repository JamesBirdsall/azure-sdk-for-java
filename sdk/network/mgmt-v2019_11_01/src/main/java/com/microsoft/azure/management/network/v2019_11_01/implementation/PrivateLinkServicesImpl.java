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
import com.microsoft.azure.management.network.v2019_11_01.PrivateLinkServices;
import com.microsoft.azure.management.network.v2019_11_01.PrivateLinkService;
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
import com.microsoft.azure.management.network.v2019_11_01.PrivateEndpointConnection;
import com.microsoft.azure.management.network.v2019_11_01.PrivateLinkServiceVisibility;
import com.microsoft.azure.management.network.v2019_11_01.AutoApprovedPrivateLinkService;

class PrivateLinkServicesImpl extends GroupableResourcesCoreImpl<PrivateLinkService, PrivateLinkServiceImpl, PrivateLinkServiceInner, PrivateLinkServicesInner, NetworkManager>  implements PrivateLinkServices {
    protected PrivateLinkServicesImpl(NetworkManager manager) {
        super(manager.inner().privateLinkServices(), manager);
    }

    @Override
    protected Observable<PrivateLinkServiceInner> getInnerAsync(String resourceGroupName, String name) {
        PrivateLinkServicesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        PrivateLinkServicesInner client = this.inner();
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
    public PagedList<PrivateLinkService> listByResourceGroup(String resourceGroupName) {
        PrivateLinkServicesInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<PrivateLinkService> listByResourceGroupAsync(String resourceGroupName) {
        PrivateLinkServicesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<PrivateLinkServiceInner>, Iterable<PrivateLinkServiceInner>>() {
            @Override
            public Iterable<PrivateLinkServiceInner> call(Page<PrivateLinkServiceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PrivateLinkServiceInner, PrivateLinkService>() {
            @Override
            public PrivateLinkService call(PrivateLinkServiceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<PrivateLinkService> list() {
        PrivateLinkServicesInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<PrivateLinkService> listAsync() {
        PrivateLinkServicesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<PrivateLinkServiceInner>, Iterable<PrivateLinkServiceInner>>() {
            @Override
            public Iterable<PrivateLinkServiceInner> call(Page<PrivateLinkServiceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PrivateLinkServiceInner, PrivateLinkService>() {
            @Override
            public PrivateLinkService call(PrivateLinkServiceInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PrivateLinkServiceImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected PrivateLinkServiceImpl wrapModel(PrivateLinkServiceInner inner) {
        return  new PrivateLinkServiceImpl(inner.name(), inner, manager());
    }

    @Override
    protected PrivateLinkServiceImpl wrapModel(String name) {
        return new PrivateLinkServiceImpl(name, new PrivateLinkServiceInner(), this.manager());
    }

    private PrivateEndpointConnectionImpl wrapPrivateEndpointConnectionModel(PrivateEndpointConnectionInner inner) {
        return  new PrivateEndpointConnectionImpl(inner, manager());
    }

    private AutoApprovedPrivateLinkServiceImpl wrapAutoApprovedPrivateLinkServiceModel(AutoApprovedPrivateLinkServiceInner inner) {
        return  new AutoApprovedPrivateLinkServiceImpl(inner, manager());
    }

    private Observable<PrivateEndpointConnectionInner> getPrivateEndpointConnectionInnerUsingPrivateLinkServicesInnerAsync(String id) {
        String resourceGroupName = IdParsingUtils.getValueFromIdByName(id, "resourceGroups");
        String serviceName = IdParsingUtils.getValueFromIdByName(id, "privateLinkServices");
        String peConnectionName = IdParsingUtils.getValueFromIdByName(id, "privateEndpointConnections");
        PrivateLinkServicesInner client = this.inner();
        return client.getPrivateEndpointConnectionAsync(resourceGroupName, serviceName, peConnectionName);
    }

    @Override
    public Observable<PrivateEndpointConnection> getPrivateEndpointConnectionAsync(String resourceGroupName, String serviceName, String peConnectionName) {
        PrivateLinkServicesInner client = this.inner();
        return client.getPrivateEndpointConnectionAsync(resourceGroupName, serviceName, peConnectionName)
        .flatMap(new Func1<PrivateEndpointConnectionInner, Observable<PrivateEndpointConnection>>() {
            @Override
            public Observable<PrivateEndpointConnection> call(PrivateEndpointConnectionInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((PrivateEndpointConnection)wrapPrivateEndpointConnectionModel(inner));
                }
            }
       });
    }

    @Override
    public Observable<PrivateEndpointConnection> listPrivateEndpointConnectionsAsync(final String resourceGroupName, final String serviceName) {
        PrivateLinkServicesInner client = this.inner();
        return client.listPrivateEndpointConnectionsAsync(resourceGroupName, serviceName)
        .flatMapIterable(new Func1<Page<PrivateEndpointConnectionInner>, Iterable<PrivateEndpointConnectionInner>>() {
            @Override
            public Iterable<PrivateEndpointConnectionInner> call(Page<PrivateEndpointConnectionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PrivateEndpointConnectionInner, PrivateEndpointConnection>() {
            @Override
            public PrivateEndpointConnection call(PrivateEndpointConnectionInner inner) {
                return wrapPrivateEndpointConnectionModel(inner);
            }
        });
    }

    @Override
    public Completable deletePrivateEndpointConnectionAsync(String resourceGroupName, String serviceName, String peConnectionName) {
        PrivateLinkServicesInner client = this.inner();
        return client.deletePrivateEndpointConnectionAsync(resourceGroupName, serviceName, peConnectionName).toCompletable();
    }

    @Override
    public Observable<PrivateLinkServiceVisibility> checkPrivateLinkServiceVisibilityAsync(String location) {
        PrivateLinkServicesInner client = this.inner();
        return client.checkPrivateLinkServiceVisibilityAsync(location)
        .map(new Func1<PrivateLinkServiceVisibilityInner, PrivateLinkServiceVisibility>() {
            @Override
            public PrivateLinkServiceVisibility call(PrivateLinkServiceVisibilityInner inner) {
                return new PrivateLinkServiceVisibilityImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<PrivateLinkServiceVisibility> checkPrivateLinkServiceVisibilityByResourceGroupAsync(String location, String resourceGroupName) {
        PrivateLinkServicesInner client = this.inner();
        return client.checkPrivateLinkServiceVisibilityByResourceGroupAsync(location, resourceGroupName)
        .map(new Func1<PrivateLinkServiceVisibilityInner, PrivateLinkServiceVisibility>() {
            @Override
            public PrivateLinkServiceVisibility call(PrivateLinkServiceVisibilityInner inner) {
                return new PrivateLinkServiceVisibilityImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<AutoApprovedPrivateLinkService> listAutoApprovedPrivateLinkServicesAsync(final String location) {
        PrivateLinkServicesInner client = this.inner();
        return client.listAutoApprovedPrivateLinkServicesAsync(location)
        .flatMapIterable(new Func1<Page<AutoApprovedPrivateLinkServiceInner>, Iterable<AutoApprovedPrivateLinkServiceInner>>() {
            @Override
            public Iterable<AutoApprovedPrivateLinkServiceInner> call(Page<AutoApprovedPrivateLinkServiceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AutoApprovedPrivateLinkServiceInner, AutoApprovedPrivateLinkService>() {
            @Override
            public AutoApprovedPrivateLinkService call(AutoApprovedPrivateLinkServiceInner inner) {
                return wrapAutoApprovedPrivateLinkServiceModel(inner);
            }
        });
    }

    @Override
    public Observable<AutoApprovedPrivateLinkService> listAutoApprovedPrivateLinkServicesByResourceGroupAsync(final String location, final String resourceGroupName) {
        PrivateLinkServicesInner client = this.inner();
        return client.listAutoApprovedPrivateLinkServicesByResourceGroupAsync(location, resourceGroupName)
        .flatMapIterable(new Func1<Page<AutoApprovedPrivateLinkServiceInner>, Iterable<AutoApprovedPrivateLinkServiceInner>>() {
            @Override
            public Iterable<AutoApprovedPrivateLinkServiceInner> call(Page<AutoApprovedPrivateLinkServiceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AutoApprovedPrivateLinkServiceInner, AutoApprovedPrivateLinkService>() {
            @Override
            public AutoApprovedPrivateLinkService call(AutoApprovedPrivateLinkServiceInner inner) {
                return new AutoApprovedPrivateLinkServiceImpl(inner, manager());
            }
        });
    }

}
