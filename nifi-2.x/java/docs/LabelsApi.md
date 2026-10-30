# LabelsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLabel**](LabelsApi.md#getLabel) | **GET** /labels/{id} | Gets a label
[**removeLabel**](LabelsApi.md#removeLabel) | **DELETE** /labels/{id} | Deletes a label
[**updateLabel**](LabelsApi.md#updateLabel) | **PUT** /labels/{id} | Updates a label

<a name="getLabel"></a>
# **getLabel**
> LabelEntity getLabel(id)

Gets a label

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.LabelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


LabelsApi apiInstance = new LabelsApi();
String id = "id_example"; // String | The label id.
try {
    LabelEntity result = apiInstance.getLabel(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LabelsApi#getLabel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The label id. |

### Return type

[**LabelEntity**](LabelEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeLabel"></a>
# **removeLabel**
> LabelEntity removeLabel(id, version, clientId, disconnectedNodeAcknowledged)

Deletes a label

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.LabelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


LabelsApi apiInstance = new LabelsApi();
String id = "id_example"; // String | The label id.
Long version = 789L; // Long | The revision is used to verify the client is working with the latest version of the flow.
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
try {
    LabelEntity result = apiInstance.removeLabel(id, version, clientId, disconnectedNodeAcknowledged);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LabelsApi#removeLabel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The label id. |
 **version** | **Long**| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]
 **disconnectedNodeAcknowledged** | **Boolean**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**LabelEntity**](LabelEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateLabel"></a>
# **updateLabel**
> LabelEntity updateLabel(body, id)

Updates a label

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.LabelsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


LabelsApi apiInstance = new LabelsApi();
LabelEntity body = new LabelEntity(); // LabelEntity | The label configuration details.
String id = "id_example"; // String | The label id.
try {
    LabelEntity result = apiInstance.updateLabel(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LabelsApi#updateLabel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LabelEntity**](LabelEntity.md)| The label configuration details. |
 **id** | **String**| The label id. |

### Return type

[**LabelEntity**](LabelEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

