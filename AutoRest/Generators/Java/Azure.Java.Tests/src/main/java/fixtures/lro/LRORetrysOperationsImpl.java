/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.lro;

import com.google.common.reflect.TypeToken;
import com.microsoft.rest.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import fixtures.lro.models.Product;
import java.io.IOException;
import retrofit.Call;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in LRORetrysOperations.
 */
public final class LRORetrysOperationsImpl implements LRORetrysOperations {
    /** The Retrofit service to perform REST calls. */
    private LRORetrysService service;
    /** The service client containing this operation class. */
    private AutoRestLongRunningOperationTestService client;

    /**
     * Initializes an instance of LRORetrysOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public LRORetrysOperationsImpl(Retrofit retrofit, AutoRestLongRunningOperationTestService client) {
        this.service = retrofit.create(LRORetrysService.class);
        this.client = client;
    }

    /**
     * Long running put request, service returns a 500, then a 201 to the initial request, with an entity that contains ProvisioningState=’Creating’.  Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @param product Product to put
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Product object wrapped in ServiceResponse if successful.
     */
    public ServiceResponse<Product> put201CreatingSucceeded200(Product product) throws CloudException, IOException, InterruptedException {
        Response<ResponseBody> result = service.put201CreatingSucceeded200(product, this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPutOrPatchResult(result, new TypeToken<Product>() { }.getType());
    }

    /**
     * Long running put request, service returns a 500, then a 201 to the initial request, with an entity that contains ProvisioningState=’Creating’.  Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> put201CreatingSucceeded200Async(Product product, final ServiceCallback<Product> serviceCallback) {
        Call<ResponseBody> call = service.put201CreatingSucceeded200(product, this.client.getAcceptLanguage());
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onFailure(Throwable t) {
                serviceCallback.failure(t);
            }
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                client.getAzureClient().getPutOrPatchResultAsync(response, new TypeToken<Product>() { }.getType(), serviceCallback);
            }
        });
        return call;
    }

    /**
     * Long running put request, service returns a 500, then a 200 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status.
     *
     * @param product Product to put
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Product object wrapped in ServiceResponse if successful.
     */
    public ServiceResponse<Product> putAsyncRelativeRetrySucceeded(Product product) throws CloudException, IOException, InterruptedException {
        Response<ResponseBody> result = service.putAsyncRelativeRetrySucceeded(product, this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPutOrPatchResult(result, new TypeToken<Product>() { }.getType());
    }

    /**
     * Long running put request, service returns a 500, then a 200 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status.
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> putAsyncRelativeRetrySucceededAsync(Product product, final ServiceCallback<Product> serviceCallback) {
        Call<ResponseBody> call = service.putAsyncRelativeRetrySucceeded(product, this.client.getAcceptLanguage());
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onFailure(Throwable t) {
                serviceCallback.failure(t);
            }
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                client.getAzureClient().getPutOrPatchResultAsync(response, new TypeToken<Product>() { }.getType(), serviceCallback);
            }
        });
        return call;
    }

    /**
     * Long running delete request, service returns a 500, then a  202 to the initial request, with an entity that contains ProvisioningState=’Accepted’.  Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Product object wrapped in ServiceResponse if successful.
     */
    public ServiceResponse<Product> deleteProvisioning202Accepted200Succeeded() throws CloudException, IOException, InterruptedException {
        Response<ResponseBody> result = service.deleteProvisioning202Accepted200Succeeded(this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPostOrDeleteResult(result, new TypeToken<Product>() { }.getType());
    }

    /**
     * Long running delete request, service returns a 500, then a  202 to the initial request, with an entity that contains ProvisioningState=’Accepted’.  Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> deleteProvisioning202Accepted200SucceededAsync(final ServiceCallback<Product> serviceCallback) {
        Call<ResponseBody> call = service.deleteProvisioning202Accepted200Succeeded(this.client.getAcceptLanguage());
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onFailure(Throwable t) {
                serviceCallback.failure(t);
            }
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                client.getAzureClient().getPostOrDeleteResultAsync(response, new TypeToken<Product>() { }.getType(), serviceCallback);
            }
        });
        return call;
    }

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    public ServiceResponse<Void> delete202Retry200() throws CloudException, IOException, InterruptedException {
        Response<ResponseBody> result = service.delete202Retry200(this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPostOrDeleteResult(result, new TypeToken<Void>() { }.getType());
    }

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Polls return this value until the last poll returns a ‘200’ with ProvisioningState=’Succeeded’.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> delete202Retry200Async(final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.delete202Retry200(this.client.getAcceptLanguage());
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onFailure(Throwable t) {
                serviceCallback.failure(t);
            }
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                client.getAzureClient().getPostOrDeleteResultAsync(response, new TypeToken<Void>() { }.getType(), serviceCallback);
            }
        });
        return call;
    }

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    public ServiceResponse<Void> deleteAsyncRelativeRetrySucceeded() throws CloudException, IOException, InterruptedException {
        Response<ResponseBody> result = service.deleteAsyncRelativeRetrySucceeded(this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPostOrDeleteResult(result, new TypeToken<Void>() { }.getType());
    }

    /**
     * Long running delete request, service returns a 500, then a 202 to the initial request. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> deleteAsyncRelativeRetrySucceededAsync(final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.deleteAsyncRelativeRetrySucceeded(this.client.getAcceptLanguage());
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onFailure(Throwable t) {
                serviceCallback.failure(t);
            }
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                client.getAzureClient().getPostOrDeleteResultAsync(response, new TypeToken<Void>() { }.getType(), serviceCallback);
            }
        });
        return call;
    }

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with 'Location' and 'Retry-After' headers, Polls return a 200 with a response body after success.
     *
     * @param product Product to put
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    public ServiceResponse<Void> post202Retry200(Product product) throws CloudException, IOException, InterruptedException {
        Response<ResponseBody> result = service.post202Retry200(product, this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPostOrDeleteResult(result, new TypeToken<Void>() { }.getType());
    }

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with 'Location' and 'Retry-After' headers, Polls return a 200 with a response body after success.
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> post202Retry200Async(Product product, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.post202Retry200(product, this.client.getAcceptLanguage());
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onFailure(Throwable t) {
                serviceCallback.failure(t);
            }
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                client.getAzureClient().getPostOrDeleteResultAsync(response, new TypeToken<Void>() { }.getType(), serviceCallback);
            }
        });
        return call;
    }

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status.
     *
     * @param product Product to put
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    public ServiceResponse<Void> postAsyncRelativeRetrySucceeded(Product product) throws CloudException, IOException, InterruptedException {
        Response<ResponseBody> result = service.postAsyncRelativeRetrySucceeded(product, this.client.getAcceptLanguage()).execute();
        return client.getAzureClient().getPostOrDeleteResult(result, new TypeToken<Void>() { }.getType());
    }

    /**
     * Long running post request, service returns a 500, then a 202 to the initial request, with an entity that contains ProvisioningState=’Creating’. Poll the endpoint indicated in the Azure-AsyncOperation header for operation status.
     *
     * @param product Product to put
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> postAsyncRelativeRetrySucceededAsync(Product product, final ServiceCallback<Void> serviceCallback) {
        Call<ResponseBody> call = service.postAsyncRelativeRetrySucceeded(product, this.client.getAcceptLanguage());
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onFailure(Throwable t) {
                serviceCallback.failure(t);
            }
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                client.getAzureClient().getPostOrDeleteResultAsync(response, new TypeToken<Void>() { }.getType(), serviceCallback);
            }
        });
        return call;
    }

}
