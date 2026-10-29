# swagger_client.ConnectorsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apply_connector_update**](ConnectorsApi.md#apply_connector_update) | **POST** /connectors/{id}/apply-update | Applies an update to a connector
[**cancel_drain**](ConnectorsApi.md#cancel_drain) | **DELETE** /connectors/{id}/drain | Cancels the draining of FlowFiles for a connector
[**clear_connector_controller_service_state**](ConnectorsApi.md#clear_connector_controller_service_state) | **POST** /connectors/{id}/controller-services/{controllerServiceId}/state/clear-requests | Clears the state for a controller service within a connector
[**clear_connector_processor_state**](ConnectorsApi.md#clear_connector_processor_state) | **POST** /connectors/{id}/processors/{processorId}/state/clear-requests | Clears the state for a processor within a connector
[**create_asset**](ConnectorsApi.md#create_asset) | **POST** /connectors/{id}/assets | Creates a new Asset in the given Connector
[**create_connector**](ConnectorsApi.md#create_connector) | **POST** /connectors | Creates a new connector
[**create_migration_payload**](ConnectorsApi.md#create_migration_payload) | **POST** /connectors/{id}/migration-payloads | Uploads a flow snapshot payload for a later Connector migration request
[**create_migration_request**](ConnectorsApi.md#create_migration_request) | **POST** /connectors/{id}/migration-requests | Creates a Connector migration request
[**create_purge_request**](ConnectorsApi.md#create_purge_request) | **POST** /connectors/{id}/purge-requests | Creates a request to purge the FlowFiles for this connector
[**delete_configuration_step_verification_request**](ConnectorsApi.md#delete_configuration_step_verification_request) | **DELETE** /connectors/{id}/configuration-steps/{configurationStepName}/verify-config/{requestId} | Deletes the Verification Request with the given ID
[**delete_connector**](ConnectorsApi.md#delete_connector) | **DELETE** /connectors/{id} | Deletes a connector
[**delete_connector_backlog_request**](ConnectorsApi.md#delete_connector_backlog_request) | **DELETE** /connectors/{id}/backlog-requests/{requestId} | Deletes the Backlog Request with the given ID
[**delete_migration_request**](ConnectorsApi.md#delete_migration_request) | **DELETE** /connectors/{id}/migration-requests/{requestId} | Deletes the Connector migration request with the given ID
[**discard_connector_update**](ConnectorsApi.md#discard_connector_update) | **DELETE** /connectors/{id}/working-configuration | Discards the working configuration of a connector
[**end_troubleshooting**](ConnectorsApi.md#end_troubleshooting) | **DELETE** /connectors/{id}/troubleshooting | Transitions a Connector out of Troubleshooting mode
[**enter_troubleshooting**](ConnectorsApi.md#enter_troubleshooting) | **POST** /connectors/{id}/troubleshooting | Transitions a Connector into Troubleshooting mode
[**get_asset_content**](ConnectorsApi.md#get_asset_content) | **GET** /connectors/{id}/assets/{assetId} | Retrieves the content of the asset with the given id for a connector
[**get_assets**](ConnectorsApi.md#get_assets) | **GET** /connectors/{id}/assets | Lists the assets that belong to the Connector with the given ID
[**get_configuration_step_verification_request**](ConnectorsApi.md#get_configuration_step_verification_request) | **GET** /connectors/{id}/configuration-steps/{configurationStepName}/verify-config/{requestId} | Returns the Verification Request with the given ID
[**get_connector**](ConnectorsApi.md#get_connector) | **GET** /connectors/{id} | Gets a connector
[**get_connector_backlog_request**](ConnectorsApi.md#get_connector_backlog_request) | **GET** /connectors/{id}/backlog-requests/{requestId} | Returns the Backlog Request with the given ID
[**get_connector_configuration_step**](ConnectorsApi.md#get_connector_configuration_step) | **GET** /connectors/{id}/configuration-steps/{configurationStepName} | Gets a specific configuration step by name for a connector
[**get_connector_configuration_steps**](ConnectorsApi.md#get_connector_configuration_steps) | **GET** /connectors/{id}/configuration-steps | Gets all configuration step names for a connector
[**get_connector_connection_status_history**](ConnectorsApi.md#get_connector_connection_status_history) | **GET** /connectors/{id}/connections/{connectionId}/status/history | Gets the status history for a connection within a connector
[**get_connector_controller_service**](ConnectorsApi.md#get_connector_controller_service) | **GET** /connectors/{id}/controller-services/{controllerServiceId} | Gets a controller service within a connector
[**get_connector_controller_service_state**](ConnectorsApi.md#get_connector_controller_service_state) | **GET** /connectors/{id}/controller-services/{controllerServiceId}/state | Gets the state for a controller service within a connector
[**get_connector_process_group_status_history**](ConnectorsApi.md#get_connector_process_group_status_history) | **GET** /connectors/{id}/process-groups/{processGroupId}/status/history | Gets the status history for a process group within a connector
[**get_connector_processor_state**](ConnectorsApi.md#get_connector_processor_state) | **GET** /connectors/{id}/processors/{processorId}/state | Gets the state for a processor within a connector
[**get_connector_processor_status_history**](ConnectorsApi.md#get_connector_processor_status_history) | **GET** /connectors/{id}/processors/{processorId}/status/history | Gets the status history for a processor within a connector
[**get_connector_property_allowable_values**](ConnectorsApi.md#get_connector_property_allowable_values) | **GET** /connectors/{id}/configuration-steps/{configurationStepName}/property-groups/{propertyGroupName}/properties/{propertyName}/allowable-values | Gets the allowable values for a specific property in a connector&#x27;s configuration step
[**get_connector_remote_process_group_status_history**](ConnectorsApi.md#get_connector_remote_process_group_status_history) | **GET** /connectors/{id}/remote-process-groups/{remoteProcessGroupId}/status/history | Gets the status history for a remote process group within a connector
[**get_connector_status**](ConnectorsApi.md#get_connector_status) | **GET** /connectors/{id}/status | Gets the status for the process group managed by a connector
[**get_controller_services_from_connector_process_group**](ConnectorsApi.md#get_controller_services_from_connector_process_group) | **GET** /connectors/{connectorId}/flow/process-groups/{processGroupId}/controller-services | Gets all controller services for a process group within a connector
[**get_flow**](ConnectorsApi.md#get_flow) | **GET** /connectors/{connectorId}/flow/process-groups/{processGroupId} | Gets the flow for a process group within a connector
[**get_migration_request**](ConnectorsApi.md#get_migration_request) | **GET** /connectors/{id}/migration-requests/{requestId} | Gets the Connector migration request with the given ID
[**get_migration_sources**](ConnectorsApi.md#get_migration_sources) | **GET** /connectors/{id}/migration-sources | Lists the Versioned Process Groups that the Connector can be migrated from
[**get_parameter_context_for_connector_process_group**](ConnectorsApi.md#get_parameter_context_for_connector_process_group) | **GET** /connectors/{connectorId}/flow/process-groups/{processGroupId}/parameter-context | Gets the parameter context bound to a process group within a connector
[**get_purge_request**](ConnectorsApi.md#get_purge_request) | **GET** /connectors/{id}/purge-requests/{purge-request-id} | Gets the current status of a purge request for the specified connector
[**get_secrets**](ConnectorsApi.md#get_secrets) | **GET** /connectors/{id}/secrets | Gets all secrets available for configuring a connector
[**initiate_drain**](ConnectorsApi.md#initiate_drain) | **POST** /connectors/{id}/drain | Initiates draining of FlowFiles for a connector
[**remove_purge_request**](ConnectorsApi.md#remove_purge_request) | **DELETE** /connectors/{id}/purge-requests/{purge-request-id} | Cancels and/or removes a request to purge the FlowFiles for this connector
[**search_connector**](ConnectorsApi.md#search_connector) | **GET** /connectors/{id}/search-results | Performs a search against the encapsulated process group of this connector using the specified search term
[**submit_configuration_step_verification_request**](ConnectorsApi.md#submit_configuration_step_verification_request) | **POST** /connectors/{id}/configuration-steps/{configurationStepName}/verify-config | Performs verification of a configuration step for a connector
[**submit_connector_backlog_request**](ConnectorsApi.md#submit_connector_backlog_request) | **POST** /connectors/{id}/backlog-requests | Initiates a request to determine the current backlog for a Connector
[**update_connector**](ConnectorsApi.md#update_connector) | **PUT** /connectors/{id} | Updates a connector
[**update_connector_configuration_step**](ConnectorsApi.md#update_connector_configuration_step) | **PUT** /connectors/{id}/configuration-steps/{configurationStepName} | Updates a specific configuration step by name for a connector
[**update_run_status**](ConnectorsApi.md#update_run_status) | **PUT** /connectors/{id}/run-status | Updates run status of a connector

# **apply_connector_update**
> ConnectorEntity apply_connector_update(body, id)

Applies an update to a connector

This will apply any pending configuration changes to the connector. The client can poll the connector endpoint to check when the update is complete.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
body = swagger_client.ConnectorEntity() # ConnectorEntity | The connector configuration with revision.
id = 'id_example' # str | The connector id.

try:
    # Applies an update to a connector
    api_response = api_instance.apply_connector_update(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->apply_connector_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConnectorEntity**](ConnectorEntity.md)| The connector configuration with revision. | 
 **id** | **str**| The connector id. | 

### Return type

[**ConnectorEntity**](ConnectorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cancel_drain**
> ConnectorEntity cancel_drain(id, version=version, client_id=client_id, disconnected_node_acknowledged=disconnected_node_acknowledged)

Cancels the draining of FlowFiles for a connector

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connector id.
version = 789 # int | The revision is used to verify the client is working with the latest version of the flow. (optional)
client_id = 'client_id_example' # str | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. (optional)
disconnected_node_acknowledged = false # bool | Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional) (default to false)

try:
    # Cancels the draining of FlowFiles for a connector
    api_response = api_instance.cancel_drain(id, version=version, client_id=client_id, disconnected_node_acknowledged=disconnected_node_acknowledged)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->cancel_drain: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connector id. | 
 **version** | **int**| The revision is used to verify the client is working with the latest version of the flow. | [optional] 
 **client_id** | **str**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional] 
 **disconnected_node_acknowledged** | **bool**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**ConnectorEntity**](ConnectorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **clear_connector_controller_service_state**
> ComponentStateEntity clear_connector_controller_service_state(id, controller_service_id, body=body)

Clears the state for a controller service within a connector

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connector id.
controller_service_id = 'controller_service_id_example' # str | The controller service id.
body = swagger_client.ComponentStateEntity() # ComponentStateEntity | Optional component state to perform a selective key removal. If omitted, clears all state. (optional)

try:
    # Clears the state for a controller service within a connector
    api_response = api_instance.clear_connector_controller_service_state(id, controller_service_id, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->clear_connector_controller_service_state: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connector id. | 
 **controller_service_id** | **str**| The controller service id. | 
 **body** | [**ComponentStateEntity**](ComponentStateEntity.md)| Optional component state to perform a selective key removal. If omitted, clears all state. | [optional] 

### Return type

[**ComponentStateEntity**](ComponentStateEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: */*, application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **clear_connector_processor_state**
> ComponentStateEntity clear_connector_processor_state(id, processor_id, body=body)

Clears the state for a processor within a connector

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connector id.
processor_id = 'processor_id_example' # str | The processor id.
body = swagger_client.ComponentStateEntity() # ComponentStateEntity | Optional component state to perform a selective key removal. If omitted, clears all state. (optional)

try:
    # Clears the state for a processor within a connector
    api_response = api_instance.clear_connector_processor_state(id, processor_id, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->clear_connector_processor_state: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connector id. | 
 **processor_id** | **str**| The processor id. | 
 **body** | [**ComponentStateEntity**](ComponentStateEntity.md)| Optional component state to perform a selective key removal. If omitted, clears all state. | [optional] 

### Return type

[**ComponentStateEntity**](ComponentStateEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: */*, application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_asset**
> AssetEntity create_asset(body, id, filename=filename)

Creates a new Asset in the given Connector

This endpoint will create a new Asset in the Connector. The Asset will be created with the given name and the contents of the file that is uploaded.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
body = NULL # object | The contents of the asset
id = 'id_example' # str | 
filename = 'filename_example' # str |  (optional)

try:
    # Creates a new Asset in the given Connector
    api_response = api_instance.create_asset(body, id, filename=filename)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->create_asset: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**object**](object.md)| The contents of the asset | 
 **id** | **str**|  | 
 **filename** | **str**|  | [optional] 

### Return type

[**AssetEntity**](AssetEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_connector**
> ConnectorEntity create_connector(body)

Creates a new connector

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
body = swagger_client.ConnectorEntity() # ConnectorEntity | The connector configuration details.

try:
    # Creates a new connector
    api_response = api_instance.create_connector(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->create_connector: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConnectorEntity**](ConnectorEntity.md)| The connector configuration details. | 

### Return type

[**ConnectorEntity**](ConnectorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_migration_payload**
> MigrationPayloadEntity create_migration_payload(body, id)

Uploads a flow snapshot payload for a later Connector migration request

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
body = NULL # object | The migration payload snapshot
id = 'id_example' # str | 

try:
    # Uploads a flow snapshot payload for a later Connector migration request
    api_response = api_instance.create_migration_payload(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->create_migration_payload: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**object**](object.md)| The migration payload snapshot | 
 **id** | **str**|  | 

### Return type

[**MigrationPayloadEntity**](MigrationPayloadEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_migration_request**
> MigrationRequestEntity create_migration_request(id, body=body)

Creates a Connector migration request

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | 
body = swagger_client.MigrationRequestEntity() # MigrationRequestEntity |  (optional)

try:
    # Creates a Connector migration request
    api_response = api_instance.create_migration_request(id, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->create_migration_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 
 **body** | [**MigrationRequestEntity**](MigrationRequestEntity.md)|  | [optional] 

### Return type

[**MigrationRequestEntity**](MigrationRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_purge_request**
> DropRequestEntity create_purge_request(id)

Creates a request to purge the FlowFiles for this connector

This will create a request to purge all FlowFiles from the connector. The connector must be in a STOPPED state before purging can begin. This is an asynchronous operation. The client should poll the returned URI to get the status of the purge request.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connector id.

try:
    # Creates a request to purge the FlowFiles for this connector
    api_response = api_instance.create_purge_request(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->create_purge_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connector id. | 

### Return type

[**DropRequestEntity**](DropRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_configuration_step_verification_request**
> VerifyConnectorConfigStepRequestEntity delete_configuration_step_verification_request(id, configuration_step_name, request_id)

Deletes the Verification Request with the given ID

Deletes the Verification Request with the given ID. After a request is created, it is expected that the client will properly clean up the request by DELETE'ing it, once the Verification process has completed. If the request is deleted before the request completes, then the Verification request will finish the step that it is currently performing and then will cancel any subsequent steps.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connector id.
configuration_step_name = 'configuration_step_name_example' # str | The configuration step name.
request_id = 'request_id_example' # str | The ID of the Verification Request

try:
    # Deletes the Verification Request with the given ID
    api_response = api_instance.delete_configuration_step_verification_request(id, configuration_step_name, request_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->delete_configuration_step_verification_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connector id. | 
 **configuration_step_name** | **str**| The configuration step name. | 
 **request_id** | **str**| The ID of the Verification Request | 

### Return type

[**VerifyConnectorConfigStepRequestEntity**](VerifyConnectorConfigStepRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_connector**
> ConnectorEntity delete_connector(id, version=version, client_id=client_id, disconnected_node_acknowledged=disconnected_node_acknowledged)

Deletes a connector

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connector id.
version = 789 # int | The revision is used to verify the client is working with the latest version of the flow. (optional)
client_id = 'client_id_example' # str | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. (optional)
disconnected_node_acknowledged = false # bool | Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional) (default to false)

try:
    # Deletes a connector
    api_response = api_instance.delete_connector(id, version=version, client_id=client_id, disconnected_node_acknowledged=disconnected_node_acknowledged)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->delete_connector: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connector id. | 
 **version** | **int**| The revision is used to verify the client is working with the latest version of the flow. | [optional] 
 **client_id** | **str**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional] 
 **disconnected_node_acknowledged** | **bool**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**ConnectorEntity**](ConnectorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_connector_backlog_request**
> BacklogRequestEntity delete_connector_backlog_request(id, request_id)

Deletes the Backlog Request with the given ID

Deletes the Backlog Request with the given ID. After a request is created, it is expected that the client will properly clean up the request by DELETE'ing it once the backlog determination has completed. If the request is deleted before it completes, the background determination is cancelled.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connector id.
request_id = 'request_id_example' # str | The ID of the Backlog Request

try:
    # Deletes the Backlog Request with the given ID
    api_response = api_instance.delete_connector_backlog_request(id, request_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->delete_connector_backlog_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connector id. | 
 **request_id** | **str**| The ID of the Backlog Request | 

### Return type

[**BacklogRequestEntity**](BacklogRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_migration_request**
> MigrationRequestEntity delete_migration_request(id, request_id)

Deletes the Connector migration request with the given ID

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | 
request_id = 'request_id_example' # str | 

try:
    # Deletes the Connector migration request with the given ID
    api_response = api_instance.delete_migration_request(id, request_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->delete_migration_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 
 **request_id** | **str**|  | 

### Return type

[**MigrationRequestEntity**](MigrationRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **discard_connector_update**
> ConnectorEntity discard_connector_update(id, version=version, client_id=client_id, disconnected_node_acknowledged=disconnected_node_acknowledged)

Discards the working configuration of a connector

This will discard any pending configuration changes for the connector and revert to the last applied configuration.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connector id.
version = 789 # int | The revision is used to verify the client is working with the latest version of the flow. (optional)
client_id = 'client_id_example' # str | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. (optional)
disconnected_node_acknowledged = false # bool | Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional) (default to false)

try:
    # Discards the working configuration of a connector
    api_response = api_instance.discard_connector_update(id, version=version, client_id=client_id, disconnected_node_acknowledged=disconnected_node_acknowledged)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->discard_connector_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connector id. | 
 **version** | **int**| The revision is used to verify the client is working with the latest version of the flow. | [optional] 
 **client_id** | **str**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional] 
 **disconnected_node_acknowledged** | **bool**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**ConnectorEntity**](ConnectorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **end_troubleshooting**
> ConnectorEntity end_troubleshooting(id, version=version, client_id=client_id, disconnected_node_acknowledged=disconnected_node_acknowledged)

Transitions a Connector out of Troubleshooting mode

Ends Troubleshooting mode for the Connector, restoring the authoritative flow. All components in the managed flow must be stopped and disabled, and the managed flow must have no active tasks.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connector id.
version = 789 # int | The revision is used to verify the client is working with the latest version of the flow. (optional)
client_id = 'client_id_example' # str | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. (optional)
disconnected_node_acknowledged = false # bool | Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional) (default to false)

try:
    # Transitions a Connector out of Troubleshooting mode
    api_response = api_instance.end_troubleshooting(id, version=version, client_id=client_id, disconnected_node_acknowledged=disconnected_node_acknowledged)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->end_troubleshooting: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connector id. | 
 **version** | **int**| The revision is used to verify the client is working with the latest version of the flow. | [optional] 
 **client_id** | **str**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional] 
 **disconnected_node_acknowledged** | **bool**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**ConnectorEntity**](ConnectorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **enter_troubleshooting**
> ConnectorEntity enter_troubleshooting(body, id)

Transitions a Connector into Troubleshooting mode

Places the Connector into Troubleshooting mode so that its managed flow may be directly modified. Standard lifecycle operations are disabled while in Troubleshooting mode.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
body = swagger_client.ConnectorEntity() # ConnectorEntity | The connector entity with revision.
id = 'id_example' # str | The connector id.

try:
    # Transitions a Connector into Troubleshooting mode
    api_response = api_instance.enter_troubleshooting(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->enter_troubleshooting: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConnectorEntity**](ConnectorEntity.md)| The connector entity with revision. | 
 **id** | **str**| The connector id. | 

### Return type

[**ConnectorEntity**](ConnectorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_asset_content**
> str get_asset_content(id, asset_id)

Retrieves the content of the asset with the given id for a connector

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connector id.
asset_id = 'asset_id_example' # str | The asset id.

try:
    # Retrieves the content of the asset with the given id for a connector
    api_response = api_instance.get_asset_content(id, asset_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->get_asset_content: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connector id. | 
 **asset_id** | **str**| The asset id. | 

### Return type

**str**

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_assets**
> AssetsEntity get_assets(id)

Lists the assets that belong to the Connector with the given ID

Lists the assets that belong to the Connector with the given ID.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connector id.

try:
    # Lists the assets that belong to the Connector with the given ID
    api_response = api_instance.get_assets(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->get_assets: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connector id. | 

### Return type

[**AssetsEntity**](AssetsEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_configuration_step_verification_request**
> VerifyConnectorConfigStepRequestEntity get_configuration_step_verification_request(id, configuration_step_name, request_id)

Returns the Verification Request with the given ID

Returns the Verification Request with the given ID. Once a Verification Request has been created, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and any failures.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connector id.
configuration_step_name = 'configuration_step_name_example' # str | The configuration step name.
request_id = 'request_id_example' # str | The ID of the Verification Request

try:
    # Returns the Verification Request with the given ID
    api_response = api_instance.get_configuration_step_verification_request(id, configuration_step_name, request_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->get_configuration_step_verification_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connector id. | 
 **configuration_step_name** | **str**| The configuration step name. | 
 **request_id** | **str**| The ID of the Verification Request | 

### Return type

[**VerifyConnectorConfigStepRequestEntity**](VerifyConnectorConfigStepRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_connector**
> ConnectorEntity get_connector(id)

Gets a connector

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connector id.

try:
    # Gets a connector
    api_response = api_instance.get_connector(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->get_connector: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connector id. | 

### Return type

[**ConnectorEntity**](ConnectorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_connector_backlog_request**
> BacklogRequestEntity get_connector_backlog_request(id, request_id)

Returns the Backlog Request with the given ID

Returns the Backlog Request with the given ID. Once a Backlog Request has been created by performing a POST to /connectors/{id}/backlog-requests, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and the backlog once the request is complete.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connector id.
request_id = 'request_id_example' # str | The ID of the Backlog Request

try:
    # Returns the Backlog Request with the given ID
    api_response = api_instance.get_connector_backlog_request(id, request_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->get_connector_backlog_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connector id. | 
 **request_id** | **str**| The ID of the Backlog Request | 

### Return type

[**BacklogRequestEntity**](BacklogRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_connector_configuration_step**
> ConfigurationStepEntity get_connector_configuration_step(id, configuration_step_name)

Gets a specific configuration step by name for a connector

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connector id.
configuration_step_name = 'configuration_step_name_example' # str | The configuration step name.

try:
    # Gets a specific configuration step by name for a connector
    api_response = api_instance.get_connector_configuration_step(id, configuration_step_name)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->get_connector_configuration_step: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connector id. | 
 **configuration_step_name** | **str**| The configuration step name. | 

### Return type

[**ConfigurationStepEntity**](ConfigurationStepEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_connector_configuration_steps**
> ConfigurationStepNamesEntity get_connector_configuration_steps(id)

Gets all configuration step names for a connector

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connector id.

try:
    # Gets all configuration step names for a connector
    api_response = api_instance.get_connector_configuration_steps(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->get_connector_configuration_steps: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connector id. | 

### Return type

[**ConfigurationStepNamesEntity**](ConfigurationStepNamesEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_connector_connection_status_history**
> StatusHistoryEntity get_connector_connection_status_history(id, connection_id)

Gets the status history for a connection within a connector

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connector id.
connection_id = 'connection_id_example' # str | The connection id.

try:
    # Gets the status history for a connection within a connector
    api_response = api_instance.get_connector_connection_status_history(id, connection_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->get_connector_connection_status_history: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connector id. | 
 **connection_id** | **str**| The connection id. | 

### Return type

[**StatusHistoryEntity**](StatusHistoryEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_connector_controller_service**
> ControllerServiceEntity get_connector_controller_service(id, controller_service_id, ui_only=ui_only)

Gets a controller service within a connector

If the uiOnly query parameter is provided with a value of true, the returned entity may only contain fields that are necessary for rendering the NiFi User Interface. As such, the selected fields may change at any time, even during incremental releases, without warning. As a result, this parameter should not be provided by any client other than the UI.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connector id.
controller_service_id = 'controller_service_id_example' # str | The controller service id.
ui_only = false # bool |  (optional) (default to false)

try:
    # Gets a controller service within a connector
    api_response = api_instance.get_connector_controller_service(id, controller_service_id, ui_only=ui_only)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->get_connector_controller_service: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connector id. | 
 **controller_service_id** | **str**| The controller service id. | 
 **ui_only** | **bool**|  | [optional] [default to false]

### Return type

[**ControllerServiceEntity**](ControllerServiceEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_connector_controller_service_state**
> ComponentStateEntity get_connector_controller_service_state(id, controller_service_id)

Gets the state for a controller service within a connector

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connector id.
controller_service_id = 'controller_service_id_example' # str | The controller service id.

try:
    # Gets the state for a controller service within a connector
    api_response = api_instance.get_connector_controller_service_state(id, controller_service_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->get_connector_controller_service_state: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connector id. | 
 **controller_service_id** | **str**| The controller service id. | 

### Return type

[**ComponentStateEntity**](ComponentStateEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_connector_process_group_status_history**
> StatusHistoryEntity get_connector_process_group_status_history(id, process_group_id)

Gets the status history for a process group within a connector

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connector id.
process_group_id = 'process_group_id_example' # str | The process group id.

try:
    # Gets the status history for a process group within a connector
    api_response = api_instance.get_connector_process_group_status_history(id, process_group_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->get_connector_process_group_status_history: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connector id. | 
 **process_group_id** | **str**| The process group id. | 

### Return type

[**StatusHistoryEntity**](StatusHistoryEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_connector_processor_state**
> ComponentStateEntity get_connector_processor_state(id, processor_id)

Gets the state for a processor within a connector

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connector id.
processor_id = 'processor_id_example' # str | The processor id.

try:
    # Gets the state for a processor within a connector
    api_response = api_instance.get_connector_processor_state(id, processor_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->get_connector_processor_state: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connector id. | 
 **processor_id** | **str**| The processor id. | 

### Return type

[**ComponentStateEntity**](ComponentStateEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_connector_processor_status_history**
> StatusHistoryEntity get_connector_processor_status_history(id, processor_id)

Gets the status history for a processor within a connector

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connector id.
processor_id = 'processor_id_example' # str | The processor id.

try:
    # Gets the status history for a processor within a connector
    api_response = api_instance.get_connector_processor_status_history(id, processor_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->get_connector_processor_status_history: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connector id. | 
 **processor_id** | **str**| The processor id. | 

### Return type

[**StatusHistoryEntity**](StatusHistoryEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_connector_property_allowable_values**
> ConnectorPropertyAllowableValuesEntity get_connector_property_allowable_values(id, configuration_step_name, property_group_name, property_name, filter=filter)

Gets the allowable values for a specific property in a connector's configuration step

Gets the allowable values for a specific property that supports dynamic fetching of allowable values. The filter parameter can be used to narrow down the results based on the property's filtering logic.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connector id.
configuration_step_name = 'configuration_step_name_example' # str | The configuration step name.
property_group_name = 'property_group_name_example' # str | The property group name.
property_name = 'property_name_example' # str | The property name.
filter = 'filter_example' # str | Optional filter to narrow down the allowable values. (optional)

try:
    # Gets the allowable values for a specific property in a connector's configuration step
    api_response = api_instance.get_connector_property_allowable_values(id, configuration_step_name, property_group_name, property_name, filter=filter)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->get_connector_property_allowable_values: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connector id. | 
 **configuration_step_name** | **str**| The configuration step name. | 
 **property_group_name** | **str**| The property group name. | 
 **property_name** | **str**| The property name. | 
 **filter** | **str**| Optional filter to narrow down the allowable values. | [optional] 

### Return type

[**ConnectorPropertyAllowableValuesEntity**](ConnectorPropertyAllowableValuesEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_connector_remote_process_group_status_history**
> StatusHistoryEntity get_connector_remote_process_group_status_history(id, remote_process_group_id)

Gets the status history for a remote process group within a connector

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connector id.
remote_process_group_id = 'remote_process_group_id_example' # str | The remote process group id.

try:
    # Gets the status history for a remote process group within a connector
    api_response = api_instance.get_connector_remote_process_group_status_history(id, remote_process_group_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->get_connector_remote_process_group_status_history: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connector id. | 
 **remote_process_group_id** | **str**| The remote process group id. | 

### Return type

[**StatusHistoryEntity**](StatusHistoryEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_connector_status**
> ProcessGroupStatusEntity get_connector_status(id, recursive=recursive, nodewise=nodewise, cluster_node_id=cluster_node_id)

Gets the status for the process group managed by a connector

Returns the status for the process group managed by the specified connector. The status includes status for all descendent components. When invoked with recursive set to true, it will return the current status of every component in the connector's encapsulated flow.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connector id.
recursive = false # bool | Whether all descendant groups and the status of their content will be included. Optional, defaults to false (optional) (default to false)
nodewise = false # bool | Whether or not to include the breakdown per node. Optional, defaults to false (optional) (default to false)
cluster_node_id = 'cluster_node_id_example' # str | The id of the node where to get the status. (optional)

try:
    # Gets the status for the process group managed by a connector
    api_response = api_instance.get_connector_status(id, recursive=recursive, nodewise=nodewise, cluster_node_id=cluster_node_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->get_connector_status: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connector id. | 
 **recursive** | **bool**| Whether all descendant groups and the status of their content will be included. Optional, defaults to false | [optional] [default to false]
 **nodewise** | **bool**| Whether or not to include the breakdown per node. Optional, defaults to false | [optional] [default to false]
 **cluster_node_id** | **str**| The id of the node where to get the status. | [optional] 

### Return type

[**ProcessGroupStatusEntity**](ProcessGroupStatusEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_controller_services_from_connector_process_group**
> ControllerServicesEntity get_controller_services_from_connector_process_group(connector_id, process_group_id, include_ancestor_groups=include_ancestor_groups, include_descendant_groups=include_descendant_groups, include_referencing_components=include_referencing_components)

Gets all controller services for a process group within a connector

Returns the controller services for the specified process group within the connector's hierarchy. The processGroupId can be obtained from the managedProcessGroupId field of the ConnectorDTO for the root process group, or from child process groups within the flow.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
connector_id = 'connector_id_example' # str | The connector id.
process_group_id = 'process_group_id_example' # str | The process group id.
include_ancestor_groups = true # bool | Whether or not to include parent/ancestor process groups (optional) (default to true)
include_descendant_groups = false # bool | Whether or not to include descendant process groups (optional) (default to false)
include_referencing_components = true # bool | Whether or not to include services' referencing components in the response (optional) (default to true)

try:
    # Gets all controller services for a process group within a connector
    api_response = api_instance.get_controller_services_from_connector_process_group(connector_id, process_group_id, include_ancestor_groups=include_ancestor_groups, include_descendant_groups=include_descendant_groups, include_referencing_components=include_referencing_components)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->get_controller_services_from_connector_process_group: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connector_id** | **str**| The connector id. | 
 **process_group_id** | **str**| The process group id. | 
 **include_ancestor_groups** | **bool**| Whether or not to include parent/ancestor process groups | [optional] [default to true]
 **include_descendant_groups** | **bool**| Whether or not to include descendant process groups | [optional] [default to false]
 **include_referencing_components** | **bool**| Whether or not to include services&#x27; referencing components in the response | [optional] [default to true]

### Return type

[**ControllerServicesEntity**](ControllerServicesEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_flow**
> ProcessGroupFlowEntity get_flow(connector_id, process_group_id, ui_only=ui_only)

Gets the flow for a process group within a connector

Returns the flow for the specified process group within the connector's hierarchy. The processGroupId can be obtained from the managedProcessGroupId field of the ConnectorDTO for the root process group, or from child process groups within the flow. If the uiOnly query parameter is provided with a value of true, the returned entity may only contain fields that are necessary for rendering the NiFi User Interface. As such, the selected fields may change at any time, even during incremental releases, without warning. As a result, this parameter should not be provided by any client other than the UI.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
connector_id = 'connector_id_example' # str | The connector id.
process_group_id = 'process_group_id_example' # str | The process group id.
ui_only = false # bool | Whether to return only UI-specific fields (optional) (default to false)

try:
    # Gets the flow for a process group within a connector
    api_response = api_instance.get_flow(connector_id, process_group_id, ui_only=ui_only)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->get_flow: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connector_id** | **str**| The connector id. | 
 **process_group_id** | **str**| The process group id. | 
 **ui_only** | **bool**| Whether to return only UI-specific fields | [optional] [default to false]

### Return type

[**ProcessGroupFlowEntity**](ProcessGroupFlowEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_migration_request**
> MigrationRequestEntity get_migration_request(id, request_id)

Gets the Connector migration request with the given ID

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | 
request_id = 'request_id_example' # str | 

try:
    # Gets the Connector migration request with the given ID
    api_response = api_instance.get_migration_request(id, request_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->get_migration_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 
 **request_id** | **str**|  | 

### Return type

[**MigrationRequestEntity**](MigrationRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_migration_sources**
> VersionedFlowMigrationSourcesEntity get_migration_sources(id)

Lists the Versioned Process Groups that the Connector can be migrated from

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | 

try:
    # Lists the Versioned Process Groups that the Connector can be migrated from
    api_response = api_instance.get_migration_sources(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->get_migration_sources: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**|  | 

### Return type

[**VersionedFlowMigrationSourcesEntity**](VersionedFlowMigrationSourcesEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_parameter_context_for_connector_process_group**
> ParameterContextEntity get_parameter_context_for_connector_process_group(connector_id, process_group_id)

Gets the parameter context bound to a process group within a connector

Returns the parameter context (with effective parameters, including those inherited from other contexts) bound to the specified process group within the connector's hierarchy. Sensitive parameter values are masked. Returns 204 No Content if the process group has no bound parameter context.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
connector_id = 'connector_id_example' # str | The connector id.
process_group_id = 'process_group_id_example' # str | The process group id.

try:
    # Gets the parameter context bound to a process group within a connector
    api_response = api_instance.get_parameter_context_for_connector_process_group(connector_id, process_group_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->get_parameter_context_for_connector_process_group: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **connector_id** | **str**| The connector id. | 
 **process_group_id** | **str**| The process group id. | 

### Return type

[**ParameterContextEntity**](ParameterContextEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_purge_request**
> DropRequestEntity get_purge_request(id, purge_request_id)

Gets the current status of a purge request for the specified connector

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connector id.
purge_request_id = 'purge_request_id_example' # str | The purge request id.

try:
    # Gets the current status of a purge request for the specified connector
    api_response = api_instance.get_purge_request(id, purge_request_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->get_purge_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connector id. | 
 **purge_request_id** | **str**| The purge request id. | 

### Return type

[**DropRequestEntity**](DropRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_secrets**
> SecretsEntity get_secrets(id)

Gets all secrets available for configuring a connector

Returns metadata for all secrets available from all secret providers. This endpoint is used when configuring a connector to discover available secrets. Note: Actual secret values are not included in the response for security reasons.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connector id.

try:
    # Gets all secrets available for configuring a connector
    api_response = api_instance.get_secrets(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->get_secrets: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connector id. | 

### Return type

[**SecretsEntity**](SecretsEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **initiate_drain**
> ConnectorEntity initiate_drain(body, id)

Initiates draining of FlowFiles for a connector

This will initiate draining of FlowFiles for a stopped connector. Draining allows the connector to process data that is currently in the flow but does not ingest any additional data. The connector must be in a STOPPED state before draining can begin. Once initiated, the connector will transition to a DRAINING state. Use the DELETE method on this endpoint to cancel an ongoing drain operation.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
body = swagger_client.ConnectorEntity() # ConnectorEntity | The connector entity with revision.
id = 'id_example' # str | The connector id.

try:
    # Initiates draining of FlowFiles for a connector
    api_response = api_instance.initiate_drain(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->initiate_drain: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConnectorEntity**](ConnectorEntity.md)| The connector entity with revision. | 
 **id** | **str**| The connector id. | 

### Return type

[**ConnectorEntity**](ConnectorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_purge_request**
> DropRequestEntity remove_purge_request(id, purge_request_id)

Cancels and/or removes a request to purge the FlowFiles for this connector

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connector id.
purge_request_id = 'purge_request_id_example' # str | The purge request id.

try:
    # Cancels and/or removes a request to purge the FlowFiles for this connector
    api_response = api_instance.remove_purge_request(id, purge_request_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->remove_purge_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connector id. | 
 **purge_request_id** | **str**| The purge request id. | 

### Return type

[**DropRequestEntity**](DropRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **search_connector**
> SearchResultsEntity search_connector(id, q=q)

Performs a search against the encapsulated process group of this connector using the specified search term

Only search results from authorized components will be returned.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connector id.
q = '' # str | The search term. (optional)

try:
    # Performs a search against the encapsulated process group of this connector using the specified search term
    api_response = api_instance.search_connector(id, q=q)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->search_connector: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connector id. | 
 **q** | **str**| The search term. | [optional] 

### Return type

[**SearchResultsEntity**](SearchResultsEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_configuration_step_verification_request**
> VerifyConnectorConfigStepRequestEntity submit_configuration_step_verification_request(body, id, configuration_step_name)

Performs verification of a configuration step for a connector

This will initiate the process of verifying a given Connector Configuration Step. This may be a long-running task. As a result, this endpoint will immediately return a VerifyConnectorConfigStepRequestEntity, and the process of performing the verification will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /connectors/{connectorId}/configuration-steps/{stepName}/verify-config/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /connectors/{connectorId}/configuration-steps/{stepName}/verify-config/{requestId}.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
body = swagger_client.VerifyConnectorConfigStepRequestEntity() # VerifyConnectorConfigStepRequestEntity | The verify config request entity containing the configuration step to verify.
id = 'id_example' # str | The connector id.
configuration_step_name = 'configuration_step_name_example' # str | The configuration step name.

try:
    # Performs verification of a configuration step for a connector
    api_response = api_instance.submit_configuration_step_verification_request(body, id, configuration_step_name)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->submit_configuration_step_verification_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VerifyConnectorConfigStepRequestEntity**](VerifyConnectorConfigStepRequestEntity.md)| The verify config request entity containing the configuration step to verify. | 
 **id** | **str**| The connector id. | 
 **configuration_step_name** | **str**| The configuration step name. | 

### Return type

[**VerifyConnectorConfigStepRequestEntity**](VerifyConnectorConfigStepRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_connector_backlog_request**
> BacklogRequestEntity submit_connector_backlog_request(id)

Initiates a request to determine the current backlog for a Connector

This will initiate the process of determining the backlog for a Connector. This may be a long-running task. As a result, this endpoint will immediately return a BacklogRequestEntity, and the process of determining the backlog will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /connectors/{id}/backlog-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /connectors/{id}/backlog-requests/{requestId}.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connector id.

try:
    # Initiates a request to determine the current backlog for a Connector
    api_response = api_instance.submit_connector_backlog_request(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->submit_connector_backlog_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connector id. | 

### Return type

[**BacklogRequestEntity**](BacklogRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_connector**
> ConnectorEntity update_connector(body, id)

Updates a connector

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
body = swagger_client.ConnectorEntity() # ConnectorEntity | The connector configuration details.
id = 'id_example' # str | The connector id.

try:
    # Updates a connector
    api_response = api_instance.update_connector(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->update_connector: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConnectorEntity**](ConnectorEntity.md)| The connector configuration details. | 
 **id** | **str**| The connector id. | 

### Return type

[**ConnectorEntity**](ConnectorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_connector_configuration_step**
> ConfigurationStepEntity update_connector_configuration_step(body, id, configuration_step_name)

Updates a specific configuration step by name for a connector

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
body = swagger_client.ConfigurationStepEntity() # ConfigurationStepEntity | The configuration step configuration.
id = 'id_example' # str | The connector id.
configuration_step_name = 'configuration_step_name_example' # str | The configuration step name.

try:
    # Updates a specific configuration step by name for a connector
    api_response = api_instance.update_connector_configuration_step(body, id, configuration_step_name)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->update_connector_configuration_step: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConfigurationStepEntity**](ConfigurationStepEntity.md)| The configuration step configuration. | 
 **id** | **str**| The connector id. | 
 **configuration_step_name** | **str**| The configuration step name. | 

### Return type

[**ConfigurationStepEntity**](ConfigurationStepEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_run_status**
> ConnectorEntity update_run_status(body, id)

Updates run status of a connector

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.ConnectorsApi(swagger_client.ApiClient(configuration))
body = swagger_client.ConnectorRunStatusEntity() # ConnectorRunStatusEntity | The connector run status.
id = 'id_example' # str | The connector id.

try:
    # Updates run status of a connector
    api_response = api_instance.update_run_status(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectorsApi->update_run_status: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConnectorRunStatusEntity**](ConnectorRunStatusEntity.md)| The connector run status. | 
 **id** | **str**| The connector id. | 

### Return type

[**ConnectorEntity**](ConnectorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

