# nifi_client_v1.SystemDiagnosticsApi

All URIs are relative to *http://localhost/nifi-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_jmx_metrics**](SystemDiagnosticsApi.md#get_jmx_metrics) | **GET** /system-diagnostics/jmx-metrics | Retrieve available JMX metrics
[**get_system_diagnostics**](SystemDiagnosticsApi.md#get_system_diagnostics) | **GET** /system-diagnostics | Gets the diagnostics for the system NiFi is running on


# **get_jmx_metrics**
> JmxMetricsResultsEntity get_jmx_metrics(bean_name_filter=bean_name_filter)

Retrieve available JMX metrics

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.SystemDiagnosticsApi()
bean_name_filter = 'bean_name_filter_example' # str | Regular Expression Pattern to be applied against the ObjectName (optional)

try:
    # Retrieve available JMX metrics
    api_response = api_instance.get_jmx_metrics(bean_name_filter=bean_name_filter)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SystemDiagnosticsApi->get_jmx_metrics: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bean_name_filter** | **str**| Regular Expression Pattern to be applied against the ObjectName | [optional] 

### Return type

[**JmxMetricsResultsEntity**](JmxMetricsResultsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_system_diagnostics**
> SystemDiagnosticsEntity get_system_diagnostics(nodewise=nodewise, cluster_node_id=cluster_node_id)

Gets the diagnostics for the system NiFi is running on



### Example
```python
from __future__ import print_function
import time
import nifi_client_v1
from nifi_client_v1.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = nifi_client_v1.SystemDiagnosticsApi()
nodewise = false # bool | Whether or not to include the breakdown per node. Optional, defaults to false (optional) (default to false)
cluster_node_id = 'cluster_node_id_example' # str | The id of the node where to get the status. (optional)

try:
    # Gets the diagnostics for the system NiFi is running on
    api_response = api_instance.get_system_diagnostics(nodewise=nodewise, cluster_node_id=cluster_node_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SystemDiagnosticsApi->get_system_diagnostics: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodewise** | **bool**| Whether or not to include the breakdown per node. Optional, defaults to false | [optional] [default to false]
 **cluster_node_id** | **str**| The id of the node where to get the status. | [optional] 

### Return type

[**SystemDiagnosticsEntity**](SystemDiagnosticsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

