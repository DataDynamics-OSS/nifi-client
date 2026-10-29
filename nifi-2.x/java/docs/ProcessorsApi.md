# ProcessorsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analyzeConfiguration**](ProcessorsApi.md#analyzeConfiguration) | **POST** /processors/{id}/config/analysis | Performs analysis of the component&#x27;s configuration, providing information about which attributes are referenced.
[**clearBulletins**](ProcessorsApi.md#clearBulletins) | **POST** /processors/{id}/bulletins/clear-requests | Clears bulletins for a processor
[**clearState**](ProcessorsApi.md#clearState) | **POST** /processors/{id}/state/clear-requests | Clears the state for a processor
[**deleteBacklogRequest**](ProcessorsApi.md#deleteBacklogRequest) | **DELETE** /processors/{id}/backlog-requests/{requestId} | Deletes the Backlog Request with the given ID
[**deleteProcessor**](ProcessorsApi.md#deleteProcessor) | **DELETE** /processors/{id} | Deletes a processor
[**deleteVerificationRequest**](ProcessorsApi.md#deleteVerificationRequest) | **DELETE** /processors/{id}/config/verification-requests/{requestId} | Deletes the Verification Request with the given ID
[**getBacklogRequest**](ProcessorsApi.md#getBacklogRequest) | **GET** /processors/{id}/backlog-requests/{requestId} | Returns the Backlog Request with the given ID
[**getProcessor**](ProcessorsApi.md#getProcessor) | **GET** /processors/{id} | Gets a processor
[**getProcessorDiagnostics**](ProcessorsApi.md#getProcessorDiagnostics) | **GET** /processors/{id}/diagnostics | Gets diagnostics information about a processor
[**getProcessorRunStatusDetails**](ProcessorsApi.md#getProcessorRunStatusDetails) | **POST** /processors/run-status-details/queries | Submits a query to retrieve the run status details of all processors that are in the given list of Processor IDs
[**getPropertyDescriptor**](ProcessorsApi.md#getPropertyDescriptor) | **GET** /processors/{id}/descriptors | Gets the descriptor for a processor property
[**getState**](ProcessorsApi.md#getState) | **GET** /processors/{id}/state | Gets the state for a processor
[**getVerificationRequest**](ProcessorsApi.md#getVerificationRequest) | **GET** /processors/{id}/config/verification-requests/{requestId} | Returns the Verification Request with the given ID
[**submitProcessorBacklogRequest**](ProcessorsApi.md#submitProcessorBacklogRequest) | **POST** /processors/{id}/backlog-requests | Initiates a request to determine the current backlog for a processor that implements BacklogReportingProcessor
[**submitProcessorVerificationRequest**](ProcessorsApi.md#submitProcessorVerificationRequest) | **POST** /processors/{id}/config/verification-requests | Performs verification of the Processor&#x27;s configuration
[**terminateProcessor**](ProcessorsApi.md#terminateProcessor) | **DELETE** /processors/{id}/threads | Terminates a processor, essentially \&quot;deleting\&quot; its threads and any active tasks
[**updateProcessor**](ProcessorsApi.md#updateProcessor) | **PUT** /processors/{id} | Updates a processor
[**updateRunStatus**](ProcessorsApi.md#updateRunStatus) | **PUT** /processors/{id}/run-status | Updates run status of a processor

<a name="analyzeConfiguration"></a>
# **analyzeConfiguration**
> ConfigurationAnalysisEntity analyzeConfiguration(body, id)

Performs analysis of the component&#x27;s configuration, providing information about which attributes are referenced.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessorsApi apiInstance = new ProcessorsApi();
ConfigurationAnalysisEntity body = new ConfigurationAnalysisEntity(); // ConfigurationAnalysisEntity | The processor configuration analysis request.
String id = "id_example"; // String | The processor id.
try {
    ConfigurationAnalysisEntity result = apiInstance.analyzeConfiguration(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#analyzeConfiguration");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConfigurationAnalysisEntity**](ConfigurationAnalysisEntity.md)| The processor configuration analysis request. |
 **id** | **String**| The processor id. |

### Return type

[**ConfigurationAnalysisEntity**](ConfigurationAnalysisEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clearBulletins"></a>
# **clearBulletins**
> ClearBulletinsResultEntity clearBulletins(body, id)

Clears bulletins for a processor

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessorsApi apiInstance = new ProcessorsApi();
ClearBulletinsRequestEntity body = new ClearBulletinsRequestEntity(); // ClearBulletinsRequestEntity | The clear bulletin request specifying the timestamp from which to clear bulletins.
String id = "id_example"; // String | The processor id.
try {
    ClearBulletinsResultEntity result = apiInstance.clearBulletins(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#clearBulletins");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClearBulletinsRequestEntity**](ClearBulletinsRequestEntity.md)| The clear bulletin request specifying the timestamp from which to clear bulletins. |
 **id** | **String**| The processor id. |

### Return type

[**ClearBulletinsResultEntity**](ClearBulletinsResultEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clearState"></a>
# **clearState**
> ComponentStateEntity clearState(id, body)

Clears the state for a processor

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The processor id.
ComponentStateEntity body = new ComponentStateEntity(); // ComponentStateEntity | Optional component state to perform a selective key removal. If omitted, clears all state.
try {
    ComponentStateEntity result = apiInstance.clearState(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#clearState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |
 **body** | [**ComponentStateEntity**](ComponentStateEntity.md)| Optional component state to perform a selective key removal. If omitted, clears all state. | [optional]

### Return type

[**ComponentStateEntity**](ComponentStateEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: */*, application/json
 - **Accept**: application/json

<a name="deleteBacklogRequest"></a>
# **deleteBacklogRequest**
> BacklogRequestEntity deleteBacklogRequest(id, requestId)

Deletes the Backlog Request with the given ID

Deletes the Backlog Request with the given ID. After a request is created, it is expected that the client will properly clean up the request by DELETE&#x27;ing it once the backlog determination has completed. If the request is deleted before it completes, the background determination is cancelled.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The processor id.
String requestId = "requestId_example"; // String | The ID of the Backlog Request
try {
    BacklogRequestEntity result = apiInstance.deleteBacklogRequest(id, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#deleteBacklogRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |
 **requestId** | **String**| The ID of the Backlog Request |

### Return type

[**BacklogRequestEntity**](BacklogRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteProcessor"></a>
# **deleteProcessor**
> ProcessorEntity deleteProcessor(id, version, clientId, disconnectedNodeAcknowledged)

Deletes a processor

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The processor id.
Long version = 789L; // Long | The revision is used to verify the client is working with the latest version of the flow.
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
try {
    ProcessorEntity result = apiInstance.deleteProcessor(id, version, clientId, disconnectedNodeAcknowledged);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#deleteProcessor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |
 **version** | **Long**| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]
 **disconnectedNodeAcknowledged** | **Boolean**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteVerificationRequest"></a>
# **deleteVerificationRequest**
> VerifyConfigRequestEntity deleteVerificationRequest(id, requestId)

Deletes the Verification Request with the given ID

Deletes the Verification Request with the given ID. After a request is created, it is expected that the client will properly clean up the request by DELETE&#x27;ing it, once the Verification process has completed. If the request is deleted before the request completes, then the Verification request will finish the step that it is currently performing and then will cancel any subsequent steps.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The ID of the Processor
String requestId = "requestId_example"; // String | The ID of the Verification Request
try {
    VerifyConfigRequestEntity result = apiInstance.deleteVerificationRequest(id, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#deleteVerificationRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the Processor |
 **requestId** | **String**| The ID of the Verification Request |

### Return type

[**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBacklogRequest"></a>
# **getBacklogRequest**
> BacklogRequestEntity getBacklogRequest(id, requestId)

Returns the Backlog Request with the given ID

Returns the Backlog Request with the given ID. Once a Backlog Request has been created by performing a POST to /processors/{processorId}/backlog-requests, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and the backlog once the request is complete.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The processor id.
String requestId = "requestId_example"; // String | The ID of the Backlog Request
try {
    BacklogRequestEntity result = apiInstance.getBacklogRequest(id, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#getBacklogRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |
 **requestId** | **String**| The ID of the Backlog Request |

### Return type

[**BacklogRequestEntity**](BacklogRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProcessor"></a>
# **getProcessor**
> ProcessorEntity getProcessor(id)

Gets a processor

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The processor id.
try {
    ProcessorEntity result = apiInstance.getProcessor(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#getProcessor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProcessorDiagnostics"></a>
# **getProcessorDiagnostics**
> ProcessorEntity getProcessorDiagnostics(id)

Gets diagnostics information about a processor

Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The processor id.
try {
    ProcessorEntity result = apiInstance.getProcessorDiagnostics(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#getProcessorDiagnostics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProcessorRunStatusDetails"></a>
# **getProcessorRunStatusDetails**
> ProcessorsRunStatusDetailsEntity getProcessorRunStatusDetails(body)

Submits a query to retrieve the run status details of all processors that are in the given list of Processor IDs

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessorsApi apiInstance = new ProcessorsApi();
RunStatusDetailsRequestEntity body = new RunStatusDetailsRequestEntity(); // RunStatusDetailsRequestEntity | The request for the processors that should be included in the results
try {
    ProcessorsRunStatusDetailsEntity result = apiInstance.getProcessorRunStatusDetails(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#getProcessorRunStatusDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RunStatusDetailsRequestEntity**](RunStatusDetailsRequestEntity.md)| The request for the processors that should be included in the results | [optional]

### Return type

[**ProcessorsRunStatusDetailsEntity**](ProcessorsRunStatusDetailsEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: */*, application/json
 - **Accept**: application/json

<a name="getPropertyDescriptor"></a>
# **getPropertyDescriptor**
> PropertyDescriptorEntity getPropertyDescriptor(id, propertyName, clientId, sensitive)

Gets the descriptor for a processor property

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The processor id.
String propertyName = "propertyName_example"; // String | The property name.
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
Boolean sensitive = true; // Boolean | Property Descriptor requested sensitive status
try {
    PropertyDescriptorEntity result = apiInstance.getPropertyDescriptor(id, propertyName, clientId, sensitive);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#getPropertyDescriptor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |
 **propertyName** | **String**| The property name. |
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]
 **sensitive** | **Boolean**| Property Descriptor requested sensitive status | [optional]

### Return type

[**PropertyDescriptorEntity**](PropertyDescriptorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getState"></a>
# **getState**
> ComponentStateEntity getState(id)

Gets the state for a processor

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The processor id.
try {
    ComponentStateEntity result = apiInstance.getState(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#getState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |

### Return type

[**ComponentStateEntity**](ComponentStateEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVerificationRequest"></a>
# **getVerificationRequest**
> VerifyConfigRequestEntity getVerificationRequest(id, requestId)

Returns the Verification Request with the given ID

Returns the Verification Request with the given ID. Once an Verification Request has been created, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and any failures. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The ID of the Processor
String requestId = "requestId_example"; // String | The ID of the Verification Request
try {
    VerifyConfigRequestEntity result = apiInstance.getVerificationRequest(id, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#getVerificationRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the Processor |
 **requestId** | **String**| The ID of the Verification Request |

### Return type

[**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="submitProcessorBacklogRequest"></a>
# **submitProcessorBacklogRequest**
> BacklogRequestEntity submitProcessorBacklogRequest(id)

Initiates a request to determine the current backlog for a processor that implements BacklogReportingProcessor

This will initiate the process of determining the backlog for a Processor. This may be a long-running task. As a result, this endpoint will immediately return a BacklogRequestEntity, and the process of determining the backlog will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /processors/{processorId}/backlog-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /processors/{processorId}/backlog-requests/{requestId}.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The processor id.
try {
    BacklogRequestEntity result = apiInstance.submitProcessorBacklogRequest(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#submitProcessorBacklogRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |

### Return type

[**BacklogRequestEntity**](BacklogRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="submitProcessorVerificationRequest"></a>
# **submitProcessorVerificationRequest**
> VerifyConfigRequestEntity submitProcessorVerificationRequest(body, id)

Performs verification of the Processor&#x27;s configuration

This will initiate the process of verifying a given Processor configuration. This may be a long-running task. As a result, this endpoint will immediately return a ProcessorConfigVerificationRequestEntity, and the process of performing the verification will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /processors/{processorId}/verification-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /processors/{processorId}/verification-requests/{requestId}.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessorsApi apiInstance = new ProcessorsApi();
VerifyConfigRequestEntity body = new VerifyConfigRequestEntity(); // VerifyConfigRequestEntity | The processor configuration verification request.
String id = "id_example"; // String | The processor id.
try {
    VerifyConfigRequestEntity result = apiInstance.submitProcessorVerificationRequest(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#submitProcessorVerificationRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)| The processor configuration verification request. |
 **id** | **String**| The processor id. |

### Return type

[**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="terminateProcessor"></a>
# **terminateProcessor**
> ProcessorEntity terminateProcessor(id)

Terminates a processor, essentially \&quot;deleting\&quot; its threads and any active tasks

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The processor id.
try {
    ProcessorEntity result = apiInstance.terminateProcessor(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#terminateProcessor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateProcessor"></a>
# **updateProcessor**
> ProcessorEntity updateProcessor(body, id)

Updates a processor

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessorsApi apiInstance = new ProcessorsApi();
ProcessorEntity body = new ProcessorEntity(); // ProcessorEntity | The processor configuration details.
String id = "id_example"; // String | The processor id.
try {
    ProcessorEntity result = apiInstance.updateProcessor(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#updateProcessor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProcessorEntity**](ProcessorEntity.md)| The processor configuration details. |
 **id** | **String**| The processor id. |

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRunStatus"></a>
# **updateRunStatus**
> ProcessorEntity updateRunStatus(body, id)

Updates run status of a processor

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessorsApi apiInstance = new ProcessorsApi();
ProcessorRunStatusEntity body = new ProcessorRunStatusEntity(); // ProcessorRunStatusEntity | The processor run status.
String id = "id_example"; // String | The processor id.
try {
    ProcessorEntity result = apiInstance.updateRunStatus(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#updateRunStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProcessorRunStatusEntity**](ProcessorRunStatusEntity.md)| The processor run status. |
 **id** | **String**| The processor id. |

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

