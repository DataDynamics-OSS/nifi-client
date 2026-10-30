# nifi_client_v2.ParameterContextsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_asset**](ParameterContextsApi.md#create_asset) | **POST** /parameter-contexts/{contextId}/assets | Creates a new Asset in the given Parameter Context
[**create_parameter_context**](ParameterContextsApi.md#create_parameter_context) | **POST** /parameter-contexts | Create a Parameter Context
[**delete_asset**](ParameterContextsApi.md#delete_asset) | **DELETE** /parameter-contexts/{contextId}/assets/{assetId} | Deletes an Asset from the given Parameter Context
[**delete_parameter_context**](ParameterContextsApi.md#delete_parameter_context) | **DELETE** /parameter-contexts/{id} | Deletes the Parameter Context with the given ID
[**delete_update_request**](ParameterContextsApi.md#delete_update_request) | **DELETE** /parameter-contexts/{contextId}/update-requests/{requestId} | Deletes the Update Request with the given ID
[**delete_validation_request**](ParameterContextsApi.md#delete_validation_request) | **DELETE** /parameter-contexts/{contextId}/validation-requests/{id} | Deletes the Validation Request with the given ID
[**get_asset_content**](ParameterContextsApi.md#get_asset_content) | **GET** /parameter-contexts/{contextId}/assets/{assetId} | Retrieves the content of the asset with the given id
[**get_assets**](ParameterContextsApi.md#get_assets) | **GET** /parameter-contexts/{contextId}/assets | Lists the assets that belong to the Parameter Context with the given ID.
[**get_parameter_context**](ParameterContextsApi.md#get_parameter_context) | **GET** /parameter-contexts/{id} | Returns the Parameter Context with the given ID
[**get_parameter_context_update**](ParameterContextsApi.md#get_parameter_context_update) | **GET** /parameter-contexts/{contextId}/update-requests/{requestId} | Returns the Update Request with the given ID
[**get_validation_request**](ParameterContextsApi.md#get_validation_request) | **GET** /parameter-contexts/{contextId}/validation-requests/{id} | Returns the Validation Request with the given ID
[**submit_parameter_context_update**](ParameterContextsApi.md#submit_parameter_context_update) | **POST** /parameter-contexts/{contextId}/update-requests | Initiate the Update Request of a Parameter Context
[**submit_validation_request**](ParameterContextsApi.md#submit_validation_request) | **POST** /parameter-contexts/{contextId}/validation-requests | Initiate a Validation Request to determine how the validity of components will change if a Parameter Context were to be updated
[**update_parameter_context**](ParameterContextsApi.md#update_parameter_context) | **PUT** /parameter-contexts/{id} | Modifies a Parameter Context

# **create_asset**
> AssetEntity create_asset(body, context_id, filename=filename)

Creates a new Asset in the given Parameter Context

This endpoint will create a new Asset in the given Parameter Context. The Asset will be created with the given name and the contents of the file that is uploaded. The Asset will be created in the given Parameter Context, and will be available for use by any component that references the Parameter Context.

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
api_instance = nifi_client_v2.ParameterContextsApi(nifi_client_v2.ApiClient(configuration))
body = NULL # object | The contents of the asset.
context_id = 'context_id_example' # str | 
filename = 'filename_example' # str |  (optional)

try:
    # Creates a new Asset in the given Parameter Context
    api_response = api_instance.create_asset(body, context_id, filename=filename)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ParameterContextsApi->create_asset: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**object**](object.md)| The contents of the asset. | 
 **context_id** | **str**|  | 
 **filename** | **str**|  | [optional] 

### Return type

[**AssetEntity**](AssetEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_parameter_context**
> ParameterContextEntity create_parameter_context(body)

Create a Parameter Context

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
api_instance = nifi_client_v2.ParameterContextsApi(nifi_client_v2.ApiClient(configuration))
body = nifi_client_v2.ParameterContextEntity() # ParameterContextEntity | The Parameter Context.

try:
    # Create a Parameter Context
    api_response = api_instance.create_parameter_context(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ParameterContextsApi->create_parameter_context: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ParameterContextEntity**](ParameterContextEntity.md)| The Parameter Context. | 

### Return type

[**ParameterContextEntity**](ParameterContextEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_asset**
> AssetEntity delete_asset(context_id, asset_id, disconnected_node_acknowledged=disconnected_node_acknowledged)

Deletes an Asset from the given Parameter Context

This endpoint will create a new Asset in the given Parameter Context. The Asset will be created with the given name and the contents of the file that is uploaded. The Asset will be created in the given Parameter Context, and will be available for use by any component that references the Parameter Context.

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
api_instance = nifi_client_v2.ParameterContextsApi(nifi_client_v2.ApiClient(configuration))
context_id = 'context_id_example' # str | The ID of the Parameter Context
asset_id = 'asset_id_example' # str | The ID of the Asset
disconnected_node_acknowledged = false # bool | Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional) (default to false)

try:
    # Deletes an Asset from the given Parameter Context
    api_response = api_instance.delete_asset(context_id, asset_id, disconnected_node_acknowledged=disconnected_node_acknowledged)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ParameterContextsApi->delete_asset: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context_id** | **str**| The ID of the Parameter Context | 
 **asset_id** | **str**| The ID of the Asset | 
 **disconnected_node_acknowledged** | **bool**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**AssetEntity**](AssetEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_parameter_context**
> ParameterContextEntity delete_parameter_context(id, version=version, client_id=client_id, disconnected_node_acknowledged=disconnected_node_acknowledged)

Deletes the Parameter Context with the given ID

Deletes the Parameter Context with the given ID.

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
api_instance = nifi_client_v2.ParameterContextsApi(nifi_client_v2.ApiClient(configuration))
id = 'id_example' # str | The Parameter Context ID.
version = 789 # int | The version is used to verify the client is working with the latest version of the flow. (optional)
client_id = 'client_id_example' # str | If the client id is not specified, a new one will be generated. This value (whether specified or generated) is included in the response. (optional)
disconnected_node_acknowledged = false # bool | Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional) (default to false)

try:
    # Deletes the Parameter Context with the given ID
    api_response = api_instance.delete_parameter_context(id, version=version, client_id=client_id, disconnected_node_acknowledged=disconnected_node_acknowledged)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ParameterContextsApi->delete_parameter_context: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The Parameter Context ID. | 
 **version** | **int**| The version is used to verify the client is working with the latest version of the flow. | [optional] 
 **client_id** | **str**| If the client id is not specified, a new one will be generated. This value (whether specified or generated) is included in the response. | [optional] 
 **disconnected_node_acknowledged** | **bool**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**ParameterContextEntity**](ParameterContextEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_update_request**
> ParameterContextUpdateRequestEntity delete_update_request(context_id, request_id, disconnected_node_acknowledged=disconnected_node_acknowledged)

Deletes the Update Request with the given ID

Deletes the Update Request with the given ID. After a request is created via a POST to /nifi-api/parameter-contexts/update-requests, it is expected that the client will properly clean up the request by DELETE'ing it, once the Update process has completed. If the request is deleted before the request completes, then the Update request will finish the step that it is currently performing and then will cancel any subsequent steps.

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
api_instance = nifi_client_v2.ParameterContextsApi(nifi_client_v2.ApiClient(configuration))
context_id = 'context_id_example' # str | The ID of the ParameterContext
request_id = 'request_id_example' # str | The ID of the Update Request
disconnected_node_acknowledged = false # bool | Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional) (default to false)

try:
    # Deletes the Update Request with the given ID
    api_response = api_instance.delete_update_request(context_id, request_id, disconnected_node_acknowledged=disconnected_node_acknowledged)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ParameterContextsApi->delete_update_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context_id** | **str**| The ID of the ParameterContext | 
 **request_id** | **str**| The ID of the Update Request | 
 **disconnected_node_acknowledged** | **bool**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**ParameterContextUpdateRequestEntity**](ParameterContextUpdateRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_validation_request**
> ParameterContextValidationRequestEntity delete_validation_request(context_id, id, disconnected_node_acknowledged=disconnected_node_acknowledged)

Deletes the Validation Request with the given ID

Deletes the Validation Request with the given ID. After a request is created via a POST to /nifi-api/validation-contexts, it is expected that the client will properly clean up the request by DELETE'ing it, once the validation process has completed. If the request is deleted before the request completes, then the Validation request will finish the step that it is currently performing and then will cancel any subsequent steps.

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
api_instance = nifi_client_v2.ParameterContextsApi(nifi_client_v2.ApiClient(configuration))
context_id = 'context_id_example' # str | The ID of the Parameter Context
id = 'id_example' # str | The ID of the Update Request
disconnected_node_acknowledged = false # bool | Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional) (default to false)

try:
    # Deletes the Validation Request with the given ID
    api_response = api_instance.delete_validation_request(context_id, id, disconnected_node_acknowledged=disconnected_node_acknowledged)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ParameterContextsApi->delete_validation_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context_id** | **str**| The ID of the Parameter Context | 
 **id** | **str**| The ID of the Update Request | 
 **disconnected_node_acknowledged** | **bool**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**ParameterContextValidationRequestEntity**](ParameterContextValidationRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_asset_content**
> str get_asset_content(context_id, asset_id)

Retrieves the content of the asset with the given id

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
api_instance = nifi_client_v2.ParameterContextsApi(nifi_client_v2.ApiClient(configuration))
context_id = 'context_id_example' # str | The ID of the Parameter Context
asset_id = 'asset_id_example' # str | The ID of the Asset

try:
    # Retrieves the content of the asset with the given id
    api_response = api_instance.get_asset_content(context_id, asset_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ParameterContextsApi->get_asset_content: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context_id** | **str**| The ID of the Parameter Context | 
 **asset_id** | **str**| The ID of the Asset | 

### Return type

**str**

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_assets**
> AssetsEntity get_assets(context_id)

Lists the assets that belong to the Parameter Context with the given ID.

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
api_instance = nifi_client_v2.ParameterContextsApi(nifi_client_v2.ApiClient(configuration))
context_id = 'context_id_example' # str | The ID of the Parameter Context

try:
    # Lists the assets that belong to the Parameter Context with the given ID.
    api_response = api_instance.get_assets(context_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ParameterContextsApi->get_assets: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context_id** | **str**| The ID of the Parameter Context | 

### Return type

[**AssetsEntity**](AssetsEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_parameter_context**
> ParameterContextEntity get_parameter_context(id, include_inherited_parameters=include_inherited_parameters)

Returns the Parameter Context with the given ID

Returns the Parameter Context with the given ID.

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
api_instance = nifi_client_v2.ParameterContextsApi(nifi_client_v2.ApiClient(configuration))
id = 'id_example' # str | The ID of the Parameter Context
include_inherited_parameters = false # bool | Whether or not to include inherited parameters from other parameter contexts, and therefore also overridden values.  If true, the result will be the 'effective' parameter context. (optional) (default to false)

try:
    # Returns the Parameter Context with the given ID
    api_response = api_instance.get_parameter_context(id, include_inherited_parameters=include_inherited_parameters)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ParameterContextsApi->get_parameter_context: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the Parameter Context | 
 **include_inherited_parameters** | **bool**| Whether or not to include inherited parameters from other parameter contexts, and therefore also overridden values.  If true, the result will be the &#x27;effective&#x27; parameter context. | [optional] [default to false]

### Return type

[**ParameterContextEntity**](ParameterContextEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_parameter_context_update**
> ParameterContextUpdateRequestEntity get_parameter_context_update(context_id, request_id)

Returns the Update Request with the given ID

Returns the Update Request with the given ID. Once an Update Request has been created by performing a POST to /nifi-api/parameter-contexts, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and any failures. 

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
api_instance = nifi_client_v2.ParameterContextsApi(nifi_client_v2.ApiClient(configuration))
context_id = 'context_id_example' # str | The ID of the Parameter Context
request_id = 'request_id_example' # str | The ID of the Update Request

try:
    # Returns the Update Request with the given ID
    api_response = api_instance.get_parameter_context_update(context_id, request_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ParameterContextsApi->get_parameter_context_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context_id** | **str**| The ID of the Parameter Context | 
 **request_id** | **str**| The ID of the Update Request | 

### Return type

[**ParameterContextUpdateRequestEntity**](ParameterContextUpdateRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_validation_request**
> ParameterContextValidationRequestEntity get_validation_request(context_id, id)

Returns the Validation Request with the given ID

Returns the Validation Request with the given ID. Once a Validation Request has been created by performing a POST to /nifi-api/validation-contexts, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and any failures. 

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
api_instance = nifi_client_v2.ParameterContextsApi(nifi_client_v2.ApiClient(configuration))
context_id = 'context_id_example' # str | The ID of the Parameter Context
id = 'id_example' # str | The ID of the Validation Request

try:
    # Returns the Validation Request with the given ID
    api_response = api_instance.get_validation_request(context_id, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ParameterContextsApi->get_validation_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **context_id** | **str**| The ID of the Parameter Context | 
 **id** | **str**| The ID of the Validation Request | 

### Return type

[**ParameterContextValidationRequestEntity**](ParameterContextValidationRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_parameter_context_update**
> ParameterContextUpdateRequestEntity submit_parameter_context_update(body, context_id)

Initiate the Update Request of a Parameter Context

This will initiate the process of updating a Parameter Context. Changing the value of a Parameter may require that one or more components be stopped and restarted, so this action may take significantly more time than many other REST API actions. As a result, this endpoint will immediately return a ParameterContextUpdateRequestEntity, and the process of updating the necessary components will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /parameter-contexts/update-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /parameter-contexts/update-requests/{requestId}.

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
api_instance = nifi_client_v2.ParameterContextsApi(nifi_client_v2.ApiClient(configuration))
body = nifi_client_v2.ParameterContextEntity() # ParameterContextEntity | The updated version of the parameter context.
context_id = 'context_id_example' # str | 

try:
    # Initiate the Update Request of a Parameter Context
    api_response = api_instance.submit_parameter_context_update(body, context_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ParameterContextsApi->submit_parameter_context_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ParameterContextEntity**](ParameterContextEntity.md)| The updated version of the parameter context. | 
 **context_id** | **str**|  | 

### Return type

[**ParameterContextUpdateRequestEntity**](ParameterContextUpdateRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_validation_request**
> ParameterContextValidationRequestEntity submit_validation_request(body, context_id)

Initiate a Validation Request to determine how the validity of components will change if a Parameter Context were to be updated

This will initiate the process of validating all components whose Process Group is bound to the specified Parameter Context. Performing validation against an arbitrary number of components may be expect and take significantly more time than many other REST API actions. As a result, this endpoint will immediately return a ParameterContextValidationRequestEntity, and the process of validating the necessary components will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /parameter-contexts/validation-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /parameter-contexts/validation-requests/{requestId}.

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
api_instance = nifi_client_v2.ParameterContextsApi(nifi_client_v2.ApiClient(configuration))
body = nifi_client_v2.ParameterContextValidationRequestEntity() # ParameterContextValidationRequestEntity | The validation request
context_id = 'context_id_example' # str | The ID of the ParameterContext

try:
    # Initiate a Validation Request to determine how the validity of components will change if a Parameter Context were to be updated
    api_response = api_instance.submit_validation_request(body, context_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ParameterContextsApi->submit_validation_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ParameterContextValidationRequestEntity**](ParameterContextValidationRequestEntity.md)| The validation request | 
 **context_id** | **str**| The ID of the ParameterContext | 

### Return type

[**ParameterContextValidationRequestEntity**](ParameterContextValidationRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_parameter_context**
> ParameterContextEntity update_parameter_context(body, id)

Modifies a Parameter Context

This endpoint will update a Parameter Context to match the provided entity. However, this request will fail if any component is running and is referencing a Parameter in the Parameter Context. Generally, this endpoint is not called directly. Instead, an update request should be submitted by making a POST to the /parameter-contexts/update-requests endpoint. That endpoint will, in turn, call this endpoint.

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
api_instance = nifi_client_v2.ParameterContextsApi(nifi_client_v2.ApiClient(configuration))
body = nifi_client_v2.ParameterContextEntity() # ParameterContextEntity | The updated Parameter Context
id = 'id_example' # str | 

try:
    # Modifies a Parameter Context
    api_response = api_instance.update_parameter_context(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ParameterContextsApi->update_parameter_context: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ParameterContextEntity**](ParameterContextEntity.md)| The updated Parameter Context | 
 **id** | **str**|  | 

### Return type

[**ParameterContextEntity**](ParameterContextEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

