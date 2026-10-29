# CountersApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCounters**](CountersApi.md#getCounters) | **GET** /counters | Gets the current counters for this NiFi
[**updateAllCounters**](CountersApi.md#updateAllCounters) | **PUT** /counters | Updates all counters. This will reset all counter values to 0
[**updateCounter**](CountersApi.md#updateCounter) | **PUT** /counters/{id} | Updates the specified counter. This will reset the counter value to 0

<a name="getCounters"></a>
# **getCounters**
> CountersEntity getCounters(nodewise, clusterNodeId)

Gets the current counters for this NiFi

Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CountersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


CountersApi apiInstance = new CountersApi();
Boolean nodewise = false; // Boolean | Whether or not to include the breakdown per node. Optional, defaults to false
String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where to get the status.
try {
    CountersEntity result = apiInstance.getCounters(nodewise, clusterNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CountersApi#getCounters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodewise** | **Boolean**| Whether or not to include the breakdown per node. Optional, defaults to false | [optional] [default to false]
 **clusterNodeId** | **String**| The id of the node where to get the status. | [optional]

### Return type

[**CountersEntity**](CountersEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateAllCounters"></a>
# **updateAllCounters**
> CountersEntity updateAllCounters()

Updates all counters. This will reset all counter values to 0

Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CountersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


CountersApi apiInstance = new CountersApi();
try {
    CountersEntity result = apiInstance.updateAllCounters();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CountersApi#updateAllCounters");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CountersEntity**](CountersEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCounter"></a>
# **updateCounter**
> CounterEntity updateCounter(id)

Updates the specified counter. This will reset the counter value to 0

Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CountersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


CountersApi apiInstance = new CountersApi();
String id = "id_example"; // String | The id of the counter.
try {
    CounterEntity result = apiInstance.updateCounter(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CountersApi#updateCounter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The id of the counter. |

### Return type

[**CounterEntity**](CounterEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

