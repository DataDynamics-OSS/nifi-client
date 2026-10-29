# swagger_client.FlowFileQueuesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_drop_request**](FlowFileQueuesApi.md#create_drop_request) | **POST** /flowfile-queues/{id}/drop-requests | Creates a request to drop the contents of the queue in this connection.
[**create_flow_file_listing**](FlowFileQueuesApi.md#create_flow_file_listing) | **POST** /flowfile-queues/{id}/listing-requests | Lists the contents of the queue in this connection.
[**delete_listing_request**](FlowFileQueuesApi.md#delete_listing_request) | **DELETE** /flowfile-queues/{id}/listing-requests/{listing-request-id} | Cancels and/or removes a request to list the contents of this connection.
[**download_flow_file_content**](FlowFileQueuesApi.md#download_flow_file_content) | **GET** /flowfile-queues/{id}/flowfiles/{flowfile-uuid}/content | Gets the content for a FlowFile in a Connection.
[**get_drop_request**](FlowFileQueuesApi.md#get_drop_request) | **GET** /flowfile-queues/{id}/drop-requests/{drop-request-id} | Gets the current status of a drop request for the specified connection.
[**get_flow_file**](FlowFileQueuesApi.md#get_flow_file) | **GET** /flowfile-queues/{id}/flowfiles/{flowfile-uuid} | Gets a FlowFile from a Connection.
[**get_listing_request**](FlowFileQueuesApi.md#get_listing_request) | **GET** /flowfile-queues/{id}/listing-requests/{listing-request-id} | Gets the current status of a listing request for the specified connection.
[**remove_drop_request**](FlowFileQueuesApi.md#remove_drop_request) | **DELETE** /flowfile-queues/{id}/drop-requests/{drop-request-id} | Cancels and/or removes a request to drop the contents of this connection.

# **create_drop_request**
> DropRequestEntity create_drop_request(id)

Creates a request to drop the contents of the queue in this connection.

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
api_instance = swagger_client.FlowFileQueuesApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connection id.

try:
    # Creates a request to drop the contents of the queue in this connection.
    api_response = api_instance.create_drop_request(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowFileQueuesApi->create_drop_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connection id. | 

### Return type

[**DropRequestEntity**](DropRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_flow_file_listing**
> ListingRequestEntity create_flow_file_listing(id)

Lists the contents of the queue in this connection.

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
api_instance = swagger_client.FlowFileQueuesApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connection id.

try:
    # Lists the contents of the queue in this connection.
    api_response = api_instance.create_flow_file_listing(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowFileQueuesApi->create_flow_file_listing: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connection id. | 

### Return type

[**ListingRequestEntity**](ListingRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_listing_request**
> ListingRequestEntity delete_listing_request(id, listing_request_id)

Cancels and/or removes a request to list the contents of this connection.

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
api_instance = swagger_client.FlowFileQueuesApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connection id.
listing_request_id = 'listing_request_id_example' # str | The listing request id.

try:
    # Cancels and/or removes a request to list the contents of this connection.
    api_response = api_instance.delete_listing_request(id, listing_request_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowFileQueuesApi->delete_listing_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connection id. | 
 **listing_request_id** | **str**| The listing request id. | 

### Return type

[**ListingRequestEntity**](ListingRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **download_flow_file_content**
> StreamingOutput download_flow_file_content(id, flowfile_uuid, range=range, client_id=client_id, cluster_node_id=cluster_node_id)

Gets the content for a FlowFile in a Connection.

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
api_instance = swagger_client.FlowFileQueuesApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connection id.
flowfile_uuid = 'flowfile_uuid_example' # str | The FlowFile uuid.
range = 'range_example' # str | Range of bytes requested (optional)
client_id = 'client_id_example' # str | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. (optional)
cluster_node_id = 'cluster_node_id_example' # str | The id of the node where the content exists if clustered. (optional)

try:
    # Gets the content for a FlowFile in a Connection.
    api_response = api_instance.download_flow_file_content(id, flowfile_uuid, range=range, client_id=client_id, cluster_node_id=cluster_node_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowFileQueuesApi->download_flow_file_content: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connection id. | 
 **flowfile_uuid** | **str**| The FlowFile uuid. | 
 **range** | **str**| Range of bytes requested | [optional] 
 **client_id** | **str**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional] 
 **cluster_node_id** | **str**| The id of the node where the content exists if clustered. | [optional] 

### Return type

[**StreamingOutput**](StreamingOutput.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_drop_request**
> DropRequestEntity get_drop_request(id, drop_request_id)

Gets the current status of a drop request for the specified connection.

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
api_instance = swagger_client.FlowFileQueuesApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connection id.
drop_request_id = 'drop_request_id_example' # str | The drop request id.

try:
    # Gets the current status of a drop request for the specified connection.
    api_response = api_instance.get_drop_request(id, drop_request_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowFileQueuesApi->get_drop_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connection id. | 
 **drop_request_id** | **str**| The drop request id. | 

### Return type

[**DropRequestEntity**](DropRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_flow_file**
> FlowFileEntity get_flow_file(id, flowfile_uuid, cluster_node_id=cluster_node_id)

Gets a FlowFile from a Connection.

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
api_instance = swagger_client.FlowFileQueuesApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connection id.
flowfile_uuid = 'flowfile_uuid_example' # str | The FlowFile uuid.
cluster_node_id = 'cluster_node_id_example' # str | The id of the node where the content exists if clustered. (optional)

try:
    # Gets a FlowFile from a Connection.
    api_response = api_instance.get_flow_file(id, flowfile_uuid, cluster_node_id=cluster_node_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowFileQueuesApi->get_flow_file: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connection id. | 
 **flowfile_uuid** | **str**| The FlowFile uuid. | 
 **cluster_node_id** | **str**| The id of the node where the content exists if clustered. | [optional] 

### Return type

[**FlowFileEntity**](FlowFileEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_listing_request**
> ListingRequestEntity get_listing_request(id, listing_request_id)

Gets the current status of a listing request for the specified connection.

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
api_instance = swagger_client.FlowFileQueuesApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connection id.
listing_request_id = 'listing_request_id_example' # str | The listing request id.

try:
    # Gets the current status of a listing request for the specified connection.
    api_response = api_instance.get_listing_request(id, listing_request_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowFileQueuesApi->get_listing_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connection id. | 
 **listing_request_id** | **str**| The listing request id. | 

### Return type

[**ListingRequestEntity**](ListingRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_drop_request**
> DropRequestEntity remove_drop_request(id, drop_request_id)

Cancels and/or removes a request to drop the contents of this connection.

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
api_instance = swagger_client.FlowFileQueuesApi(swagger_client.ApiClient(configuration))
id = 'id_example' # str | The connection id.
drop_request_id = 'drop_request_id_example' # str | The drop request id.

try:
    # Cancels and/or removes a request to drop the contents of this connection.
    api_response = api_instance.remove_drop_request(id, drop_request_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling FlowFileQueuesApi->remove_drop_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The connection id. | 
 **drop_request_id** | **str**| The drop request id. | 

### Return type

[**DropRequestEntity**](DropRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

