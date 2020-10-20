/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_07_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in VirtualMachineRunCommands.
 */
public class VirtualMachineRunCommandsInner {
    /** The Retrofit service to perform REST calls. */
    private VirtualMachineRunCommandsService service;
    /** The service client containing this operation class. */
    private ComputeManagementClientImpl client;

    /**
     * Initializes an instance of VirtualMachineRunCommandsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public VirtualMachineRunCommandsInner(Retrofit retrofit, ComputeManagementClientImpl client) {
        this.service = retrofit.create(VirtualMachineRunCommandsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for VirtualMachineRunCommands to be
     * used by Retrofit to perform actually REST calls.
     */
    interface VirtualMachineRunCommandsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.v2019_07_01.VirtualMachineRunCommands list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/runCommands")
        Observable<Response<ResponseBody>> list(@Path("location") String location, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.v2019_07_01.VirtualMachineRunCommands get" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/runCommands/{commandId}")
        Observable<Response<ResponseBody>> get(@Path("location") String location, @Path("commandId") String commandId, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.v2019_07_01.VirtualMachineRunCommands listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists all available run commands for a subscription in a location.
     *
     * @param location The location upon which run commands is queried.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;RunCommandDocumentBaseInner&gt; object if successful.
     */
    public PagedList<RunCommandDocumentBaseInner> list(final String location) {
        ServiceResponse<Page<RunCommandDocumentBaseInner>> response = listSinglePageAsync(location).toBlocking().single();
        return new PagedList<RunCommandDocumentBaseInner>(response.body()) {
            @Override
            public Page<RunCommandDocumentBaseInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists all available run commands for a subscription in a location.
     *
     * @param location The location upon which run commands is queried.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<RunCommandDocumentBaseInner>> listAsync(final String location, final ListOperationCallback<RunCommandDocumentBaseInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(location),
            new Func1<String, Observable<ServiceResponse<Page<RunCommandDocumentBaseInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RunCommandDocumentBaseInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all available run commands for a subscription in a location.
     *
     * @param location The location upon which run commands is queried.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RunCommandDocumentBaseInner&gt; object
     */
    public Observable<Page<RunCommandDocumentBaseInner>> listAsync(final String location) {
        return listWithServiceResponseAsync(location)
            .map(new Func1<ServiceResponse<Page<RunCommandDocumentBaseInner>>, Page<RunCommandDocumentBaseInner>>() {
                @Override
                public Page<RunCommandDocumentBaseInner> call(ServiceResponse<Page<RunCommandDocumentBaseInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists all available run commands for a subscription in a location.
     *
     * @param location The location upon which run commands is queried.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RunCommandDocumentBaseInner&gt; object
     */
    public Observable<ServiceResponse<Page<RunCommandDocumentBaseInner>>> listWithServiceResponseAsync(final String location) {
        return listSinglePageAsync(location)
            .concatMap(new Func1<ServiceResponse<Page<RunCommandDocumentBaseInner>>, Observable<ServiceResponse<Page<RunCommandDocumentBaseInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RunCommandDocumentBaseInner>>> call(ServiceResponse<Page<RunCommandDocumentBaseInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all available run commands for a subscription in a location.
     *
    ServiceResponse<PageImpl1<RunCommandDocumentBaseInner>> * @param location The location upon which run commands is queried.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;RunCommandDocumentBaseInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<RunCommandDocumentBaseInner>>> listSinglePageAsync(final String location) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2019-07-01";
        return service.list(location, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<RunCommandDocumentBaseInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RunCommandDocumentBaseInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<RunCommandDocumentBaseInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<RunCommandDocumentBaseInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<RunCommandDocumentBaseInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<RunCommandDocumentBaseInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<RunCommandDocumentBaseInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets specific run command for a subscription in a location.
     *
     * @param location The location upon which run commands is queried.
     * @param commandId The command id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RunCommandDocumentInner object if successful.
     */
    public RunCommandDocumentInner get(String location, String commandId) {
        return getWithServiceResponseAsync(location, commandId).toBlocking().single().body();
    }

    /**
     * Gets specific run command for a subscription in a location.
     *
     * @param location The location upon which run commands is queried.
     * @param commandId The command id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RunCommandDocumentInner> getAsync(String location, String commandId, final ServiceCallback<RunCommandDocumentInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(location, commandId), serviceCallback);
    }

    /**
     * Gets specific run command for a subscription in a location.
     *
     * @param location The location upon which run commands is queried.
     * @param commandId The command id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RunCommandDocumentInner object
     */
    public Observable<RunCommandDocumentInner> getAsync(String location, String commandId) {
        return getWithServiceResponseAsync(location, commandId).map(new Func1<ServiceResponse<RunCommandDocumentInner>, RunCommandDocumentInner>() {
            @Override
            public RunCommandDocumentInner call(ServiceResponse<RunCommandDocumentInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets specific run command for a subscription in a location.
     *
     * @param location The location upon which run commands is queried.
     * @param commandId The command id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RunCommandDocumentInner object
     */
    public Observable<ServiceResponse<RunCommandDocumentInner>> getWithServiceResponseAsync(String location, String commandId) {
        if (location == null) {
            throw new IllegalArgumentException("Parameter location is required and cannot be null.");
        }
        if (commandId == null) {
            throw new IllegalArgumentException("Parameter commandId is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2019-07-01";
        return service.get(location, commandId, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RunCommandDocumentInner>>>() {
                @Override
                public Observable<ServiceResponse<RunCommandDocumentInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RunCommandDocumentInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RunCommandDocumentInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RunCommandDocumentInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RunCommandDocumentInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Lists all available run commands for a subscription in a location.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;RunCommandDocumentBaseInner&gt; object if successful.
     */
    public PagedList<RunCommandDocumentBaseInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<RunCommandDocumentBaseInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<RunCommandDocumentBaseInner>(response.body()) {
            @Override
            public Page<RunCommandDocumentBaseInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists all available run commands for a subscription in a location.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<RunCommandDocumentBaseInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<RunCommandDocumentBaseInner>> serviceFuture, final ListOperationCallback<RunCommandDocumentBaseInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<RunCommandDocumentBaseInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RunCommandDocumentBaseInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all available run commands for a subscription in a location.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RunCommandDocumentBaseInner&gt; object
     */
    public Observable<Page<RunCommandDocumentBaseInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<RunCommandDocumentBaseInner>>, Page<RunCommandDocumentBaseInner>>() {
                @Override
                public Page<RunCommandDocumentBaseInner> call(ServiceResponse<Page<RunCommandDocumentBaseInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists all available run commands for a subscription in a location.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;RunCommandDocumentBaseInner&gt; object
     */
    public Observable<ServiceResponse<Page<RunCommandDocumentBaseInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<RunCommandDocumentBaseInner>>, Observable<ServiceResponse<Page<RunCommandDocumentBaseInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RunCommandDocumentBaseInner>>> call(ServiceResponse<Page<RunCommandDocumentBaseInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all available run commands for a subscription in a location.
     *
    ServiceResponse<PageImpl1<RunCommandDocumentBaseInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;RunCommandDocumentBaseInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<RunCommandDocumentBaseInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<RunCommandDocumentBaseInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<RunCommandDocumentBaseInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<RunCommandDocumentBaseInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<RunCommandDocumentBaseInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<RunCommandDocumentBaseInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<RunCommandDocumentBaseInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<RunCommandDocumentBaseInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
