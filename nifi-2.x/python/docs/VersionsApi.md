# swagger_client.VersionsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apply_rebased_flow_version**](VersionsApi.md#apply_rebased_flow_version) | **PUT** /versions/process-groups/{id}/rebase | Applies a rebased flow to a Process Group with the given ID on this node
[**create_flow_branch**](VersionsApi.md#create_flow_branch) | **POST** /versions/process-groups/{id}/branches | Creates a new branch for a version controlled Process Group
[**create_version_control_request**](VersionsApi.md#create_version_control_request) | **POST** /versions/active-requests | Create a version control request
[**delete_rebase_request**](VersionsApi.md#delete_rebase_request) | **DELETE** /versions/rebase-requests/{id} | Deletes the Rebase Request with the given ID
[**delete_revert_request**](VersionsApi.md#delete_revert_request) | **DELETE** /versions/revert-requests/{id} | Deletes the Revert Request with the given ID
[**delete_update_request**](VersionsApi.md#delete_update_request) | **DELETE** /versions/update-requests/{id} | Deletes the Update Request with the given ID
[**delete_version_control_request**](VersionsApi.md#delete_version_control_request) | **DELETE** /versions/active-requests/{id} | Deletes the version control request with the given ID
[**export_flow_version**](VersionsApi.md#export_flow_version) | **GET** /versions/process-groups/{id}/download | Gets the latest version of a Process Group for download
[**get_rebase_analysis**](VersionsApi.md#get_rebase_analysis) | **GET** /versions/rebase-analysis/process-groups/{id} | Gets a Rebase Analysis for a Process Group
[**get_rebase_request**](VersionsApi.md#get_rebase_request) | **GET** /versions/rebase-requests/{id} | Returns the Rebase Request with the given ID
[**get_revert_request**](VersionsApi.md#get_revert_request) | **GET** /versions/revert-requests/{id} | Returns the Revert Request with the given ID
[**get_update_request**](VersionsApi.md#get_update_request) | **GET** /versions/update-requests/{id} | Returns the Update Request with the given ID
[**get_version_information**](VersionsApi.md#get_version_information) | **GET** /versions/process-groups/{id} | Gets the Version Control information for a process group
[**initiate_rebase**](VersionsApi.md#initiate_rebase) | **POST** /versions/rebase-requests/process-groups/{id} | Initiate a Rebase Request for a Process Group with the given ID
[**initiate_revert_flow_version**](VersionsApi.md#initiate_revert_flow_version) | **POST** /versions/revert-requests/process-groups/{id} | Initiate the Revert Request of a Process Group with the given ID
[**initiate_version_control_update**](VersionsApi.md#initiate_version_control_update) | **POST** /versions/update-requests/process-groups/{id} | Initiate the Update Request of a Process Group with the given ID
[**save_to_flow_registry**](VersionsApi.md#save_to_flow_registry) | **POST** /versions/process-groups/{id} | Save the Process Group with the given ID
[**stop_version_control**](VersionsApi.md#stop_version_control) | **DELETE** /versions/process-groups/{id} | Stops version controlling the Process Group with the given ID
[**update_flow_version**](VersionsApi.md#update_flow_version) | **PUT** /versions/process-groups/{id} | Update the version of a Process Group with the given ID
[**update_version_control_request**](VersionsApi.md#update_version_control_request) | **PUT** /versions/active-requests/{id} | Updates the request with the given ID

# **apply_rebased_flow_version**
> VersionControlInformationEntity apply_rebased_flow_version(body, id)

Applies a rebased flow to a Process Group with the given ID on this node

This endpoint is used internally to apply a rebase to a Process Group on each node of a cluster. It synchronizes the flow to the supplied merged snapshot and then resets the Version Control Information to the clean target version so that the preserved local changes are detected as local modifications. Note: This endpoint is subject to change as NiFi and it's REST API evolve.

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
api_instance = swagger_client.VersionsApi(swagger_client.ApiClient(configuration))
body = swagger_client.VersionedFlowSnapshotEntity() # VersionedFlowSnapshotEntity | The rebased versioned flow snapshot.
id = 'id_example' # str | The process group id.

try:
    # Applies a rebased flow to a Process Group with the given ID on this node
    api_response = api_instance.apply_rebased_flow_version(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling VersionsApi->apply_rebased_flow_version: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VersionedFlowSnapshotEntity**](VersionedFlowSnapshotEntity.md)| The rebased versioned flow snapshot. | 
 **id** | **str**| The process group id. | 

### Return type

[**VersionControlInformationEntity**](VersionControlInformationEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_flow_branch**
> VersionControlInformationEntity create_flow_branch(body, id)

Creates a new branch for a version controlled Process Group

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
api_instance = swagger_client.VersionsApi(swagger_client.ApiClient(configuration))
body = swagger_client.CreateFlowBranchRequestEntity() # CreateFlowBranchRequestEntity | The branch creation request.
id = 'id_example' # str | The process group id.

try:
    # Creates a new branch for a version controlled Process Group
    api_response = api_instance.create_flow_branch(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling VersionsApi->create_flow_branch: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateFlowBranchRequestEntity**](CreateFlowBranchRequestEntity.md)| The branch creation request. | 
 **id** | **str**| The process group id. | 

### Return type

[**VersionControlInformationEntity**](VersionControlInformationEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_version_control_request**
> str create_version_control_request(body)

Create a version control request

Creates a request so that a Process Group can be placed under Version Control or have its Version Control configuration changed. Creating this request will prevent any other threads from simultaneously saving local changes to Version Control. It will not, however, actually save the local flow to the Flow Registry. A POST to /versions/process-groups/{id} should be used to initiate saving of the local flow to the Flow Registry. Note: This endpoint is subject to change as NiFi and it's REST API evolve.

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
api_instance = swagger_client.VersionsApi(swagger_client.ApiClient(configuration))
body = swagger_client.CreateActiveRequestEntity() # CreateActiveRequestEntity | The versioned flow details.

try:
    # Create a version control request
    api_response = api_instance.create_version_control_request(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling VersionsApi->create_version_control_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateActiveRequestEntity**](CreateActiveRequestEntity.md)| The versioned flow details. | 

### Return type

**str**

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_rebase_request**
> VersionedFlowUpdateRequestEntity delete_rebase_request(id, disconnected_node_acknowledged=disconnected_node_acknowledged)

Deletes the Rebase Request with the given ID

Deletes the Rebase Request with the given ID. After a request is created via a POST to /versions/rebase-requests/process-groups/{id}, it is expected that the client will properly clean up the request by DELETE'ing it, once the Rebase process has completed. If the request is deleted before the request completes, then the Rebase request will finish the step that it is currently performing and then will cancel any subsequent steps. Note: This endpoint is subject to change as NiFi and it's REST API evolve.

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
api_instance = swagger_client.VersionsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The ID of the Rebase Request
disconnected_node_acknowledged = false # bool | Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional) (default to false)

try:
    # Deletes the Rebase Request with the given ID
    api_response = api_instance.delete_rebase_request(id, disconnected_node_acknowledged=disconnected_node_acknowledged)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling VersionsApi->delete_rebase_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the Rebase Request | 
 **disconnected_node_acknowledged** | **bool**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**VersionedFlowUpdateRequestEntity**](VersionedFlowUpdateRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_revert_request**
> VersionedFlowUpdateRequestEntity delete_revert_request(id, disconnected_node_acknowledged=disconnected_node_acknowledged)

Deletes the Revert Request with the given ID

Deletes the Revert Request with the given ID. After a request is created via a POST to /versions/revert-requests/process-groups/{id}, it is expected that the client will properly clean up the request by DELETE'ing it, once the Revert process has completed. If the request is deleted before the request completes, then the Revert request will finish the step that it is currently performing and then will cancel any subsequent steps. Note: This endpoint is subject to change as NiFi and it's REST API evolve.

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
api_instance = swagger_client.VersionsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The ID of the Revert Request
disconnected_node_acknowledged = false # bool | Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional) (default to false)

try:
    # Deletes the Revert Request with the given ID
    api_response = api_instance.delete_revert_request(id, disconnected_node_acknowledged=disconnected_node_acknowledged)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling VersionsApi->delete_revert_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the Revert Request | 
 **disconnected_node_acknowledged** | **bool**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**VersionedFlowUpdateRequestEntity**](VersionedFlowUpdateRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_update_request**
> VersionedFlowUpdateRequestEntity delete_update_request(id, disconnected_node_acknowledged=disconnected_node_acknowledged)

Deletes the Update Request with the given ID

Deletes the Update Request with the given ID. After a request is created via a POST to /versions/update-requests/process-groups/{id}, it is expected that the client will properly clean up the request by DELETE'ing it, once the Update process has completed. If the request is deleted before the request completes, then the Update request will finish the step that it is currently performing and then will cancel any subsequent steps. Note: This endpoint is subject to change as NiFi and it's REST API evolve.

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
api_instance = swagger_client.VersionsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The ID of the Update Request
disconnected_node_acknowledged = false # bool | Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional) (default to false)

try:
    # Deletes the Update Request with the given ID
    api_response = api_instance.delete_update_request(id, disconnected_node_acknowledged=disconnected_node_acknowledged)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling VersionsApi->delete_update_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the Update Request | 
 **disconnected_node_acknowledged** | **bool**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**VersionedFlowUpdateRequestEntity**](VersionedFlowUpdateRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_version_control_request**
> delete_version_control_request(id, disconnected_node_acknowledged=disconnected_node_acknowledged)

Deletes the version control request with the given ID

Deletes the Version Control Request with the given ID. This will allow other threads to save flows to the Flow Registry. See also the documentation for POSTing to /versions/active-requests for information regarding why this is done. Note: This endpoint is subject to change as NiFi and it's REST API evolve.

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
api_instance = swagger_client.VersionsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The request ID.
disconnected_node_acknowledged = false # bool | Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional) (default to false)

try:
    # Deletes the version control request with the given ID
    api_instance.delete_version_control_request(id, disconnected_node_acknowledged=disconnected_node_acknowledged)
except ApiException as e:
    print("Exception when calling VersionsApi->delete_version_control_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The request ID. | 
 **disconnected_node_acknowledged** | **bool**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

void (empty response body)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **export_flow_version**
> str export_flow_version(id)

Gets the latest version of a Process Group for download

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
api_instance = swagger_client.VersionsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The process group id.

try:
    # Gets the latest version of a Process Group for download
    api_response = api_instance.export_flow_version(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling VersionsApi->export_flow_version: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 

### Return type

**str**

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_rebase_analysis**
> RebaseAnalysisEntity get_rebase_analysis(id, target_version)

Gets a Rebase Analysis for a Process Group

For a Process Group that is under Version Control, this will perform a rebase analysis by comparing local modifications against upstream changes between the current version and the specified target version. The analysis determines whether a rebase is allowed or if there are conflicts.

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
api_instance = swagger_client.VersionsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The process group id.
target_version = 'target_version_example' # str | The target version to rebase to.

try:
    # Gets a Rebase Analysis for a Process Group
    api_response = api_instance.get_rebase_analysis(id, target_version)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling VersionsApi->get_rebase_analysis: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 
 **target_version** | **str**| The target version to rebase to. | 

### Return type

[**RebaseAnalysisEntity**](RebaseAnalysisEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_rebase_request**
> VersionedFlowUpdateRequestEntity get_rebase_request(id)

Returns the Rebase Request with the given ID

Returns the Rebase Request with the given ID. Once a Rebase Request has been created by performing a POST to /versions/rebase-requests/process-groups/{id}, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and any failures. Note: This endpoint is subject to change as NiFi and it's REST API evolve.

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
api_instance = swagger_client.VersionsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The ID of the Rebase Request

try:
    # Returns the Rebase Request with the given ID
    api_response = api_instance.get_rebase_request(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling VersionsApi->get_rebase_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the Rebase Request | 

### Return type

[**VersionedFlowUpdateRequestEntity**](VersionedFlowUpdateRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_revert_request**
> VersionedFlowUpdateRequestEntity get_revert_request(id)

Returns the Revert Request with the given ID

Returns the Revert Request with the given ID. Once a Revert Request has been created by performing a POST to /versions/revert-requests/process-groups/{id}, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and any failures. Note: This endpoint is subject to change as NiFi and it's REST API evolve.

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
api_instance = swagger_client.VersionsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The ID of the Revert Request

try:
    # Returns the Revert Request with the given ID
    api_response = api_instance.get_revert_request(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling VersionsApi->get_revert_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the Revert Request | 

### Return type

[**VersionedFlowUpdateRequestEntity**](VersionedFlowUpdateRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_update_request**
> VersionedFlowUpdateRequestEntity get_update_request(id)

Returns the Update Request with the given ID

Returns the Update Request with the given ID. Once an Update Request has been created by performing a POST to /versions/update-requests/process-groups/{id}, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and any failures. Note: This endpoint is subject to change as NiFi and it's REST API evolve.

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
api_instance = swagger_client.VersionsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The ID of the Update Request

try:
    # Returns the Update Request with the given ID
    api_response = api_instance.get_update_request(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling VersionsApi->get_update_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the Update Request | 

### Return type

[**VersionedFlowUpdateRequestEntity**](VersionedFlowUpdateRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_version_information**
> VersionControlInformationEntity get_version_information(id)

Gets the Version Control information for a process group

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
api_instance = swagger_client.VersionsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The process group id.

try:
    # Gets the Version Control information for a process group
    api_response = api_instance.get_version_information(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling VersionsApi->get_version_information: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 

### Return type

[**VersionControlInformationEntity**](VersionControlInformationEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **initiate_rebase**
> VersionedFlowUpdateRequestEntity initiate_rebase(body, id)

Initiate a Rebase Request for a Process Group with the given ID

For a Process Group that is already under Version Control, this will initiate the action of rebasing the flow to a different version while preserving compatible local changes. This can be a lengthy process, as it will stop any Processors and disable any Controller Services necessary to perform the action and then restart them. As a result, the endpoint will immediately return a VersionedFlowUpdateRequestEntity, and the process of rebasing the flow will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /versions/rebase-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /versions/rebase-requests/{requestId}. Note: This endpoint is subject to change as NiFi and it's REST API evolve.

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
api_instance = swagger_client.VersionsApi(swagger_client.ApiClient(configuration))
body = swagger_client.RebaseRequestEntity() # RebaseRequestEntity | The rebase request details.
id = 'id_example' # str | The process group id.

try:
    # Initiate a Rebase Request for a Process Group with the given ID
    api_response = api_instance.initiate_rebase(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling VersionsApi->initiate_rebase: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RebaseRequestEntity**](RebaseRequestEntity.md)| The rebase request details. | 
 **id** | **str**| The process group id. | 

### Return type

[**VersionedFlowUpdateRequestEntity**](VersionedFlowUpdateRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **initiate_revert_flow_version**
> VersionedFlowUpdateRequestEntity initiate_revert_flow_version(body, id)

Initiate the Revert Request of a Process Group with the given ID

For a Process Group that is already under Version Control, this will initiate the action of reverting any local changes that have been made to the Process Group since it was last synchronized with the Flow Registry. This will result in the flow matching the Versioned Flow that exists in the Flow Registry. This can be a lengthy process, as it will stop any Processors and disable any Controller Services necessary to perform the action and then restart them. As a result, the endpoint will immediately return a VersionedFlowUpdateRequestEntity, and the process of updating the flow will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /versions/revert-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /versions/revert-requests/{requestId}. Note: This endpoint is subject to change as NiFi and it's REST API evolve.

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
api_instance = swagger_client.VersionsApi(swagger_client.ApiClient(configuration))
body = swagger_client.VersionControlInformationEntity() # VersionControlInformationEntity | The Version Control Information to revert to.
id = 'id_example' # str | The process group id.

try:
    # Initiate the Revert Request of a Process Group with the given ID
    api_response = api_instance.initiate_revert_flow_version(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling VersionsApi->initiate_revert_flow_version: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VersionControlInformationEntity**](VersionControlInformationEntity.md)| The Version Control Information to revert to. | 
 **id** | **str**| The process group id. | 

### Return type

[**VersionedFlowUpdateRequestEntity**](VersionedFlowUpdateRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **initiate_version_control_update**
> VersionedFlowUpdateRequestEntity initiate_version_control_update(body, id)

Initiate the Update Request of a Process Group with the given ID

For a Process Group that is already under Version Control, this will initiate the action of changing from a specific version of the flow in the Flow Registry to a different version of the flow. This can be a lengthy process, as it will stop any Processors and disable any Controller Services necessary to perform the action and then restart them. As a result, the endpoint will immediately return a VersionedFlowUpdateRequestEntity, and the process of updating the flow will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /versions/update-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /versions/update-requests/{requestId}. Note: This endpoint is subject to change as NiFi and it's REST API evolve.

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
api_instance = swagger_client.VersionsApi(swagger_client.ApiClient(configuration))
body = swagger_client.VersionControlInformationEntity() # VersionControlInformationEntity | The controller service configuration details.
id = 'id_example' # str | The process group id.

try:
    # Initiate the Update Request of a Process Group with the given ID
    api_response = api_instance.initiate_version_control_update(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling VersionsApi->initiate_version_control_update: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VersionControlInformationEntity**](VersionControlInformationEntity.md)| The controller service configuration details. | 
 **id** | **str**| The process group id. | 

### Return type

[**VersionedFlowUpdateRequestEntity**](VersionedFlowUpdateRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **save_to_flow_registry**
> VersionControlInformationEntity save_to_flow_registry(body, id)

Save the Process Group with the given ID

Begins version controlling the Process Group with the given ID or commits changes to the Versioned Flow, depending on if the provided VersionControlInformation includes a flowId. Note: This endpoint is subject to change as NiFi and it's REST API evolve.

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
api_instance = swagger_client.VersionsApi(swagger_client.ApiClient(configuration))
body = swagger_client.StartVersionControlRequestEntity() # StartVersionControlRequestEntity | The versioned flow details.
id = 'id_example' # str | The process group id.

try:
    # Save the Process Group with the given ID
    api_response = api_instance.save_to_flow_registry(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling VersionsApi->save_to_flow_registry: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**StartVersionControlRequestEntity**](StartVersionControlRequestEntity.md)| The versioned flow details. | 
 **id** | **str**| The process group id. | 

### Return type

[**VersionControlInformationEntity**](VersionControlInformationEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **stop_version_control**
> VersionControlInformationEntity stop_version_control(id, version=version, client_id=client_id, disconnected_node_acknowledged=disconnected_node_acknowledged)

Stops version controlling the Process Group with the given ID

Stops version controlling the Process Group with the given ID. The Process Group will no longer track to any Versioned Flow. Note: This endpoint is subject to change as NiFi and it's REST API evolve.

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
api_instance = swagger_client.VersionsApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The process group id.
version = 789 # int | The version is used to verify the client is working with the latest version of the flow. (optional)
client_id = 'client_id_example' # str | If the client id is not specified, a new one will be generated. This value (whether specified or generated) is included in the response. (optional)
disconnected_node_acknowledged = false # bool | Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional) (default to false)

try:
    # Stops version controlling the Process Group with the given ID
    api_response = api_instance.stop_version_control(id, version=version, client_id=client_id, disconnected_node_acknowledged=disconnected_node_acknowledged)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling VersionsApi->stop_version_control: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The process group id. | 
 **version** | **int**| The version is used to verify the client is working with the latest version of the flow. | [optional] 
 **client_id** | **str**| If the client id is not specified, a new one will be generated. This value (whether specified or generated) is included in the response. | [optional] 
 **disconnected_node_acknowledged** | **bool**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**VersionControlInformationEntity**](VersionControlInformationEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_flow_version**
> VersionControlInformationEntity update_flow_version(body, id)

Update the version of a Process Group with the given ID

For a Process Group that is already under Version Control, this will update the version of the flow to a different version. This endpoint expects that the given snapshot will not modify any Processor that is currently running or any Controller Service that is enabled. Note: This endpoint is subject to change as NiFi and it's REST API evolve.

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
api_instance = swagger_client.VersionsApi(swagger_client.ApiClient(configuration))
body = swagger_client.VersionedFlowSnapshotEntity() # VersionedFlowSnapshotEntity | The controller service configuration details.
id = 'id_example' # str | The process group id.

try:
    # Update the version of a Process Group with the given ID
    api_response = api_instance.update_flow_version(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling VersionsApi->update_flow_version: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VersionedFlowSnapshotEntity**](VersionedFlowSnapshotEntity.md)| The controller service configuration details. | 
 **id** | **str**| The process group id. | 

### Return type

[**VersionControlInformationEntity**](VersionControlInformationEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_version_control_request**
> VersionControlInformationEntity update_version_control_request(body, id)

Updates the request with the given ID

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
api_instance = swagger_client.VersionsApi(swagger_client.ApiClient(configuration))
body = swagger_client.VersionControlComponentMappingEntity() # VersionControlComponentMappingEntity | The version control component mapping.
id = 'id_example' # str | The request ID.

try:
    # Updates the request with the given ID
    api_response = api_instance.update_version_control_request(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling VersionsApi->update_version_control_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VersionControlComponentMappingEntity**](VersionControlComponentMappingEntity.md)| The version control component mapping. | 
 **id** | **str**| The request ID. | 

### Return type

[**VersionControlInformationEntity**](VersionControlInformationEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

