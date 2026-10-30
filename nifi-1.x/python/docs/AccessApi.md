# nifi_client_v1.AccessApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_access_token**](AccessApi.md#create_access_token) | **POST** /access/token | Creates a token for accessing the REST API via username/password
[**create_access_token_from_ticket**](AccessApi.md#create_access_token_from_ticket) | **POST** /access/kerberos | Creates a token for accessing the REST API via Kerberos ticket exchange / SPNEGO negotiation
[**get_access_status**](AccessApi.md#get_access_status) | **GET** /access | Gets the status the client&#39;s access
[**get_access_token_expiration**](AccessApi.md#get_access_token_expiration) | **GET** /access/token/expiration | Get expiration for current Access Token
[**get_login_config**](AccessApi.md#get_login_config) | **GET** /access/config | Retrieves the access configuration for this NiFi
[**knox_callback**](AccessApi.md#knox_callback) | **GET** /access/knox/callback | Redirect/callback URI for processing the result of the Apache Knox login sequence.
[**knox_logout**](AccessApi.md#knox_logout) | **GET** /access/knox/logout | Performs a logout in the Apache Knox.
[**knox_request**](AccessApi.md#knox_request) | **GET** /access/knox/request | Initiates a request to authenticate through Apache Knox.
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
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.AccessApi()
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

# **create_access_token_from_ticket**
> str create_access_token_from_ticket()

Creates a token for accessing the REST API via Kerberos ticket exchange / SPNEGO negotiation

The token returned is formatted as a JSON Web Token (JWT). The token is base64 encoded and comprised of three parts. The header, the body, and the signature. The expiration of the token is a contained within the body. The token can be used in the Authorization header in the format 'Authorization: Bearer <token>'. It is also stored in the browser as a cookie.

### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.AccessApi()

try:
    # Creates a token for accessing the REST API via Kerberos ticket exchange / SPNEGO negotiation
    api_response = api_instance.create_access_token_from_ticket()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccessApi->create_access_token_from_ticket: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

**str**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_access_status**
> AccessStatusEntity get_access_status()

Gets the status the client's access

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.AccessApi()

try:
    # Gets the status the client's access
    api_response = api_instance.get_access_status()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccessApi->get_access_status: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccessStatusEntity**](AccessStatusEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_access_token_expiration**
> AccessTokenExpirationEntity get_access_token_expiration()

Get expiration for current Access Token

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.AccessApi()

try:
    # Get expiration for current Access Token
    api_response = api_instance.get_access_token_expiration()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccessApi->get_access_token_expiration: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccessTokenExpirationEntity**](AccessTokenExpirationEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_login_config**
> AccessConfigurationEntity get_login_config()

Retrieves the access configuration for this NiFi



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.AccessApi()

try:
    # Retrieves the access configuration for this NiFi
    api_response = api_instance.get_login_config()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AccessApi->get_login_config: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AccessConfigurationEntity**](AccessConfigurationEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **knox_callback**
> knox_callback()

Redirect/callback URI for processing the result of the Apache Knox login sequence.

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.AccessApi()

try:
    # Redirect/callback URI for processing the result of the Apache Knox login sequence.
    api_instance.knox_callback()
except ApiException as e:
    print("Exception when calling AccessApi->knox_callback: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **knox_logout**
> knox_logout()

Performs a logout in the Apache Knox.

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.AccessApi()

try:
    # Performs a logout in the Apache Knox.
    api_instance.knox_logout()
except ApiException as e:
    print("Exception when calling AccessApi->knox_logout: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **knox_request**
> knox_request()

Initiates a request to authenticate through Apache Knox.

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.AccessApi()

try:
    # Initiates a request to authenticate through Apache Knox.
    api_instance.knox_request()
except ApiException as e:
    print("Exception when calling AccessApi->knox_request: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **log_out**
> log_out()

Performs a logout for other providers that have been issued a JWT.

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.AccessApi()

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

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **log_out_complete**
> log_out_complete()

Completes the logout sequence by removing the cached Logout Request and Cookie if they existed and redirects to /nifi/login.

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.AccessApi()

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

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

