# nifi_client_v1.ParameterProvidersApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analyze_configuration**](ParameterProvidersApi.md#analyze_configuration) | **POST** /parameter-providers/{id}/config/analysis | Performs analysis of the component&#39;s configuration, providing information about which attributes are referenced.
[**clear_state**](ParameterProvidersApi.md#clear_state) | **POST** /parameter-providers/{id}/state/clear-requests | Clears the state for a parameter provider
[**delete_apply_parameters_request**](ParameterProvidersApi.md#delete_apply_parameters_request) | **DELETE** /parameter-providers/{providerId}/apply-parameters-requests/{requestId} | Deletes the Apply Parameters Request with the given ID
[**delete_verification_request**](ParameterProvidersApi.md#delete_verification_request) | **DELETE** /parameter-providers/{id}/config/verification-requests/{requestId} | Deletes the Verification Request with the given ID
[**fetch_parameters**](ParameterProvidersApi.md#fetch_parameters) | **POST** /parameter-providers/{id}/parameters/fetch-requests | Fetches and temporarily caches the parameters for a provider
[**get_parameter_provider**](ParameterProvidersApi.md#get_parameter_provider) | **GET** /parameter-providers/{id} | Gets a parameter provider
[**get_parameter_provider_apply_parameters_request**](ParameterProvidersApi.md#get_parameter_provider_apply_parameters_request) | **GET** /parameter-providers/{providerId}/apply-parameters-requests/{requestId} | Returns the Apply Parameters Request with the given ID
[**get_parameter_provider_references**](ParameterProvidersApi.md#get_parameter_provider_references) | **GET** /parameter-providers/{id}/references | Gets all references to a parameter provider
[**get_property_descriptor**](ParameterProvidersApi.md#get_property_descriptor) | **GET** /parameter-providers/{id}/descriptors | Gets a parameter provider property descriptor
[**get_state**](ParameterProvidersApi.md#get_state) | **GET** /parameter-providers/{id}/state | Gets the state for a parameter provider
[**get_verification_request**](ParameterProvidersApi.md#get_verification_request) | **GET** /parameter-providers/{id}/config/verification-requests/{requestId} | Returns the Verification Request with the given ID
[**remove_parameter_provider**](ParameterProvidersApi.md#remove_parameter_provider) | **DELETE** /parameter-providers/{id} | Deletes a parameter provider
[**submit_apply_parameters**](ParameterProvidersApi.md#submit_apply_parameters) | **POST** /parameter-providers/{providerId}/apply-parameters-requests | Initiate a request to apply the fetched parameters of a Parameter Provider
[**submit_config_verification_request**](ParameterProvidersApi.md#submit_config_verification_request) | **POST** /parameter-providers/{id}/config/verification-requests | Performs verification of the Parameter Provider&#39;s configuration
[**update_parameter_provider**](ParameterProvidersApi.md#update_parameter_provider) | **PUT** /parameter-providers/{id} | Updates a parameter provider


# **analyze_configuration**
> ConfigurationAnalysisEntity analyze_configuration(id, body)

Performs analysis of the component's configuration, providing information about which attributes are referenced.



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ParameterProvidersApi()
id = 'id_example' # str | The parameter provider id.
body = nifi_client_v1.ConfigurationAnalysisEntity() # ConfigurationAnalysisEntity | The configuration analysis request.

try:
    # Performs analysis of the component's configuration, providing information about which attributes are referenced.
    api_response = api_instance.analyze_configuration(id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ParameterProvidersApi->analyze_configuration: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The parameter provider id. | 
 **body** | [**ConfigurationAnalysisEntity**](ConfigurationAnalysisEntity.md)| The configuration analysis request. | 

### Return type

[**ConfigurationAnalysisEntity**](ConfigurationAnalysisEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **clear_state**
> ComponentStateEntity clear_state(id)

Clears the state for a parameter provider



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ParameterProvidersApi()
id = 'id_example' # str | The parameter provider id.

try:
    # Clears the state for a parameter provider
    api_response = api_instance.clear_state(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ParameterProvidersApi->clear_state: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The parameter provider id. | 

### Return type

[**ComponentStateEntity**](ComponentStateEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_apply_parameters_request**
> ParameterProviderApplyParametersRequestEntity delete_apply_parameters_request(provider_id, request_id, disconnected_node_acknowledged=disconnected_node_acknowledged)

Deletes the Apply Parameters Request with the given ID

Deletes the Apply Parameters Request with the given ID. After a request is created via a POST to /nifi-api/parameter-providers/apply-parameters-requests, it is expected that the client will properly clean up the request by DELETE'ing it, once the Apply process has completed. If the request is deleted before the request completes, then the Apply Parameters Request will finish the step that it is currently performing and then will cancel any subsequent steps.

### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ParameterProvidersApi()
provider_id = 'provider_id_example' # str | The ID of the Parameter Provider
request_id = 'request_id_example' # str | The ID of the Apply Parameters Request
disconnected_node_acknowledged = false # bool | Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional) (default to false)

try:
    # Deletes the Apply Parameters Request with the given ID
    api_response = api_instance.delete_apply_parameters_request(provider_id, request_id, disconnected_node_acknowledged=disconnected_node_acknowledged)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ParameterProvidersApi->delete_apply_parameters_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **provider_id** | **str**| The ID of the Parameter Provider | 
 **request_id** | **str**| The ID of the Apply Parameters Request | 
 **disconnected_node_acknowledged** | **bool**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**ParameterProviderApplyParametersRequestEntity**](ParameterProviderApplyParametersRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
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
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ParameterProvidersApi()
id = 'id_example' # str | The ID of the Parameter Provider
request_id = 'request_id_example' # str | The ID of the Verification Request

try:
    # Deletes the Verification Request with the given ID
    api_response = api_instance.delete_verification_request(id, request_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ParameterProvidersApi->delete_verification_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the Parameter Provider | 
 **request_id** | **str**| The ID of the Verification Request | 

### Return type

[**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fetch_parameters**
> ParameterProviderEntity fetch_parameters(id, body)

Fetches and temporarily caches the parameters for a provider



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ParameterProvidersApi()
id = 'id_example' # str | The parameter provider id.
body = nifi_client_v1.ParameterProviderParameterFetchEntity() # ParameterProviderParameterFetchEntity | The parameter fetch request.

try:
    # Fetches and temporarily caches the parameters for a provider
    api_response = api_instance.fetch_parameters(id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ParameterProvidersApi->fetch_parameters: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The parameter provider id. | 
 **body** | [**ParameterProviderParameterFetchEntity**](ParameterProviderParameterFetchEntity.md)| The parameter fetch request. | 

### Return type

[**ParameterProviderEntity**](ParameterProviderEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_parameter_provider**
> ParameterProviderEntity get_parameter_provider(id)

Gets a parameter provider



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ParameterProvidersApi()
id = 'id_example' # str | The parameter provider id.

try:
    # Gets a parameter provider
    api_response = api_instance.get_parameter_provider(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ParameterProvidersApi->get_parameter_provider: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The parameter provider id. | 

### Return type

[**ParameterProviderEntity**](ParameterProviderEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_parameter_provider_apply_parameters_request**
> ParameterProviderApplyParametersRequestEntity get_parameter_provider_apply_parameters_request(provider_id, request_id)

Returns the Apply Parameters Request with the given ID

Returns the Apply Parameters Request with the given ID. Once an Apply Parameters Request has been created by performing a POST to /nifi-api/parameter-providers, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the state, such as percent complete, the current state of the request, and any failures. 

### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ParameterProvidersApi()
provider_id = 'provider_id_example' # str | The ID of the Parameter Provider
request_id = 'request_id_example' # str | The ID of the Apply Parameters Request

try:
    # Returns the Apply Parameters Request with the given ID
    api_response = api_instance.get_parameter_provider_apply_parameters_request(provider_id, request_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ParameterProvidersApi->get_parameter_provider_apply_parameters_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **provider_id** | **str**| The ID of the Parameter Provider | 
 **request_id** | **str**| The ID of the Apply Parameters Request | 

### Return type

[**ParameterProviderApplyParametersRequestEntity**](ParameterProviderApplyParametersRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_parameter_provider_references**
> ParameterProviderReferencingComponentsEntity get_parameter_provider_references(id)

Gets all references to a parameter provider



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ParameterProvidersApi()
id = 'id_example' # str | The parameter provider id.

try:
    # Gets all references to a parameter provider
    api_response = api_instance.get_parameter_provider_references(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ParameterProvidersApi->get_parameter_provider_references: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The parameter provider id. | 

### Return type

[**ParameterProviderReferencingComponentsEntity**](ParameterProviderReferencingComponentsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_property_descriptor**
> PropertyDescriptorEntity get_property_descriptor(id, property_name)

Gets a parameter provider property descriptor



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ParameterProvidersApi()
id = 'id_example' # str | The parameter provider id.
property_name = 'property_name_example' # str | The property name.

try:
    # Gets a parameter provider property descriptor
    api_response = api_instance.get_property_descriptor(id, property_name)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ParameterProvidersApi->get_property_descriptor: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The parameter provider id. | 
 **property_name** | **str**| The property name. | 

### Return type

[**PropertyDescriptorEntity**](PropertyDescriptorEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_state**
> ComponentStateEntity get_state(id)

Gets the state for a parameter provider



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ParameterProvidersApi()
id = 'id_example' # str | The parameter provider id.

try:
    # Gets the state for a parameter provider
    api_response = api_instance.get_state(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ParameterProvidersApi->get_state: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The parameter provider id. | 

### Return type

[**ComponentStateEntity**](ComponentStateEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
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
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ParameterProvidersApi()
id = 'id_example' # str | The ID of the Parameter Provider
request_id = 'request_id_example' # str | The ID of the Verification Request

try:
    # Returns the Verification Request with the given ID
    api_response = api_instance.get_verification_request(id, request_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ParameterProvidersApi->get_verification_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the Parameter Provider | 
 **request_id** | **str**| The ID of the Verification Request | 

### Return type

[**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_parameter_provider**
> ParameterProviderEntity remove_parameter_provider(id, version=version, client_id=client_id, disconnected_node_acknowledged=disconnected_node_acknowledged)

Deletes a parameter provider



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ParameterProvidersApi()
id = 'id_example' # str | The parameter provider id.
version = 'version_example' # str | The revision is used to verify the client is working with the latest version of the flow. (optional)
client_id = 'client_id_example' # str | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. (optional)
disconnected_node_acknowledged = false # bool | Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional) (default to false)

try:
    # Deletes a parameter provider
    api_response = api_instance.remove_parameter_provider(id, version=version, client_id=client_id, disconnected_node_acknowledged=disconnected_node_acknowledged)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ParameterProvidersApi->remove_parameter_provider: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The parameter provider id. | 
 **version** | **str**| The revision is used to verify the client is working with the latest version of the flow. | [optional] 
 **client_id** | **str**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional] 
 **disconnected_node_acknowledged** | **bool**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**ParameterProviderEntity**](ParameterProviderEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_apply_parameters**
> ParameterProviderApplyParametersRequestEntity submit_apply_parameters(provider_id, body)

Initiate a request to apply the fetched parameters of a Parameter Provider

This will initiate the process of applying fetched parameters to all referencing Parameter Contexts. Changing the value of a Parameter may require that one or more components be stopped and restarted, so this action may take significantly more time than many other REST API actions. As a result, this endpoint will immediately return a ParameterProviderApplyParametersRequestEntity, and the process of updating the necessary components will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /parameter-providers/apply-parameters-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /parameter-providers/apply-parameters-requests/{requestId}.

### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ParameterProvidersApi()
provider_id = 'provider_id_example' # str | 
body = nifi_client_v1.ParameterProviderParameterApplicationEntity() # ParameterProviderParameterApplicationEntity | The apply parameters request.

try:
    # Initiate a request to apply the fetched parameters of a Parameter Provider
    api_response = api_instance.submit_apply_parameters(provider_id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ParameterProvidersApi->submit_apply_parameters: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **provider_id** | **str**|  | 
 **body** | [**ParameterProviderParameterApplicationEntity**](ParameterProviderParameterApplicationEntity.md)| The apply parameters request. | 

### Return type

[**ParameterProviderApplyParametersRequestEntity**](ParameterProviderApplyParametersRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_config_verification_request**
> VerifyConfigRequestEntity submit_config_verification_request(id, body)

Performs verification of the Parameter Provider's configuration

This will initiate the process of verifying a given Parameter Provider configuration. This may be a long-running task. As a result, this endpoint will immediately return a ParameterProviderConfigVerificationRequestEntity, and the process of performing the verification will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /parameter-providers/{serviceId}/verification-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /parameter-providers/{providerId}/verification-requests/{requestId}.

### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ParameterProvidersApi()
id = 'id_example' # str | The parameter provider id.
body = nifi_client_v1.VerifyConfigRequestEntity() # VerifyConfigRequestEntity | The parameter provider configuration verification request.

try:
    # Performs verification of the Parameter Provider's configuration
    api_response = api_instance.submit_config_verification_request(id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ParameterProvidersApi->submit_config_verification_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The parameter provider id. | 
 **body** | [**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)| The parameter provider configuration verification request. | 

### Return type

[**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_parameter_provider**
> ParameterProviderEntity update_parameter_provider(id, body)

Updates a parameter provider



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ParameterProvidersApi()
id = 'id_example' # str | The parameter provider id.
body = nifi_client_v1.ParameterProviderEntity() # ParameterProviderEntity | The parameter provider configuration details.

try:
    # Updates a parameter provider
    api_response = api_instance.update_parameter_provider(id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ParameterProvidersApi->update_parameter_provider: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The parameter provider id. | 
 **body** | [**ParameterProviderEntity**](ParameterProviderEntity.md)| The parameter provider configuration details. | 

### Return type

[**ParameterProviderEntity**](ParameterProviderEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

