# swagger_client.InputPortsApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_input_port**](InputPortsApi.md#get_input_port) | **GET** /input-ports/{id} | Gets an input port
[**remove_input_port**](InputPortsApi.md#remove_input_port) | **DELETE** /input-ports/{id} | Deletes an input port
[**update_input_port**](InputPortsApi.md#update_input_port) | **PUT** /input-ports/{id} | Updates an input port
[**update_run_status**](InputPortsApi.md#update_run_status) | **PUT** /input-ports/{id}/run-status | Updates run status of an input-port


# **get_input_port**
> PortEntity get_input_port(id)

Gets an input port



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.InputPortsApi()
id = 'id_example' # str | The input port id.

try:
    # Gets an input port
    api_response = api_instance.get_input_port(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InputPortsApi->get_input_port: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The input port id. | 

### Return type

[**PortEntity**](PortEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_input_port**
> PortEntity remove_input_port(id, version=version, client_id=client_id, disconnected_node_acknowledged=disconnected_node_acknowledged)

Deletes an input port



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.InputPortsApi()
id = 'id_example' # str | The input port id.
version = 'version_example' # str | The revision is used to verify the client is working with the latest version of the flow. (optional)
client_id = 'client_id_example' # str | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. (optional)
disconnected_node_acknowledged = false # bool | Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional) (default to false)

try:
    # Deletes an input port
    api_response = api_instance.remove_input_port(id, version=version, client_id=client_id, disconnected_node_acknowledged=disconnected_node_acknowledged)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InputPortsApi->remove_input_port: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The input port id. | 
 **version** | **str**| The revision is used to verify the client is working with the latest version of the flow. | [optional] 
 **client_id** | **str**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional] 
 **disconnected_node_acknowledged** | **bool**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**PortEntity**](PortEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_input_port**
> PortEntity update_input_port(id, body)

Updates an input port



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.InputPortsApi()
id = 'id_example' # str | The input port id.
body = swagger_client.PortEntity() # PortEntity | The input port configuration details.

try:
    # Updates an input port
    api_response = api_instance.update_input_port(id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InputPortsApi->update_input_port: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The input port id. | 
 **body** | [**PortEntity**](PortEntity.md)| The input port configuration details. | 

### Return type

[**PortEntity**](PortEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_run_status**
> ProcessorEntity update_run_status(id, body)

Updates run status of an input-port



### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.InputPortsApi()
id = 'id_example' # str | The port id.
body = swagger_client.PortRunStatusEntity() # PortRunStatusEntity | The port run status.

try:
    # Updates run status of an input-port
    api_response = api_instance.update_run_status(id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling InputPortsApi->update_run_status: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The port id. | 
 **body** | [**PortRunStatusEntity**](PortRunStatusEntity.md)| The port run status. | 

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

