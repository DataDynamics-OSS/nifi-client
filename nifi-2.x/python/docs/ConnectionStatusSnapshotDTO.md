# ConnectionStatusSnapshotDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bytes_in** | **int** | The size of the FlowFiles that have come into the connection in the last 5 minutes. | [optional] 
**bytes_out** | **int** | The number of bytes that have left the connection in the last 5 minutes. | [optional] 
**bytes_queued** | **int** | The size of the FlowFiles that are currently queued in the connection. | [optional] 
**destination_id** | **str** | The id of the destination of the connection. | [optional] 
**destination_name** | **str** | The name of the destination of the connection. | [optional] 
**flow_file_availability** | **str** | The availability of FlowFiles in this connection | [optional] 
**flow_files_in** | **int** | The number of FlowFiles that have come into the connection in the last 5 minutes. | [optional] 
**flow_files_out** | **int** | The number of FlowFiles that have left the connection in the last 5 minutes. | [optional] 
**flow_files_queued** | **int** | The number of FlowFiles that are currently queued in the connection. | [optional] 
**group_id** | **str** | The id of the process group the connection belongs to. | [optional] 
**id** | **str** | The id of the connection. | [optional] 
**input** | **str** | The input count/size for the connection in the last 5 minutes, pretty printed. | [optional] 
**load_balance_status** | **str** | The load balance status of the connection | [optional] 
**name** | **str** | The name of the connection. | [optional] 
**output** | **str** | The output count/size for the connection in the last 5 minutes, pretty printed. | [optional] 
**percent_use_bytes** | **int** | Connection percent use regarding queued FlowFiles size and backpressure threshold if configured. | [optional] 
**percent_use_count** | **int** | Connection percent use regarding queued FlowFiles count and backpressure threshold if configured. | [optional] 
**predictions** | [**ConnectionStatusPredictionsSnapshotDTO**](ConnectionStatusPredictionsSnapshotDTO.md) |  | [optional] 
**queued** | **str** | The total count and size of queued FlowFiles formatted. | [optional] 
**queued_count** | **str** | The number of FlowFiles that are queued, pretty printed. | [optional] 
**queued_size** | **str** | The total size of FlowFiles that are queued formatted. | [optional] 
**source_id** | **str** | The id of the source of the connection. | [optional] 
**source_name** | **str** | The name of the source of the connection. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

