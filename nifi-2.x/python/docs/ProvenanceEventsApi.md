# swagger_client.ProvenanceEventsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_input_content**](ProvenanceEventsApi.md#get_input_content) | **GET** /provenance-events/{id}/content/input | Gets the input content for a provenance event
[**get_latest_provenance_events**](ProvenanceEventsApi.md#get_latest_provenance_events) | **GET** /provenance-events/latest/{componentId} | Retrieves the latest cached Provenance Events for the specified component
[**get_output_content**](ProvenanceEventsApi.md#get_output_content) | **GET** /provenance-events/{id}/content/output | Gets the output content for a provenance event
[**get_provenance_event**](ProvenanceEventsApi.md#get_provenance_event) | **GET** /provenance-events/{id} | Gets a provenance event
[**submit_replay**](ProvenanceEventsApi.md#submit_replay) | **POST** /provenance-events/replays | Replays content from a provenance event
[**submit_replay_latest_event**](ProvenanceEventsApi.md#submit_replay_latest_event) | **POST** /provenance-events/latest/replays | Replays content from a provenance event

# **get_input_content**
> StreamingOutput get_input_content(id, range=range, cluster_node_id=cluster_node_id)

Gets the input content for a provenance event

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
api_instance = swagger_client.ProvenanceEventsApi(swagger_client.ApiClient(configuration))
id = 789 # int | The provenance event id.
range = 'range_example' # str | Range of bytes requested (optional)
cluster_node_id = 'cluster_node_id_example' # str | The id of the node where the content exists if clustered. (optional)

try:
    # Gets the input content for a provenance event
    api_response = api_instance.get_input_content(id, range=range, cluster_node_id=cluster_node_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProvenanceEventsApi->get_input_content: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The provenance event id. | 
 **range** | **str**| Range of bytes requested | [optional] 
 **cluster_node_id** | **str**| The id of the node where the content exists if clustered. | [optional] 

### Return type

[**StreamingOutput**](StreamingOutput.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_latest_provenance_events**
> LatestProvenanceEventsEntity get_latest_provenance_events(component_id, limit=limit)

Retrieves the latest cached Provenance Events for the specified component

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
api_instance = swagger_client.ProvenanceEventsApi(swagger_client.ApiClient(configuration))
component_id = 'component_id_example' # str | The ID of the component to retrieve the latest Provenance Events for.
limit = 10 # int | The number of events to limit the response to. Defaults to 10. (optional) (default to 10)

try:
    # Retrieves the latest cached Provenance Events for the specified component
    api_response = api_instance.get_latest_provenance_events(component_id, limit=limit)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProvenanceEventsApi->get_latest_provenance_events: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **component_id** | **str**| The ID of the component to retrieve the latest Provenance Events for. | 
 **limit** | **int**| The number of events to limit the response to. Defaults to 10. | [optional] [default to 10]

### Return type

[**LatestProvenanceEventsEntity**](LatestProvenanceEventsEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_output_content**
> StreamingOutput get_output_content(id, range=range, cluster_node_id=cluster_node_id)

Gets the output content for a provenance event

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
api_instance = swagger_client.ProvenanceEventsApi(swagger_client.ApiClient(configuration))
id = 789 # int | The provenance event id.
range = 'range_example' # str | Range of bytes requested (optional)
cluster_node_id = 'cluster_node_id_example' # str | The id of the node where the content exists if clustered. (optional)

try:
    # Gets the output content for a provenance event
    api_response = api_instance.get_output_content(id, range=range, cluster_node_id=cluster_node_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProvenanceEventsApi->get_output_content: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The provenance event id. | 
 **range** | **str**| Range of bytes requested | [optional] 
 **cluster_node_id** | **str**| The id of the node where the content exists if clustered. | [optional] 

### Return type

[**StreamingOutput**](StreamingOutput.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_provenance_event**
> ProvenanceEventEntity get_provenance_event(id, cluster_node_id=cluster_node_id)

Gets a provenance event

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
api_instance = swagger_client.ProvenanceEventsApi(swagger_client.ApiClient(configuration))
id = 789 # int | The provenance event id.
cluster_node_id = 'cluster_node_id_example' # str | The id of the node where this event exists if clustered. (optional)

try:
    # Gets a provenance event
    api_response = api_instance.get_provenance_event(id, cluster_node_id=cluster_node_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProvenanceEventsApi->get_provenance_event: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**| The provenance event id. | 
 **cluster_node_id** | **str**| The id of the node where this event exists if clustered. | [optional] 

### Return type

[**ProvenanceEventEntity**](ProvenanceEventEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_replay**
> ProvenanceEventEntity submit_replay(body)

Replays content from a provenance event

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
api_instance = swagger_client.ProvenanceEventsApi(swagger_client.ApiClient(configuration))
body = swagger_client.SubmitReplayRequestEntity() # SubmitReplayRequestEntity | The replay request.

try:
    # Replays content from a provenance event
    api_response = api_instance.submit_replay(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProvenanceEventsApi->submit_replay: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubmitReplayRequestEntity**](SubmitReplayRequestEntity.md)| The replay request. | 

### Return type

[**ProvenanceEventEntity**](ProvenanceEventEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_replay_latest_event**
> ReplayLastEventResponseEntity submit_replay_latest_event(body)

Replays content from a provenance event

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
api_instance = swagger_client.ProvenanceEventsApi(swagger_client.ApiClient(configuration))
body = swagger_client.ReplayLastEventRequestEntity() # ReplayLastEventRequestEntity | The replay request.

try:
    # Replays content from a provenance event
    api_response = api_instance.submit_replay_latest_event(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProvenanceEventsApi->submit_replay_latest_event: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReplayLastEventRequestEntity**](ReplayLastEventRequestEntity.md)| The replay request. | 

### Return type

[**ReplayLastEventResponseEntity**](ReplayLastEventResponseEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

