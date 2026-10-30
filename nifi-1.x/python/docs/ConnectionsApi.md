# nifi_client_v1.ConnectionsApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete_connection**](ConnectionsApi.md#delete_connection) | **DELETE** /connections/{id} | Deletes a connection
[**get_connection**](ConnectionsApi.md#get_connection) | **GET** /connections/{id} | Gets a connection
[**update_connection**](ConnectionsApi.md#update_connection) | **PUT** /connections/{id} | Updates a connection


# **delete_connection**
> ConnectionEntity delete_connection(id, version=version, client_id=client_id, disconnected_node_acknowledged=disconnected_node_acknowledged)

Deletes a connection



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ConnectionsApi()
id = 'id_example' # str | The connection id.
version = 'version_example' # str | The revision is used to verify the client is working with the latest version of the flow. (optional)
client_id = 'client_id_example' # str | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. (optional)
disconnected_node_acknowledged = false # bool | Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional) (default to false)

try:
    # Deletes a connection
    api_response = api_instance.delete_connection(id, version=version, client_id=client_id, disconnected_node_acknowledged=disconnected_node_acknowledged)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectionsApi->delete_connection: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connection id. | 
 **version** | **str**| The revision is used to verify the client is working with the latest version of the flow. | [optional] 
 **client_id** | **str**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional] 
 **disconnected_node_acknowledged** | **bool**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**ConnectionEntity**](ConnectionEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_connection**
> ConnectionEntity get_connection(id)

Gets a connection



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ConnectionsApi()
id = 'id_example' # str | The connection id.

try:
    # Gets a connection
    api_response = api_instance.get_connection(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectionsApi->get_connection: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connection id. | 

### Return type

[**ConnectionEntity**](ConnectionEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_connection**
> ConnectionEntity update_connection(id, body)

Updates a connection



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ConnectionsApi()
id = 'id_example' # str | The connection id.
body = nifi_client_v1.ConnectionEntity() # ConnectionEntity | The connection configuration details.

try:
    # Updates a connection
    api_response = api_instance.update_connection(id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ConnectionsApi->update_connection: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connection id. | 
 **body** | [**ConnectionEntity**](ConnectionEntity.md)| The connection configuration details. | 

### Return type

[**ConnectionEntity**](ConnectionEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

