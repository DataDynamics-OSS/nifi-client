# ConnectorStatusSnapshotDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active_thread_count** | **int** | The number of active threads for the connector. | [optional] 
**bytes_queued** | **int** | The number of bytes queued in this connector&#x27;s managed process group. | [optional] 
**bytes_read** | **int** | The number of bytes read by processors in this connector&#x27;s managed process group. | [optional] 
**bytes_received** | **int** | The number of bytes received by this connector&#x27;s managed process group. | [optional] 
**bytes_sent** | **int** | The number of bytes sent by this connector&#x27;s managed process group. | [optional] 
**bytes_written** | **int** | The number of bytes written by processors in this connector&#x27;s managed process group. | [optional] 
**flow_files_queued** | **int** | The number of FlowFiles queued in this connector&#x27;s managed process group. | [optional] 
**flow_files_received** | **int** | The number of FlowFiles received by this connector&#x27;s managed process group. | [optional] 
**flow_files_sent** | **int** | The number of FlowFiles sent by this connector&#x27;s managed process group. | [optional] 
**group_id** | **str** | The id of the parent process group to which the connector belongs. | [optional] 
**id** | **str** | The id of the connector. | [optional] 
**idle** | **bool** | Whether or not the connector is currently idle (no FlowFiles queued and no FlowFiles processed recently). | [optional] 
**idle_duration** | **str** | A human-readable representation of how long the connector has been idle, or null if the connector is not idle. | [optional] 
**idle_duration_millis** | **int** | The number of milliseconds the connector has been idle, or null if the connector is not idle. | [optional] 
**name** | **str** | The name of the connector. | [optional] 
**processing_performance_status** | [**ProcessingPerformanceStatusDTO**](ProcessingPerformanceStatusDTO.md) |  | [optional] 
**queued** | **str** | The count/size of queued data, pretty-printed. | [optional] 
**queued_count** | **str** | The count of queued FlowFiles, pretty-printed. | [optional] 
**queued_size** | **str** | The size of queued data, pretty-printed. | [optional] 
**read** | **str** | The number of bytes read, pretty-printed. | [optional] 
**received** | **str** | The count/size of data that has been received by this connector, pretty-printed. | [optional] 
**run_status** | **str** | The run status of the connector. | [optional] 
**sent** | **str** | The count/size of data that has been sent by this connector, pretty-printed. | [optional] 
**type** | **str** | The type of the connector. | [optional] 
**written** | **str** | The number of bytes written, pretty-printed. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

