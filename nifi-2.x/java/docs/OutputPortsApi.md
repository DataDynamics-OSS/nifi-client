# OutputPortsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clearBulletins**](OutputPortsApi.md#clearBulletins) | **POST** /output-ports/{id}/bulletins/clear-requests | Clears bulletins for an output port
[**getOutputPort**](OutputPortsApi.md#getOutputPort) | **GET** /output-ports/{id} | Gets an output port
[**removeOutputPort**](OutputPortsApi.md#removeOutputPort) | **DELETE** /output-ports/{id} | Deletes an output port
[**updateOutputPort**](OutputPortsApi.md#updateOutputPort) | **PUT** /output-ports/{id} | Updates an output port
[**updateRunStatus**](OutputPortsApi.md#updateRunStatus) | **PUT** /output-ports/{id}/run-status | Updates run status of an output-port

<a name="clearBulletins"></a>
# **clearBulletins**
> ClearBulletinsResultEntity clearBulletins(body, id)

Clears bulletins for an output port

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OutputPortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


OutputPortsApi apiInstance = new OutputPortsApi();
ClearBulletinsRequestEntity body = new ClearBulletinsRequestEntity(); // ClearBulletinsRequestEntity | The request to clear bulletins.
String id = "id_example"; // String | The output port id.
try {
    ClearBulletinsResultEntity result = apiInstance.clearBulletins(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutputPortsApi#clearBulletins");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClearBulletinsRequestEntity**](ClearBulletinsRequestEntity.md)| The request to clear bulletins. |
 **id** | **String**| The output port id. |

### Return type

[**ClearBulletinsResultEntity**](ClearBulletinsResultEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getOutputPort"></a>
# **getOutputPort**
> PortEntity getOutputPort(id)

Gets an output port

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OutputPortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


OutputPortsApi apiInstance = new OutputPortsApi();
String id = "id_example"; // String | The output port id.
try {
    PortEntity result = apiInstance.getOutputPort(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutputPortsApi#getOutputPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The output port id. |

### Return type

[**PortEntity**](PortEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeOutputPort"></a>
# **removeOutputPort**
> PortEntity removeOutputPort(id, version, clientId, disconnectedNodeAcknowledged)

Deletes an output port

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OutputPortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


OutputPortsApi apiInstance = new OutputPortsApi();
String id = "id_example"; // String | The output port id.
Long version = 789L; // Long | The revision is used to verify the client is working with the latest version of the flow.
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
try {
    PortEntity result = apiInstance.removeOutputPort(id, version, clientId, disconnectedNodeAcknowledged);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutputPortsApi#removeOutputPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The output port id. |
 **version** | **Long**| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]
 **disconnectedNodeAcknowledged** | **Boolean**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**PortEntity**](PortEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateOutputPort"></a>
# **updateOutputPort**
> PortEntity updateOutputPort(body, id)

Updates an output port

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OutputPortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


OutputPortsApi apiInstance = new OutputPortsApi();
PortEntity body = new PortEntity(); // PortEntity | The output port configuration details.
String id = "id_example"; // String | The output port id.
try {
    PortEntity result = apiInstance.updateOutputPort(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutputPortsApi#updateOutputPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PortEntity**](PortEntity.md)| The output port configuration details. |
 **id** | **String**| The output port id. |

### Return type

[**PortEntity**](PortEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRunStatus"></a>
# **updateRunStatus**
> ProcessorEntity updateRunStatus(body, id)

Updates run status of an output-port

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OutputPortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


OutputPortsApi apiInstance = new OutputPortsApi();
PortRunStatusEntity body = new PortRunStatusEntity(); // PortRunStatusEntity | The port run status.
String id = "id_example"; // String | The port id.
try {
    ProcessorEntity result = apiInstance.updateRunStatus(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OutputPortsApi#updateRunStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PortRunStatusEntity**](PortRunStatusEntity.md)| The port run status. |
 **id** | **String**| The port id. |

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

