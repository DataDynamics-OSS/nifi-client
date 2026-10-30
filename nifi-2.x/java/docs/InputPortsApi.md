# InputPortsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clearBulletins**](InputPortsApi.md#clearBulletins) | **POST** /input-ports/{id}/bulletins/clear-requests | Clears bulletins for an input port
[**getInputPort**](InputPortsApi.md#getInputPort) | **GET** /input-ports/{id} | Gets an input port
[**removeInputPort**](InputPortsApi.md#removeInputPort) | **DELETE** /input-ports/{id} | Deletes an input port
[**updateInputPort**](InputPortsApi.md#updateInputPort) | **PUT** /input-ports/{id} | Updates an input port
[**updateRunStatus**](InputPortsApi.md#updateRunStatus) | **PUT** /input-ports/{id}/run-status | Updates run status of an input-port

<a name="clearBulletins"></a>
# **clearBulletins**
> ClearBulletinsResultEntity clearBulletins(body, id)

Clears bulletins for an input port

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.InputPortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


InputPortsApi apiInstance = new InputPortsApi();
ClearBulletinsRequestEntity body = new ClearBulletinsRequestEntity(); // ClearBulletinsRequestEntity | The request to clear bulletins.
String id = "id_example"; // String | The input port id.
try {
    ClearBulletinsResultEntity result = apiInstance.clearBulletins(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InputPortsApi#clearBulletins");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClearBulletinsRequestEntity**](ClearBulletinsRequestEntity.md)| The request to clear bulletins. |
 **id** | **String**| The input port id. |

### Return type

[**ClearBulletinsResultEntity**](ClearBulletinsResultEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInputPort"></a>
# **getInputPort**
> PortEntity getInputPort(id)

Gets an input port

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.InputPortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


InputPortsApi apiInstance = new InputPortsApi();
String id = "id_example"; // String | The input port id.
try {
    PortEntity result = apiInstance.getInputPort(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InputPortsApi#getInputPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The input port id. |

### Return type

[**PortEntity**](PortEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeInputPort"></a>
# **removeInputPort**
> PortEntity removeInputPort(id, version, clientId, disconnectedNodeAcknowledged)

Deletes an input port

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.InputPortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


InputPortsApi apiInstance = new InputPortsApi();
String id = "id_example"; // String | The input port id.
Long version = 789L; // Long | The revision is used to verify the client is working with the latest version of the flow.
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
try {
    PortEntity result = apiInstance.removeInputPort(id, version, clientId, disconnectedNodeAcknowledged);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InputPortsApi#removeInputPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The input port id. |
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

<a name="updateInputPort"></a>
# **updateInputPort**
> PortEntity updateInputPort(body, id)

Updates an input port

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.InputPortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


InputPortsApi apiInstance = new InputPortsApi();
PortEntity body = new PortEntity(); // PortEntity | The input port configuration details.
String id = "id_example"; // String | The input port id.
try {
    PortEntity result = apiInstance.updateInputPort(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InputPortsApi#updateInputPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PortEntity**](PortEntity.md)| The input port configuration details. |
 **id** | **String**| The input port id. |

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

Updates run status of an input-port

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.InputPortsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


InputPortsApi apiInstance = new InputPortsApi();
PortRunStatusEntity body = new PortRunStatusEntity(); // PortRunStatusEntity | The port run status.
String id = "id_example"; // String | The port id.
try {
    ProcessorEntity result = apiInstance.updateRunStatus(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InputPortsApi#updateRunStatus");
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

