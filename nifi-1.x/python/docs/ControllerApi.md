# nifi_client_v1.ControllerApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_bulletin**](ControllerApi.md#create_bulletin) | **POST** /controller/bulletin | Creates a new bulletin
[**create_controller_service**](ControllerApi.md#create_controller_service) | **POST** /controller/controller-services | Creates a new controller service
[**create_flow_registry_client**](ControllerApi.md#create_flow_registry_client) | **POST** /controller/registry-clients | Creates a new flow registry client
[**create_parameter_provider**](ControllerApi.md#create_parameter_provider) | **POST** /controller/parameter-providers | Creates a new parameter provider
[**create_reporting_task**](ControllerApi.md#create_reporting_task) | **POST** /controller/reporting-tasks | Creates a new reporting task
[**delete_flow_registry_client**](ControllerApi.md#delete_flow_registry_client) | **DELETE** /controller/registry-clients/{id} | Deletes a flow registry client
[**delete_history**](ControllerApi.md#delete_history) | **DELETE** /controller/history | Purges history
[**delete_node**](ControllerApi.md#delete_node) | **DELETE** /controller/cluster/nodes/{id} | Removes a node from the cluster
[**get_cluster**](ControllerApi.md#get_cluster) | **GET** /controller/cluster | Gets the contents of the cluster
[**get_controller_config**](ControllerApi.md#get_controller_config) | **GET** /controller/config | Retrieves the configuration for this NiFi Controller
[**get_flow_registry_client**](ControllerApi.md#get_flow_registry_client) | **GET** /controller/registry-clients/{id} | Gets a flow registry client
[**get_flow_registry_clients**](ControllerApi.md#get_flow_registry_clients) | **GET** /controller/registry-clients | Gets the listing of available flow registry clients
[**get_node**](ControllerApi.md#get_node) | **GET** /controller/cluster/nodes/{id} | Gets a node in the cluster
[**get_node_status_history**](ControllerApi.md#get_node_status_history) | **GET** /controller/status/history | Gets status history for the node
[**get_property_descriptor**](ControllerApi.md#get_property_descriptor) | **GET** /controller/registry-clients/{id}/descriptors | Gets a flow registry client property descriptor
[**get_registry_client_types**](ControllerApi.md#get_registry_client_types) | **GET** /controller/registry-types | Retrieves the types of flow  that this NiFi supports
[**update_controller_config**](ControllerApi.md#update_controller_config) | **PUT** /controller/config | Retrieves the configuration for this NiFi
[**update_flow_registry_client**](ControllerApi.md#update_flow_registry_client) | **PUT** /controller/registry-clients/{id} | Updates a flow registry client
[**update_node**](ControllerApi.md#update_node) | **PUT** /controller/cluster/nodes/{id} | Updates a node in the cluster


# **create_bulletin**
> BulletinEntity create_bulletin(body)

Creates a new bulletin



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ControllerApi()
body = nifi_client_v1.BulletinEntity() # BulletinEntity | The reporting task configuration details.

try:
    # Creates a new bulletin
    api_response = api_instance.create_bulletin(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->create_bulletin: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BulletinEntity**](BulletinEntity.md)| The reporting task configuration details. | 

### Return type

[**BulletinEntity**](BulletinEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_controller_service**
> ControllerServiceEntity create_controller_service(body)

Creates a new controller service



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ControllerApi()
body = nifi_client_v1.ControllerServiceEntity() # ControllerServiceEntity | The controller service configuration details.

try:
    # Creates a new controller service
    api_response = api_instance.create_controller_service(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->create_controller_service: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ControllerServiceEntity**](ControllerServiceEntity.md)| The controller service configuration details. | 

### Return type

[**ControllerServiceEntity**](ControllerServiceEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_flow_registry_client**
> FlowRegistryClientEntity create_flow_registry_client(body)

Creates a new flow registry client



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ControllerApi()
body = nifi_client_v1.FlowRegistryClientEntity() # FlowRegistryClientEntity | The flow registry client configuration details.

try:
    # Creates a new flow registry client
    api_response = api_instance.create_flow_registry_client(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->create_flow_registry_client: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FlowRegistryClientEntity**](FlowRegistryClientEntity.md)| The flow registry client configuration details. | 

### Return type

[**FlowRegistryClientEntity**](FlowRegistryClientEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_parameter_provider**
> ParameterProviderEntity create_parameter_provider(body)

Creates a new parameter provider



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ControllerApi()
body = nifi_client_v1.ParameterProviderEntity() # ParameterProviderEntity | The parameter provider configuration details.

try:
    # Creates a new parameter provider
    api_response = api_instance.create_parameter_provider(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->create_parameter_provider: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ParameterProviderEntity**](ParameterProviderEntity.md)| The parameter provider configuration details. | 

### Return type

[**ParameterProviderEntity**](ParameterProviderEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_reporting_task**
> ReportingTaskEntity create_reporting_task(body)

Creates a new reporting task



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ControllerApi()
body = nifi_client_v1.ReportingTaskEntity() # ReportingTaskEntity | The reporting task configuration details.

try:
    # Creates a new reporting task
    api_response = api_instance.create_reporting_task(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->create_reporting_task: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReportingTaskEntity**](ReportingTaskEntity.md)| The reporting task configuration details. | 

### Return type

[**ReportingTaskEntity**](ReportingTaskEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_flow_registry_client**
> FlowRegistryClientEntity delete_flow_registry_client(id, version=version, client_id=client_id, disconnected_node_acknowledged=disconnected_node_acknowledged)

Deletes a flow registry client



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ControllerApi()
id = 'id_example' # str | The flow registry client id.
version = 'version_example' # str | The revision is used to verify the client is working with the latest version of the flow. (optional)
client_id = 'client_id_example' # str | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. (optional)
disconnected_node_acknowledged = false # bool | Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional) (default to false)

try:
    # Deletes a flow registry client
    api_response = api_instance.delete_flow_registry_client(id, version=version, client_id=client_id, disconnected_node_acknowledged=disconnected_node_acknowledged)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->delete_flow_registry_client: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The flow registry client id. | 
 **version** | **str**| The revision is used to verify the client is working with the latest version of the flow. | [optional] 
 **client_id** | **str**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional] 
 **disconnected_node_acknowledged** | **bool**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**FlowRegistryClientEntity**](FlowRegistryClientEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_history**
> HistoryEntity delete_history(end_date)

Purges history



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ControllerApi()
end_date = 'end_date_example' # str | Purge actions before this date/time.

try:
    # Purges history
    api_response = api_instance.delete_history(end_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->delete_history: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **end_date** | **str**| Purge actions before this date/time. | 

### Return type

[**HistoryEntity**](HistoryEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_node**
> NodeEntity delete_node(id)

Removes a node from the cluster



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ControllerApi()
id = 'id_example' # str | The node id.

try:
    # Removes a node from the cluster
    api_response = api_instance.delete_node(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->delete_node: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The node id. | 

### Return type

[**NodeEntity**](NodeEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_cluster**
> ClusterEntity get_cluster()

Gets the contents of the cluster

Returns the contents of the cluster including all nodes and their status.

### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ControllerApi()

try:
    # Gets the contents of the cluster
    api_response = api_instance.get_cluster()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->get_cluster: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClusterEntity**](ClusterEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_controller_config**
> ControllerConfigurationEntity get_controller_config()

Retrieves the configuration for this NiFi Controller



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ControllerApi()

try:
    # Retrieves the configuration for this NiFi Controller
    api_response = api_instance.get_controller_config()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->get_controller_config: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ControllerConfigurationEntity**](ControllerConfigurationEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_flow_registry_client**
> FlowRegistryClientEntity get_flow_registry_client(id)

Gets a flow registry client



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ControllerApi()
id = 'id_example' # str | The flow registry client id.

try:
    # Gets a flow registry client
    api_response = api_instance.get_flow_registry_client(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->get_flow_registry_client: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The flow registry client id. | 

### Return type

[**FlowRegistryClientEntity**](FlowRegistryClientEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_flow_registry_clients**
> FlowRegistryClientsEntity get_flow_registry_clients()

Gets the listing of available flow registry clients



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ControllerApi()

try:
    # Gets the listing of available flow registry clients
    api_response = api_instance.get_flow_registry_clients()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->get_flow_registry_clients: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FlowRegistryClientsEntity**](FlowRegistryClientsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_node**
> NodeEntity get_node(id)

Gets a node in the cluster



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ControllerApi()
id = 'id_example' # str | The node id.

try:
    # Gets a node in the cluster
    api_response = api_instance.get_node(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->get_node: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The node id. | 

### Return type

[**NodeEntity**](NodeEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_node_status_history**
> ComponentHistoryEntity get_node_status_history()

Gets status history for the node

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ControllerApi()

try:
    # Gets status history for the node
    api_response = api_instance.get_node_status_history()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->get_node_status_history: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ComponentHistoryEntity**](ComponentHistoryEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_property_descriptor**
> PropertyDescriptorEntity get_property_descriptor(id, property_name, sensitive=sensitive)

Gets a flow registry client property descriptor



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ControllerApi()
id = 'id_example' # str | The flow registry client id.
property_name = 'property_name_example' # str | The property name.
sensitive = false # bool | Property Descriptor requested sensitive status (optional) (default to false)

try:
    # Gets a flow registry client property descriptor
    api_response = api_instance.get_property_descriptor(id, property_name, sensitive=sensitive)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->get_property_descriptor: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The flow registry client id. | 
 **property_name** | **str**| The property name. | 
 **sensitive** | **bool**| Property Descriptor requested sensitive status | [optional] [default to false]

### Return type

[**PropertyDescriptorEntity**](PropertyDescriptorEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_registry_client_types**
> FlowRegistryClientTypesEntity get_registry_client_types()

Retrieves the types of flow  that this NiFi supports

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ControllerApi()

try:
    # Retrieves the types of flow  that this NiFi supports
    api_response = api_instance.get_registry_client_types()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->get_registry_client_types: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FlowRegistryClientTypesEntity**](FlowRegistryClientTypesEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_controller_config**
> ControllerConfigurationEntity update_controller_config(body)

Retrieves the configuration for this NiFi



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ControllerApi()
body = nifi_client_v1.ControllerConfigurationEntity() # ControllerConfigurationEntity | The controller configuration.

try:
    # Retrieves the configuration for this NiFi
    api_response = api_instance.update_controller_config(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->update_controller_config: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ControllerConfigurationEntity**](ControllerConfigurationEntity.md)| The controller configuration. | 

### Return type

[**ControllerConfigurationEntity**](ControllerConfigurationEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_flow_registry_client**
> FlowRegistryClientEntity update_flow_registry_client(id, body)

Updates a flow registry client



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ControllerApi()
id = 'id_example' # str | The flow registry client id.
body = nifi_client_v1.FlowRegistryClientEntity() # FlowRegistryClientEntity | The flow registry client configuration details.

try:
    # Updates a flow registry client
    api_response = api_instance.update_flow_registry_client(id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->update_flow_registry_client: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The flow registry client id. | 
 **body** | [**FlowRegistryClientEntity**](FlowRegistryClientEntity.md)| The flow registry client configuration details. | 

### Return type

[**FlowRegistryClientEntity**](FlowRegistryClientEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_node**
> NodeEntity update_node(id, body)

Updates a node in the cluster



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ControllerApi()
id = 'id_example' # str | The node id.
body = nifi_client_v1.NodeEntity() # NodeEntity | The node configuration. The only configuration that will be honored at this endpoint is the status.

try:
    # Updates a node in the cluster
    api_response = api_instance.update_node(id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->update_node: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The node id. | 
 **body** | [**NodeEntity**](NodeEntity.md)| The node configuration. The only configuration that will be honored at this endpoint is the status. | 

### Return type

[**NodeEntity**](NodeEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

