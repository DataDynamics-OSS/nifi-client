# SnippetsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSnippet**](SnippetsApi.md#createSnippet) | **POST** /snippets | Creates a snippet. The snippet will be automatically discarded if not used in a subsequent request after 1 minute.
[**deleteSnippet**](SnippetsApi.md#deleteSnippet) | **DELETE** /snippets/{id} | Deletes the components in a snippet and discards the snippet
[**updateSnippet**](SnippetsApi.md#updateSnippet) | **PUT** /snippets/{id} | Move&#x27;s the components in this Snippet into a new Process Group and discards the snippet

<a name="createSnippet"></a>
# **createSnippet**
> SnippetEntity createSnippet(body)

Creates a snippet. The snippet will be automatically discarded if not used in a subsequent request after 1 minute.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnippetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


SnippetsApi apiInstance = new SnippetsApi();
SnippetEntity body = new SnippetEntity(); // SnippetEntity | The snippet configuration details.
try {
    SnippetEntity result = apiInstance.createSnippet(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#createSnippet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SnippetEntity**](SnippetEntity.md)| The snippet configuration details. |

### Return type

[**SnippetEntity**](SnippetEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSnippet"></a>
# **deleteSnippet**
> SnippetEntity deleteSnippet(id, disconnectedNodeAcknowledged)

Deletes the components in a snippet and discards the snippet

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnippetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


SnippetsApi apiInstance = new SnippetsApi();
String id = "id_example"; // String | The snippet id.
Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
try {
    SnippetEntity result = apiInstance.deleteSnippet(id, disconnectedNodeAcknowledged);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#deleteSnippet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The snippet id. |
 **disconnectedNodeAcknowledged** | **Boolean**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**SnippetEntity**](SnippetEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateSnippet"></a>
# **updateSnippet**
> SnippetEntity updateSnippet(body, id)

Move&#x27;s the components in this Snippet into a new Process Group and discards the snippet

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnippetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


SnippetsApi apiInstance = new SnippetsApi();
SnippetEntity body = new SnippetEntity(); // SnippetEntity | The snippet configuration details.
String id = "id_example"; // String | The snippet id.
try {
    SnippetEntity result = apiInstance.updateSnippet(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnippetsApi#updateSnippet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SnippetEntity**](SnippetEntity.md)| The snippet configuration details. |
 **id** | **String**| The snippet id. |

### Return type

[**SnippetEntity**](SnippetEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

