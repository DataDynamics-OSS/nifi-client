# FlowFileQueuesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDropRequest**](FlowFileQueuesApi.md#createDropRequest) | **POST** /flowfile-queues/{id}/drop-requests | Creates a request to drop the contents of the queue in this connection.
[**createFlowFileListing**](FlowFileQueuesApi.md#createFlowFileListing) | **POST** /flowfile-queues/{id}/listing-requests | Lists the contents of the queue in this connection.
[**deleteListingRequest**](FlowFileQueuesApi.md#deleteListingRequest) | **DELETE** /flowfile-queues/{id}/listing-requests/{listing-request-id} | Cancels and/or removes a request to list the contents of this connection.
[**downloadFlowFileContent**](FlowFileQueuesApi.md#downloadFlowFileContent) | **GET** /flowfile-queues/{id}/flowfiles/{flowfile-uuid}/content | Gets the content for a FlowFile in a Connection.
[**getDropRequest**](FlowFileQueuesApi.md#getDropRequest) | **GET** /flowfile-queues/{id}/drop-requests/{drop-request-id} | Gets the current status of a drop request for the specified connection.
[**getFlowFile**](FlowFileQueuesApi.md#getFlowFile) | **GET** /flowfile-queues/{id}/flowfiles/{flowfile-uuid} | Gets a FlowFile from a Connection.
[**getListingRequest**](FlowFileQueuesApi.md#getListingRequest) | **GET** /flowfile-queues/{id}/listing-requests/{listing-request-id} | Gets the current status of a listing request for the specified connection.
[**removeDropRequest**](FlowFileQueuesApi.md#removeDropRequest) | **DELETE** /flowfile-queues/{id}/drop-requests/{drop-request-id} | Cancels and/or removes a request to drop the contents of this connection.

<a name="createDropRequest"></a>
# **createDropRequest**
> DropRequestEntity createDropRequest(id)

Creates a request to drop the contents of the queue in this connection.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlowFileQueuesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


FlowFileQueuesApi apiInstance = new FlowFileQueuesApi();
String id = "id_example"; // String | The connection id.
try {
    DropRequestEntity result = apiInstance.createDropRequest(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowFileQueuesApi#createDropRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connection id. |

### Return type

[**DropRequestEntity**](DropRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createFlowFileListing"></a>
# **createFlowFileListing**
> ListingRequestEntity createFlowFileListing(id)

Lists the contents of the queue in this connection.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlowFileQueuesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


FlowFileQueuesApi apiInstance = new FlowFileQueuesApi();
String id = "id_example"; // String | The connection id.
try {
    ListingRequestEntity result = apiInstance.createFlowFileListing(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowFileQueuesApi#createFlowFileListing");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connection id. |

### Return type

[**ListingRequestEntity**](ListingRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteListingRequest"></a>
# **deleteListingRequest**
> ListingRequestEntity deleteListingRequest(id, listingRequestId)

Cancels and/or removes a request to list the contents of this connection.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlowFileQueuesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


FlowFileQueuesApi apiInstance = new FlowFileQueuesApi();
String id = "id_example"; // String | The connection id.
String listingRequestId = "listingRequestId_example"; // String | The listing request id.
try {
    ListingRequestEntity result = apiInstance.deleteListingRequest(id, listingRequestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowFileQueuesApi#deleteListingRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connection id. |
 **listingRequestId** | **String**| The listing request id. |

### Return type

[**ListingRequestEntity**](ListingRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="downloadFlowFileContent"></a>
# **downloadFlowFileContent**
> StreamingOutput downloadFlowFileContent(id, flowfileUuid, range, clientId, clusterNodeId)

Gets the content for a FlowFile in a Connection.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlowFileQueuesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


FlowFileQueuesApi apiInstance = new FlowFileQueuesApi();
String id = "id_example"; // String | The connection id.
String flowfileUuid = "flowfileUuid_example"; // String | The FlowFile uuid.
String range = "range_example"; // String | Range of bytes requested
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where the content exists if clustered.
try {
    StreamingOutput result = apiInstance.downloadFlowFileContent(id, flowfileUuid, range, clientId, clusterNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowFileQueuesApi#downloadFlowFileContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connection id. |
 **flowfileUuid** | **String**| The FlowFile uuid. |
 **range** | **String**| Range of bytes requested | [optional]
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]
 **clusterNodeId** | **String**| The id of the node where the content exists if clustered. | [optional]

### Return type

[**StreamingOutput**](StreamingOutput.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getDropRequest"></a>
# **getDropRequest**
> DropRequestEntity getDropRequest(id, dropRequestId)

Gets the current status of a drop request for the specified connection.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlowFileQueuesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


FlowFileQueuesApi apiInstance = new FlowFileQueuesApi();
String id = "id_example"; // String | The connection id.
String dropRequestId = "dropRequestId_example"; // String | The drop request id.
try {
    DropRequestEntity result = apiInstance.getDropRequest(id, dropRequestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowFileQueuesApi#getDropRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connection id. |
 **dropRequestId** | **String**| The drop request id. |

### Return type

[**DropRequestEntity**](DropRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFlowFile"></a>
# **getFlowFile**
> FlowFileEntity getFlowFile(id, flowfileUuid, clusterNodeId)

Gets a FlowFile from a Connection.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlowFileQueuesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


FlowFileQueuesApi apiInstance = new FlowFileQueuesApi();
String id = "id_example"; // String | The connection id.
String flowfileUuid = "flowfileUuid_example"; // String | The FlowFile uuid.
String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where the content exists if clustered.
try {
    FlowFileEntity result = apiInstance.getFlowFile(id, flowfileUuid, clusterNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowFileQueuesApi#getFlowFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connection id. |
 **flowfileUuid** | **String**| The FlowFile uuid. |
 **clusterNodeId** | **String**| The id of the node where the content exists if clustered. | [optional]

### Return type

[**FlowFileEntity**](FlowFileEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getListingRequest"></a>
# **getListingRequest**
> ListingRequestEntity getListingRequest(id, listingRequestId)

Gets the current status of a listing request for the specified connection.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlowFileQueuesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


FlowFileQueuesApi apiInstance = new FlowFileQueuesApi();
String id = "id_example"; // String | The connection id.
String listingRequestId = "listingRequestId_example"; // String | The listing request id.
try {
    ListingRequestEntity result = apiInstance.getListingRequest(id, listingRequestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowFileQueuesApi#getListingRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connection id. |
 **listingRequestId** | **String**| The listing request id. |

### Return type

[**ListingRequestEntity**](ListingRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeDropRequest"></a>
# **removeDropRequest**
> DropRequestEntity removeDropRequest(id, dropRequestId)

Cancels and/or removes a request to drop the contents of this connection.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FlowFileQueuesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


FlowFileQueuesApi apiInstance = new FlowFileQueuesApi();
String id = "id_example"; // String | The connection id.
String dropRequestId = "dropRequestId_example"; // String | The drop request id.
try {
    DropRequestEntity result = apiInstance.removeDropRequest(id, dropRequestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowFileQueuesApi#removeDropRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connection id. |
 **dropRequestId** | **String**| The drop request id. |

### Return type

[**DropRequestEntity**](DropRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

