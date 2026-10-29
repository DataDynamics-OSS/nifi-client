# swagger_client.CountersApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_counters**](CountersApi.md#get_counters) | **GET** /counters | Gets the current counters for this NiFi
[**update_all_counters**](CountersApi.md#update_all_counters) | **PUT** /counters | Updates all counters. This will reset all counter values to 0
[**update_counter**](CountersApi.md#update_counter) | **PUT** /counters/{id} | Updates the specified counter. This will reset the counter value to 0

# **get_counters**
> CountersEntity get_counters(nodewise=nodewise, cluster_node_id=cluster_node_id)

Gets the current counters for this NiFi

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
api_instance = swagger_client.CountersApi(swagger_client.ApiClient(configuration))
nodewise = false # bool | Whether or not to include the breakdown per node. Optional, defaults to false (optional) (default to false)
cluster_node_id = 'cluster_node_id_example' # str | The id of the node where to get the status. (optional)

try:
    # Gets the current counters for this NiFi
    api_response = api_instance.get_counters(nodewise=nodewise, cluster_node_id=cluster_node_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CountersApi->get_counters: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodewise** | **bool**| Whether or not to include the breakdown per node. Optional, defaults to false | [optional] [default to false]
 **cluster_node_id** | **str**| The id of the node where to get the status. | [optional] 

### Return type

[**CountersEntity**](CountersEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_all_counters**
> CountersEntity update_all_counters()

Updates all counters. This will reset all counter values to 0

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
api_instance = swagger_client.CountersApi(swagger_client.ApiClient(configuration))

try:
    # Updates all counters. This will reset all counter values to 0
    api_response = api_instance.update_all_counters()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CountersApi->update_all_counters: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CountersEntity**](CountersEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_counter**
> CounterEntity update_counter(id)

Updates the specified counter. This will reset the counter value to 0

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
api_instance = swagger_client.CountersApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The id of the counter.

try:
    # Updates the specified counter. This will reset the counter value to 0
    api_response = api_instance.update_counter(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling CountersApi->update_counter: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The id of the counter. | 

### Return type

[**CounterEntity**](CounterEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

