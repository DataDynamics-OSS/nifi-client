# swagger_client.ProcessorsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analyze_configuration**](ProcessorsApi.md#analyze_configuration) | **POST** /processors/{id}/config/analysis | Performs analysis of the component&#x27;s configuration, providing information about which attributes are referenced.
[**clear_bulletins**](ProcessorsApi.md#clear_bulletins) | **POST** /processors/{id}/bulletins/clear-requests | Clears bulletins for a processor
[**clear_state**](ProcessorsApi.md#clear_state) | **POST** /processors/{id}/state/clear-requests | Clears the state for a processor
[**delete_backlog_request**](ProcessorsApi.md#delete_backlog_request) | **DELETE** /processors/{id}/backlog-requests/{requestId} | Deletes the Backlog Request with the given ID
[**delete_processor**](ProcessorsApi.md#delete_processor) | **DELETE** /processors/{id} | Deletes a processor
[**delete_verification_request**](ProcessorsApi.md#delete_verification_request) | **DELETE** /processors/{id}/config/verification-requests/{requestId} | Deletes the Verification Request with the given ID
[**get_backlog_request**](ProcessorsApi.md#get_backlog_request) | **GET** /processors/{id}/backlog-requests/{requestId} | Returns the Backlog Request with the given ID
[**get_processor**](ProcessorsApi.md#get_processor) | **GET** /processors/{id} | Gets a processor
[**get_processor_diagnostics**](ProcessorsApi.md#get_processor_diagnostics) | **GET** /processors/{id}/diagnostics | Gets diagnostics information about a processor
[**get_processor_run_status_details**](ProcessorsApi.md#get_processor_run_status_details) | **POST** /processors/run-status-details/queries | Submits a query to retrieve the run status details of all processors that are in the given list of Processor IDs
[**get_property_descriptor**](ProcessorsApi.md#get_property_descriptor) | **GET** /processors/{id}/descriptors | Gets the descriptor for a processor property
[**get_state**](ProcessorsApi.md#get_state) | **GET** /processors/{id}/state | Gets the state for a processor
[**get_verification_request**](ProcessorsApi.md#get_verification_request) | **GET** /processors/{id}/config/verification-requests/{requestId} | Returns the Verification Request with the given ID
[**submit_processor_backlog_request**](ProcessorsApi.md#submit_processor_backlog_request) | **POST** /processors/{id}/backlog-requests | Initiates a request to determine the current backlog for a processor that implements BacklogReportingProcessor
[**submit_processor_verification_request**](ProcessorsApi.md#submit_processor_verification_request) | **POST** /processors/{id}/config/verification-requests | Performs verification of the Processor&#x27;s configuration
[**terminate_processor**](ProcessorsApi.md#terminate_processor) | **DELETE** /processors/{id}/threads | Terminates a processor, essentially \&quot;deleting\&quot; its threads and any active tasks
[**update_processor**](ProcessorsApi.md#update_processor) | **PUT** /processors/{id} | Updates a processor
[**update_run_status**](ProcessorsApi.md#update_run_status) | **PUT** /processors/{id}/run-status | Updates run status of a processor

# **analyze_configuration**
> ConfigurationAnalysisEntity analyze_configuration(body, id)

Performs analysis of the component's configuration, providing information about which attributes are referenced.

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
api_instance = swagger_client.ProcessorsApi(swagger_client.ApiClient(configuration))
body = swagger_client.ConfigurationAnalysisEntity() # ConfigurationAnalysisEntity | The processor configuration analysis request.
id = 'id_example' # str | The processor id.

try:
    # Performs analysis of the component's configuration, providing information about which attributes are referenced.
    api_response = api_instance.analyze_configuration(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessorsApi->analyze_configuration: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConfigurationAnalysisEntity**](ConfigurationAnalysisEntity.md)| The processor configuration analysis request. | 
 **id** | **str**| The processor id. | 

### Return type

[**ConfigurationAnalysisEntity**](ConfigurationAnalysisEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **clear_bulletins**
> ClearBulletinsResultEntity clear_bulletins(body, id)

Clears bulletins for a processor

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
api_instance = swagger_client.ProcessorsApi(swagger_client.ApiClient(configuration))
body = swagger_client.ClearBulletinsRequestEntity() # ClearBulletinsRequestEntity | The clear bulletin request specifying the timestamp from which to clear bulletins.
id = 'id_example' # str | The processor id.

try:
    # Clears bulletins for a processor
    api_response = api_instance.clear_bulletins(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessorsApi->clear_bulletins: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClearBulletinsRequestEntity**](ClearBulletinsRequestEntity.md)| The clear bulletin request specifying the timestamp from which to clear bulletins. | 
 **id** | **str**| The processor id. | 

### Return type

[**ClearBulletinsResultEntity**](ClearBulletinsResultEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **clear_state**
> ComponentStateEntity clear_state(id, body=body)

Clears the state for a processor

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
api_instance = swagger_client.ProcessorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The processor id.
body = swagger_client.ComponentStateEntity() # ComponentStateEntity | Optional component state to perform a selective key removal. If omitted, clears all state. (optional)

try:
    # Clears the state for a processor
    api_response = api_instance.clear_state(id, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessorsApi->clear_state: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The processor id. | 
 **body** | [**ComponentStateEntity**](ComponentStateEntity.md)| Optional component state to perform a selective key removal. If omitted, clears all state. | [optional] 

### Return type

[**ComponentStateEntity**](ComponentStateEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: */*, application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_backlog_request**
> BacklogRequestEntity delete_backlog_request(id, request_id)

Deletes the Backlog Request with the given ID

Deletes the Backlog Request with the given ID. After a request is created, it is expected that the client will properly clean up the request by DELETE'ing it once the backlog determination has completed. If the request is deleted before it completes, the background determination is cancelled.

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
api_instance = swagger_client.ProcessorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The processor id.
request_id = 'request_id_example' # str | The ID of the Backlog Request

try:
    # Deletes the Backlog Request with the given ID
    api_response = api_instance.delete_backlog_request(id, request_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessorsApi->delete_backlog_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The processor id. | 
 **request_id** | **str**| The ID of the Backlog Request | 

### Return type

[**BacklogRequestEntity**](BacklogRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_processor**
> ProcessorEntity delete_processor(id, version=version, client_id=client_id, disconnected_node_acknowledged=disconnected_node_acknowledged)

Deletes a processor

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
api_instance = swagger_client.ProcessorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The processor id.
version = 789 # int | The revision is used to verify the client is working with the latest version of the flow. (optional)
client_id = 'client_id_example' # str | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. (optional)
disconnected_node_acknowledged = false # bool | Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional) (default to false)

try:
    # Deletes a processor
    api_response = api_instance.delete_processor(id, version=version, client_id=client_id, disconnected_node_acknowledged=disconnected_node_acknowledged)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessorsApi->delete_processor: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The processor id. | 
 **version** | **int**| The revision is used to verify the client is working with the latest version of the flow. | [optional] 
 **client_id** | **str**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional] 
 **disconnected_node_acknowledged** | **bool**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_verification_request**
> VerifyConfigRequestEntity delete_verification_request(id, request_id)

Deletes the Verification Request with the given ID

Deletes the Verification Request with the given ID. After a request is created, it is expected that the client will properly clean up the request by DELETE'ing it, once the Verification process has completed. If the request is deleted before the request completes, then the Verification request will finish the step that it is currently performing and then will cancel any subsequent steps.

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
api_instance = swagger_client.ProcessorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The ID of the Processor
request_id = 'request_id_example' # str | The ID of the Verification Request

try:
    # Deletes the Verification Request with the given ID
    api_response = api_instance.delete_verification_request(id, request_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessorsApi->delete_verification_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the Processor | 
 **request_id** | **str**| The ID of the Verification Request | 

### Return type

[**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_backlog_request**
> BacklogRequestEntity get_backlog_request(id, request_id)

Returns the Backlog Request with the given ID

Returns the Backlog Request with the given ID. Once a Backlog Request has been created by performing a POST to /processors/{processorId}/backlog-requests, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and the backlog once the request is complete.

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
api_instance = swagger_client.ProcessorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The processor id.
request_id = 'request_id_example' # str | The ID of the Backlog Request

try:
    # Returns the Backlog Request with the given ID
    api_response = api_instance.get_backlog_request(id, request_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessorsApi->get_backlog_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The processor id. | 
 **request_id** | **str**| The ID of the Backlog Request | 

### Return type

[**BacklogRequestEntity**](BacklogRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_processor**
> ProcessorEntity get_processor(id)

Gets a processor

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
api_instance = swagger_client.ProcessorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The processor id.

try:
    # Gets a processor
    api_response = api_instance.get_processor(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessorsApi->get_processor: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The processor id. | 

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_processor_diagnostics**
> ProcessorEntity get_processor_diagnostics(id)

Gets diagnostics information about a processor

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
api_instance = swagger_client.ProcessorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The processor id.

try:
    # Gets diagnostics information about a processor
    api_response = api_instance.get_processor_diagnostics(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessorsApi->get_processor_diagnostics: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The processor id. | 

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_processor_run_status_details**
> ProcessorsRunStatusDetailsEntity get_processor_run_status_details(body=body)

Submits a query to retrieve the run status details of all processors that are in the given list of Processor IDs

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
api_instance = swagger_client.ProcessorsApi(swagger_client.ApiClient(configuration))
body = swagger_client.RunStatusDetailsRequestEntity() # RunStatusDetailsRequestEntity | The request for the processors that should be included in the results (optional)

try:
    # Submits a query to retrieve the run status details of all processors that are in the given list of Processor IDs
    api_response = api_instance.get_processor_run_status_details(body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessorsApi->get_processor_run_status_details: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RunStatusDetailsRequestEntity**](RunStatusDetailsRequestEntity.md)| The request for the processors that should be included in the results | [optional] 

### Return type

[**ProcessorsRunStatusDetailsEntity**](ProcessorsRunStatusDetailsEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: */*, application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_property_descriptor**
> PropertyDescriptorEntity get_property_descriptor(id, property_name, client_id=client_id, sensitive=sensitive)

Gets the descriptor for a processor property

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
api_instance = swagger_client.ProcessorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The processor id.
property_name = 'property_name_example' # str | The property name.
client_id = 'client_id_example' # str | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. (optional)
sensitive = true # bool | Property Descriptor requested sensitive status (optional)

try:
    # Gets the descriptor for a processor property
    api_response = api_instance.get_property_descriptor(id, property_name, client_id=client_id, sensitive=sensitive)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessorsApi->get_property_descriptor: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The processor id. | 
 **property_name** | **str**| The property name. | 
 **client_id** | **str**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional] 
 **sensitive** | **bool**| Property Descriptor requested sensitive status | [optional] 

### Return type

[**PropertyDescriptorEntity**](PropertyDescriptorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_state**
> ComponentStateEntity get_state(id)

Gets the state for a processor

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
api_instance = swagger_client.ProcessorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The processor id.

try:
    # Gets the state for a processor
    api_response = api_instance.get_state(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessorsApi->get_state: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The processor id. | 

### Return type

[**ComponentStateEntity**](ComponentStateEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_verification_request**
> VerifyConfigRequestEntity get_verification_request(id, request_id)

Returns the Verification Request with the given ID

Returns the Verification Request with the given ID. Once an Verification Request has been created, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and any failures. 

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
api_instance = swagger_client.ProcessorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The ID of the Processor
request_id = 'request_id_example' # str | The ID of the Verification Request

try:
    # Returns the Verification Request with the given ID
    api_response = api_instance.get_verification_request(id, request_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessorsApi->get_verification_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the Processor | 
 **request_id** | **str**| The ID of the Verification Request | 

### Return type

[**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_processor_backlog_request**
> BacklogRequestEntity submit_processor_backlog_request(id)

Initiates a request to determine the current backlog for a processor that implements BacklogReportingProcessor

This will initiate the process of determining the backlog for a Processor. This may be a long-running task. As a result, this endpoint will immediately return a BacklogRequestEntity, and the process of determining the backlog will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /processors/{processorId}/backlog-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /processors/{processorId}/backlog-requests/{requestId}.

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
api_instance = swagger_client.ProcessorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The processor id.

try:
    # Initiates a request to determine the current backlog for a processor that implements BacklogReportingProcessor
    api_response = api_instance.submit_processor_backlog_request(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessorsApi->submit_processor_backlog_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The processor id. | 

### Return type

[**BacklogRequestEntity**](BacklogRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_processor_verification_request**
> VerifyConfigRequestEntity submit_processor_verification_request(body, id)

Performs verification of the Processor's configuration

This will initiate the process of verifying a given Processor configuration. This may be a long-running task. As a result, this endpoint will immediately return a ProcessorConfigVerificationRequestEntity, and the process of performing the verification will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /processors/{processorId}/verification-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /processors/{processorId}/verification-requests/{requestId}.

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
api_instance = swagger_client.ProcessorsApi(swagger_client.ApiClient(configuration))
body = swagger_client.VerifyConfigRequestEntity() # VerifyConfigRequestEntity | The processor configuration verification request.
id = 'id_example' # str | The processor id.

try:
    # Performs verification of the Processor's configuration
    api_response = api_instance.submit_processor_verification_request(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessorsApi->submit_processor_verification_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)| The processor configuration verification request. | 
 **id** | **str**| The processor id. | 

### Return type

[**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **terminate_processor**
> ProcessorEntity terminate_processor(id)

Terminates a processor, essentially \"deleting\" its threads and any active tasks

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
api_instance = swagger_client.ProcessorsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The processor id.

try:
    # Terminates a processor, essentially \"deleting\" its threads and any active tasks
    api_response = api_instance.terminate_processor(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessorsApi->terminate_processor: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The processor id. | 

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_processor**
> ProcessorEntity update_processor(body, id)

Updates a processor

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
api_instance = swagger_client.ProcessorsApi(swagger_client.ApiClient(configuration))
body = swagger_client.ProcessorEntity() # ProcessorEntity | The processor configuration details.
id = 'id_example' # str | The processor id.

try:
    # Updates a processor
    api_response = api_instance.update_processor(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessorsApi->update_processor: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProcessorEntity**](ProcessorEntity.md)| The processor configuration details. | 
 **id** | **str**| The processor id. | 

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_run_status**
> ProcessorEntity update_run_status(body, id)

Updates run status of a processor

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
api_instance = swagger_client.ProcessorsApi(swagger_client.ApiClient(configuration))
body = swagger_client.ProcessorRunStatusEntity() # ProcessorRunStatusEntity | The processor run status.
id = 'id_example' # str | The processor id.

try:
    # Updates run status of a processor
    api_response = api_instance.update_run_status(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProcessorsApi->update_run_status: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProcessorRunStatusEntity**](ProcessorRunStatusEntity.md)| The processor run status. | 
 **id** | **str**| The processor id. | 

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

