# swagger_client.ProcessGroupsApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**copy_snippet**](ProcessGroupsApi.md#copy_snippet) | **POST** /process-groups/{id}/snippet-instance | Copies a snippet and discards it.
[**create_connection**](ProcessGroupsApi.md#create_connection) | **POST** /process-groups/{id}/connections | Creates a connection
[**create_controller_service**](ProcessGroupsApi.md#create_controller_service) | **POST** /process-groups/{id}/controller-services | Creates a new controller service
[**create_empty_all_connections_request**](ProcessGroupsApi.md#create_empty_all_connections_request) | **POST** /process-groups/{id}/empty-all-connections-requests | Creates a request to drop all flowfiles of all connection queues in this process group.
[**create_funnel**](ProcessGroupsApi.md#create_funnel) | **POST** /process-groups/{id}/funnels | Creates a funnel
[**create_input_port**](ProcessGroupsApi.md#create_input_port) | **POST** /process-groups/{id}/input-ports | Creates an input port
[**create_label**](ProcessGroupsApi.md#create_label) | **POST** /process-groups/{id}/labels | Creates a label
[**create_output_port**](ProcessGroupsApi.md#create_output_port) | **POST** /process-groups/{id}/output-ports | Creates an output port
[**create_process_group**](ProcessGroupsApi.md#create_process_group) | **POST** /process-groups/{id}/process-groups | Creates a process group
[**create_processor**](ProcessGroupsApi.md#create_processor) | **POST** /process-groups/{id}/processors | Creates a new processor
[**create_remote_process_group**](ProcessGroupsApi.md#create_remote_process_group) | **POST** /process-groups/{id}/remote-process-groups | Creates a new process group
[**create_template**](ProcessGroupsApi.md#create_template) | **POST** /process-groups/{id}/templates | Creates a template and discards the specified snippet.
[**delete_replace_process_group_request**](ProcessGroupsApi.md#delete_replace_process_group_request) | **DELETE** /process-groups/replace-requests/{id} | Deletes the Replace Request with the given ID
[**delete_variable_registry_update_request**](ProcessGroupsApi.md#delete_variable_registry_update_request) | **DELETE** /process-groups/{groupId}/variable-registry/update-requests/{updateId} | Deletes an update request for a process group&#39;s variable registry. If the request is not yet complete, it will automatically be cancelled.
[**export_process_group**](ProcessGroupsApi.md#export_process_group) | **GET** /process-groups/{id}/download | Gets a process group for download
[**get_connections**](ProcessGroupsApi.md#get_connections) | **GET** /process-groups/{id}/connections | Gets all connections
[**get_drop_all_flowfiles_request**](ProcessGroupsApi.md#get_drop_all_flowfiles_request) | **GET** /process-groups/{id}/empty-all-connections-requests/{drop-request-id} | Gets the current status of a drop all flowfiles request.
[**get_funnels**](ProcessGroupsApi.md#get_funnels) | **GET** /process-groups/{id}/funnels | Gets all funnels
[**get_input_ports**](ProcessGroupsApi.md#get_input_ports) | **GET** /process-groups/{id}/input-ports | Gets all input ports
[**get_labels**](ProcessGroupsApi.md#get_labels) | **GET** /process-groups/{id}/labels | Gets all labels
[**get_local_modifications**](ProcessGroupsApi.md#get_local_modifications) | **GET** /process-groups/{id}/local-modifications | Gets a list of local modifications to the Process Group since it was last synchronized with the Flow Registry
[**get_output_ports**](ProcessGroupsApi.md#get_output_ports) | **GET** /process-groups/{id}/output-ports | Gets all output ports
[**get_process_group**](ProcessGroupsApi.md#get_process_group) | **GET** /process-groups/{id} | Gets a process group
[**get_process_groups**](ProcessGroupsApi.md#get_process_groups) | **GET** /process-groups/{id}/process-groups | Gets all process groups
[**get_processors**](ProcessGroupsApi.md#get_processors) | **GET** /process-groups/{id}/processors | Gets all processors
[**get_remote_process_groups**](ProcessGroupsApi.md#get_remote_process_groups) | **GET** /process-groups/{id}/remote-process-groups | Gets all remote process groups
[**get_replace_process_group_request**](ProcessGroupsApi.md#get_replace_process_group_request) | **GET** /process-groups/replace-requests/{id} | Returns the Replace Request with the given ID
[**get_variable_registry**](ProcessGroupsApi.md#get_variable_registry) | **GET** /process-groups/{id}/variable-registry | Gets a process group&#39;s variable registry
[**get_variable_registry_update_request**](ProcessGroupsApi.md#get_variable_registry_update_request) | **GET** /process-groups/{groupId}/variable-registry/update-requests/{updateId} | Gets a process group&#39;s variable registry
[**import_process_group**](ProcessGroupsApi.md#import_process_group) | **POST** /process-groups/{id}/process-groups/import | Imports a specified process group
[**import_template**](ProcessGroupsApi.md#import_template) | **POST** /process-groups/{id}/templates/import | Imports a template
[**initiate_replace_process_group**](ProcessGroupsApi.md#initiate_replace_process_group) | **POST** /process-groups/{id}/replace-requests | Initiate the Replace Request of a Process Group with the given ID
[**instantiate_template**](ProcessGroupsApi.md#instantiate_template) | **POST** /process-groups/{id}/template-instance | Instantiates a template
[**remove_drop_request**](ProcessGroupsApi.md#remove_drop_request) | **DELETE** /process-groups/{id}/empty-all-connections-requests/{drop-request-id} | Cancels and/or removes a request to drop all flowfiles.
[**remove_process_group**](ProcessGroupsApi.md#remove_process_group) | **DELETE** /process-groups/{id} | Deletes a process group
[**replace_process_group**](ProcessGroupsApi.md#replace_process_group) | **PUT** /process-groups/{id}/flow-contents | Replace Process Group contents with the given ID with the specified Process Group contents
[**submit_update_variable_registry_request**](ProcessGroupsApi.md#submit_update_variable_registry_request) | **POST** /process-groups/{id}/variable-registry/update-requests | Submits a request to update a process group&#39;s variable registry
[**update_process_group**](ProcessGroupsApi.md#update_process_group) | **PUT** /process-groups/{id} | Updates a process group
[**update_variable_registry**](ProcessGroupsApi.md#update_variable_registry) | **PUT** /process-groups/{id}/variable-registry | Updates the contents of a Process Group&#39;s variable Registry
[**upload_process_group**](ProcessGroupsApi.md#upload_process_group) | **POST** /process-groups/{id}/process-groups/upload | Uploads a versioned flow definition and creates a process group
[**upload_template**](ProcessGroupsApi.md#upload_template) | **POST** /process-groups/{id}/templates/upload | Uploads a template


# **copy_snippet**
> FlowEntity copy_snippet(id, body)

Copies a snippet and discards it.



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.
body = swagger_client.CopySnippetRequestEntity() # CopySnippetRequestEntity | The copy snippet request.

try:
    # Copies a snippet and discards it.
    api_response = api_instance.copy_snippet(id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->copy_snippet: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 
 **body** | [**CopySnippetRequestEntity**](CopySnippetRequestEntity.md)| The copy snippet request. | 

### Return type

[**FlowEntity**](FlowEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_connection**
> ConnectionEntity create_connection(id, body)

Creates a connection



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.
body = swagger_client.ConnectionEntity() # ConnectionEntity | The connection configuration details.

try:
    # Creates a connection
    api_response = api_instance.create_connection(id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->create_connection: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 
 **body** | [**ConnectionEntity**](ConnectionEntity.md)| The connection configuration details. | 

### Return type

[**ConnectionEntity**](ConnectionEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_controller_service**
> ControllerServiceEntity create_controller_service(id, body)

Creates a new controller service



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.
body = swagger_client.ControllerServiceEntity() # ControllerServiceEntity | The controller service configuration details.

try:
    # Creates a new controller service
    api_response = api_instance.create_controller_service(id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->create_controller_service: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 
 **body** | [**ControllerServiceEntity**](ControllerServiceEntity.md)| The controller service configuration details. | 

### Return type

[**ControllerServiceEntity**](ControllerServiceEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_empty_all_connections_request**
> DropRequestEntity create_empty_all_connections_request(id)

Creates a request to drop all flowfiles of all connection queues in this process group.



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.

try:
    # Creates a request to drop all flowfiles of all connection queues in this process group.
    api_response = api_instance.create_empty_all_connections_request(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->create_empty_all_connections_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 

### Return type

[**DropRequestEntity**](DropRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_funnel**
> FunnelEntity create_funnel(id, body)

Creates a funnel



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.
body = swagger_client.FunnelEntity() # FunnelEntity | The funnel configuration details.

try:
    # Creates a funnel
    api_response = api_instance.create_funnel(id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->create_funnel: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 
 **body** | [**FunnelEntity**](FunnelEntity.md)| The funnel configuration details. | 

### Return type

[**FunnelEntity**](FunnelEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_input_port**
> PortEntity create_input_port(id, body)

Creates an input port



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.
body = swagger_client.PortEntity() # PortEntity | The input port configuration details.

try:
    # Creates an input port
    api_response = api_instance.create_input_port(id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->create_input_port: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 
 **body** | [**PortEntity**](PortEntity.md)| The input port configuration details. | 

### Return type

[**PortEntity**](PortEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_label**
> LabelEntity create_label(id, body)

Creates a label



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.
body = swagger_client.LabelEntity() # LabelEntity | The label configuration details.

try:
    # Creates a label
    api_response = api_instance.create_label(id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->create_label: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 
 **body** | [**LabelEntity**](LabelEntity.md)| The label configuration details. | 

### Return type

[**LabelEntity**](LabelEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_output_port**
> PortEntity create_output_port(id, body)

Creates an output port



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.
body = swagger_client.PortEntity() # PortEntity | The output port configuration.

try:
    # Creates an output port
    api_response = api_instance.create_output_port(id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->create_output_port: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 
 **body** | [**PortEntity**](PortEntity.md)| The output port configuration. | 

### Return type

[**PortEntity**](PortEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_process_group**
> ProcessGroupEntity create_process_group(id, body, parameter_context_handling_strategy=parameter_context_handling_strategy)

Creates a process group



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.
body = swagger_client.ProcessGroupEntity() # ProcessGroupEntity | The process group configuration details.
parameter_context_handling_strategy = 'KEEP_EXISTING' # str | Handling Strategy controls whether to keep or replace Parameter Contexts (optional) (default to KEEP_EXISTING)

try:
    # Creates a process group
    api_response = api_instance.create_process_group(id, body, parameter_context_handling_strategy=parameter_context_handling_strategy)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->create_process_group: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 
 **body** | [**ProcessGroupEntity**](ProcessGroupEntity.md)| The process group configuration details. | 
 **parameter_context_handling_strategy** | **str**| Handling Strategy controls whether to keep or replace Parameter Contexts | [optional] [default to KEEP_EXISTING]

### Return type

[**ProcessGroupEntity**](ProcessGroupEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_processor**
> ProcessorEntity create_processor(id, body)

Creates a new processor



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.
body = swagger_client.ProcessorEntity() # ProcessorEntity | The processor configuration details.

try:
    # Creates a new processor
    api_response = api_instance.create_processor(id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->create_processor: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 
 **body** | [**ProcessorEntity**](ProcessorEntity.md)| The processor configuration details. | 

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_remote_process_group**
> RemoteProcessGroupEntity create_remote_process_group(id, body)

Creates a new process group



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.
body = swagger_client.RemoteProcessGroupEntity() # RemoteProcessGroupEntity | The remote process group configuration details.

try:
    # Creates a new process group
    api_response = api_instance.create_remote_process_group(id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->create_remote_process_group: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 
 **body** | [**RemoteProcessGroupEntity**](RemoteProcessGroupEntity.md)| The remote process group configuration details. | 

### Return type

[**RemoteProcessGroupEntity**](RemoteProcessGroupEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_template**
> TemplateEntity create_template(id, body)

Creates a template and discards the specified snippet.



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.
body = swagger_client.CreateTemplateRequestEntity() # CreateTemplateRequestEntity | The create template request.

try:
    # Creates a template and discards the specified snippet.
    api_response = api_instance.create_template(id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->create_template: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 
 **body** | [**CreateTemplateRequestEntity**](CreateTemplateRequestEntity.md)| The create template request. | 

### Return type

[**TemplateEntity**](TemplateEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_replace_process_group_request**
> ProcessGroupReplaceRequestEntity delete_replace_process_group_request(id, disconnected_node_acknowledged=disconnected_node_acknowledged)

Deletes the Replace Request with the given ID

Deletes the Replace Request with the given ID. After a request is created via a POST to /process-groups/{id}/replace-requests, it is expected that the client will properly clean up the request by DELETE'ing it, once the Replace process has completed. If the request is deleted before the request completes, then the Replace request will finish the step that it is currently performing and then will cancel any subsequent steps. Note: This endpoint is subject to change as NiFi and it's REST API evolve.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The ID of the Update Request
disconnected_node_acknowledged = false # bool | Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional) (default to false)

try:
    # Deletes the Replace Request with the given ID
    api_response = api_instance.delete_replace_process_group_request(id, disconnected_node_acknowledged=disconnected_node_acknowledged)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->delete_replace_process_group_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the Update Request | 
 **disconnected_node_acknowledged** | **bool**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**ProcessGroupReplaceRequestEntity**](ProcessGroupReplaceRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_variable_registry_update_request**
> VariableRegistryUpdateRequestEntity delete_variable_registry_update_request(group_id, update_id, disconnected_node_acknowledged=disconnected_node_acknowledged)

Deletes an update request for a process group's variable registry. If the request is not yet complete, it will automatically be cancelled.

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
group_id = 'group_id_example' # str | The process group id.
update_id = 'update_id_example' # str | The ID of the Variable Registry Update Request
disconnected_node_acknowledged = false # bool | Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional) (default to false)

try:
    # Deletes an update request for a process group's variable registry. If the request is not yet complete, it will automatically be cancelled.
    api_response = api_instance.delete_variable_registry_update_request(group_id, update_id, disconnected_node_acknowledged=disconnected_node_acknowledged)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->delete_variable_registry_update_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group_id** | **str**| The process group id. | 
 **update_id** | **str**| The ID of the Variable Registry Update Request | 
 **disconnected_node_acknowledged** | **bool**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**VariableRegistryUpdateRequestEntity**](VariableRegistryUpdateRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **export_process_group**
> str export_process_group(id, include_referenced_services=include_referenced_services)

Gets a process group for download



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.
include_referenced_services = false # bool | If referenced services from outside the target group should be included (optional) (default to false)

try:
    # Gets a process group for download
    api_response = api_instance.export_process_group(id, include_referenced_services=include_referenced_services)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->export_process_group: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 
 **include_referenced_services** | **bool**| If referenced services from outside the target group should be included | [optional] [default to false]

### Return type

**str**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_connections**
> ConnectionsEntity get_connections(id)

Gets all connections



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.

try:
    # Gets all connections
    api_response = api_instance.get_connections(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->get_connections: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 

### Return type

[**ConnectionsEntity**](ConnectionsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_drop_all_flowfiles_request**
> DropRequestEntity get_drop_all_flowfiles_request(id, drop_request_id)

Gets the current status of a drop all flowfiles request.



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.
drop_request_id = 'drop_request_id_example' # str | The drop request id.

try:
    # Gets the current status of a drop all flowfiles request.
    api_response = api_instance.get_drop_all_flowfiles_request(id, drop_request_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->get_drop_all_flowfiles_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 
 **drop_request_id** | **str**| The drop request id. | 

### Return type

[**DropRequestEntity**](DropRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_funnels**
> FunnelsEntity get_funnels(id)

Gets all funnels



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.

try:
    # Gets all funnels
    api_response = api_instance.get_funnels(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->get_funnels: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 

### Return type

[**FunnelsEntity**](FunnelsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_input_ports**
> InputPortsEntity get_input_ports(id)

Gets all input ports



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.

try:
    # Gets all input ports
    api_response = api_instance.get_input_ports(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->get_input_ports: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 

### Return type

[**InputPortsEntity**](InputPortsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_labels**
> LabelsEntity get_labels(id)

Gets all labels



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.

try:
    # Gets all labels
    api_response = api_instance.get_labels(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->get_labels: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 

### Return type

[**LabelsEntity**](LabelsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_local_modifications**
> FlowComparisonEntity get_local_modifications(id)

Gets a list of local modifications to the Process Group since it was last synchronized with the Flow Registry



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.

try:
    # Gets a list of local modifications to the Process Group since it was last synchronized with the Flow Registry
    api_response = api_instance.get_local_modifications(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->get_local_modifications: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 

### Return type

[**FlowComparisonEntity**](FlowComparisonEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_output_ports**
> OutputPortsEntity get_output_ports(id)

Gets all output ports



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.

try:
    # Gets all output ports
    api_response = api_instance.get_output_ports(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->get_output_ports: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 

### Return type

[**OutputPortsEntity**](OutputPortsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_process_group**
> ProcessGroupEntity get_process_group(id)

Gets a process group



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.

try:
    # Gets a process group
    api_response = api_instance.get_process_group(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->get_process_group: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 

### Return type

[**ProcessGroupEntity**](ProcessGroupEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_process_groups**
> ProcessGroupsEntity get_process_groups(id)

Gets all process groups



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.

try:
    # Gets all process groups
    api_response = api_instance.get_process_groups(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->get_process_groups: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 

### Return type

[**ProcessGroupsEntity**](ProcessGroupsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_processors**
> ProcessorsEntity get_processors(id, include_descendant_groups=include_descendant_groups)

Gets all processors



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.
include_descendant_groups = false # bool | Whether or not to include processors from descendant process groups (optional) (default to false)

try:
    # Gets all processors
    api_response = api_instance.get_processors(id, include_descendant_groups=include_descendant_groups)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->get_processors: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 
 **include_descendant_groups** | **bool**| Whether or not to include processors from descendant process groups | [optional] [default to false]

### Return type

[**ProcessorsEntity**](ProcessorsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_remote_process_groups**
> RemoteProcessGroupsEntity get_remote_process_groups(id)

Gets all remote process groups



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.

try:
    # Gets all remote process groups
    api_response = api_instance.get_remote_process_groups(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->get_remote_process_groups: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 

### Return type

[**RemoteProcessGroupsEntity**](RemoteProcessGroupsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_replace_process_group_request**
> ProcessGroupReplaceRequestEntity get_replace_process_group_request(id)

Returns the Replace Request with the given ID

Returns the Replace Request with the given ID. Once a Replace Request has been created by performing a POST to /process-groups/{id}/replace-requests, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and any failures. Note: This endpoint is subject to change as NiFi and it's REST API evolve.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The ID of the Replace Request

try:
    # Returns the Replace Request with the given ID
    api_response = api_instance.get_replace_process_group_request(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->get_replace_process_group_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the Replace Request | 

### Return type

[**ProcessGroupReplaceRequestEntity**](ProcessGroupReplaceRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_variable_registry**
> VariableRegistryEntity get_variable_registry(id, include_ancestor_groups=include_ancestor_groups)

Gets a process group's variable registry

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.
include_ancestor_groups = true # bool | Whether or not to include ancestor groups (optional) (default to true)

try:
    # Gets a process group's variable registry
    api_response = api_instance.get_variable_registry(id, include_ancestor_groups=include_ancestor_groups)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->get_variable_registry: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 
 **include_ancestor_groups** | **bool**| Whether or not to include ancestor groups | [optional] [default to true]

### Return type

[**VariableRegistryEntity**](VariableRegistryEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_variable_registry_update_request**
> VariableRegistryUpdateRequestEntity get_variable_registry_update_request(group_id, update_id)

Gets a process group's variable registry

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
group_id = 'group_id_example' # str | The process group id.
update_id = 'update_id_example' # str | The ID of the Variable Registry Update Request

try:
    # Gets a process group's variable registry
    api_response = api_instance.get_variable_registry_update_request(group_id, update_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->get_variable_registry_update_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group_id** | **str**| The process group id. | 
 **update_id** | **str**| The ID of the Variable Registry Update Request | 

### Return type

[**VariableRegistryUpdateRequestEntity**](VariableRegistryUpdateRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **import_process_group**
> ProcessGroupEntity import_process_group(id)

Imports a specified process group



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.

try:
    # Imports a specified process group
    api_response = api_instance.import_process_group(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->import_process_group: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 

### Return type

[**ProcessGroupEntity**](ProcessGroupEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **import_template**
> TemplateEntity import_template(id)

Imports a template



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.

try:
    # Imports a template
    api_response = api_instance.import_template(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->import_template: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 

### Return type

[**TemplateEntity**](TemplateEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/xml
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **initiate_replace_process_group**
> ProcessGroupReplaceRequestEntity initiate_replace_process_group(id, body)

Initiate the Replace Request of a Process Group with the given ID

This will initiate the action of replacing a process group with the given process group. This can be a lengthy process, as it will stop any Processors and disable any Controller Services necessary to perform the action and then restart them. As a result, the endpoint will immediately return a ProcessGroupReplaceRequestEntity, and the process of replacing the flow will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /process-groups/replace-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /process-groups/replace-requests/{requestId}. Note: This endpoint is subject to change as NiFi and it's REST API evolve.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.
body = swagger_client.ProcessGroupImportEntity() # ProcessGroupImportEntity | The process group replace request entity

try:
    # Initiate the Replace Request of a Process Group with the given ID
    api_response = api_instance.initiate_replace_process_group(id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->initiate_replace_process_group: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 
 **body** | [**ProcessGroupImportEntity**](ProcessGroupImportEntity.md)| The process group replace request entity | 

### Return type

[**ProcessGroupReplaceRequestEntity**](ProcessGroupReplaceRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **instantiate_template**
> FlowEntity instantiate_template(id, body)

Instantiates a template



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.
body = swagger_client.InstantiateTemplateRequestEntity() # InstantiateTemplateRequestEntity | The instantiate template request.

try:
    # Instantiates a template
    api_response = api_instance.instantiate_template(id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->instantiate_template: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 
 **body** | [**InstantiateTemplateRequestEntity**](InstantiateTemplateRequestEntity.md)| The instantiate template request. | 

### Return type

[**FlowEntity**](FlowEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_drop_request**
> DropRequestEntity remove_drop_request(id, drop_request_id)

Cancels and/or removes a request to drop all flowfiles.



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.
drop_request_id = 'drop_request_id_example' # str | The drop request id.

try:
    # Cancels and/or removes a request to drop all flowfiles.
    api_response = api_instance.remove_drop_request(id, drop_request_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->remove_drop_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 
 **drop_request_id** | **str**| The drop request id. | 

### Return type

[**DropRequestEntity**](DropRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_process_group**
> ProcessGroupEntity remove_process_group(id, version=version, client_id=client_id, disconnected_node_acknowledged=disconnected_node_acknowledged)

Deletes a process group



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.
version = 'version_example' # str | The revision is used to verify the client is working with the latest version of the flow. (optional)
client_id = 'client_id_example' # str | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. (optional)
disconnected_node_acknowledged = false # bool | Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional) (default to false)

try:
    # Deletes a process group
    api_response = api_instance.remove_process_group(id, version=version, client_id=client_id, disconnected_node_acknowledged=disconnected_node_acknowledged)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->remove_process_group: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 
 **version** | **str**| The revision is used to verify the client is working with the latest version of the flow. | [optional] 
 **client_id** | **str**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional] 
 **disconnected_node_acknowledged** | **bool**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**ProcessGroupEntity**](ProcessGroupEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **replace_process_group**
> ProcessGroupImportEntity replace_process_group(id, body)

Replace Process Group contents with the given ID with the specified Process Group contents

This endpoint is used for replication within a cluster, when replacing a flow with a new flow. It expects that the flow beingreplaced is not under version control and that the given snapshot will not modify any Processor that is currently running or any Controller Service that is enabled. Note: This endpoint is subject to change as NiFi and it's REST API evolve.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.
body = swagger_client.ProcessGroupImportEntity() # ProcessGroupImportEntity | The process group replace request entity.

try:
    # Replace Process Group contents with the given ID with the specified Process Group contents
    api_response = api_instance.replace_process_group(id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->replace_process_group: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 
 **body** | [**ProcessGroupImportEntity**](ProcessGroupImportEntity.md)| The process group replace request entity. | 

### Return type

[**ProcessGroupImportEntity**](ProcessGroupImportEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_update_variable_registry_request**
> VariableRegistryUpdateRequestEntity submit_update_variable_registry_request(id, body)

Submits a request to update a process group's variable registry

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.
body = swagger_client.VariableRegistryEntity() # VariableRegistryEntity | The variable registry configuration details.

try:
    # Submits a request to update a process group's variable registry
    api_response = api_instance.submit_update_variable_registry_request(id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->submit_update_variable_registry_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 
 **body** | [**VariableRegistryEntity**](VariableRegistryEntity.md)| The variable registry configuration details. | 

### Return type

[**VariableRegistryUpdateRequestEntity**](VariableRegistryUpdateRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_process_group**
> ProcessGroupEntity update_process_group(id, body)

Updates a process group



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.
body = swagger_client.ProcessGroupEntity() # ProcessGroupEntity | The process group configuration details.

try:
    # Updates a process group
    api_response = api_instance.update_process_group(id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->update_process_group: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 
 **body** | [**ProcessGroupEntity**](ProcessGroupEntity.md)| The process group configuration details. | 

### Return type

[**ProcessGroupEntity**](ProcessGroupEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_variable_registry**
> VariableRegistryEntity update_variable_registry(id, body)

Updates the contents of a Process Group's variable Registry

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.
body = swagger_client.VariableRegistryEntity() # VariableRegistryEntity | The variable registry configuration details.

try:
    # Updates the contents of a Process Group's variable Registry
    api_response = api_instance.update_variable_registry(id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->update_variable_registry: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 
 **body** | [**VariableRegistryEntity**](VariableRegistryEntity.md)| The variable registry configuration details. | 

### Return type

[**VariableRegistryEntity**](VariableRegistryEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **upload_process_group**
> ProcessGroupEntity upload_process_group(id, group_name, position_x, position_y, client_id, file, disconnected_node_acknowledged=disconnected_node_acknowledged)

Uploads a versioned flow definition and creates a process group



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.
group_name = 'group_name_example' # str | The process group name.
position_x = 8.14 # float | The process group X position.
position_y = 8.14 # float | The process group Y position.
client_id = 'client_id_example' # str | The client id.
file = '/path/to/file.txt' # file | The binary content of the versioned flow definition file being uploaded.
disconnected_node_acknowledged = false # bool | Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional) (default to false)

try:
    # Uploads a versioned flow definition and creates a process group
    api_response = api_instance.upload_process_group(id, group_name, position_x, position_y, client_id, file, disconnected_node_acknowledged=disconnected_node_acknowledged)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->upload_process_group: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 
 **group_name** | **str**| The process group name. | 
 **position_x** | **float**| The process group X position. | 
 **position_y** | **float**| The process group Y position. | 
 **client_id** | **str**| The client id. | 
 **file** | **file**| The binary content of the versioned flow definition file being uploaded. | 
 **disconnected_node_acknowledged** | **bool**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**ProcessGroupEntity**](ProcessGroupEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **upload_template**
> TemplateEntity upload_template(id, template, disconnected_node_acknowledged=disconnected_node_acknowledged)

Uploads a template



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.ProcessGroupsApi()
id = 'id_example' # str | The process group id.
template = '/path/to/file.txt' # file | The binary content of the template file being uploaded.
disconnected_node_acknowledged = false # bool | Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional) (default to false)

try:
    # Uploads a template
    api_response = api_instance.upload_template(id, template, disconnected_node_acknowledged=disconnected_node_acknowledged)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessGroupsApi->upload_template: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 
 **template** | **file**| The binary content of the template file being uploaded. | 
 **disconnected_node_acknowledged** | **bool**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**TemplateEntity**](TemplateEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

