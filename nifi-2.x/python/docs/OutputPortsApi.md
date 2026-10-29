# swagger_client.OutputPortsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clear_bulletins**](OutputPortsApi.md#clear_bulletins) | **POST** /output-ports/{id}/bulletins/clear-requests | Clears bulletins for an output port
[**get_output_port**](OutputPortsApi.md#get_output_port) | **GET** /output-ports/{id} | Gets an output port
[**remove_output_port**](OutputPortsApi.md#remove_output_port) | **DELETE** /output-ports/{id} | Deletes an output port
[**update_output_port**](OutputPortsApi.md#update_output_port) | **PUT** /output-ports/{id} | Updates an output port
[**update_run_status**](OutputPortsApi.md#update_run_status) | **PUT** /output-ports/{id}/run-status | Updates run status of an output-port

# **clear_bulletins**
> ClearBulletinsResultEntity clear_bulletins(body, id)

Clears bulletins for an output port

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
api_instance = swagger_client.OutputPortsApi(swagger_client.ApiClient(configuration))
body = swagger_client.ClearBulletinsRequestEntity() # ClearBulletinsRequestEntity | The request to clear bulletins.
id = 'id_example' # str | The output port id.

try:
    # Clears bulletins for an output port
    api_response = api_instance.clear_bulletins(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OutputPortsApi->clear_bulletins: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClearBulletinsRequestEntity**](ClearBulletinsRequestEntity.md)| The request to clear bulletins. | 
 **id** | **str**| The output port id. | 

### Return type

[**ClearBulletinsResultEntity**](ClearBulletinsResultEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_output_port**
> PortEntity get_output_port(id)

Gets an output port

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
api_instance = swagger_client.OutputPortsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The output port id.

try:
    # Gets an output port
    api_response = api_instance.get_output_port(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OutputPortsApi->get_output_port: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The output port id. | 

### Return type

[**PortEntity**](PortEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_output_port**
> PortEntity remove_output_port(id, version=version, client_id=client_id, disconnected_node_acknowledged=disconnected_node_acknowledged)

Deletes an output port

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
api_instance = swagger_client.OutputPortsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The output port id.
version = 789 # int | The revision is used to verify the client is working with the latest version of the flow. (optional)
client_id = 'client_id_example' # str | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. (optional)
disconnected_node_acknowledged = false # bool | Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional) (default to false)

try:
    # Deletes an output port
    api_response = api_instance.remove_output_port(id, version=version, client_id=client_id, disconnected_node_acknowledged=disconnected_node_acknowledged)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OutputPortsApi->remove_output_port: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The output port id. | 
 **version** | **int**| The revision is used to verify the client is working with the latest version of the flow. | [optional] 
 **client_id** | **str**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional] 
 **disconnected_node_acknowledged** | **bool**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**PortEntity**](PortEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_output_port**
> PortEntity update_output_port(body, id)

Updates an output port

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
api_instance = swagger_client.OutputPortsApi(swagger_client.ApiClient(configuration))
body = swagger_client.PortEntity() # PortEntity | The output port configuration details.
id = 'id_example' # str | The output port id.

try:
    # Updates an output port
    api_response = api_instance.update_output_port(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OutputPortsApi->update_output_port: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PortEntity**](PortEntity.md)| The output port configuration details. | 
 **id** | **str**| The output port id. | 

### Return type

[**PortEntity**](PortEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_run_status**
> ProcessorEntity update_run_status(body, id)

Updates run status of an output-port

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
api_instance = swagger_client.OutputPortsApi(swagger_client.ApiClient(configuration))
body = swagger_client.PortRunStatusEntity() # PortRunStatusEntity | The port run status.
id = 'id_example' # str | The port id.

try:
    # Updates run status of an output-port
    api_response = api_instance.update_run_status(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling OutputPortsApi->update_run_status: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PortRunStatusEntity**](PortRunStatusEntity.md)| The port run status. | 
 **id** | **str**| The port id. | 

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

