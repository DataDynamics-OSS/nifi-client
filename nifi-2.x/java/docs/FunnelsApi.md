# FunnelsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFunnel**](FunnelsApi.md#getFunnel) | **GET** /funnels/{id} | Gets a funnel
[**removeFunnel**](FunnelsApi.md#removeFunnel) | **DELETE** /funnels/{id} | Deletes a funnel
[**updateFunnel**](FunnelsApi.md#updateFunnel) | **PUT** /funnels/{id} | Updates a funnel

<a name="getFunnel"></a>
# **getFunnel**
> FunnelEntity getFunnel(id)

Gets a funnel

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.FunnelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


FunnelsApi apiInstance = new FunnelsApi();
String id = "id_example"; // String | The funnel id.
try {
    FunnelEntity result = apiInstance.getFunnel(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FunnelsApi#getFunnel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The funnel id. |

### Return type

[**FunnelEntity**](FunnelEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeFunnel"></a>
# **removeFunnel**
> FunnelEntity removeFunnel(id, version, clientId, disconnectedNodeAcknowledged)

Deletes a funnel

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.FunnelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


FunnelsApi apiInstance = new FunnelsApi();
String id = "id_example"; // String | The funnel id.
Long version = 789L; // Long | The revision is used to verify the client is working with the latest version of the flow.
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
try {
    FunnelEntity result = apiInstance.removeFunnel(id, version, clientId, disconnectedNodeAcknowledged);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FunnelsApi#removeFunnel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The funnel id. |
 **version** | **Long**| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]
 **disconnectedNodeAcknowledged** | **Boolean**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**FunnelEntity**](FunnelEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateFunnel"></a>
# **updateFunnel**
> FunnelEntity updateFunnel(body, id)

Updates a funnel

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.FunnelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


FunnelsApi apiInstance = new FunnelsApi();
FunnelEntity body = new FunnelEntity(); // FunnelEntity | The funnel configuration details.
String id = "id_example"; // String | The funnel id.
try {
    FunnelEntity result = apiInstance.updateFunnel(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FunnelsApi#updateFunnel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FunnelEntity**](FunnelEntity.md)| The funnel configuration details. |
 **id** | **String**| The funnel id. |

### Return type

[**FunnelEntity**](FunnelEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

