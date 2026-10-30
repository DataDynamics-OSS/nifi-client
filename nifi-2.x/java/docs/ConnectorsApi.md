# ConnectorsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**applyConnectorUpdate**](ConnectorsApi.md#applyConnectorUpdate) | **POST** /connectors/{id}/apply-update | Applies an update to a connector
[**cancelDrain**](ConnectorsApi.md#cancelDrain) | **DELETE** /connectors/{id}/drain | Cancels the draining of FlowFiles for a connector
[**clearConnectorControllerServiceState**](ConnectorsApi.md#clearConnectorControllerServiceState) | **POST** /connectors/{id}/controller-services/{controllerServiceId}/state/clear-requests | Clears the state for a controller service within a connector
[**clearConnectorProcessorState**](ConnectorsApi.md#clearConnectorProcessorState) | **POST** /connectors/{id}/processors/{processorId}/state/clear-requests | Clears the state for a processor within a connector
[**createAsset**](ConnectorsApi.md#createAsset) | **POST** /connectors/{id}/assets | Creates a new Asset in the given Connector
[**createConnector**](ConnectorsApi.md#createConnector) | **POST** /connectors | Creates a new connector
[**createMigrationPayload**](ConnectorsApi.md#createMigrationPayload) | **POST** /connectors/{id}/migration-payloads | Uploads a flow snapshot payload for a later Connector migration request
[**createMigrationRequest**](ConnectorsApi.md#createMigrationRequest) | **POST** /connectors/{id}/migration-requests | Creates a Connector migration request
[**createPurgeRequest**](ConnectorsApi.md#createPurgeRequest) | **POST** /connectors/{id}/purge-requests | Creates a request to purge the FlowFiles for this connector
[**deleteConfigurationStepVerificationRequest**](ConnectorsApi.md#deleteConfigurationStepVerificationRequest) | **DELETE** /connectors/{id}/configuration-steps/{configurationStepName}/verify-config/{requestId} | Deletes the Verification Request with the given ID
[**deleteConnector**](ConnectorsApi.md#deleteConnector) | **DELETE** /connectors/{id} | Deletes a connector
[**deleteConnectorBacklogRequest**](ConnectorsApi.md#deleteConnectorBacklogRequest) | **DELETE** /connectors/{id}/backlog-requests/{requestId} | Deletes the Backlog Request with the given ID
[**deleteMigrationRequest**](ConnectorsApi.md#deleteMigrationRequest) | **DELETE** /connectors/{id}/migration-requests/{requestId} | Deletes the Connector migration request with the given ID
[**discardConnectorUpdate**](ConnectorsApi.md#discardConnectorUpdate) | **DELETE** /connectors/{id}/working-configuration | Discards the working configuration of a connector
[**endTroubleshooting**](ConnectorsApi.md#endTroubleshooting) | **DELETE** /connectors/{id}/troubleshooting | Transitions a Connector out of Troubleshooting mode
[**enterTroubleshooting**](ConnectorsApi.md#enterTroubleshooting) | **POST** /connectors/{id}/troubleshooting | Transitions a Connector into Troubleshooting mode
[**getAssetContent**](ConnectorsApi.md#getAssetContent) | **GET** /connectors/{id}/assets/{assetId} | Retrieves the content of the asset with the given id for a connector
[**getAssets**](ConnectorsApi.md#getAssets) | **GET** /connectors/{id}/assets | Lists the assets that belong to the Connector with the given ID
[**getConfigurationStepVerificationRequest**](ConnectorsApi.md#getConfigurationStepVerificationRequest) | **GET** /connectors/{id}/configuration-steps/{configurationStepName}/verify-config/{requestId} | Returns the Verification Request with the given ID
[**getConnector**](ConnectorsApi.md#getConnector) | **GET** /connectors/{id} | Gets a connector
[**getConnectorBacklogRequest**](ConnectorsApi.md#getConnectorBacklogRequest) | **GET** /connectors/{id}/backlog-requests/{requestId} | Returns the Backlog Request with the given ID
[**getConnectorConfigurationStep**](ConnectorsApi.md#getConnectorConfigurationStep) | **GET** /connectors/{id}/configuration-steps/{configurationStepName} | Gets a specific configuration step by name for a connector
[**getConnectorConfigurationSteps**](ConnectorsApi.md#getConnectorConfigurationSteps) | **GET** /connectors/{id}/configuration-steps | Gets all configuration step names for a connector
[**getConnectorConnectionStatusHistory**](ConnectorsApi.md#getConnectorConnectionStatusHistory) | **GET** /connectors/{id}/connections/{connectionId}/status/history | Gets the status history for a connection within a connector
[**getConnectorControllerService**](ConnectorsApi.md#getConnectorControllerService) | **GET** /connectors/{id}/controller-services/{controllerServiceId} | Gets a controller service within a connector
[**getConnectorControllerServiceState**](ConnectorsApi.md#getConnectorControllerServiceState) | **GET** /connectors/{id}/controller-services/{controllerServiceId}/state | Gets the state for a controller service within a connector
[**getConnectorProcessGroupStatusHistory**](ConnectorsApi.md#getConnectorProcessGroupStatusHistory) | **GET** /connectors/{id}/process-groups/{processGroupId}/status/history | Gets the status history for a process group within a connector
[**getConnectorProcessorState**](ConnectorsApi.md#getConnectorProcessorState) | **GET** /connectors/{id}/processors/{processorId}/state | Gets the state for a processor within a connector
[**getConnectorProcessorStatusHistory**](ConnectorsApi.md#getConnectorProcessorStatusHistory) | **GET** /connectors/{id}/processors/{processorId}/status/history | Gets the status history for a processor within a connector
[**getConnectorPropertyAllowableValues**](ConnectorsApi.md#getConnectorPropertyAllowableValues) | **GET** /connectors/{id}/configuration-steps/{configurationStepName}/property-groups/{propertyGroupName}/properties/{propertyName}/allowable-values | Gets the allowable values for a specific property in a connector&#x27;s configuration step
[**getConnectorRemoteProcessGroupStatusHistory**](ConnectorsApi.md#getConnectorRemoteProcessGroupStatusHistory) | **GET** /connectors/{id}/remote-process-groups/{remoteProcessGroupId}/status/history | Gets the status history for a remote process group within a connector
[**getConnectorStatus**](ConnectorsApi.md#getConnectorStatus) | **GET** /connectors/{id}/status | Gets the status for the process group managed by a connector
[**getControllerServicesFromConnectorProcessGroup**](ConnectorsApi.md#getControllerServicesFromConnectorProcessGroup) | **GET** /connectors/{connectorId}/flow/process-groups/{processGroupId}/controller-services | Gets all controller services for a process group within a connector
[**getFlow**](ConnectorsApi.md#getFlow) | **GET** /connectors/{connectorId}/flow/process-groups/{processGroupId} | Gets the flow for a process group within a connector
[**getMigrationRequest**](ConnectorsApi.md#getMigrationRequest) | **GET** /connectors/{id}/migration-requests/{requestId} | Gets the Connector migration request with the given ID
[**getMigrationSources**](ConnectorsApi.md#getMigrationSources) | **GET** /connectors/{id}/migration-sources | Lists the Versioned Process Groups that the Connector can be migrated from
[**getParameterContextForConnectorProcessGroup**](ConnectorsApi.md#getParameterContextForConnectorProcessGroup) | **GET** /connectors/{connectorId}/flow/process-groups/{processGroupId}/parameter-context | Gets the parameter context bound to a process group within a connector
[**getPurgeRequest**](ConnectorsApi.md#getPurgeRequest) | **GET** /connectors/{id}/purge-requests/{purge-request-id} | Gets the current status of a purge request for the specified connector
[**getSecrets**](ConnectorsApi.md#getSecrets) | **GET** /connectors/{id}/secrets | Gets all secrets available for configuring a connector
[**initiateDrain**](ConnectorsApi.md#initiateDrain) | **POST** /connectors/{id}/drain | Initiates draining of FlowFiles for a connector
[**removePurgeRequest**](ConnectorsApi.md#removePurgeRequest) | **DELETE** /connectors/{id}/purge-requests/{purge-request-id} | Cancels and/or removes a request to purge the FlowFiles for this connector
[**searchConnector**](ConnectorsApi.md#searchConnector) | **GET** /connectors/{id}/search-results | Performs a search against the encapsulated process group of this connector using the specified search term
[**submitConfigurationStepVerificationRequest**](ConnectorsApi.md#submitConfigurationStepVerificationRequest) | **POST** /connectors/{id}/configuration-steps/{configurationStepName}/verify-config | Performs verification of a configuration step for a connector
[**submitConnectorBacklogRequest**](ConnectorsApi.md#submitConnectorBacklogRequest) | **POST** /connectors/{id}/backlog-requests | Initiates a request to determine the current backlog for a Connector
[**updateConnector**](ConnectorsApi.md#updateConnector) | **PUT** /connectors/{id} | Updates a connector
[**updateConnectorConfigurationStep**](ConnectorsApi.md#updateConnectorConfigurationStep) | **PUT** /connectors/{id}/configuration-steps/{configurationStepName} | Updates a specific configuration step by name for a connector
[**updateRunStatus**](ConnectorsApi.md#updateRunStatus) | **PUT** /connectors/{id}/run-status | Updates run status of a connector

<a name="applyConnectorUpdate"></a>
# **applyConnectorUpdate**
> ConnectorEntity applyConnectorUpdate(body, id)

Applies an update to a connector

This will apply any pending configuration changes to the connector. The client can poll the connector endpoint to check when the update is complete.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
ConnectorEntity body = new ConnectorEntity(); // ConnectorEntity | The connector configuration with revision.
String id = "id_example"; // String | The connector id.
try {
    ConnectorEntity result = apiInstance.applyConnectorUpdate(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#applyConnectorUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConnectorEntity**](ConnectorEntity.md)| The connector configuration with revision. |
 **id** | **String**| The connector id. |

### Return type

[**ConnectorEntity**](ConnectorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cancelDrain"></a>
# **cancelDrain**
> ConnectorEntity cancelDrain(id, version, clientId, disconnectedNodeAcknowledged)

Cancels the draining of FlowFiles for a connector

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String id = "id_example"; // String | The connector id.
Long version = 789L; // Long | The revision is used to verify the client is working with the latest version of the flow.
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
try {
    ConnectorEntity result = apiInstance.cancelDrain(id, version, clientId, disconnectedNodeAcknowledged);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#cancelDrain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connector id. |
 **version** | **Long**| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]
 **disconnectedNodeAcknowledged** | **Boolean**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**ConnectorEntity**](ConnectorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="clearConnectorControllerServiceState"></a>
# **clearConnectorControllerServiceState**
> ComponentStateEntity clearConnectorControllerServiceState(id, controllerServiceId, body)

Clears the state for a controller service within a connector

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String id = "id_example"; // String | The connector id.
String controllerServiceId = "controllerServiceId_example"; // String | The controller service id.
ComponentStateEntity body = new ComponentStateEntity(); // ComponentStateEntity | Optional component state to perform a selective key removal. If omitted, clears all state.
try {
    ComponentStateEntity result = apiInstance.clearConnectorControllerServiceState(id, controllerServiceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#clearConnectorControllerServiceState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connector id. |
 **controllerServiceId** | **String**| The controller service id. |
 **body** | [**ComponentStateEntity**](ComponentStateEntity.md)| Optional component state to perform a selective key removal. If omitted, clears all state. | [optional]

### Return type

[**ComponentStateEntity**](ComponentStateEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: */*, application/json
 - **Accept**: application/json

<a name="clearConnectorProcessorState"></a>
# **clearConnectorProcessorState**
> ComponentStateEntity clearConnectorProcessorState(id, processorId, body)

Clears the state for a processor within a connector

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String id = "id_example"; // String | The connector id.
String processorId = "processorId_example"; // String | The processor id.
ComponentStateEntity body = new ComponentStateEntity(); // ComponentStateEntity | Optional component state to perform a selective key removal. If omitted, clears all state.
try {
    ComponentStateEntity result = apiInstance.clearConnectorProcessorState(id, processorId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#clearConnectorProcessorState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connector id. |
 **processorId** | **String**| The processor id. |
 **body** | [**ComponentStateEntity**](ComponentStateEntity.md)| Optional component state to perform a selective key removal. If omitted, clears all state. | [optional]

### Return type

[**ComponentStateEntity**](ComponentStateEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: */*, application/json
 - **Accept**: application/json

<a name="createAsset"></a>
# **createAsset**
> AssetEntity createAsset(body, id, filename)

Creates a new Asset in the given Connector

This endpoint will create a new Asset in the Connector. The Asset will be created with the given name and the contents of the file that is uploaded.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
Object body = null; // Object | The contents of the asset
String id = "id_example"; // String | 
String filename = "filename_example"; // String | 
try {
    AssetEntity result = apiInstance.createAsset(body, id, filename);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#createAsset");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)| The contents of the asset |
 **id** | **String**|  |
 **filename** | **String**|  | [optional]

### Return type

[**AssetEntity**](AssetEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

<a name="createConnector"></a>
# **createConnector**
> ConnectorEntity createConnector(body)

Creates a new connector

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
ConnectorEntity body = new ConnectorEntity(); // ConnectorEntity | The connector configuration details.
try {
    ConnectorEntity result = apiInstance.createConnector(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#createConnector");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConnectorEntity**](ConnectorEntity.md)| The connector configuration details. |

### Return type

[**ConnectorEntity**](ConnectorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createMigrationPayload"></a>
# **createMigrationPayload**
> MigrationPayloadEntity createMigrationPayload(body, id)

Uploads a flow snapshot payload for a later Connector migration request

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
Object body = null; // Object | The migration payload snapshot
String id = "id_example"; // String | 
try {
    MigrationPayloadEntity result = apiInstance.createMigrationPayload(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#createMigrationPayload");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Object**](Object.md)| The migration payload snapshot |
 **id** | **String**|  |

### Return type

[**MigrationPayloadEntity**](MigrationPayloadEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

<a name="createMigrationRequest"></a>
# **createMigrationRequest**
> MigrationRequestEntity createMigrationRequest(id, body)

Creates a Connector migration request

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String id = "id_example"; // String | 
MigrationRequestEntity body = new MigrationRequestEntity(); // MigrationRequestEntity | 
try {
    MigrationRequestEntity result = apiInstance.createMigrationRequest(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#createMigrationRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **body** | [**MigrationRequestEntity**](MigrationRequestEntity.md)|  | [optional]

### Return type

[**MigrationRequestEntity**](MigrationRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPurgeRequest"></a>
# **createPurgeRequest**
> DropRequestEntity createPurgeRequest(id)

Creates a request to purge the FlowFiles for this connector

This will create a request to purge all FlowFiles from the connector. The connector must be in a STOPPED state before purging can begin. This is an asynchronous operation. The client should poll the returned URI to get the status of the purge request.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String id = "id_example"; // String | The connector id.
try {
    DropRequestEntity result = apiInstance.createPurgeRequest(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#createPurgeRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connector id. |

### Return type

[**DropRequestEntity**](DropRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteConfigurationStepVerificationRequest"></a>
# **deleteConfigurationStepVerificationRequest**
> VerifyConnectorConfigStepRequestEntity deleteConfigurationStepVerificationRequest(id, configurationStepName, requestId)

Deletes the Verification Request with the given ID

Deletes the Verification Request with the given ID. After a request is created, it is expected that the client will properly clean up the request by DELETE&#x27;ing it, once the Verification process has completed. If the request is deleted before the request completes, then the Verification request will finish the step that it is currently performing and then will cancel any subsequent steps.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String id = "id_example"; // String | The connector id.
String configurationStepName = "configurationStepName_example"; // String | The configuration step name.
String requestId = "requestId_example"; // String | The ID of the Verification Request
try {
    VerifyConnectorConfigStepRequestEntity result = apiInstance.deleteConfigurationStepVerificationRequest(id, configurationStepName, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#deleteConfigurationStepVerificationRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connector id. |
 **configurationStepName** | **String**| The configuration step name. |
 **requestId** | **String**| The ID of the Verification Request |

### Return type

[**VerifyConnectorConfigStepRequestEntity**](VerifyConnectorConfigStepRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteConnector"></a>
# **deleteConnector**
> ConnectorEntity deleteConnector(id, version, clientId, disconnectedNodeAcknowledged)

Deletes a connector

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String id = "id_example"; // String | The connector id.
Long version = 789L; // Long | The revision is used to verify the client is working with the latest version of the flow.
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
try {
    ConnectorEntity result = apiInstance.deleteConnector(id, version, clientId, disconnectedNodeAcknowledged);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#deleteConnector");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connector id. |
 **version** | **Long**| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]
 **disconnectedNodeAcknowledged** | **Boolean**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**ConnectorEntity**](ConnectorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteConnectorBacklogRequest"></a>
# **deleteConnectorBacklogRequest**
> BacklogRequestEntity deleteConnectorBacklogRequest(id, requestId)

Deletes the Backlog Request with the given ID

Deletes the Backlog Request with the given ID. After a request is created, it is expected that the client will properly clean up the request by DELETE&#x27;ing it once the backlog determination has completed. If the request is deleted before it completes, the background determination is cancelled.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String id = "id_example"; // String | The connector id.
String requestId = "requestId_example"; // String | The ID of the Backlog Request
try {
    BacklogRequestEntity result = apiInstance.deleteConnectorBacklogRequest(id, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#deleteConnectorBacklogRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connector id. |
 **requestId** | **String**| The ID of the Backlog Request |

### Return type

[**BacklogRequestEntity**](BacklogRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteMigrationRequest"></a>
# **deleteMigrationRequest**
> MigrationRequestEntity deleteMigrationRequest(id, requestId)

Deletes the Connector migration request with the given ID

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String id = "id_example"; // String | 
String requestId = "requestId_example"; // String | 
try {
    MigrationRequestEntity result = apiInstance.deleteMigrationRequest(id, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#deleteMigrationRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **requestId** | **String**|  |

### Return type

[**MigrationRequestEntity**](MigrationRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="discardConnectorUpdate"></a>
# **discardConnectorUpdate**
> ConnectorEntity discardConnectorUpdate(id, version, clientId, disconnectedNodeAcknowledged)

Discards the working configuration of a connector

This will discard any pending configuration changes for the connector and revert to the last applied configuration.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String id = "id_example"; // String | The connector id.
Long version = 789L; // Long | The revision is used to verify the client is working with the latest version of the flow.
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
try {
    ConnectorEntity result = apiInstance.discardConnectorUpdate(id, version, clientId, disconnectedNodeAcknowledged);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#discardConnectorUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connector id. |
 **version** | **Long**| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]
 **disconnectedNodeAcknowledged** | **Boolean**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**ConnectorEntity**](ConnectorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="endTroubleshooting"></a>
# **endTroubleshooting**
> ConnectorEntity endTroubleshooting(id, version, clientId, disconnectedNodeAcknowledged)

Transitions a Connector out of Troubleshooting mode

Ends Troubleshooting mode for the Connector, restoring the authoritative flow. All components in the managed flow must be stopped and disabled, and the managed flow must have no active tasks.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String id = "id_example"; // String | The connector id.
Long version = 789L; // Long | The revision is used to verify the client is working with the latest version of the flow.
String clientId = "clientId_example"; // String | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
try {
    ConnectorEntity result = apiInstance.endTroubleshooting(id, version, clientId, disconnectedNodeAcknowledged);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#endTroubleshooting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connector id. |
 **version** | **Long**| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | **String**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]
 **disconnectedNodeAcknowledged** | **Boolean**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**ConnectorEntity**](ConnectorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="enterTroubleshooting"></a>
# **enterTroubleshooting**
> ConnectorEntity enterTroubleshooting(body, id)

Transitions a Connector into Troubleshooting mode

Places the Connector into Troubleshooting mode so that its managed flow may be directly modified. Standard lifecycle operations are disabled while in Troubleshooting mode.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
ConnectorEntity body = new ConnectorEntity(); // ConnectorEntity | The connector entity with revision.
String id = "id_example"; // String | The connector id.
try {
    ConnectorEntity result = apiInstance.enterTroubleshooting(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#enterTroubleshooting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConnectorEntity**](ConnectorEntity.md)| The connector entity with revision. |
 **id** | **String**| The connector id. |

### Return type

[**ConnectorEntity**](ConnectorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAssetContent"></a>
# **getAssetContent**
> byte[] getAssetContent(id, assetId)

Retrieves the content of the asset with the given id for a connector

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String id = "id_example"; // String | The connector id.
String assetId = "assetId_example"; // String | The asset id.
try {
    byte[] result = apiInstance.getAssetContent(id, assetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#getAssetContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connector id. |
 **assetId** | **String**| The asset id. |

### Return type

**byte[]**

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

<a name="getAssets"></a>
# **getAssets**
> AssetsEntity getAssets(id)

Lists the assets that belong to the Connector with the given ID

Lists the assets that belong to the Connector with the given ID.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String id = "id_example"; // String | The connector id.
try {
    AssetsEntity result = apiInstance.getAssets(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#getAssets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connector id. |

### Return type

[**AssetsEntity**](AssetsEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConfigurationStepVerificationRequest"></a>
# **getConfigurationStepVerificationRequest**
> VerifyConnectorConfigStepRequestEntity getConfigurationStepVerificationRequest(id, configurationStepName, requestId)

Returns the Verification Request with the given ID

Returns the Verification Request with the given ID. Once a Verification Request has been created, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and any failures.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String id = "id_example"; // String | The connector id.
String configurationStepName = "configurationStepName_example"; // String | The configuration step name.
String requestId = "requestId_example"; // String | The ID of the Verification Request
try {
    VerifyConnectorConfigStepRequestEntity result = apiInstance.getConfigurationStepVerificationRequest(id, configurationStepName, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#getConfigurationStepVerificationRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connector id. |
 **configurationStepName** | **String**| The configuration step name. |
 **requestId** | **String**| The ID of the Verification Request |

### Return type

[**VerifyConnectorConfigStepRequestEntity**](VerifyConnectorConfigStepRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConnector"></a>
# **getConnector**
> ConnectorEntity getConnector(id)

Gets a connector

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String id = "id_example"; // String | The connector id.
try {
    ConnectorEntity result = apiInstance.getConnector(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#getConnector");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connector id. |

### Return type

[**ConnectorEntity**](ConnectorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConnectorBacklogRequest"></a>
# **getConnectorBacklogRequest**
> BacklogRequestEntity getConnectorBacklogRequest(id, requestId)

Returns the Backlog Request with the given ID

Returns the Backlog Request with the given ID. Once a Backlog Request has been created by performing a POST to /connectors/{id}/backlog-requests, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and the backlog once the request is complete.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String id = "id_example"; // String | The connector id.
String requestId = "requestId_example"; // String | The ID of the Backlog Request
try {
    BacklogRequestEntity result = apiInstance.getConnectorBacklogRequest(id, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#getConnectorBacklogRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connector id. |
 **requestId** | **String**| The ID of the Backlog Request |

### Return type

[**BacklogRequestEntity**](BacklogRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConnectorConfigurationStep"></a>
# **getConnectorConfigurationStep**
> ConfigurationStepEntity getConnectorConfigurationStep(id, configurationStepName)

Gets a specific configuration step by name for a connector

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String id = "id_example"; // String | The connector id.
String configurationStepName = "configurationStepName_example"; // String | The configuration step name.
try {
    ConfigurationStepEntity result = apiInstance.getConnectorConfigurationStep(id, configurationStepName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#getConnectorConfigurationStep");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connector id. |
 **configurationStepName** | **String**| The configuration step name. |

### Return type

[**ConfigurationStepEntity**](ConfigurationStepEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConnectorConfigurationSteps"></a>
# **getConnectorConfigurationSteps**
> ConfigurationStepNamesEntity getConnectorConfigurationSteps(id)

Gets all configuration step names for a connector

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String id = "id_example"; // String | The connector id.
try {
    ConfigurationStepNamesEntity result = apiInstance.getConnectorConfigurationSteps(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#getConnectorConfigurationSteps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connector id. |

### Return type

[**ConfigurationStepNamesEntity**](ConfigurationStepNamesEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConnectorConnectionStatusHistory"></a>
# **getConnectorConnectionStatusHistory**
> StatusHistoryEntity getConnectorConnectionStatusHistory(id, connectionId)

Gets the status history for a connection within a connector

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String id = "id_example"; // String | The connector id.
String connectionId = "connectionId_example"; // String | The connection id.
try {
    StatusHistoryEntity result = apiInstance.getConnectorConnectionStatusHistory(id, connectionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#getConnectorConnectionStatusHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connector id. |
 **connectionId** | **String**| The connection id. |

### Return type

[**StatusHistoryEntity**](StatusHistoryEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConnectorControllerService"></a>
# **getConnectorControllerService**
> ControllerServiceEntity getConnectorControllerService(id, controllerServiceId, uiOnly)

Gets a controller service within a connector

If the uiOnly query parameter is provided with a value of true, the returned entity may only contain fields that are necessary for rendering the NiFi User Interface. As such, the selected fields may change at any time, even during incremental releases, without warning. As a result, this parameter should not be provided by any client other than the UI.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String id = "id_example"; // String | The connector id.
String controllerServiceId = "controllerServiceId_example"; // String | The controller service id.
Boolean uiOnly = false; // Boolean | 
try {
    ControllerServiceEntity result = apiInstance.getConnectorControllerService(id, controllerServiceId, uiOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#getConnectorControllerService");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connector id. |
 **controllerServiceId** | **String**| The controller service id. |
 **uiOnly** | **Boolean**|  | [optional] [default to false]

### Return type

[**ControllerServiceEntity**](ControllerServiceEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConnectorControllerServiceState"></a>
# **getConnectorControllerServiceState**
> ComponentStateEntity getConnectorControllerServiceState(id, controllerServiceId)

Gets the state for a controller service within a connector

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String id = "id_example"; // String | The connector id.
String controllerServiceId = "controllerServiceId_example"; // String | The controller service id.
try {
    ComponentStateEntity result = apiInstance.getConnectorControllerServiceState(id, controllerServiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#getConnectorControllerServiceState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connector id. |
 **controllerServiceId** | **String**| The controller service id. |

### Return type

[**ComponentStateEntity**](ComponentStateEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConnectorProcessGroupStatusHistory"></a>
# **getConnectorProcessGroupStatusHistory**
> StatusHistoryEntity getConnectorProcessGroupStatusHistory(id, processGroupId)

Gets the status history for a process group within a connector

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String id = "id_example"; // String | The connector id.
String processGroupId = "processGroupId_example"; // String | The process group id.
try {
    StatusHistoryEntity result = apiInstance.getConnectorProcessGroupStatusHistory(id, processGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#getConnectorProcessGroupStatusHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connector id. |
 **processGroupId** | **String**| The process group id. |

### Return type

[**StatusHistoryEntity**](StatusHistoryEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConnectorProcessorState"></a>
# **getConnectorProcessorState**
> ComponentStateEntity getConnectorProcessorState(id, processorId)

Gets the state for a processor within a connector

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String id = "id_example"; // String | The connector id.
String processorId = "processorId_example"; // String | The processor id.
try {
    ComponentStateEntity result = apiInstance.getConnectorProcessorState(id, processorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#getConnectorProcessorState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connector id. |
 **processorId** | **String**| The processor id. |

### Return type

[**ComponentStateEntity**](ComponentStateEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConnectorProcessorStatusHistory"></a>
# **getConnectorProcessorStatusHistory**
> StatusHistoryEntity getConnectorProcessorStatusHistory(id, processorId)

Gets the status history for a processor within a connector

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String id = "id_example"; // String | The connector id.
String processorId = "processorId_example"; // String | The processor id.
try {
    StatusHistoryEntity result = apiInstance.getConnectorProcessorStatusHistory(id, processorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#getConnectorProcessorStatusHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connector id. |
 **processorId** | **String**| The processor id. |

### Return type

[**StatusHistoryEntity**](StatusHistoryEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConnectorPropertyAllowableValues"></a>
# **getConnectorPropertyAllowableValues**
> ConnectorPropertyAllowableValuesEntity getConnectorPropertyAllowableValues(id, configurationStepName, propertyGroupName, propertyName, filter)

Gets the allowable values for a specific property in a connector&#x27;s configuration step

Gets the allowable values for a specific property that supports dynamic fetching of allowable values. The filter parameter can be used to narrow down the results based on the property&#x27;s filtering logic.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String id = "id_example"; // String | The connector id.
String configurationStepName = "configurationStepName_example"; // String | The configuration step name.
String propertyGroupName = "propertyGroupName_example"; // String | The property group name.
String propertyName = "propertyName_example"; // String | The property name.
String filter = "filter_example"; // String | Optional filter to narrow down the allowable values.
try {
    ConnectorPropertyAllowableValuesEntity result = apiInstance.getConnectorPropertyAllowableValues(id, configurationStepName, propertyGroupName, propertyName, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#getConnectorPropertyAllowableValues");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connector id. |
 **configurationStepName** | **String**| The configuration step name. |
 **propertyGroupName** | **String**| The property group name. |
 **propertyName** | **String**| The property name. |
 **filter** | **String**| Optional filter to narrow down the allowable values. | [optional]

### Return type

[**ConnectorPropertyAllowableValuesEntity**](ConnectorPropertyAllowableValuesEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConnectorRemoteProcessGroupStatusHistory"></a>
# **getConnectorRemoteProcessGroupStatusHistory**
> StatusHistoryEntity getConnectorRemoteProcessGroupStatusHistory(id, remoteProcessGroupId)

Gets the status history for a remote process group within a connector

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String id = "id_example"; // String | The connector id.
String remoteProcessGroupId = "remoteProcessGroupId_example"; // String | The remote process group id.
try {
    StatusHistoryEntity result = apiInstance.getConnectorRemoteProcessGroupStatusHistory(id, remoteProcessGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#getConnectorRemoteProcessGroupStatusHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connector id. |
 **remoteProcessGroupId** | **String**| The remote process group id. |

### Return type

[**StatusHistoryEntity**](StatusHistoryEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConnectorStatus"></a>
# **getConnectorStatus**
> ProcessGroupStatusEntity getConnectorStatus(id, recursive, nodewise, clusterNodeId)

Gets the status for the process group managed by a connector

Returns the status for the process group managed by the specified connector. The status includes status for all descendent components. When invoked with recursive set to true, it will return the current status of every component in the connector&#x27;s encapsulated flow.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String id = "id_example"; // String | The connector id.
Boolean recursive = false; // Boolean | Whether all descendant groups and the status of their content will be included. Optional, defaults to false
Boolean nodewise = false; // Boolean | Whether or not to include the breakdown per node. Optional, defaults to false
String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where to get the status.
try {
    ProcessGroupStatusEntity result = apiInstance.getConnectorStatus(id, recursive, nodewise, clusterNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#getConnectorStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connector id. |
 **recursive** | **Boolean**| Whether all descendant groups and the status of their content will be included. Optional, defaults to false | [optional] [default to false]
 **nodewise** | **Boolean**| Whether or not to include the breakdown per node. Optional, defaults to false | [optional] [default to false]
 **clusterNodeId** | **String**| The id of the node where to get the status. | [optional]

### Return type

[**ProcessGroupStatusEntity**](ProcessGroupStatusEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getControllerServicesFromConnectorProcessGroup"></a>
# **getControllerServicesFromConnectorProcessGroup**
> ControllerServicesEntity getControllerServicesFromConnectorProcessGroup(connectorId, processGroupId, includeAncestorGroups, includeDescendantGroups, includeReferencingComponents)

Gets all controller services for a process group within a connector

Returns the controller services for the specified process group within the connector&#x27;s hierarchy. The processGroupId can be obtained from the managedProcessGroupId field of the ConnectorDTO for the root process group, or from child process groups within the flow.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String connectorId = "connectorId_example"; // String | The connector id.
String processGroupId = "processGroupId_example"; // String | The process group id.
Boolean includeAncestorGroups = true; // Boolean | Whether or not to include parent/ancestor process groups
Boolean includeDescendantGroups = false; // Boolean | Whether or not to include descendant process groups
Boolean includeReferencingComponents = true; // Boolean | Whether or not to include services' referencing components in the response
try {
    ControllerServicesEntity result = apiInstance.getControllerServicesFromConnectorProcessGroup(connectorId, processGroupId, includeAncestorGroups, includeDescendantGroups, includeReferencingComponents);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#getControllerServicesFromConnectorProcessGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectorId** | **String**| The connector id. |
 **processGroupId** | **String**| The process group id. |
 **includeAncestorGroups** | **Boolean**| Whether or not to include parent/ancestor process groups | [optional] [default to true]
 **includeDescendantGroups** | **Boolean**| Whether or not to include descendant process groups | [optional] [default to false]
 **includeReferencingComponents** | **Boolean**| Whether or not to include services&#x27; referencing components in the response | [optional] [default to true]

### Return type

[**ControllerServicesEntity**](ControllerServicesEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFlow"></a>
# **getFlow**
> ProcessGroupFlowEntity getFlow(connectorId, processGroupId, uiOnly)

Gets the flow for a process group within a connector

Returns the flow for the specified process group within the connector&#x27;s hierarchy. The processGroupId can be obtained from the managedProcessGroupId field of the ConnectorDTO for the root process group, or from child process groups within the flow. If the uiOnly query parameter is provided with a value of true, the returned entity may only contain fields that are necessary for rendering the NiFi User Interface. As such, the selected fields may change at any time, even during incremental releases, without warning. As a result, this parameter should not be provided by any client other than the UI.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String connectorId = "connectorId_example"; // String | The connector id.
String processGroupId = "processGroupId_example"; // String | The process group id.
Boolean uiOnly = false; // Boolean | Whether to return only UI-specific fields
try {
    ProcessGroupFlowEntity result = apiInstance.getFlow(connectorId, processGroupId, uiOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#getFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectorId** | **String**| The connector id. |
 **processGroupId** | **String**| The process group id. |
 **uiOnly** | **Boolean**| Whether to return only UI-specific fields | [optional] [default to false]

### Return type

[**ProcessGroupFlowEntity**](ProcessGroupFlowEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMigrationRequest"></a>
# **getMigrationRequest**
> MigrationRequestEntity getMigrationRequest(id, requestId)

Gets the Connector migration request with the given ID

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String id = "id_example"; // String | 
String requestId = "requestId_example"; // String | 
try {
    MigrationRequestEntity result = apiInstance.getMigrationRequest(id, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#getMigrationRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **requestId** | **String**|  |

### Return type

[**MigrationRequestEntity**](MigrationRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getMigrationSources"></a>
# **getMigrationSources**
> VersionedFlowMigrationSourcesEntity getMigrationSources(id)

Lists the Versioned Process Groups that the Connector can be migrated from

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String id = "id_example"; // String | 
try {
    VersionedFlowMigrationSourcesEntity result = apiInstance.getMigrationSources(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#getMigrationSources");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**VersionedFlowMigrationSourcesEntity**](VersionedFlowMigrationSourcesEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getParameterContextForConnectorProcessGroup"></a>
# **getParameterContextForConnectorProcessGroup**
> ParameterContextEntity getParameterContextForConnectorProcessGroup(connectorId, processGroupId)

Gets the parameter context bound to a process group within a connector

Returns the parameter context (with effective parameters, including those inherited from other contexts) bound to the specified process group within the connector&#x27;s hierarchy. Sensitive parameter values are masked. Returns 204 No Content if the process group has no bound parameter context.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String connectorId = "connectorId_example"; // String | The connector id.
String processGroupId = "processGroupId_example"; // String | The process group id.
try {
    ParameterContextEntity result = apiInstance.getParameterContextForConnectorProcessGroup(connectorId, processGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#getParameterContextForConnectorProcessGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connectorId** | **String**| The connector id. |
 **processGroupId** | **String**| The process group id. |

### Return type

[**ParameterContextEntity**](ParameterContextEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPurgeRequest"></a>
# **getPurgeRequest**
> DropRequestEntity getPurgeRequest(id, purgeRequestId)

Gets the current status of a purge request for the specified connector

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String id = "id_example"; // String | The connector id.
String purgeRequestId = "purgeRequestId_example"; // String | The purge request id.
try {
    DropRequestEntity result = apiInstance.getPurgeRequest(id, purgeRequestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#getPurgeRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connector id. |
 **purgeRequestId** | **String**| The purge request id. |

### Return type

[**DropRequestEntity**](DropRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSecrets"></a>
# **getSecrets**
> SecretsEntity getSecrets(id)

Gets all secrets available for configuring a connector

Returns metadata for all secrets available from all secret providers. This endpoint is used when configuring a connector to discover available secrets. Note: Actual secret values are not included in the response for security reasons.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String id = "id_example"; // String | The connector id.
try {
    SecretsEntity result = apiInstance.getSecrets(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#getSecrets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connector id. |

### Return type

[**SecretsEntity**](SecretsEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="initiateDrain"></a>
# **initiateDrain**
> ConnectorEntity initiateDrain(body, id)

Initiates draining of FlowFiles for a connector

This will initiate draining of FlowFiles for a stopped connector. Draining allows the connector to process data that is currently in the flow but does not ingest any additional data. The connector must be in a STOPPED state before draining can begin. Once initiated, the connector will transition to a DRAINING state. Use the DELETE method on this endpoint to cancel an ongoing drain operation.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
ConnectorEntity body = new ConnectorEntity(); // ConnectorEntity | The connector entity with revision.
String id = "id_example"; // String | The connector id.
try {
    ConnectorEntity result = apiInstance.initiateDrain(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#initiateDrain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConnectorEntity**](ConnectorEntity.md)| The connector entity with revision. |
 **id** | **String**| The connector id. |

### Return type

[**ConnectorEntity**](ConnectorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removePurgeRequest"></a>
# **removePurgeRequest**
> DropRequestEntity removePurgeRequest(id, purgeRequestId)

Cancels and/or removes a request to purge the FlowFiles for this connector

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String id = "id_example"; // String | The connector id.
String purgeRequestId = "purgeRequestId_example"; // String | The purge request id.
try {
    DropRequestEntity result = apiInstance.removePurgeRequest(id, purgeRequestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#removePurgeRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connector id. |
 **purgeRequestId** | **String**| The purge request id. |

### Return type

[**DropRequestEntity**](DropRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchConnector"></a>
# **searchConnector**
> SearchResultsEntity searchConnector(id, q)

Performs a search against the encapsulated process group of this connector using the specified search term

Only search results from authorized components will be returned.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String id = "id_example"; // String | The connector id.
String q = ""; // String | The search term.
try {
    SearchResultsEntity result = apiInstance.searchConnector(id, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#searchConnector");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connector id. |
 **q** | **String**| The search term. | [optional]

### Return type

[**SearchResultsEntity**](SearchResultsEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="submitConfigurationStepVerificationRequest"></a>
# **submitConfigurationStepVerificationRequest**
> VerifyConnectorConfigStepRequestEntity submitConfigurationStepVerificationRequest(body, id, configurationStepName)

Performs verification of a configuration step for a connector

This will initiate the process of verifying a given Connector Configuration Step. This may be a long-running task. As a result, this endpoint will immediately return a VerifyConnectorConfigStepRequestEntity, and the process of performing the verification will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /connectors/{connectorId}/configuration-steps/{stepName}/verify-config/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /connectors/{connectorId}/configuration-steps/{stepName}/verify-config/{requestId}.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
VerifyConnectorConfigStepRequestEntity body = new VerifyConnectorConfigStepRequestEntity(); // VerifyConnectorConfigStepRequestEntity | The verify config request entity containing the configuration step to verify.
String id = "id_example"; // String | The connector id.
String configurationStepName = "configurationStepName_example"; // String | The configuration step name.
try {
    VerifyConnectorConfigStepRequestEntity result = apiInstance.submitConfigurationStepVerificationRequest(body, id, configurationStepName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#submitConfigurationStepVerificationRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VerifyConnectorConfigStepRequestEntity**](VerifyConnectorConfigStepRequestEntity.md)| The verify config request entity containing the configuration step to verify. |
 **id** | **String**| The connector id. |
 **configurationStepName** | **String**| The configuration step name. |

### Return type

[**VerifyConnectorConfigStepRequestEntity**](VerifyConnectorConfigStepRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="submitConnectorBacklogRequest"></a>
# **submitConnectorBacklogRequest**
> BacklogRequestEntity submitConnectorBacklogRequest(id)

Initiates a request to determine the current backlog for a Connector

This will initiate the process of determining the backlog for a Connector. This may be a long-running task. As a result, this endpoint will immediately return a BacklogRequestEntity, and the process of determining the backlog will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /connectors/{id}/backlog-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /connectors/{id}/backlog-requests/{requestId}.

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
String id = "id_example"; // String | The connector id.
try {
    BacklogRequestEntity result = apiInstance.submitConnectorBacklogRequest(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#submitConnectorBacklogRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connector id. |

### Return type

[**BacklogRequestEntity**](BacklogRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateConnector"></a>
# **updateConnector**
> ConnectorEntity updateConnector(body, id)

Updates a connector

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
ConnectorEntity body = new ConnectorEntity(); // ConnectorEntity | The connector configuration details.
String id = "id_example"; // String | The connector id.
try {
    ConnectorEntity result = apiInstance.updateConnector(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#updateConnector");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConnectorEntity**](ConnectorEntity.md)| The connector configuration details. |
 **id** | **String**| The connector id. |

### Return type

[**ConnectorEntity**](ConnectorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateConnectorConfigurationStep"></a>
# **updateConnectorConfigurationStep**
> ConfigurationStepEntity updateConnectorConfigurationStep(body, id, configurationStepName)

Updates a specific configuration step by name for a connector

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
ConfigurationStepEntity body = new ConfigurationStepEntity(); // ConfigurationStepEntity | The configuration step configuration.
String id = "id_example"; // String | The connector id.
String configurationStepName = "configurationStepName_example"; // String | The configuration step name.
try {
    ConfigurationStepEntity result = apiInstance.updateConnectorConfigurationStep(body, id, configurationStepName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#updateConnectorConfigurationStep");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConfigurationStepEntity**](ConfigurationStepEntity.md)| The configuration step configuration. |
 **id** | **String**| The connector id. |
 **configurationStepName** | **String**| The configuration step name. |

### Return type

[**ConfigurationStepEntity**](ConfigurationStepEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRunStatus"></a>
# **updateRunStatus**
> ConnectorEntity updateRunStatus(body, id)

Updates run status of a connector

### Example
```java
// Import classes:
//import io.datadynamics.nifi.client.v2.ApiClient;
//import io.datadynamics.nifi.client.v2.ApiException;
//import io.datadynamics.nifi.client.v2.Configuration;
//import io.datadynamics.nifi.client.v2.auth.*;
//import io.datadynamics.nifi.client.v2.api.ConnectorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


ConnectorsApi apiInstance = new ConnectorsApi();
ConnectorRunStatusEntity body = new ConnectorRunStatusEntity(); // ConnectorRunStatusEntity | The connector run status.
String id = "id_example"; // String | The connector id.
try {
    ConnectorEntity result = apiInstance.updateRunStatus(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConnectorsApi#updateRunStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConnectorRunStatusEntity**](ConnectorRunStatusEntity.md)| The connector run status. |
 **id** | **String**| The connector id. |

### Return type

[**ConnectorEntity**](ConnectorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

