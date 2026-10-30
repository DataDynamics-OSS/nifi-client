# DataTransferApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**commitInputPortTransaction**](DataTransferApi.md#commitInputPortTransaction) | **DELETE** /data-transfer/input-ports/{portId}/transactions/{transactionId} | Commit or cancel the specified transaction
[**commitOutputPortTransaction**](DataTransferApi.md#commitOutputPortTransaction) | **DELETE** /data-transfer/output-ports/{portId}/transactions/{transactionId} | Commit or cancel the specified transaction
[**createPortTransaction**](DataTransferApi.md#createPortTransaction) | **POST** /data-transfer/{portType}/{portId}/transactions | Create a transaction to the specified output port or input port
[**extendInputPortTransactionTTL**](DataTransferApi.md#extendInputPortTransactionTTL) | **PUT** /data-transfer/input-ports/{portId}/transactions/{transactionId} | Extend transaction TTL
[**extendOutputPortTransactionTTL**](DataTransferApi.md#extendOutputPortTransactionTTL) | **PUT** /data-transfer/output-ports/{portId}/transactions/{transactionId} | Extend transaction TTL
[**receiveFlowFiles**](DataTransferApi.md#receiveFlowFiles) | **POST** /data-transfer/input-ports/{portId}/transactions/{transactionId}/flow-files | Transfer FlowFiles to the input port
[**transferFlowFiles**](DataTransferApi.md#transferFlowFiles) | **GET** /data-transfer/output-ports/{portId}/transactions/{transactionId}/flow-files | Transfer FlowFiles from the output port

<a name="commitInputPortTransaction"></a>
# **commitInputPortTransaction**
> TransactionResultEntity commitInputPortTransaction(responseCode, portId, transactionId, body)

Commit or cancel the specified transaction

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.DataTransferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


DataTransferApi apiInstance = new DataTransferApi();
Integer responseCode = 56; // Integer | The response code. Available values are BAD_CHECKSUM(19), CONFIRM_TRANSACTION(12) or CANCEL_TRANSACTION(15).
String portId = "portId_example"; // String | The input port id.
String transactionId = "transactionId_example"; // String | The transaction id.
Object body = null; // Object | 
try {
    TransactionResultEntity result = apiInstance.commitInputPortTransaction(responseCode, portId, transactionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTransferApi#commitInputPortTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **responseCode** | **Integer**| The response code. Available values are BAD_CHECKSUM(19), CONFIRM_TRANSACTION(12) or CANCEL_TRANSACTION(15). |
 **portId** | **String**| The input port id. |
 **transactionId** | **String**| The transaction id. |
 **body** | [**Object**](Object.md)|  | [optional]

### Return type

[**TransactionResultEntity**](TransactionResultEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

<a name="commitOutputPortTransaction"></a>
# **commitOutputPortTransaction**
> TransactionResultEntity commitOutputPortTransaction(responseCode, checksum, portId, transactionId, body)

Commit or cancel the specified transaction

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.DataTransferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


DataTransferApi apiInstance = new DataTransferApi();
Integer responseCode = 56; // Integer | The response code. Available values are CONFIRM_TRANSACTION(12) or CANCEL_TRANSACTION(15).
String checksum = ""; // String | A checksum calculated at client side using CRC32 to check flow file content integrity. It must match with the value calculated at server side.
String portId = "portId_example"; // String | The output port id.
String transactionId = "transactionId_example"; // String | The transaction id.
Object body = null; // Object | 
try {
    TransactionResultEntity result = apiInstance.commitOutputPortTransaction(responseCode, checksum, portId, transactionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTransferApi#commitOutputPortTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **responseCode** | **Integer**| The response code. Available values are CONFIRM_TRANSACTION(12) or CANCEL_TRANSACTION(15). |
 **checksum** | **String**| A checksum calculated at client side using CRC32 to check flow file content integrity. It must match with the value calculated at server side. |
 **portId** | **String**| The output port id. |
 **transactionId** | **String**| The transaction id. |
 **body** | [**Object**](Object.md)|  | [optional]

### Return type

[**TransactionResultEntity**](TransactionResultEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

<a name="createPortTransaction"></a>
# **createPortTransaction**
> TransactionResultEntity createPortTransaction(portType, portId, body)

Create a transaction to the specified output port or input port

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.DataTransferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


DataTransferApi apiInstance = new DataTransferApi();
String portType = "portType_example"; // String | The port type.
String portId = "portId_example"; // String | The input or output port id.
Object body = null; // Object | 
try {
    TransactionResultEntity result = apiInstance.createPortTransaction(portType, portId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTransferApi#createPortTransaction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portType** | **String**| The port type. |
 **portId** | **String**| The input or output port id. |
 **body** | [**Object**](Object.md)|  | [optional]

### Return type

[**TransactionResultEntity**](TransactionResultEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="extendInputPortTransactionTTL"></a>
# **extendInputPortTransactionTTL**
> TransactionResultEntity extendInputPortTransactionTTL(portId, transactionId, body)

Extend transaction TTL

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.DataTransferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


DataTransferApi apiInstance = new DataTransferApi();
String portId = "portId_example"; // String | The input port id.
String transactionId = "transactionId_example"; // String | The transaction id.
Object body = null; // Object | 
try {
    TransactionResultEntity result = apiInstance.extendInputPortTransactionTTL(portId, transactionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTransferApi#extendInputPortTransactionTTL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portId** | **String**| The input port id. |
 **transactionId** | **String**| The transaction id. |
 **body** | [**Object**](Object.md)|  | [optional]

### Return type

[**TransactionResultEntity**](TransactionResultEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="extendOutputPortTransactionTTL"></a>
# **extendOutputPortTransactionTTL**
> TransactionResultEntity extendOutputPortTransactionTTL(portId, transactionId, body)

Extend transaction TTL

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.DataTransferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


DataTransferApi apiInstance = new DataTransferApi();
String portId = "portId_example"; // String | The output port id.
String transactionId = "transactionId_example"; // String | The transaction id.
Object body = null; // Object | 
try {
    TransactionResultEntity result = apiInstance.extendOutputPortTransactionTTL(portId, transactionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTransferApi#extendOutputPortTransactionTTL");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portId** | **String**| The output port id. |
 **transactionId** | **String**| The transaction id. |
 **body** | [**Object**](Object.md)|  | [optional]

### Return type

[**TransactionResultEntity**](TransactionResultEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

<a name="receiveFlowFiles"></a>
# **receiveFlowFiles**
> String receiveFlowFiles(portId, transactionId, body)

Transfer FlowFiles to the input port

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.DataTransferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


DataTransferApi apiInstance = new DataTransferApi();
String portId = "portId_example"; // String | The input port id.
String transactionId = "transactionId_example"; // String | The transaction id.
Object body = null; // Object | 
try {
    String result = apiInstance.receiveFlowFiles(portId, transactionId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTransferApi#receiveFlowFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portId** | **String**| The input port id. |
 **transactionId** | **String**| The transaction id. |
 **body** | [**Object**](Object.md)|  | [optional]

### Return type

**String**

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: text/plain

<a name="transferFlowFiles"></a>
# **transferFlowFiles**
> transferFlowFiles(portId, transactionId, body)

Transfer FlowFiles from the output port

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.DataTransferApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


DataTransferApi apiInstance = new DataTransferApi();
String portId = "portId_example"; // String | The output port id.
String transactionId = "transactionId_example"; // String | The transaction id.
Object body = null; // Object | 
try {
    apiInstance.transferFlowFiles(portId, transactionId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling DataTransferApi#transferFlowFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portId** | **String**| The output port id. |
 **transactionId** | **String**| The transaction id. |
 **body** | [**Object**](Object.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/octet-stream

