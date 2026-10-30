# nifi_client_v2.AuthenticationApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_authentication_configuration**](AuthenticationApi.md#get_authentication_configuration) | **GET** /authentication/configuration | Retrieves the authentication configuration details and status information

# **get_authentication_configuration**
> AuthenticationConfigurationEntity get_authentication_configuration()

Retrieves the authentication configuration details and status information

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v2.AuthenticationApi()

try:
    # Retrieves the authentication configuration details and status information
    api_response = api_instance.get_authentication_configuration()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AuthenticationApi->get_authentication_configuration: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuthenticationConfigurationEntity**](AuthenticationConfigurationEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

