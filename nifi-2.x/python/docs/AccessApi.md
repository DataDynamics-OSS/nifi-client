# swagger_client.AccessApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_access_token**](AccessApi.md#create_access_token) | **POST** /access/token | Creates a token for accessing the REST API via username/password
[**log_out**](AccessApi.md#log_out) | **DELETE** /access/logout | Performs a logout for other providers that have been issued a JWT.
[**log_out_complete**](AccessApi.md#log_out_complete) | **GET** /access/logout/complete | Completes the logout sequence by removing the cached Logout Request and Cookie if they existed and redirects to /nifi/login.

# **create_access_token**
> str create_access_token(username=username, password=password)

Creates a token for accessing the REST API via username/password

The token returned is formatted as a JSON Web Token (JWT). The token is base64 encoded and comprised of three parts. The header, the body, and the signature. The expiration of the token is a contained within the body. It is stored in the browser as a cookie, but also returned inthe response body to be stored/used by third party client scripts.

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = swagger_client.AccessApi()
username = 'username_example' # str |  (optional)
password = 'password_example' # str |  (optional)

try:
    # Creates a token for accessing the REST API via username/password
    api_response = api_instance.create_access_token(username=username, password=password)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccessApi->create_access_token: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **str**|  | [optional] 
 **password** | **str**|  | [optional] 

### Return type

**str**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **log_out**
> log_out()

Performs a logout for other providers that have been issued a JWT.

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
api_instance = swagger_client.AccessApi(swagger_client.ApiClient(configuration))

try:
    # Performs a logout for other providers that have been issued a JWT.
    api_instance.log_out()
except ApiException as e:
    print("Exception when calling AccessApi->log_out: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **log_out_complete**
> log_out_complete()

Completes the logout sequence by removing the cached Logout Request and Cookie if they existed and redirects to /nifi/login.

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
api_instance = swagger_client.AccessApi(swagger_client.ApiClient(configuration))

try:
    # Completes the logout sequence by removing the cached Logout Request and Cookie if they existed and redirects to /nifi/login.
    api_instance.log_out_complete()
except ApiException as e:
    print("Exception when calling AccessApi->log_out_complete: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

