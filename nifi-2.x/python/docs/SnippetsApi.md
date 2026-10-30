# nifi_client_v2.SnippetsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_snippet**](SnippetsApi.md#create_snippet) | **POST** /snippets | Creates a snippet. The snippet will be automatically discarded if not used in a subsequent request after 1 minute.
[**delete_snippet**](SnippetsApi.md#delete_snippet) | **DELETE** /snippets/{id} | Deletes the components in a snippet and discards the snippet
[**update_snippet**](SnippetsApi.md#update_snippet) | **PUT** /snippets/{id} | Move&#x27;s the components in this Snippet into a new Process Group and discards the snippet

# **create_snippet**
> SnippetEntity create_snippet(body)

Creates a snippet. The snippet will be automatically discarded if not used in a subsequent request after 1 minute.

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
api_instance = nifi_client_v2.SnippetsApi(nifi_client_v2.ApiClient(configuration))
body = nifi_client_v2.SnippetEntity() # SnippetEntity | The snippet configuration details.

try:
    # Creates a snippet. The snippet will be automatically discarded if not used in a subsequent request after 1 minute.
    api_response = api_instance.create_snippet(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SnippetsApi->create_snippet: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SnippetEntity**](SnippetEntity.md)| The snippet configuration details. | 

### Return type

[**SnippetEntity**](SnippetEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_snippet**
> SnippetEntity delete_snippet(id, disconnected_node_acknowledged=disconnected_node_acknowledged)

Deletes the components in a snippet and discards the snippet

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
api_instance = nifi_client_v2.SnippetsApi(nifi_client_v2.ApiClient(configuration))
id = 'id_example' # str | The snippet id.
disconnected_node_acknowledged = false # bool | Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional) (default to false)

try:
    # Deletes the components in a snippet and discards the snippet
    api_response = api_instance.delete_snippet(id, disconnected_node_acknowledged=disconnected_node_acknowledged)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SnippetsApi->delete_snippet: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The snippet id. | 
 **disconnected_node_acknowledged** | **bool**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**SnippetEntity**](SnippetEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_snippet**
> SnippetEntity update_snippet(body, id)

Move's the components in this Snippet into a new Process Group and discards the snippet

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
api_instance = nifi_client_v2.SnippetsApi(nifi_client_v2.ApiClient(configuration))
body = nifi_client_v2.SnippetEntity() # SnippetEntity | The snippet configuration details.
id = 'id_example' # str | The snippet id.

try:
    # Move's the components in this Snippet into a new Process Group and discards the snippet
    api_response = api_instance.update_snippet(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SnippetsApi->update_snippet: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SnippetEntity**](SnippetEntity.md)| The snippet configuration details. | 
 **id** | **str**| The snippet id. | 

### Return type

[**SnippetEntity**](SnippetEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

