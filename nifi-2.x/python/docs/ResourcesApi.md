# swagger_client.ResourcesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_resources**](ResourcesApi.md#get_resources) | **GET** /resources | Gets the available resources that support access/authorization policies

# **get_resources**
> ResourcesEntity get_resources()

Gets the available resources that support access/authorization policies

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
api_instance = swagger_client.ResourcesApi(swagger_client.ApiClient(configuration))

try:
    # Gets the available resources that support access/authorization policies
    api_response = api_instance.get_resources()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ResourcesApi->get_resources: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResourcesEntity**](ResourcesEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

