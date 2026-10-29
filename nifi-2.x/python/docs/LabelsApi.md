# swagger_client.LabelsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_label**](LabelsApi.md#get_label) | **GET** /labels/{id} | Gets a label
[**remove_label**](LabelsApi.md#remove_label) | **DELETE** /labels/{id} | Deletes a label
[**update_label**](LabelsApi.md#update_label) | **PUT** /labels/{id} | Updates a label

# **get_label**
> LabelEntity get_label(id)

Gets a label

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
api_instance = swagger_client.LabelsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The label id.

try:
    # Gets a label
    api_response = api_instance.get_label(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LabelsApi->get_label: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The label id. | 

### Return type

[**LabelEntity**](LabelEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_label**
> LabelEntity remove_label(id, version=version, client_id=client_id, disconnected_node_acknowledged=disconnected_node_acknowledged)

Deletes a label

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
api_instance = swagger_client.LabelsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The label id.
version = 789 # int | The revision is used to verify the client is working with the latest version of the flow. (optional)
client_id = 'client_id_example' # str | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. (optional)
disconnected_node_acknowledged = false # bool | Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional) (default to false)

try:
    # Deletes a label
    api_response = api_instance.remove_label(id, version=version, client_id=client_id, disconnected_node_acknowledged=disconnected_node_acknowledged)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LabelsApi->remove_label: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The label id. | 
 **version** | **int**| The revision is used to verify the client is working with the latest version of the flow. | [optional] 
 **client_id** | **str**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional] 
 **disconnected_node_acknowledged** | **bool**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**LabelEntity**](LabelEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_label**
> LabelEntity update_label(body, id)

Updates a label

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
api_instance = swagger_client.LabelsApi(swagger_client.ApiClient(configuration))
body = swagger_client.LabelEntity() # LabelEntity | The label configuration details.
id = 'id_example' # str | The label id.

try:
    # Updates a label
    api_response = api_instance.update_label(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LabelsApi->update_label: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**LabelEntity**](LabelEntity.md)| The label configuration details. | 
 **id** | **str**| The label id. | 

### Return type

[**LabelEntity**](LabelEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

