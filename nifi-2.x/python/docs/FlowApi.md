# swagger_client.FlowApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activate_controller_services**](FlowApi.md#activate_controller_services) | **PUT** /flow/process-groups/{id}/controller-services | Enable or disable Controller Services in the specified Process Group.
[**clear_bulletins**](FlowApi.md#clear_bulletins) | **POST** /flow/process-groups/{id}/bulletins/clear-requests | Clears bulletins for components in the specified Process Group.
[**download_reporting_task_snapshot**](FlowApi.md#download_reporting_task_snapshot) | **GET** /flow/reporting-tasks/download | Download a snapshot of the given reporting tasks and any controller services they use
[**generate_client_id**](FlowApi.md#generate_client_id) | **GET** /flow/client-id | Generates a client id.
[**get_about_info**](FlowApi.md#get_about_info) | **GET** /flow/about | Retrieves details about this NiFi to put in the About dialog
[**get_action**](FlowApi.md#get_action) | **GET** /flow/history/{id} | Gets an action
[**get_additional_details**](FlowApi.md#get_additional_details) | **GET** /flow/additional-details/{group}/{artifact}/{version}/{type} | Retrieves the additional details for the specified component type.
[**get_all_flow_analysis_results**](FlowApi.md#get_all_flow_analysis_results) | **GET** /flow/flow-analysis/results | Returns all flow analysis results currently in effect
[**get_banners**](FlowApi.md#get_banners) | **GET** /flow/banners | Retrieves the banners for this NiFi
[**get_branches**](FlowApi.md#get_branches) | **GET** /flow/registries/{id}/branches | Gets the branches from the specified registry for the current user
[**get_breadcrumbs**](FlowApi.md#get_breadcrumbs) | **GET** /flow/process-groups/{id}/breadcrumbs | Gets the breadcrumbs for a process group
[**get_buckets**](FlowApi.md#get_buckets) | **GET** /flow/registries/{id}/buckets | Gets the buckets from the specified registry for the current user
[**get_bulletin_board**](FlowApi.md#get_bulletin_board) | **GET** /flow/bulletin-board | Gets current bulletins
[**get_bulletins**](FlowApi.md#get_bulletins) | **GET** /flow/controller/bulletins | Retrieves Controller level bulletins
[**get_cluster_summary**](FlowApi.md#get_cluster_summary) | **GET** /flow/cluster/summary | The cluster summary for this NiFi
[**get_component_history**](FlowApi.md#get_component_history) | **GET** /flow/history/components/{componentId} | Gets configuration history for a component
[**get_connection_statistics**](FlowApi.md#get_connection_statistics) | **GET** /flow/connections/{id}/statistics | Gets statistics for a connection
[**get_connection_status**](FlowApi.md#get_connection_status) | **GET** /flow/connections/{id}/status | Gets status for a connection
[**get_connection_status_history**](FlowApi.md#get_connection_status_history) | **GET** /flow/connections/{id}/status/history | Gets the status history for a connection
[**get_connector_definition**](FlowApi.md#get_connector_definition) | **GET** /flow/connector-definition/{group}/{artifact}/{version}/{type} | Retrieves the Connector Definition for the specified component type.
[**get_connector_types**](FlowApi.md#get_connector_types) | **GET** /flow/connector-types | Retrieves the types of connectors that this NiFi supports
[**get_connectors**](FlowApi.md#get_connectors) | **GET** /flow/connectors | Gets all connectors
[**get_content_viewers**](FlowApi.md#get_content_viewers) | **GET** /flow/content-viewers | Retrieves the registered content viewers
[**get_controller_service_definition**](FlowApi.md#get_controller_service_definition) | **GET** /flow/controller-service-definition/{group}/{artifact}/{version}/{type} | Retrieves the Controller Service Definition for the specified component type.
[**get_controller_service_types**](FlowApi.md#get_controller_service_types) | **GET** /flow/controller-service-types | Retrieves the types of controller services that this NiFi supports
[**get_controller_services_from_controller**](FlowApi.md#get_controller_services_from_controller) | **GET** /flow/controller/controller-services | Gets controller services for reporting tasks
[**get_controller_services_from_group**](FlowApi.md#get_controller_services_from_group) | **GET** /flow/process-groups/{id}/controller-services | Gets all controller services
[**get_controller_status**](FlowApi.md#get_controller_status) | **GET** /flow/status | Gets the current status of this NiFi
[**get_current_user**](FlowApi.md#get_current_user) | **GET** /flow/current-user | Retrieves the user identity of the user making the request
[**get_details**](FlowApi.md#get_details) | **GET** /flow/registries/{registry-id}/buckets/{bucket-id}/flows/{flow-id}/details | Gets the details of a flow from the specified registry and bucket for the specified flow for the current user
[**get_flow**](FlowApi.md#get_flow) | **GET** /flow/process-groups/{id} | Gets a process group
[**get_flow_analysis_results**](FlowApi.md#get_flow_analysis_results) | **GET** /flow/flow-analysis/results/{processGroupId} | Returns flow analysis results produced by the analysis of a given process group
[**get_flow_analysis_rule_definition**](FlowApi.md#get_flow_analysis_rule_definition) | **GET** /flow/flow-analysis-rule-definition/{group}/{artifact}/{version}/{type} | Retrieves the Flow Analysis Rule Definition for the specified component type.
[**get_flow_analysis_rule_types**](FlowApi.md#get_flow_analysis_rule_types) | **GET** /flow/flow-analysis-rule-types | Retrieves the types of available Flow Analysis Rules
[**get_flow_config**](FlowApi.md#get_flow_config) | **GET** /flow/config | Retrieves the configuration for this NiFi flow
[**get_flow_metrics**](FlowApi.md#get_flow_metrics) | **GET** /flow/metrics/{producer} | Gets all metrics for the flow from a particular node
[**get_flow_registry_client_definition**](FlowApi.md#get_flow_registry_client_definition) | **GET** /flow/flow-registry-client-definition/{group}/{artifact}/{version}/{type} | Retrieves the Flow Registry Client Definition for the specified component type.
[**get_flows**](FlowApi.md#get_flows) | **GET** /flow/registries/{registry-id}/buckets/{bucket-id}/flows | Gets the flows from the specified registry and bucket for the current user
[**get_input_port_status**](FlowApi.md#get_input_port_status) | **GET** /flow/input-ports/{id}/status | Gets status for an input port
[**get_listen_ports**](FlowApi.md#get_listen_ports) | **GET** /flow/listen-ports | Gets all listen ports configured on this NiFi that the current user has access to
[**get_output_port_status**](FlowApi.md#get_output_port_status) | **GET** /flow/output-ports/{id}/status | Gets status for an output port
[**get_parameter_contexts**](FlowApi.md#get_parameter_contexts) | **GET** /flow/parameter-contexts | Gets all Parameter Contexts
[**get_parameter_provider_definition**](FlowApi.md#get_parameter_provider_definition) | **GET** /flow/parameter-provider-definition/{group}/{artifact}/{version}/{type} | Retrieves the Parameter Provider Definition for the specified component type.
[**get_parameter_provider_types**](FlowApi.md#get_parameter_provider_types) | **GET** /flow/parameter-provider-types | Retrieves the types of parameter providers that this NiFi supports
[**get_parameter_providers**](FlowApi.md#get_parameter_providers) | **GET** /flow/parameter-providers | Gets all parameter providers
[**get_prioritizers**](FlowApi.md#get_prioritizers) | **GET** /flow/prioritizers | Retrieves the types of prioritizers that this NiFi supports
[**get_process_group_status**](FlowApi.md#get_process_group_status) | **GET** /flow/process-groups/{id}/status | Gets the status for a process group
[**get_process_group_status_history**](FlowApi.md#get_process_group_status_history) | **GET** /flow/process-groups/{id}/status/history | Gets status history for a remote process group
[**get_processor_definition**](FlowApi.md#get_processor_definition) | **GET** /flow/processor-definition/{group}/{artifact}/{version}/{type} | Retrieves the Processor Definition for the specified component type.
[**get_processor_status**](FlowApi.md#get_processor_status) | **GET** /flow/processors/{id}/status | Gets status for a processor
[**get_processor_status_history**](FlowApi.md#get_processor_status_history) | **GET** /flow/processors/{id}/status/history | Gets status history for a processor
[**get_processor_types**](FlowApi.md#get_processor_types) | **GET** /flow/processor-types | Retrieves the types of processors that this NiFi supports
[**get_registry_clients**](FlowApi.md#get_registry_clients) | **GET** /flow/registries | Gets the listing of available flow registry clients
[**get_remote_process_group_status**](FlowApi.md#get_remote_process_group_status) | **GET** /flow/remote-process-groups/{id}/status | Gets status for a remote process group
[**get_remote_process_group_status_history**](FlowApi.md#get_remote_process_group_status_history) | **GET** /flow/remote-process-groups/{id}/status/history | Gets the status history
[**get_reporting_task_definition**](FlowApi.md#get_reporting_task_definition) | **GET** /flow/reporting-task-definition/{group}/{artifact}/{version}/{type} | Retrieves the Reporting Task Definition for the specified component type.
[**get_reporting_task_snapshot**](FlowApi.md#get_reporting_task_snapshot) | **GET** /flow/reporting-tasks/snapshot | Get a snapshot of the given reporting tasks and any controller services they use
[**get_reporting_task_types**](FlowApi.md#get_reporting_task_types) | **GET** /flow/reporting-task-types | Retrieves the types of reporting tasks that this NiFi supports
[**get_reporting_tasks**](FlowApi.md#get_reporting_tasks) | **GET** /flow/reporting-tasks | Gets all reporting tasks
[**get_runtime_manifest**](FlowApi.md#get_runtime_manifest) | **GET** /flow/runtime-manifest | Retrieves the runtime manifest for this NiFi instance.
[**get_step_documentation**](FlowApi.md#get_step_documentation) | **GET** /flow/steps/{group}/{artifact}/{version}/{connectorType}/{stepName} | Retrieves the step documentation for the specified Connector configuration step.
[**get_version_differences**](FlowApi.md#get_version_differences) | **GET** /flow/registries/{registry-id}/branches/{branch-id-a}/buckets/{bucket-id-a}/flows/{flow-id-a}/{version-a}/diff/branches/{branch-id-b}/buckets/{bucket-id-b}/flows/{flow-id-b}/{version-b} | Gets the differences between two versions of the same versioned flow, the basis of the comparison will be the first version
[**get_versions**](FlowApi.md#get_versions) | **GET** /flow/registries/{registry-id}/buckets/{bucket-id}/flows/{flow-id}/versions | Gets the flow versions from the specified registry and bucket for the specified flow for the current user
[**query_history**](FlowApi.md#query_history) | **GET** /flow/history | Gets configuration history
[**schedule_components**](FlowApi.md#schedule_components) | **PUT** /flow/process-groups/{id} | Schedule or unschedule components in the specified Process Group.
[**search_cluster**](FlowApi.md#search_cluster) | **GET** /flow/cluster/search-results | Searches the cluster for a node with the specified address
[**search_flow**](FlowApi.md#search_flow) | **GET** /flow/search-results | Performs a search against this NiFi using the specified search term

# **activate_controller_services**
> ActivateControllerServicesEntity activate_controller_services(body, id)

Enable or disable Controller Services in the specified Process Group.

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
body = swagger_client.ActivateControllerServicesEntity() # ActivateControllerServicesEntity | The request to schedule or unschedule. If the components in the request are not specified, all authorized components will be considered.
id = 'id_example' # str | The process group id.

try:
    # Enable or disable Controller Services in the specified Process Group.
    api_response = api_instance.activate_controller_services(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->activate_controller_services: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ActivateControllerServicesEntity**](ActivateControllerServicesEntity.md)| The request to schedule or unschedule. If the components in the request are not specified, all authorized components will be considered. | 
 **id** | **str**| The process group id. | 

### Return type

[**ActivateControllerServicesEntity**](ActivateControllerServicesEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **clear_bulletins**
> ClearBulletinsForGroupResultsEntity clear_bulletins(body, id)

Clears bulletins for components in the specified Process Group.

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
body = swagger_client.ClearBulletinsForGroupRequestEntity() # ClearBulletinsForGroupRequestEntity | The request to clear bulletins. If the components in the request are not specified, all authorized components will be considered.
id = 'id_example' # str | The process group id.

try:
    # Clears bulletins for components in the specified Process Group.
    api_response = api_instance.clear_bulletins(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->clear_bulletins: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClearBulletinsForGroupRequestEntity**](ClearBulletinsForGroupRequestEntity.md)| The request to clear bulletins. If the components in the request are not specified, all authorized components will be considered. | 
 **id** | **str**| The process group id. | 

### Return type

[**ClearBulletinsForGroupResultsEntity**](ClearBulletinsForGroupResultsEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **download_reporting_task_snapshot**
> str download_reporting_task_snapshot(reporting_task_id=reporting_task_id)

Download a snapshot of the given reporting tasks and any controller services they use

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
reporting_task_id = 'reporting_task_id_example' # str | Specifies a reporting task id to export. If not specified, all reporting tasks will be exported. (optional)

try:
    # Download a snapshot of the given reporting tasks and any controller services they use
    api_response = api_instance.download_reporting_task_snapshot(reporting_task_id=reporting_task_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->download_reporting_task_snapshot: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reporting_task_id** | **str**| Specifies a reporting task id to export. If not specified, all reporting tasks will be exported. | [optional] 

### Return type

**str**

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_client_id**
> str generate_client_id()

Generates a client id.

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))

try:
    # Generates a client id.
    api_response = api_instance.generate_client_id()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->generate_client_id: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

**str**

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_about_info**
> AboutEntity get_about_info()

Retrieves details about this NiFi to put in the About dialog

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))

try:
    # Retrieves details about this NiFi to put in the About dialog
    api_response = api_instance.get_about_info()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_about_info: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AboutEntity**](AboutEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_action**
> ActionEntity get_action(id)

Gets an action

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
id = 56 # int | The action id.

try:
    # Gets an action
    api_response = api_instance.get_action(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_action: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The action id. | 

### Return type

[**ActionEntity**](ActionEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_additional_details**
> AdditionalDetailsEntity get_additional_details(group, artifact, version, type)

Retrieves the additional details for the specified component type.

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
group = 'group_example' # str | The bundle group
artifact = 'artifact_example' # str | The bundle artifact
version = 'version_example' # str | The bundle version
type = 'type_example' # str | The processor type

try:
    # Retrieves the additional details for the specified component type.
    api_response = api_instance.get_additional_details(group, artifact, version, type)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_additional_details: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **str**| The bundle group | 
 **artifact** | **str**| The bundle artifact | 
 **version** | **str**| The bundle version | 
 **type** | **str**| The processor type | 

### Return type

[**AdditionalDetailsEntity**](AdditionalDetailsEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_all_flow_analysis_results**
> FlowAnalysisResultEntity get_all_flow_analysis_results()

Returns all flow analysis results currently in effect

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))

try:
    # Returns all flow analysis results currently in effect
    api_response = api_instance.get_all_flow_analysis_results()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_all_flow_analysis_results: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FlowAnalysisResultEntity**](FlowAnalysisResultEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_banners**
> BannerEntity get_banners()

Retrieves the banners for this NiFi

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))

try:
    # Retrieves the banners for this NiFi
    api_response = api_instance.get_banners()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_banners: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BannerEntity**](BannerEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_branches**
> FlowRegistryBranchesEntity get_branches(id)

Gets the branches from the specified registry for the current user

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The registry id.

try:
    # Gets the branches from the specified registry for the current user
    api_response = api_instance.get_branches(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_branches: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The registry id. | 

### Return type

[**FlowRegistryBranchesEntity**](FlowRegistryBranchesEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_breadcrumbs**
> FlowBreadcrumbEntity get_breadcrumbs(id)

Gets the breadcrumbs for a process group

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The process group id.

try:
    # Gets the breadcrumbs for a process group
    api_response = api_instance.get_breadcrumbs(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_breadcrumbs: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 

### Return type

[**FlowBreadcrumbEntity**](FlowBreadcrumbEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_buckets**
> FlowRegistryBucketsEntity get_buckets(id, branch=branch)

Gets the buckets from the specified registry for the current user

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The registry id.
branch = 'branch_example' # str | The name of a branch to get the buckets from. If not specified the default branch of the registry client will be used. (optional)

try:
    # Gets the buckets from the specified registry for the current user
    api_response = api_instance.get_buckets(id, branch=branch)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_buckets: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The registry id. | 
 **branch** | **str**| The name of a branch to get the buckets from. If not specified the default branch of the registry client will be used. | [optional] 

### Return type

[**FlowRegistryBucketsEntity**](FlowRegistryBucketsEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_bulletin_board**
> BulletinBoardEntity get_bulletin_board(after=after, source_name=source_name, message=message, source_id=source_id, group_id=group_id, limit=limit)

Gets current bulletins

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
after = 789 # int | Includes bulletins with an id after this value. (optional)
source_name = 'source_name_example' # str | Includes bulletins originating from this sources whose name match this regular expression. (optional)
message = 'message_example' # str | Includes bulletins whose message that match this regular expression. (optional)
source_id = 'source_id_example' # str | Includes bulletins originating from this sources whose id match this regular expression. (optional)
group_id = 'group_id_example' # str | Includes bulletins originating from this sources whose group id match this regular expression. (optional)
limit = 56 # int | The number of bulletins to limit the response to. Optional, default is no limit. (optional)

try:
    # Gets current bulletins
    api_response = api_instance.get_bulletin_board(after=after, source_name=source_name, message=message, source_id=source_id, group_id=group_id, limit=limit)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_bulletin_board: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | **int**| Includes bulletins with an id after this value. | [optional] 
 **source_name** | **str**| Includes bulletins originating from this sources whose name match this regular expression. | [optional] 
 **message** | **str**| Includes bulletins whose message that match this regular expression. | [optional] 
 **source_id** | **str**| Includes bulletins originating from this sources whose id match this regular expression. | [optional] 
 **group_id** | **str**| Includes bulletins originating from this sources whose group id match this regular expression. | [optional] 
 **limit** | **int**| The number of bulletins to limit the response to. Optional, default is no limit. | [optional] 

### Return type

[**BulletinBoardEntity**](BulletinBoardEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_bulletins**
> ControllerBulletinsEntity get_bulletins()

Retrieves Controller level bulletins

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))

try:
    # Retrieves Controller level bulletins
    api_response = api_instance.get_bulletins()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_bulletins: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ControllerBulletinsEntity**](ControllerBulletinsEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_cluster_summary**
> ClusterSummaryEntity get_cluster_summary()

The cluster summary for this NiFi

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))

try:
    # The cluster summary for this NiFi
    api_response = api_instance.get_cluster_summary()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_cluster_summary: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClusterSummaryEntity**](ClusterSummaryEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_component_history**
> ComponentHistoryEntity get_component_history(component_id)

Gets configuration history for a component

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
component_id = 'component_id_example' # str | The component id.

try:
    # Gets configuration history for a component
    api_response = api_instance.get_component_history(component_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_component_history: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **component_id** | **str**| The component id. | 

### Return type

[**ComponentHistoryEntity**](ComponentHistoryEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_connection_statistics**
> ConnectionStatisticsEntity get_connection_statistics(id, nodewise=nodewise, cluster_node_id=cluster_node_id)

Gets statistics for a connection

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connection id.
nodewise = false # bool | Whether or not to include the breakdown per node. Optional, defaults to false (optional) (default to false)
cluster_node_id = 'cluster_node_id_example' # str | The id of the node where to get the statistics. (optional)

try:
    # Gets statistics for a connection
    api_response = api_instance.get_connection_statistics(id, nodewise=nodewise, cluster_node_id=cluster_node_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_connection_statistics: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connection id. | 
 **nodewise** | **bool**| Whether or not to include the breakdown per node. Optional, defaults to false | [optional] [default to false]
 **cluster_node_id** | **str**| The id of the node where to get the statistics. | [optional] 

### Return type

[**ConnectionStatisticsEntity**](ConnectionStatisticsEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_connection_status**
> ConnectionStatusEntity get_connection_status(id, nodewise=nodewise, cluster_node_id=cluster_node_id)

Gets status for a connection

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connection id.
nodewise = false # bool | Whether or not to include the breakdown per node. Optional, defaults to false (optional) (default to false)
cluster_node_id = 'cluster_node_id_example' # str | The id of the node where to get the status. (optional)

try:
    # Gets status for a connection
    api_response = api_instance.get_connection_status(id, nodewise=nodewise, cluster_node_id=cluster_node_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_connection_status: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connection id. | 
 **nodewise** | **bool**| Whether or not to include the breakdown per node. Optional, defaults to false | [optional] [default to false]
 **cluster_node_id** | **str**| The id of the node where to get the status. | [optional] 

### Return type

[**ConnectionStatusEntity**](ConnectionStatusEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_connection_status_history**
> StatusHistoryEntity get_connection_status_history(id)

Gets the status history for a connection

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connection id.

try:
    # Gets the status history for a connection
    api_response = api_instance.get_connection_status_history(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_connection_status_history: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connection id. | 

### Return type

[**StatusHistoryEntity**](StatusHistoryEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_connector_definition**
> ConnectorDefinition get_connector_definition(group, artifact, version, type)

Retrieves the Connector Definition for the specified component type.

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
group = 'group_example' # str | The bundle group
artifact = 'artifact_example' # str | The bundle artifact
version = 'version_example' # str | The bundle version
type = 'type_example' # str | The connector type

try:
    # Retrieves the Connector Definition for the specified component type.
    api_response = api_instance.get_connector_definition(group, artifact, version, type)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_connector_definition: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **str**| The bundle group | 
 **artifact** | **str**| The bundle artifact | 
 **version** | **str**| The bundle version | 
 **type** | **str**| The connector type | 

### Return type

[**ConnectorDefinition**](ConnectorDefinition.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_connector_types**
> ConnectorTypesEntity get_connector_types(bundle_group_filter=bundle_group_filter, bundle_artifact_filter=bundle_artifact_filter, type=type)

Retrieves the types of connectors that this NiFi supports

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
bundle_group_filter = 'bundle_group_filter_example' # str | If specified, will only return types that are a member of this bundle group. (optional)
bundle_artifact_filter = 'bundle_artifact_filter_example' # str | If specified, will only return types that are a member of this bundle artifact. (optional)
type = 'type_example' # str | If specified, will only return types whose fully qualified classname matches. (optional)

try:
    # Retrieves the types of connectors that this NiFi supports
    api_response = api_instance.get_connector_types(bundle_group_filter=bundle_group_filter, bundle_artifact_filter=bundle_artifact_filter, type=type)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_connector_types: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundle_group_filter** | **str**| If specified, will only return types that are a member of this bundle group. | [optional] 
 **bundle_artifact_filter** | **str**| If specified, will only return types that are a member of this bundle artifact. | [optional] 
 **type** | **str**| If specified, will only return types whose fully qualified classname matches. | [optional] 

### Return type

[**ConnectorTypesEntity**](ConnectorTypesEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_connectors**
> ConnectorsEntity get_connectors()

Gets all connectors

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))

try:
    # Gets all connectors
    api_response = api_instance.get_connectors()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_connectors: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ConnectorsEntity**](ConnectorsEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_content_viewers**
> ContentViewerEntity get_content_viewers()

Retrieves the registered content viewers

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))

try:
    # Retrieves the registered content viewers
    api_response = api_instance.get_content_viewers()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_content_viewers: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ContentViewerEntity**](ContentViewerEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_controller_service_definition**
> ControllerServiceDefinition get_controller_service_definition(group, artifact, version, type)

Retrieves the Controller Service Definition for the specified component type.

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
group = 'group_example' # str | The bundle group
artifact = 'artifact_example' # str | The bundle artifact
version = 'version_example' # str | The bundle version
type = 'type_example' # str | The controller service type

try:
    # Retrieves the Controller Service Definition for the specified component type.
    api_response = api_instance.get_controller_service_definition(group, artifact, version, type)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_controller_service_definition: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **str**| The bundle group | 
 **artifact** | **str**| The bundle artifact | 
 **version** | **str**| The bundle version | 
 **type** | **str**| The controller service type | 

### Return type

[**ControllerServiceDefinition**](ControllerServiceDefinition.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_controller_service_types**
> ControllerServiceTypesEntity get_controller_service_types(service_type=service_type, service_bundle_group=service_bundle_group, service_bundle_artifact=service_bundle_artifact, service_bundle_version=service_bundle_version, bundle_group_filter=bundle_group_filter, bundle_artifact_filter=bundle_artifact_filter, type_filter=type_filter)

Retrieves the types of controller services that this NiFi supports

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
service_type = 'service_type_example' # str | If specified, will only return controller services that are compatible with this type of service. (optional)
service_bundle_group = 'service_bundle_group_example' # str | If serviceType specified, is the bundle group of the serviceType. (optional)
service_bundle_artifact = 'service_bundle_artifact_example' # str | If serviceType specified, is the bundle artifact of the serviceType. (optional)
service_bundle_version = 'service_bundle_version_example' # str | If serviceType specified, is the bundle version of the serviceType. (optional)
bundle_group_filter = 'bundle_group_filter_example' # str | If specified, will only return types that are a member of this bundle group. (optional)
bundle_artifact_filter = 'bundle_artifact_filter_example' # str | If specified, will only return types that are a member of this bundle artifact. (optional)
type_filter = 'type_filter_example' # str | If specified, will only return types whose fully qualified classname matches. (optional)

try:
    # Retrieves the types of controller services that this NiFi supports
    api_response = api_instance.get_controller_service_types(service_type=service_type, service_bundle_group=service_bundle_group, service_bundle_artifact=service_bundle_artifact, service_bundle_version=service_bundle_version, bundle_group_filter=bundle_group_filter, bundle_artifact_filter=bundle_artifact_filter, type_filter=type_filter)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_controller_service_types: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **service_type** | **str**| If specified, will only return controller services that are compatible with this type of service. | [optional] 
 **service_bundle_group** | **str**| If serviceType specified, is the bundle group of the serviceType. | [optional] 
 **service_bundle_artifact** | **str**| If serviceType specified, is the bundle artifact of the serviceType. | [optional] 
 **service_bundle_version** | **str**| If serviceType specified, is the bundle version of the serviceType. | [optional] 
 **bundle_group_filter** | **str**| If specified, will only return types that are a member of this bundle group. | [optional] 
 **bundle_artifact_filter** | **str**| If specified, will only return types that are a member of this bundle artifact. | [optional] 
 **type_filter** | **str**| If specified, will only return types whose fully qualified classname matches. | [optional] 

### Return type

[**ControllerServiceTypesEntity**](ControllerServiceTypesEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_controller_services_from_controller**
> ControllerServicesEntity get_controller_services_from_controller(include_referencing_components=include_referencing_components, ui_only=ui_only)

Gets controller services for reporting tasks

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
include_referencing_components = true # bool | Whether or not to include services' referencing components in the response (optional) (default to true)
ui_only = false # bool |  (optional) (default to false)

try:
    # Gets controller services for reporting tasks
    api_response = api_instance.get_controller_services_from_controller(include_referencing_components=include_referencing_components, ui_only=ui_only)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_controller_services_from_controller: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include_referencing_components** | **bool**| Whether or not to include services&#x27; referencing components in the response | [optional] [default to true]
 **ui_only** | **bool**|  | [optional] [default to false]

### Return type

[**ControllerServicesEntity**](ControllerServicesEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_controller_services_from_group**
> ControllerServicesEntity get_controller_services_from_group(id, include_ancestor_groups=include_ancestor_groups, include_descendant_groups=include_descendant_groups, include_referencing_components=include_referencing_components, ui_only=ui_only)

Gets all controller services

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The process group id.
include_ancestor_groups = true # bool | Whether or not to include parent/ancestor process groups (optional) (default to true)
include_descendant_groups = false # bool | Whether or not to include descendant process groups (optional) (default to false)
include_referencing_components = true # bool | Whether or not to include services' referencing components in the response (optional) (default to true)
ui_only = false # bool |  (optional) (default to false)

try:
    # Gets all controller services
    api_response = api_instance.get_controller_services_from_group(id, include_ancestor_groups=include_ancestor_groups, include_descendant_groups=include_descendant_groups, include_referencing_components=include_referencing_components, ui_only=ui_only)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_controller_services_from_group: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 
 **include_ancestor_groups** | **bool**| Whether or not to include parent/ancestor process groups | [optional] [default to true]
 **include_descendant_groups** | **bool**| Whether or not to include descendant process groups | [optional] [default to false]
 **include_referencing_components** | **bool**| Whether or not to include services&#x27; referencing components in the response | [optional] [default to true]
 **ui_only** | **bool**|  | [optional] [default to false]

### Return type

[**ControllerServicesEntity**](ControllerServicesEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_controller_status**
> ControllerStatusEntity get_controller_status()

Gets the current status of this NiFi

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))

try:
    # Gets the current status of this NiFi
    api_response = api_instance.get_controller_status()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_controller_status: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ControllerStatusEntity**](ControllerStatusEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_current_user**
> CurrentUserEntity get_current_user()

Retrieves the user identity of the user making the request

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))

try:
    # Retrieves the user identity of the user making the request
    api_response = api_instance.get_current_user()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_current_user: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CurrentUserEntity**](CurrentUserEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_details**
> VersionedFlowEntity get_details(registry_id, bucket_id, flow_id, branch=branch)

Gets the details of a flow from the specified registry and bucket for the specified flow for the current user

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
registry_id = 'registry_id_example' # str | The registry client id.
bucket_id = 'bucket_id_example' # str | The bucket id.
flow_id = 'flow_id_example' # str | The flow id.
branch = 'branch_example' # str | The name of a branch to get the flow from. If not specified the default branch of the registry client will be used. (optional)

try:
    # Gets the details of a flow from the specified registry and bucket for the specified flow for the current user
    api_response = api_instance.get_details(registry_id, bucket_id, flow_id, branch=branch)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_details: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registry_id** | **str**| The registry client id. | 
 **bucket_id** | **str**| The bucket id. | 
 **flow_id** | **str**| The flow id. | 
 **branch** | **str**| The name of a branch to get the flow from. If not specified the default branch of the registry client will be used. | [optional] 

### Return type

[**VersionedFlowEntity**](VersionedFlowEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_flow**
> ProcessGroupFlowEntity get_flow(id, ui_only=ui_only)

Gets a process group

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The process group id.
ui_only = false # bool |  (optional) (default to false)

try:
    # Gets a process group
    api_response = api_instance.get_flow(id, ui_only=ui_only)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_flow: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 
 **ui_only** | **bool**|  | [optional] [default to false]

### Return type

[**ProcessGroupFlowEntity**](ProcessGroupFlowEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_flow_analysis_results**
> FlowAnalysisResultEntity get_flow_analysis_results(process_group_id)

Returns flow analysis results produced by the analysis of a given process group

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
process_group_id = 'process_group_id_example' # str | The id of the process group representing (a part of) the flow to be analyzed.

try:
    # Returns flow analysis results produced by the analysis of a given process group
    api_response = api_instance.get_flow_analysis_results(process_group_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_flow_analysis_results: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **process_group_id** | **str**| The id of the process group representing (a part of) the flow to be analyzed. | 

### Return type

[**FlowAnalysisResultEntity**](FlowAnalysisResultEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_flow_analysis_rule_definition**
> FlowAnalysisRuleDefinition get_flow_analysis_rule_definition(group, artifact, version, type)

Retrieves the Flow Analysis Rule Definition for the specified component type.

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
group = 'group_example' # str | The bundle group
artifact = 'artifact_example' # str | The bundle artifact
version = 'version_example' # str | The bundle version
type = 'type_example' # str | The flow analysis rule type

try:
    # Retrieves the Flow Analysis Rule Definition for the specified component type.
    api_response = api_instance.get_flow_analysis_rule_definition(group, artifact, version, type)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_flow_analysis_rule_definition: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **str**| The bundle group | 
 **artifact** | **str**| The bundle artifact | 
 **version** | **str**| The bundle version | 
 **type** | **str**| The flow analysis rule type | 

### Return type

[**FlowAnalysisRuleDefinition**](FlowAnalysisRuleDefinition.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_flow_analysis_rule_types**
> FlowAnalysisRuleTypesEntity get_flow_analysis_rule_types(bundle_group_filter=bundle_group_filter, bundle_artifact_filter=bundle_artifact_filter, type=type)

Retrieves the types of available Flow Analysis Rules

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
bundle_group_filter = 'bundle_group_filter_example' # str | If specified, will only return types that are a member of this bundle group. (optional)
bundle_artifact_filter = 'bundle_artifact_filter_example' # str | If specified, will only return types that are a member of this bundle artifact. (optional)
type = 'type_example' # str | If specified, will only return types whose fully qualified classname matches. (optional)

try:
    # Retrieves the types of available Flow Analysis Rules
    api_response = api_instance.get_flow_analysis_rule_types(bundle_group_filter=bundle_group_filter, bundle_artifact_filter=bundle_artifact_filter, type=type)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_flow_analysis_rule_types: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundle_group_filter** | **str**| If specified, will only return types that are a member of this bundle group. | [optional] 
 **bundle_artifact_filter** | **str**| If specified, will only return types that are a member of this bundle artifact. | [optional] 
 **type** | **str**| If specified, will only return types whose fully qualified classname matches. | [optional] 

### Return type

[**FlowAnalysisRuleTypesEntity**](FlowAnalysisRuleTypesEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_flow_config**
> FlowConfigurationEntity get_flow_config()

Retrieves the configuration for this NiFi flow

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))

try:
    # Retrieves the configuration for this NiFi flow
    api_response = api_instance.get_flow_config()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_flow_config: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FlowConfigurationEntity**](FlowConfigurationEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_flow_metrics**
> StreamingOutput get_flow_metrics(producer, included_registries=included_registries, sample_name=sample_name, sample_label_value=sample_label_value, root_field_name=root_field_name, flow_metrics_reporting_strategy=flow_metrics_reporting_strategy)

Gets all metrics for the flow from a particular node

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
producer = 'producer_example' # str | The producer for flow file metrics. Each producer may have its own output format.
included_registries = 'included_registries_example' # str | Set of included metrics registries. Duplicate the parameter to include multiple registries. All registries are included by default. (optional)
sample_name = 'sample_name_example' # str | Regular Expression Pattern to be applied against the sample name field (optional)
sample_label_value = 'sample_label_value_example' # str | Regular Expression Pattern to be applied against the sample label value field (optional)
root_field_name = 'root_field_name_example' # str | Name of the first field of JSON object. Applicable for JSON producer only. (optional)
flow_metrics_reporting_strategy = 'ALL_COMPONENTS' # str | Flow metrics reporting strategy limits collected metrics (optional) (default to ALL_COMPONENTS)

try:
    # Gets all metrics for the flow from a particular node
    api_response = api_instance.get_flow_metrics(producer, included_registries=included_registries, sample_name=sample_name, sample_label_value=sample_label_value, root_field_name=root_field_name, flow_metrics_reporting_strategy=flow_metrics_reporting_strategy)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_flow_metrics: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **producer** | **str**| The producer for flow file metrics. Each producer may have its own output format. | 
 **included_registries** | **str**| Set of included metrics registries. Duplicate the parameter to include multiple registries. All registries are included by default. | [optional] 
 **sample_name** | **str**| Regular Expression Pattern to be applied against the sample name field | [optional] 
 **sample_label_value** | **str**| Regular Expression Pattern to be applied against the sample label value field | [optional] 
 **root_field_name** | **str**| Name of the first field of JSON object. Applicable for JSON producer only. | [optional] 
 **flow_metrics_reporting_strategy** | **str**| Flow metrics reporting strategy limits collected metrics | [optional] [default to ALL_COMPONENTS]

### Return type

[**StreamingOutput**](StreamingOutput.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_flow_registry_client_definition**
> FlowRegistryClientDefinition get_flow_registry_client_definition(group, artifact, version, type)

Retrieves the Flow Registry Client Definition for the specified component type.

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
group = 'group_example' # str | The bundle group
artifact = 'artifact_example' # str | The bundle artifact
version = 'version_example' # str | The bundle version
type = 'type_example' # str | The flow registry client type

try:
    # Retrieves the Flow Registry Client Definition for the specified component type.
    api_response = api_instance.get_flow_registry_client_definition(group, artifact, version, type)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_flow_registry_client_definition: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **str**| The bundle group | 
 **artifact** | **str**| The bundle artifact | 
 **version** | **str**| The bundle version | 
 **type** | **str**| The flow registry client type | 

### Return type

[**FlowRegistryClientDefinition**](FlowRegistryClientDefinition.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_flows**
> VersionedFlowsEntity get_flows(registry_id, bucket_id, branch=branch)

Gets the flows from the specified registry and bucket for the current user

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
registry_id = 'registry_id_example' # str | The registry client id.
bucket_id = 'bucket_id_example' # str | The bucket id.
branch = 'branch_example' # str | The name of a branch to get the flows from. If not specified the default branch of the registry client will be used. (optional)

try:
    # Gets the flows from the specified registry and bucket for the current user
    api_response = api_instance.get_flows(registry_id, bucket_id, branch=branch)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_flows: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registry_id** | **str**| The registry client id. | 
 **bucket_id** | **str**| The bucket id. | 
 **branch** | **str**| The name of a branch to get the flows from. If not specified the default branch of the registry client will be used. | [optional] 

### Return type

[**VersionedFlowsEntity**](VersionedFlowsEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_input_port_status**
> PortStatusEntity get_input_port_status(id, nodewise=nodewise, cluster_node_id=cluster_node_id)

Gets status for an input port

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The input port id.
nodewise = false # bool | Whether or not to include the breakdown per node. Optional, defaults to false (optional) (default to false)
cluster_node_id = 'cluster_node_id_example' # str | The id of the node where to get the status. (optional)

try:
    # Gets status for an input port
    api_response = api_instance.get_input_port_status(id, nodewise=nodewise, cluster_node_id=cluster_node_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_input_port_status: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The input port id. | 
 **nodewise** | **bool**| Whether or not to include the breakdown per node. Optional, defaults to false | [optional] [default to false]
 **cluster_node_id** | **str**| The id of the node where to get the status. | [optional] 

### Return type

[**PortStatusEntity**](PortStatusEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_listen_ports**
> ListenPortsEntity get_listen_ports()

Gets all listen ports configured on this NiFi that the current user has access to

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))

try:
    # Gets all listen ports configured on this NiFi that the current user has access to
    api_response = api_instance.get_listen_ports()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_listen_ports: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ListenPortsEntity**](ListenPortsEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_output_port_status**
> PortStatusEntity get_output_port_status(id, nodewise=nodewise, cluster_node_id=cluster_node_id)

Gets status for an output port

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The output port id.
nodewise = false # bool | Whether or not to include the breakdown per node. Optional, defaults to false (optional) (default to false)
cluster_node_id = 'cluster_node_id_example' # str | The id of the node where to get the status. (optional)

try:
    # Gets status for an output port
    api_response = api_instance.get_output_port_status(id, nodewise=nodewise, cluster_node_id=cluster_node_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_output_port_status: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The output port id. | 
 **nodewise** | **bool**| Whether or not to include the breakdown per node. Optional, defaults to false | [optional] [default to false]
 **cluster_node_id** | **str**| The id of the node where to get the status. | [optional] 

### Return type

[**PortStatusEntity**](PortStatusEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_parameter_contexts**
> ParameterContextsEntity get_parameter_contexts()

Gets all Parameter Contexts

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))

try:
    # Gets all Parameter Contexts
    api_response = api_instance.get_parameter_contexts()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_parameter_contexts: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ParameterContextsEntity**](ParameterContextsEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_parameter_provider_definition**
> ParameterProviderDefinition get_parameter_provider_definition(group, artifact, version, type)

Retrieves the Parameter Provider Definition for the specified component type.

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
group = 'group_example' # str | The bundle group
artifact = 'artifact_example' # str | The bundle artifact
version = 'version_example' # str | The bundle version
type = 'type_example' # str | The parameter provider type

try:
    # Retrieves the Parameter Provider Definition for the specified component type.
    api_response = api_instance.get_parameter_provider_definition(group, artifact, version, type)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_parameter_provider_definition: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **str**| The bundle group | 
 **artifact** | **str**| The bundle artifact | 
 **version** | **str**| The bundle version | 
 **type** | **str**| The parameter provider type | 

### Return type

[**ParameterProviderDefinition**](ParameterProviderDefinition.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_parameter_provider_types**
> ParameterProviderTypesEntity get_parameter_provider_types(bundle_group_filter=bundle_group_filter, bundle_artifact_filter=bundle_artifact_filter, type=type)

Retrieves the types of parameter providers that this NiFi supports

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
bundle_group_filter = 'bundle_group_filter_example' # str | If specified, will only return types that are a member of this bundle group. (optional)
bundle_artifact_filter = 'bundle_artifact_filter_example' # str | If specified, will only return types that are a member of this bundle artifact. (optional)
type = 'type_example' # str | If specified, will only return types whose fully qualified classname matches. (optional)

try:
    # Retrieves the types of parameter providers that this NiFi supports
    api_response = api_instance.get_parameter_provider_types(bundle_group_filter=bundle_group_filter, bundle_artifact_filter=bundle_artifact_filter, type=type)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_parameter_provider_types: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundle_group_filter** | **str**| If specified, will only return types that are a member of this bundle group. | [optional] 
 **bundle_artifact_filter** | **str**| If specified, will only return types that are a member of this bundle artifact. | [optional] 
 **type** | **str**| If specified, will only return types whose fully qualified classname matches. | [optional] 

### Return type

[**ParameterProviderTypesEntity**](ParameterProviderTypesEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_parameter_providers**
> ParameterProvidersEntity get_parameter_providers()

Gets all parameter providers

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))

try:
    # Gets all parameter providers
    api_response = api_instance.get_parameter_providers()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_parameter_providers: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ParameterProvidersEntity**](ParameterProvidersEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_prioritizers**
> PrioritizerTypesEntity get_prioritizers()

Retrieves the types of prioritizers that this NiFi supports

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))

try:
    # Retrieves the types of prioritizers that this NiFi supports
    api_response = api_instance.get_prioritizers()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_prioritizers: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PrioritizerTypesEntity**](PrioritizerTypesEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_process_group_status**
> ProcessGroupStatusEntity get_process_group_status(id, recursive=recursive, nodewise=nodewise, cluster_node_id=cluster_node_id)

Gets the status for a process group

The status for a process group includes status for all descendent components. When invoked on the root group with recursive set to true, it will return the current status of every component in the flow.

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The process group id.
recursive = false # bool | Whether all descendant groups and the status of their content will be included. Optional, defaults to false (optional) (default to false)
nodewise = false # bool | Whether or not to include the breakdown per node. Optional, defaults to false (optional) (default to false)
cluster_node_id = 'cluster_node_id_example' # str | The id of the node where to get the status. (optional)

try:
    # Gets the status for a process group
    api_response = api_instance.get_process_group_status(id, recursive=recursive, nodewise=nodewise, cluster_node_id=cluster_node_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_process_group_status: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 
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

# **get_process_group_status_history**
> StatusHistoryEntity get_process_group_status_history(id)

Gets status history for a remote process group

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The process group id.

try:
    # Gets status history for a remote process group
    api_response = api_instance.get_process_group_status_history(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_process_group_status_history: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 

### Return type

[**StatusHistoryEntity**](StatusHistoryEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_processor_definition**
> ProcessorDefinition get_processor_definition(group, artifact, version, type)

Retrieves the Processor Definition for the specified component type.

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
group = 'group_example' # str | The bundle group
artifact = 'artifact_example' # str | The bundle artifact
version = 'version_example' # str | The bundle version
type = 'type_example' # str | The processor type

try:
    # Retrieves the Processor Definition for the specified component type.
    api_response = api_instance.get_processor_definition(group, artifact, version, type)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_processor_definition: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **str**| The bundle group | 
 **artifact** | **str**| The bundle artifact | 
 **version** | **str**| The bundle version | 
 **type** | **str**| The processor type | 

### Return type

[**ProcessorDefinition**](ProcessorDefinition.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_processor_status**
> ProcessorStatusEntity get_processor_status(id, nodewise=nodewise, cluster_node_id=cluster_node_id)

Gets status for a processor

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The processor id.
nodewise = false # bool | Whether or not to include the breakdown per node. Optional, defaults to false (optional) (default to false)
cluster_node_id = 'cluster_node_id_example' # str | The id of the node where to get the status. (optional)

try:
    # Gets status for a processor
    api_response = api_instance.get_processor_status(id, nodewise=nodewise, cluster_node_id=cluster_node_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_processor_status: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The processor id. | 
 **nodewise** | **bool**| Whether or not to include the breakdown per node. Optional, defaults to false | [optional] [default to false]
 **cluster_node_id** | **str**| The id of the node where to get the status. | [optional] 

### Return type

[**ProcessorStatusEntity**](ProcessorStatusEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_processor_status_history**
> StatusHistoryEntity get_processor_status_history(id)

Gets status history for a processor

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The processor id.

try:
    # Gets status history for a processor
    api_response = api_instance.get_processor_status_history(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_processor_status_history: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The processor id. | 

### Return type

[**StatusHistoryEntity**](StatusHistoryEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_processor_types**
> ProcessorTypesEntity get_processor_types(bundle_group_filter=bundle_group_filter, bundle_artifact_filter=bundle_artifact_filter, type=type)

Retrieves the types of processors that this NiFi supports

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
bundle_group_filter = 'bundle_group_filter_example' # str | If specified, will only return types that are a member of this bundle group. (optional)
bundle_artifact_filter = 'bundle_artifact_filter_example' # str | If specified, will only return types that are a member of this bundle artifact. (optional)
type = 'type_example' # str | If specified, will only return types whose fully qualified classname matches. (optional)

try:
    # Retrieves the types of processors that this NiFi supports
    api_response = api_instance.get_processor_types(bundle_group_filter=bundle_group_filter, bundle_artifact_filter=bundle_artifact_filter, type=type)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_processor_types: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundle_group_filter** | **str**| If specified, will only return types that are a member of this bundle group. | [optional] 
 **bundle_artifact_filter** | **str**| If specified, will only return types that are a member of this bundle artifact. | [optional] 
 **type** | **str**| If specified, will only return types whose fully qualified classname matches. | [optional] 

### Return type

[**ProcessorTypesEntity**](ProcessorTypesEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_registry_clients**
> FlowRegistryClientsEntity get_registry_clients()

Gets the listing of available flow registry clients

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))

try:
    # Gets the listing of available flow registry clients
    api_response = api_instance.get_registry_clients()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_registry_clients: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FlowRegistryClientsEntity**](FlowRegistryClientsEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_remote_process_group_status**
> RemoteProcessGroupStatusEntity get_remote_process_group_status(id, nodewise=nodewise, cluster_node_id=cluster_node_id)

Gets status for a remote process group

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The remote process group id.
nodewise = false # bool | Whether or not to include the breakdown per node. Optional, defaults to false (optional) (default to false)
cluster_node_id = 'cluster_node_id_example' # str | The id of the node where to get the status. (optional)

try:
    # Gets status for a remote process group
    api_response = api_instance.get_remote_process_group_status(id, nodewise=nodewise, cluster_node_id=cluster_node_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_remote_process_group_status: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The remote process group id. | 
 **nodewise** | **bool**| Whether or not to include the breakdown per node. Optional, defaults to false | [optional] [default to false]
 **cluster_node_id** | **str**| The id of the node where to get the status. | [optional] 

### Return type

[**RemoteProcessGroupStatusEntity**](RemoteProcessGroupStatusEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_remote_process_group_status_history**
> StatusHistoryEntity get_remote_process_group_status_history(id)

Gets the status history

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The remote process group id.

try:
    # Gets the status history
    api_response = api_instance.get_remote_process_group_status_history(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_remote_process_group_status_history: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The remote process group id. | 

### Return type

[**StatusHistoryEntity**](StatusHistoryEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_reporting_task_definition**
> ReportingTaskDefinition get_reporting_task_definition(group, artifact, version, type)

Retrieves the Reporting Task Definition for the specified component type.

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
group = 'group_example' # str | The bundle group
artifact = 'artifact_example' # str | The bundle artifact
version = 'version_example' # str | The bundle version
type = 'type_example' # str | The reporting task type

try:
    # Retrieves the Reporting Task Definition for the specified component type.
    api_response = api_instance.get_reporting_task_definition(group, artifact, version, type)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_reporting_task_definition: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **str**| The bundle group | 
 **artifact** | **str**| The bundle artifact | 
 **version** | **str**| The bundle version | 
 **type** | **str**| The reporting task type | 

### Return type

[**ReportingTaskDefinition**](ReportingTaskDefinition.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_reporting_task_snapshot**
> VersionedReportingTaskSnapshot get_reporting_task_snapshot(reporting_task_id=reporting_task_id)

Get a snapshot of the given reporting tasks and any controller services they use

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
reporting_task_id = 'reporting_task_id_example' # str | Specifies a reporting task id to export. If not specified, all reporting tasks will be exported. (optional)

try:
    # Get a snapshot of the given reporting tasks and any controller services they use
    api_response = api_instance.get_reporting_task_snapshot(reporting_task_id=reporting_task_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_reporting_task_snapshot: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reporting_task_id** | **str**| Specifies a reporting task id to export. If not specified, all reporting tasks will be exported. | [optional] 

### Return type

[**VersionedReportingTaskSnapshot**](VersionedReportingTaskSnapshot.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_reporting_task_types**
> ReportingTaskTypesEntity get_reporting_task_types(bundle_group_filter=bundle_group_filter, bundle_artifact_filter=bundle_artifact_filter, type=type)

Retrieves the types of reporting tasks that this NiFi supports

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
bundle_group_filter = 'bundle_group_filter_example' # str | If specified, will only return types that are a member of this bundle group. (optional)
bundle_artifact_filter = 'bundle_artifact_filter_example' # str | If specified, will only return types that are a member of this bundle artifact. (optional)
type = 'type_example' # str | If specified, will only return types whose fully qualified classname matches. (optional)

try:
    # Retrieves the types of reporting tasks that this NiFi supports
    api_response = api_instance.get_reporting_task_types(bundle_group_filter=bundle_group_filter, bundle_artifact_filter=bundle_artifact_filter, type=type)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_reporting_task_types: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundle_group_filter** | **str**| If specified, will only return types that are a member of this bundle group. | [optional] 
 **bundle_artifact_filter** | **str**| If specified, will only return types that are a member of this bundle artifact. | [optional] 
 **type** | **str**| If specified, will only return types whose fully qualified classname matches. | [optional] 

### Return type

[**ReportingTaskTypesEntity**](ReportingTaskTypesEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_reporting_tasks**
> ReportingTasksEntity get_reporting_tasks()

Gets all reporting tasks

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))

try:
    # Gets all reporting tasks
    api_response = api_instance.get_reporting_tasks()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_reporting_tasks: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ReportingTasksEntity**](ReportingTasksEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_runtime_manifest**
> RuntimeManifestEntity get_runtime_manifest()

Retrieves the runtime manifest for this NiFi instance.

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))

try:
    # Retrieves the runtime manifest for this NiFi instance.
    api_response = api_instance.get_runtime_manifest()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_runtime_manifest: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RuntimeManifestEntity**](RuntimeManifestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_step_documentation**
> StepDocumentationEntity get_step_documentation(group, artifact, version, connector_type, step_name)

Retrieves the step documentation for the specified Connector configuration step.

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
group = 'group_example' # str | The bundle group
artifact = 'artifact_example' # str | The bundle artifact
version = 'version_example' # str | The bundle version
connector_type = 'connector_type_example' # str | The fully qualified Connector type
step_name = 'step_name_example' # str | The configuration step name

try:
    # Retrieves the step documentation for the specified Connector configuration step.
    api_response = api_instance.get_step_documentation(group, artifact, version, connector_type, step_name)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_step_documentation: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **str**| The bundle group | 
 **artifact** | **str**| The bundle artifact | 
 **version** | **str**| The bundle version | 
 **connector_type** | **str**| The fully qualified Connector type | 
 **step_name** | **str**| The configuration step name | 

### Return type

[**StepDocumentationEntity**](StepDocumentationEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_version_differences**
> FlowComparisonEntity get_version_differences(registry_id, branch_id_a, bucket_id_a, flow_id_a, version_a, branch_id_b, bucket_id_b, flow_id_b, version_b, offset=offset, limit=limit)

Gets the differences between two versions of the same versioned flow, the basis of the comparison will be the first version

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
registry_id = 'registry_id_example' # str | The registry client id.
branch_id_a = 'branch_id_a_example' # str | The branch id for the base version.
bucket_id_a = 'bucket_id_a_example' # str | The bucket id for the base version.
flow_id_a = 'flow_id_a_example' # str | The flow id for the base version.
version_a = 'version_a_example' # str | The base version.
branch_id_b = 'branch_id_b_example' # str | The branch id for the compared version.
bucket_id_b = 'bucket_id_b_example' # str | The bucket id for the compared version.
flow_id_b = 'flow_id_b_example' # str | The flow id for the compared version.
version_b = 'version_b_example' # str | The compared version.
offset = 0 # int | Must be a non-negative number. Specifies the starting point of the listing. 0 means start from the beginning. (optional) (default to 0)
limit = 1000 # int | Limits the number of differences listed. This might lead to partial result. 0 means no limitation is applied. (optional) (default to 1000)

try:
    # Gets the differences between two versions of the same versioned flow, the basis of the comparison will be the first version
    api_response = api_instance.get_version_differences(registry_id, branch_id_a, bucket_id_a, flow_id_a, version_a, branch_id_b, bucket_id_b, flow_id_b, version_b, offset=offset, limit=limit)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_version_differences: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registry_id** | **str**| The registry client id. | 
 **branch_id_a** | **str**| The branch id for the base version. | 
 **bucket_id_a** | **str**| The bucket id for the base version. | 
 **flow_id_a** | **str**| The flow id for the base version. | 
 **version_a** | **str**| The base version. | 
 **branch_id_b** | **str**| The branch id for the compared version. | 
 **bucket_id_b** | **str**| The bucket id for the compared version. | 
 **flow_id_b** | **str**| The flow id for the compared version. | 
 **version_b** | **str**| The compared version. | 
 **offset** | **int**| Must be a non-negative number. Specifies the starting point of the listing. 0 means start from the beginning. | [optional] [default to 0]
 **limit** | **int**| Limits the number of differences listed. This might lead to partial result. 0 means no limitation is applied. | [optional] [default to 1000]

### Return type

[**FlowComparisonEntity**](FlowComparisonEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_versions**
> VersionedFlowSnapshotMetadataSetEntity get_versions(registry_id, bucket_id, flow_id, branch=branch)

Gets the flow versions from the specified registry and bucket for the specified flow for the current user

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
registry_id = 'registry_id_example' # str | The registry client id.
bucket_id = 'bucket_id_example' # str | The bucket id.
flow_id = 'flow_id_example' # str | The flow id.
branch = 'branch_example' # str | The name of a branch to get the flow versions from. If not specified the default branch of the registry client will be used. (optional)

try:
    # Gets the flow versions from the specified registry and bucket for the specified flow for the current user
    api_response = api_instance.get_versions(registry_id, bucket_id, flow_id, branch=branch)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->get_versions: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registry_id** | **str**| The registry client id. | 
 **bucket_id** | **str**| The bucket id. | 
 **flow_id** | **str**| The flow id. | 
 **branch** | **str**| The name of a branch to get the flow versions from. If not specified the default branch of the registry client will be used. | [optional] 

### Return type

[**VersionedFlowSnapshotMetadataSetEntity**](VersionedFlowSnapshotMetadataSetEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **query_history**
> HistoryEntity query_history(offset, count, sort_column=sort_column, sort_order=sort_order, start_date=start_date, end_date=end_date, user_identity=user_identity, source_id=source_id)

Gets configuration history

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
offset = 56 # int | The offset into the result set.
count = 56 # int | The number of actions to return.
sort_column = 'sort_column_example' # str | The field to sort on. (optional)
sort_order = 'sort_order_example' # str | The direction to sort. (optional)
start_date = 'start_date_example' # str | Include actions after this date. (optional)
end_date = 'end_date_example' # str | Include actions before this date. (optional)
user_identity = 'user_identity_example' # str | Include actions performed by this user. (optional)
source_id = 'source_id_example' # str | Include actions on this component. (optional)

try:
    # Gets configuration history
    api_response = api_instance.query_history(offset, count, sort_column=sort_column, sort_order=sort_order, start_date=start_date, end_date=end_date, user_identity=user_identity, source_id=source_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->query_history: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **int**| The offset into the result set. | 
 **count** | **int**| The number of actions to return. | 
 **sort_column** | **str**| The field to sort on. | [optional] 
 **sort_order** | **str**| The direction to sort. | [optional] 
 **start_date** | **str**| Include actions after this date. | [optional] 
 **end_date** | **str**| Include actions before this date. | [optional] 
 **user_identity** | **str**| Include actions performed by this user. | [optional] 
 **source_id** | **str**| Include actions on this component. | [optional] 

### Return type

[**HistoryEntity**](HistoryEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **schedule_components**
> ScheduleComponentsEntity schedule_components(body, id)

Schedule or unschedule components in the specified Process Group.

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
body = swagger_client.ScheduleComponentsEntity() # ScheduleComponentsEntity | The request to schedule or unschedule. If the components in the request are not specified, all authorized components will be considered.
id = 'id_example' # str | The process group id.

try:
    # Schedule or unschedule components in the specified Process Group.
    api_response = api_instance.schedule_components(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->schedule_components: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ScheduleComponentsEntity**](ScheduleComponentsEntity.md)| The request to schedule or unschedule. If the components in the request are not specified, all authorized components will be considered. | 
 **id** | **str**| The process group id. | 

### Return type

[**ScheduleComponentsEntity**](ScheduleComponentsEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **search_cluster**
> ClusterSearchResultsEntity search_cluster(q)

Searches the cluster for a node with the specified address

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
q = '' # str | Node address to search for.

try:
    # Searches the cluster for a node with the specified address
    api_response = api_instance.search_cluster(q)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->search_cluster: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **str**| Node address to search for. | 

### Return type

[**ClusterSearchResultsEntity**](ClusterSearchResultsEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **search_flow**
> SearchResultsEntity search_flow(q=q, a=a)

Performs a search against this NiFi using the specified search term

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
api_instance = swagger_client.FlowApi(swagger_client.ApiClient(configuration))
q = '' # str | The search term. (optional)
a = '' # str | The id of the currently visited process group. If not specified, then the root process group is used. (optional)

try:
    # Performs a search against this NiFi using the specified search term
    api_response = api_instance.search_flow(q=q, a=a)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowApi->search_flow: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **str**| The search term. | [optional] 
 **a** | **str**| The id of the currently visited process group. If not specified, then the root process group is used. | [optional] 

### Return type

[**SearchResultsEntity**](SearchResultsEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

