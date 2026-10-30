# nifi_client_v2.FunnelsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_funnel**](FunnelsApi.md#get_funnel) | **GET** /funnels/{id} | Gets a funnel
[**remove_funnel**](FunnelsApi.md#remove_funnel) | **DELETE** /funnels/{id} | Deletes a funnel
[**update_funnel**](FunnelsApi.md#update_funnel) | **PUT** /funnels/{id} | Updates a funnel

# **get_funnel**
> FunnelEntity get_funnel(id)

Gets a funnel

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.FunnelsApi(nifi_client_v2.ApiClient(configuration))
id = 'id_example' # str | The funnel id.

try:
    # Gets a funnel
    api_response = api_instance.get_funnel(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FunnelsApi->get_funnel: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The funnel id. | 

### Return type

[**FunnelEntity**](FunnelEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_funnel**
> FunnelEntity remove_funnel(id, version=version, client_id=client_id, disconnected_node_acknowledged=disconnected_node_acknowledged)

Deletes a funnel

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.FunnelsApi(nifi_client_v2.ApiClient(configuration))
id = 'id_example' # str | The funnel id.
version = 789 # int | The revision is used to verify the client is working with the latest version of the flow. (optional)
client_id = 'client_id_example' # str | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. (optional)
disconnected_node_acknowledged = false # bool | Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional) (default to false)

try:
    # Deletes a funnel
    api_response = api_instance.remove_funnel(id, version=version, client_id=client_id, disconnected_node_acknowledged=disconnected_node_acknowledged)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FunnelsApi->remove_funnel: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The funnel id. | 
 **version** | **int**| The revision is used to verify the client is working with the latest version of the flow. | [optional] 
 **client_id** | **str**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional] 
 **disconnected_node_acknowledged** | **bool**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**FunnelEntity**](FunnelEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_funnel**
> FunnelEntity update_funnel(body, id)

Updates a funnel

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.FunnelsApi(nifi_client_v2.ApiClient(configuration))
body = nifi_client_v2.FunnelEntity() # FunnelEntity | The funnel configuration details.
id = 'id_example' # str | The funnel id.

try:
    # Updates a funnel
    api_response = api_instance.update_funnel(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FunnelsApi->update_funnel: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FunnelEntity**](FunnelEntity.md)| The funnel configuration details. | 
 **id** | **str**| The funnel id. | 

### Return type

[**FunnelEntity**](FunnelEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

