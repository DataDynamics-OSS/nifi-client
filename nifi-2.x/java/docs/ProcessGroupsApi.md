# ProcessGroupsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**copy**](ProcessGroupsApi.md#copy) | **POST** /process-groups/{id}/copy | Generates a copy response for the given copy request
[**copySnippet**](ProcessGroupsApi.md#copySnippet) | **POST** /process-groups/{id}/snippet-instance | Copies a snippet and discards it.
[**createConnection**](ProcessGroupsApi.md#createConnection) | **POST** /process-groups/{id}/connections | Creates a connection
[**createControllerService**](ProcessGroupsApi.md#createControllerService) | **POST** /process-groups/{id}/controller-services | Creates a new controller service
[**createEmptyAllConnectionsRequest**](ProcessGroupsApi.md#createEmptyAllConnectionsRequest) | **POST** /process-groups/{id}/empty-all-connections-requests | Creates a request to drop all FlowFiles of all connection queues in this process group.
[**createFunnel**](ProcessGroupsApi.md#createFunnel) | **POST** /process-groups/{id}/funnels | Creates a funnel
[**createInputPort**](ProcessGroupsApi.md#createInputPort) | **POST** /process-groups/{id}/input-ports | Creates an input port
[**createLabel**](ProcessGroupsApi.md#createLabel) | **POST** /process-groups/{id}/labels | Creates a label
[**createOutputPort**](ProcessGroupsApi.md#createOutputPort) | **POST** /process-groups/{id}/output-ports | Creates an output port
[**createProcessGroup**](ProcessGroupsApi.md#createProcessGroup) | **POST** /process-groups/{id}/process-groups | Creates a process group
[**createProcessor**](ProcessGroupsApi.md#createProcessor) | **POST** /process-groups/{id}/processors | Creates a new processor
[**createRemoteProcessGroup**](ProcessGroupsApi.md#createRemoteProcessGroup) | **POST** /process-groups/{id}/remote-process-groups | Creates a new process group
[**deleteReplaceProcessGroupRequest**](ProcessGroupsApi.md#deleteReplaceProcessGroupRequest) | **DELETE** /process-groups/replace-requests/{id} | Deletes the Replace Request with the given ID
[**exportProcessGroup**](ProcessGroupsApi.md#exportProcessGroup) | **GET** /process-groups/{id}/download | Gets a process group for download
[**getConnections**](ProcessGroupsApi.md#getConnections) | **GET** /process-groups/{id}/connections | Gets all connections
[**getDropAllFlowfilesRequest**](ProcessGroupsApi.md#getDropAllFlowfilesRequest) | **GET** /process-groups/{id}/empty-all-connections-requests/{drop-request-id} | Gets the current status of a drop all FlowFiles request.
[**getFunnels**](ProcessGroupsApi.md#getFunnels) | **GET** /process-groups/{id}/funnels | Gets all funnels
[**getInputPorts**](ProcessGroupsApi.md#getInputPorts) | **GET** /process-groups/{id}/input-ports | Gets all input ports
[**getLabels**](ProcessGroupsApi.md#getLabels) | **GET** /process-groups/{id}/labels | Gets all labels
[**getLocalModifications**](ProcessGroupsApi.md#getLocalModifications) | **GET** /process-groups/{id}/local-modifications | Gets a list of local modifications to the Process Group since it was last synchronized with the Flow Registry
[**getOutputPorts**](ProcessGroupsApi.md#getOutputPorts) | **GET** /process-groups/{id}/output-ports | Gets all output ports
[**getProcessGroup**](ProcessGroupsApi.md#getProcessGroup) | **GET** /process-groups/{id} | Gets a process group
[**getProcessGroups**](ProcessGroupsApi.md#getProcessGroups) | **GET** /process-groups/{id}/process-groups | Gets all process groups
[**getProcessors**](ProcessGroupsApi.md#getProcessors) | **GET** /process-groups/{id}/processors | Gets all processors
[**getRemoteProcessGroups**](ProcessGroupsApi.md#getRemoteProcessGroups) | **GET** /process-groups/{id}/remote-process-groups | Gets all remote process groups
[**getReplaceProcessGroupRequest**](ProcessGroupsApi.md#getReplaceProcessGroupRequest) | **GET** /process-groups/replace-requests/{id} | Returns the Replace Request with the given ID
[**importProcessGroup**](ProcessGroupsApi.md#importProcessGroup) | **POST** /process-groups/{id}/process-groups/import | Imports a specified process group
[**initiateReplaceProcessGroup**](ProcessGroupsApi.md#initiateReplaceProcessGroup) | **POST** /process-groups/{id}/replace-requests | Initiate the Replace Request of a Process Group with the given ID
[**paste**](ProcessGroupsApi.md#paste) | **PUT** /process-groups/{id}/paste | Pastes into the specified process group
[**removeDropRequest**](ProcessGroupsApi.md#removeDropRequest) | **DELETE** /process-groups/{id}/empty-all-connections-requests/{drop-request-id} | Cancels and/or removes a request to drop all FlowFiles.
[**removeProcessGroup**](ProcessGroupsApi.md#removeProcessGroup) | **DELETE** /process-groups/{id} | Deletes a process group
[**replaceProcessGroup**](ProcessGroupsApi.md#replaceProcessGroup) | **PUT** /process-groups/{id}/flow-contents | Replace Process Group contents with the given ID with the specified Process Group contents
[**updateProcessGroup**](ProcessGroupsApi.md#updateProcessGroup) | **PUT** /process-groups/{id} | Updates a process group
[**uploadProcessGroup**](ProcessGroupsApi.md#uploadProcessGroup) | **POST** /process-groups/{id}/process-groups/upload | Uploads a versioned flow definition and creates a process group

<a name="copy"></a>
# **copy**
> CopyResponseEntity copy(body, id)

Generates a copy response for the given copy request

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessGroupsApi apiInstance = new ProcessGroupsApi();
CopyRequestEntity body = new CopyRequestEntity(); // CopyRequestEntity | The request including the components to be copied from the specified Process Group.
String id = "id_example"; // String | The process group id.
try {
    CopyResponseEntity result = apiInstance.copy(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#copy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CopyRequestEntity**](CopyRequestEntity.md)| The request including the components to be copied from the specified Process Group. |
 **id** | **String**| The process group id. |

### Return type

[**CopyResponseEntity**](CopyResponseEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="copySnippet"></a>
# **copySnippet**
> FlowEntity copySnippet(body, id)

Copies a snippet and discards it.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessGroupsApi apiInstance = new ProcessGroupsApi();
CopySnippetRequestEntity body = new CopySnippetRequestEntity(); // CopySnippetRequestEntity | The copy snippet request.
String id = "id_example"; // String | The process group id.
try {
    FlowEntity result = apiInstance.copySnippet(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#copySnippet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CopySnippetRequestEntity**](CopySnippetRequestEntity.md)| The copy snippet request. |
 **id** | **String**| The process group id. |

### Return type

[**FlowEntity**](FlowEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createConnection"></a>
# **createConnection**
> ConnectionEntity createConnection(body, id)

Creates a connection

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessGroupsApi apiInstance = new ProcessGroupsApi();
ConnectionEntity body = new ConnectionEntity(); // ConnectionEntity | The connection configuration details.
String id = "id_example"; // String | The process group id.
try {
    ConnectionEntity result = apiInstance.createConnection(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#createConnection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConnectionEntity**](ConnectionEntity.md)| The connection configuration details. |
 **id** | **String**| The process group id. |

### Return type

[**ConnectionEntity**](ConnectionEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createControllerService"></a>
# **createControllerService**
> ControllerServiceEntity createControllerService(body, id)

Creates a new controller service

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessGroupsApi apiInstance = new ProcessGroupsApi();
ControllerServiceEntity body = new ControllerServiceEntity(); // ControllerServiceEntity | The controller service configuration details.
String id = "id_example"; // String | The process group id.
try {
    ControllerServiceEntity result = apiInstance.createControllerService(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#createControllerService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ControllerServiceEntity**](ControllerServiceEntity.md)| The controller service configuration details. |
 **id** | **String**| The process group id. |

### Return type

[**ControllerServiceEntity**](ControllerServiceEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createEmptyAllConnectionsRequest"></a>
# **createEmptyAllConnectionsRequest**
> DropRequestEntity createEmptyAllConnectionsRequest(id)

Creates a request to drop all FlowFiles of all connection queues in this process group.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
try {
    DropRequestEntity result = apiInstance.createEmptyAllConnectionsRequest(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#createEmptyAllConnectionsRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**DropRequestEntity**](DropRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createFunnel"></a>
# **createFunnel**
> FunnelEntity createFunnel(body, id)

Creates a funnel

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessGroupsApi apiInstance = new ProcessGroupsApi();
FunnelEntity body = new FunnelEntity(); // FunnelEntity | The funnel configuration details.
String id = "id_example"; // String | The process group id.
try {
    FunnelEntity result = apiInstance.createFunnel(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#createFunnel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FunnelEntity**](FunnelEntity.md)| The funnel configuration details. |
 **id** | **String**| The process group id. |

### Return type

[**FunnelEntity**](FunnelEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createInputPort"></a>
# **createInputPort**
> PortEntity createInputPort(body, id)

Creates an input port

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessGroupsApi apiInstance = new ProcessGroupsApi();
PortEntity body = new PortEntity(); // PortEntity | The input port configuration details.
String id = "id_example"; // String | The process group id.
try {
    PortEntity result = apiInstance.createInputPort(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#createInputPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PortEntity**](PortEntity.md)| The input port configuration details. |
 **id** | **String**| The process group id. |

### Return type

[**PortEntity**](PortEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createLabel"></a>
# **createLabel**
> LabelEntity createLabel(body, id)

Creates a label

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessGroupsApi apiInstance = new ProcessGroupsApi();
LabelEntity body = new LabelEntity(); // LabelEntity | The label configuration details.
String id = "id_example"; // String | The process group id.
try {
    LabelEntity result = apiInstance.createLabel(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#createLabel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LabelEntity**](LabelEntity.md)| The label configuration details. |
 **id** | **String**| The process group id. |

### Return type

[**LabelEntity**](LabelEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createOutputPort"></a>
# **createOutputPort**
> PortEntity createOutputPort(body, id)

Creates an output port

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessGroupsApi apiInstance = new ProcessGroupsApi();
PortEntity body = new PortEntity(); // PortEntity | The output port configuration.
String id = "id_example"; // String | The process group id.
try {
    PortEntity result = apiInstance.createOutputPort(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#createOutputPort");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PortEntity**](PortEntity.md)| The output port configuration. |
 **id** | **String**| The process group id. |

### Return type

[**PortEntity**](PortEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createProcessGroup"></a>
# **createProcessGroup**
> ProcessGroupEntity createProcessGroup(body, id, parameterContextHandlingStrategy)

Creates a process group

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessGroupsApi apiInstance = new ProcessGroupsApi();
ProcessGroupEntity body = new ProcessGroupEntity(); // ProcessGroupEntity | The process group configuration details.
String id = "id_example"; // String | The process group id.
String parameterContextHandlingStrategy = "KEEP_EXISTING"; // String | Handling Strategy controls whether to keep or replace Parameter Contexts
try {
    ProcessGroupEntity result = apiInstance.createProcessGroup(body, id, parameterContextHandlingStrategy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#createProcessGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProcessGroupEntity**](ProcessGroupEntity.md)| The process group configuration details. |
 **id** | **String**| The process group id. |
 **parameterContextHandlingStrategy** | **String**| Handling Strategy controls whether to keep or replace Parameter Contexts | [optional] [default to KEEP_EXISTING] [enum: KEEP_EXISTING, REPLACE]

### Return type

[**ProcessGroupEntity**](ProcessGroupEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createProcessor"></a>
# **createProcessor**
> ProcessorEntity createProcessor(body, id)

Creates a new processor

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessGroupsApi apiInstance = new ProcessGroupsApi();
ProcessorEntity body = new ProcessorEntity(); // ProcessorEntity | The processor configuration details.
String id = "id_example"; // String | The process group id.
try {
    ProcessorEntity result = apiInstance.createProcessor(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#createProcessor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProcessorEntity**](ProcessorEntity.md)| The processor configuration details. |
 **id** | **String**| The process group id. |

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRemoteProcessGroup"></a>
# **createRemoteProcessGroup**
> RemoteProcessGroupEntity createRemoteProcessGroup(body, id)

Creates a new process group

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessGroupsApi apiInstance = new ProcessGroupsApi();
RemoteProcessGroupEntity body = new RemoteProcessGroupEntity(); // RemoteProcessGroupEntity | The remote process group configuration details.
String id = "id_example"; // String | The process group id.
try {
    RemoteProcessGroupEntity result = apiInstance.createRemoteProcessGroup(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#createRemoteProcessGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RemoteProcessGroupEntity**](RemoteProcessGroupEntity.md)| The remote process group configuration details. |
 **id** | **String**| The process group id. |

### Return type

[**RemoteProcessGroupEntity**](RemoteProcessGroupEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteReplaceProcessGroupRequest"></a>
# **deleteReplaceProcessGroupRequest**
> ProcessGroupReplaceRequestEntity deleteReplaceProcessGroupRequest(id, disconnectedNodeAcknowledged)

Deletes the Replace Request with the given ID

Deletes the Replace Request with the given ID. After a request is created via a POST to /process-groups/{id}/replace-requests, it is expected that the client will properly clean up the request by DELETE&#x27;ing it, once the Replace process has completed. If the request is deleted before the request completes, then the Replace request will finish the step that it is currently performing and then will cancel any subsequent steps. Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The ID of the Update Request
Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
try {
    ProcessGroupReplaceRequestEntity result = apiInstance.deleteReplaceProcessGroupRequest(id, disconnectedNodeAcknowledged);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#deleteReplaceProcessGroupRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the Update Request |
 **disconnectedNodeAcknowledged** | **Boolean**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**ProcessGroupReplaceRequestEntity**](ProcessGroupReplaceRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="exportProcessGroup"></a>
# **exportProcessGroup**
> String exportProcessGroup(id, includeReferencedServices, includeComponentState)

Gets a process group for download

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
Boolean includeReferencedServices = false; // Boolean | If referenced services from outside the target group should be included
Boolean includeComponentState = false; // Boolean | If component state should be included in the exported flow definition. Requires all processors to be stopped and all controller services to be disabled.
try {
    String result = apiInstance.exportProcessGroup(id, includeReferencedServices, includeComponentState);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#exportProcessGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **includeReferencedServices** | **Boolean**| If referenced services from outside the target group should be included | [optional] [default to false]
 **includeComponentState** | **Boolean**| If component state should be included in the exported flow definition. Requires all processors to be stopped and all controller services to be disabled. | [optional] [default to false]

### Return type

**String**

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConnections"></a>
# **getConnections**
> ConnectionsEntity getConnections(id)

Gets all connections

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
try {
    ConnectionsEntity result = apiInstance.getConnections(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#getConnections");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**ConnectionsEntity**](ConnectionsEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDropAllFlowfilesRequest"></a>
# **getDropAllFlowfilesRequest**
> DropRequestEntity getDropAllFlowfilesRequest(id, dropRequestId)

Gets the current status of a drop all FlowFiles request.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
String dropRequestId = "dropRequestId_example"; // String | The drop request id.
try {
    DropRequestEntity result = apiInstance.getDropAllFlowfilesRequest(id, dropRequestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#getDropAllFlowfilesRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **dropRequestId** | **String**| The drop request id. |

### Return type

[**DropRequestEntity**](DropRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFunnels"></a>
# **getFunnels**
> FunnelsEntity getFunnels(id)

Gets all funnels

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
try {
    FunnelsEntity result = apiInstance.getFunnels(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#getFunnels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**FunnelsEntity**](FunnelsEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInputPorts"></a>
# **getInputPorts**
> InputPortsEntity getInputPorts(id)

Gets all input ports

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
try {
    InputPortsEntity result = apiInstance.getInputPorts(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#getInputPorts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**InputPortsEntity**](InputPortsEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLabels"></a>
# **getLabels**
> LabelsEntity getLabels(id)

Gets all labels

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
try {
    LabelsEntity result = apiInstance.getLabels(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#getLabels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**LabelsEntity**](LabelsEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLocalModifications"></a>
# **getLocalModifications**
> FlowComparisonEntity getLocalModifications(id)

Gets a list of local modifications to the Process Group since it was last synchronized with the Flow Registry

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
try {
    FlowComparisonEntity result = apiInstance.getLocalModifications(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#getLocalModifications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**FlowComparisonEntity**](FlowComparisonEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOutputPorts"></a>
# **getOutputPorts**
> OutputPortsEntity getOutputPorts(id)

Gets all output ports

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
try {
    OutputPortsEntity result = apiInstance.getOutputPorts(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#getOutputPorts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**OutputPortsEntity**](OutputPortsEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProcessGroup"></a>
# **getProcessGroup**
> ProcessGroupEntity getProcessGroup(id)

Gets a process group

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
try {
    ProcessGroupEntity result = apiInstance.getProcessGroup(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#getProcessGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**ProcessGroupEntity**](ProcessGroupEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProcessGroups"></a>
# **getProcessGroups**
> ProcessGroupsEntity getProcessGroups(id)

Gets all process groups

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
try {
    ProcessGroupsEntity result = apiInstance.getProcessGroups(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#getProcessGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**ProcessGroupsEntity**](ProcessGroupsEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProcessors"></a>
# **getProcessors**
> ProcessorsEntity getProcessors(id, includeDescendantGroups)

Gets all processors

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
Boolean includeDescendantGroups = false; // Boolean | Whether or not to include processors from descendant process groups
try {
    ProcessorsEntity result = apiInstance.getProcessors(id, includeDescendantGroups);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#getProcessors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **includeDescendantGroups** | **Boolean**| Whether or not to include processors from descendant process groups | [optional] [default to false]

### Return type

[**ProcessorsEntity**](ProcessorsEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRemoteProcessGroups"></a>
# **getRemoteProcessGroups**
> RemoteProcessGroupsEntity getRemoteProcessGroups(id)

Gets all remote process groups

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
try {
    RemoteProcessGroupsEntity result = apiInstance.getRemoteProcessGroups(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#getRemoteProcessGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**RemoteProcessGroupsEntity**](RemoteProcessGroupsEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReplaceProcessGroupRequest"></a>
# **getReplaceProcessGroupRequest**
> ProcessGroupReplaceRequestEntity getReplaceProcessGroupRequest(id)

Returns the Replace Request with the given ID

Returns the Replace Request with the given ID. Once a Replace Request has been created by performing a POST to /process-groups/{id}/replace-requests, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and any failures. Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The ID of the Replace Request
try {
    ProcessGroupReplaceRequestEntity result = apiInstance.getReplaceProcessGroupRequest(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#getReplaceProcessGroupRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the Replace Request |

### Return type

[**ProcessGroupReplaceRequestEntity**](ProcessGroupReplaceRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="importProcessGroup"></a>
# **importProcessGroup**
> ProcessGroupEntity importProcessGroup(id, body)

Imports a specified process group

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
ProcessGroupUploadEntity body = new ProcessGroupUploadEntity(); // ProcessGroupUploadEntity | The Process Group Upload import details
try {
    ProcessGroupEntity result = apiInstance.importProcessGroup(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#importProcessGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **body** | [**ProcessGroupUploadEntity**](ProcessGroupUploadEntity.md)| The Process Group Upload import details | [optional]

### Return type

[**ProcessGroupEntity**](ProcessGroupEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="initiateReplaceProcessGroup"></a>
# **initiateReplaceProcessGroup**
> ProcessGroupReplaceRequestEntity initiateReplaceProcessGroup(body, id)

Initiate the Replace Request of a Process Group with the given ID

This will initiate the action of replacing a process group with the given process group. This can be a lengthy process, as it will stop any Processors and disable any Controller Services necessary to perform the action and then restart them. As a result, the endpoint will immediately return a ProcessGroupReplaceRequestEntity, and the process of replacing the flow will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /process-groups/replace-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /process-groups/replace-requests/{requestId}. Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessGroupsApi apiInstance = new ProcessGroupsApi();
ProcessGroupImportEntity body = new ProcessGroupImportEntity(); // ProcessGroupImportEntity | The process group replace request entity
String id = "id_example"; // String | The process group id.
try {
    ProcessGroupReplaceRequestEntity result = apiInstance.initiateReplaceProcessGroup(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#initiateReplaceProcessGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProcessGroupImportEntity**](ProcessGroupImportEntity.md)| The process group replace request entity |
 **id** | **String**| The process group id. |

### Return type

[**ProcessGroupReplaceRequestEntity**](ProcessGroupReplaceRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="paste"></a>
# **paste**
> PasteResponseEntity paste(body, id)

Pastes into the specified process group

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessGroupsApi apiInstance = new ProcessGroupsApi();
PasteRequestEntity body = new PasteRequestEntity(); // PasteRequestEntity | The request including the components to be pasted into the specified Process Group.
String id = "id_example"; // String | The process group id.
try {
    PasteResponseEntity result = apiInstance.paste(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#paste");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PasteRequestEntity**](PasteRequestEntity.md)| The request including the components to be pasted into the specified Process Group. |
 **id** | **String**| The process group id. |

### Return type

[**PasteResponseEntity**](PasteResponseEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeDropRequest"></a>
# **removeDropRequest**
> DropRequestEntity removeDropRequest(id, dropRequestId)

Cancels and/or removes a request to drop all FlowFiles.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
String dropRequestId = "dropRequestId_example"; // String | The drop request id.
try {
    DropRequestEntity result = apiInstance.removeDropRequest(id, dropRequestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#removeDropRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **dropRequestId** | **String**| The drop request id. |

### Return type

[**DropRequestEntity**](DropRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeProcessGroup"></a>
# **removeProcessGroup**
> ProcessGroupEntity removeProcessGroup(id, version, clientId, disconnectedNodeAcknowledged)

Deletes a process group

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
Long version = 789L; // Long | The revision is used to verify the client is working with the latest version of the flow.
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
try {
    ProcessGroupEntity result = apiInstance.removeProcessGroup(id, version, clientId, disconnectedNodeAcknowledged);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#removeProcessGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **version** | **Long**| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]
 **disconnectedNodeAcknowledged** | **Boolean**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**ProcessGroupEntity**](ProcessGroupEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="replaceProcessGroup"></a>
# **replaceProcessGroup**
> ProcessGroupImportEntity replaceProcessGroup(body, id)

Replace Process Group contents with the given ID with the specified Process Group contents

This endpoint is used for replication within a cluster, when replacing a flow with a new flow. It expects that the flow beingreplaced is not under version control and that the given snapshot will not modify any Processor that is currently running or any Controller Service that is enabled. Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessGroupsApi apiInstance = new ProcessGroupsApi();
ProcessGroupImportEntity body = new ProcessGroupImportEntity(); // ProcessGroupImportEntity | The process group replace request entity.
String id = "id_example"; // String | The process group id.
try {
    ProcessGroupImportEntity result = apiInstance.replaceProcessGroup(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#replaceProcessGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProcessGroupImportEntity**](ProcessGroupImportEntity.md)| The process group replace request entity. |
 **id** | **String**| The process group id. |

### Return type

[**ProcessGroupImportEntity**](ProcessGroupImportEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProcessGroup"></a>
# **updateProcessGroup**
> ProcessGroupEntity updateProcessGroup(body, id)

Updates a process group

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessGroupsApi apiInstance = new ProcessGroupsApi();
ProcessGroupEntity body = new ProcessGroupEntity(); // ProcessGroupEntity | The process group configuration details.
String id = "id_example"; // String | The process group id.
try {
    ProcessGroupEntity result = apiInstance.updateProcessGroup(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#updateProcessGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProcessGroupEntity**](ProcessGroupEntity.md)| The process group configuration details. |
 **id** | **String**| The process group id. |

### Return type

[**ProcessGroupEntity**](ProcessGroupEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadProcessGroup"></a>
# **uploadProcessGroup**
> ProcessGroupEntity uploadProcessGroup(id, clientId, disconnectedNodeAcknowledged, file, groupName, positionX, positionY)

Uploads a versioned flow definition and creates a process group

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProcessGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ProcessGroupsApi apiInstance = new ProcessGroupsApi();
String id = "id_example"; // String | The process group id.
String clientId = "clientId_example"; // String | 
Boolean disconnectedNodeAcknowledged = true; // Boolean | 
Object file = null; // Object | 
String groupName = "groupName_example"; // String | 
Double positionX = 3.4D; // Double | 
Double positionY = 3.4D; // Double | 
try {
    ProcessGroupEntity result = apiInstance.uploadProcessGroup(id, clientId, disconnectedNodeAcknowledged, file, groupName, positionX, positionY);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessGroupsApi#uploadProcessGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **clientId** | **String**|  | [optional]
 **disconnectedNodeAcknowledged** | **Boolean**|  | [optional]
 **file** | [**Object**](.md)|  | [optional]
 **groupName** | **String**|  | [optional]
 **positionX** | **Double**|  | [optional]
 **positionY** | **Double**|  | [optional]

### Return type

[**ProcessGroupEntity**](ProcessGroupEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

