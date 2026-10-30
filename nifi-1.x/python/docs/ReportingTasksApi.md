# nifi_client_v1.ReportingTasksApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analyze_configuration**](ReportingTasksApi.md#analyze_configuration) | **POST** /reporting-tasks/{id}/config/analysis | Performs analysis of the component&#39;s configuration, providing information about which attributes are referenced.
[**clear_state**](ReportingTasksApi.md#clear_state) | **POST** /reporting-tasks/{id}/state/clear-requests | Clears the state for a reporting task
[**delete_verification_request**](ReportingTasksApi.md#delete_verification_request) | **DELETE** /reporting-tasks/{id}/config/verification-requests/{requestId} | Deletes the Verification Request with the given ID
[**get_property_descriptor**](ReportingTasksApi.md#get_property_descriptor) | **GET** /reporting-tasks/{id}/descriptors | Gets a reporting task property descriptor
[**get_reporting_task**](ReportingTasksApi.md#get_reporting_task) | **GET** /reporting-tasks/{id} | Gets a reporting task
[**get_state**](ReportingTasksApi.md#get_state) | **GET** /reporting-tasks/{id}/state | Gets the state for a reporting task
[**get_verification_request**](ReportingTasksApi.md#get_verification_request) | **GET** /reporting-tasks/{id}/config/verification-requests/{requestId} | Returns the Verification Request with the given ID
[**remove_reporting_task**](ReportingTasksApi.md#remove_reporting_task) | **DELETE** /reporting-tasks/{id} | Deletes a reporting task
[**submit_config_verification_request**](ReportingTasksApi.md#submit_config_verification_request) | **POST** /reporting-tasks/{id}/config/verification-requests | Performs verification of the Reporting Task&#39;s configuration
[**update_reporting_task**](ReportingTasksApi.md#update_reporting_task) | **PUT** /reporting-tasks/{id} | Updates a reporting task
[**update_run_status**](ReportingTasksApi.md#update_run_status) | **PUT** /reporting-tasks/{id}/run-status | Updates run status of a reporting task


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
api_instance = nifi_client_v1.ReportingTasksApi()
id = 'id_example' # str | The reporting task id.
body = nifi_client_v1.ConfigurationAnalysisEntity() # ConfigurationAnalysisEntity | The configuration analysis request.

try:
    # Performs analysis of the component's configuration, providing information about which attributes are referenced.
    api_response = api_instance.analyze_configuration(id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReportingTasksApi->analyze_configuration: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The reporting task id. | 
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

Clears the state for a reporting task



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ReportingTasksApi()
id = 'id_example' # str | The reporting task id.

try:
    # Clears the state for a reporting task
    api_response = api_instance.clear_state(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReportingTasksApi->clear_state: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The reporting task id. | 

### Return type

[**ComponentStateEntity**](ComponentStateEntity.md)

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
api_instance = nifi_client_v1.ReportingTasksApi()
id = 'id_example' # str | The ID of the Reporting Task
request_id = 'request_id_example' # str | The ID of the Verification Request

try:
    # Deletes the Verification Request with the given ID
    api_response = api_instance.delete_verification_request(id, request_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReportingTasksApi->delete_verification_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the Reporting Task | 
 **request_id** | **str**| The ID of the Verification Request | 

### Return type

[**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_property_descriptor**
> PropertyDescriptorEntity get_property_descriptor(id, property_name, sensitive=sensitive)

Gets a reporting task property descriptor



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ReportingTasksApi()
id = 'id_example' # str | The reporting task id.
property_name = 'property_name_example' # str | The property name.
sensitive = false # bool | Property Descriptor requested sensitive status (optional) (default to false)

try:
    # Gets a reporting task property descriptor
    api_response = api_instance.get_property_descriptor(id, property_name, sensitive=sensitive)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReportingTasksApi->get_property_descriptor: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The reporting task id. | 
 **property_name** | **str**| The property name. | 
 **sensitive** | **bool**| Property Descriptor requested sensitive status | [optional] [default to false]

### Return type

[**PropertyDescriptorEntity**](PropertyDescriptorEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_reporting_task**
> ReportingTaskEntity get_reporting_task(id)

Gets a reporting task



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ReportingTasksApi()
id = 'id_example' # str | The reporting task id.

try:
    # Gets a reporting task
    api_response = api_instance.get_reporting_task(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReportingTasksApi->get_reporting_task: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The reporting task id. | 

### Return type

[**ReportingTaskEntity**](ReportingTaskEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_state**
> ComponentStateEntity get_state(id)

Gets the state for a reporting task



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ReportingTasksApi()
id = 'id_example' # str | The reporting task id.

try:
    # Gets the state for a reporting task
    api_response = api_instance.get_state(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReportingTasksApi->get_state: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The reporting task id. | 

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
api_instance = nifi_client_v1.ReportingTasksApi()
id = 'id_example' # str | The ID of the Reporting Task
request_id = 'request_id_example' # str | The ID of the Verification Request

try:
    # Returns the Verification Request with the given ID
    api_response = api_instance.get_verification_request(id, request_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReportingTasksApi->get_verification_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the Reporting Task | 
 **request_id** | **str**| The ID of the Verification Request | 

### Return type

[**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_reporting_task**
> ReportingTaskEntity remove_reporting_task(id, version=version, client_id=client_id, disconnected_node_acknowledged=disconnected_node_acknowledged)

Deletes a reporting task



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ReportingTasksApi()
id = 'id_example' # str | The reporting task id.
version = 'version_example' # str | The revision is used to verify the client is working with the latest version of the flow. (optional)
client_id = 'client_id_example' # str | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. (optional)
disconnected_node_acknowledged = false # bool | Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional) (default to false)

try:
    # Deletes a reporting task
    api_response = api_instance.remove_reporting_task(id, version=version, client_id=client_id, disconnected_node_acknowledged=disconnected_node_acknowledged)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReportingTasksApi->remove_reporting_task: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The reporting task id. | 
 **version** | **str**| The revision is used to verify the client is working with the latest version of the flow. | [optional] 
 **client_id** | **str**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional] 
 **disconnected_node_acknowledged** | **bool**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**ReportingTaskEntity**](ReportingTaskEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_config_verification_request**
> VerifyConfigRequestEntity submit_config_verification_request(id, body)

Performs verification of the Reporting Task's configuration

This will initiate the process of verifying a given Reporting Task configuration. This may be a long-running task. As a result, this endpoint will immediately return a ReportingTaskConfigVerificationRequestEntity, and the process of performing the verification will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /reporting-tasks/{taskId}/verification-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /reporting-tasks/{serviceId}/verification-requests/{requestId}.

### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ReportingTasksApi()
id = 'id_example' # str | The reporting task id.
body = nifi_client_v1.VerifyConfigRequestEntity() # VerifyConfigRequestEntity | The reporting task configuration verification request.

try:
    # Performs verification of the Reporting Task's configuration
    api_response = api_instance.submit_config_verification_request(id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReportingTasksApi->submit_config_verification_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The reporting task id. | 
 **body** | [**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)| The reporting task configuration verification request. | 

### Return type

[**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_reporting_task**
> ReportingTaskEntity update_reporting_task(id, body)

Updates a reporting task



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ReportingTasksApi()
id = 'id_example' # str | The reporting task id.
body = nifi_client_v1.ReportingTaskEntity() # ReportingTaskEntity | The reporting task configuration details.

try:
    # Updates a reporting task
    api_response = api_instance.update_reporting_task(id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReportingTasksApi->update_reporting_task: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The reporting task id. | 
 **body** | [**ReportingTaskEntity**](ReportingTaskEntity.md)| The reporting task configuration details. | 

### Return type

[**ReportingTaskEntity**](ReportingTaskEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_run_status**
> ReportingTaskEntity update_run_status(id, body)

Updates run status of a reporting task



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.ReportingTasksApi()
id = 'id_example' # str | The reporting task id.
body = nifi_client_v1.ReportingTaskRunStatusEntity() # ReportingTaskRunStatusEntity | The reporting task run status.

try:
    # Updates run status of a reporting task
    api_response = api_instance.update_run_status(id, body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReportingTasksApi->update_run_status: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The reporting task id. | 
 **body** | [**ReportingTaskRunStatusEntity**](ReportingTaskRunStatusEntity.md)| The reporting task run status. | 

### Return type

[**ReportingTaskEntity**](ReportingTaskEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

