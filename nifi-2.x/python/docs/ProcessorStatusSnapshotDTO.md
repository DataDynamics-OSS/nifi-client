# ProcessorStatusSnapshotDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active_thread_count** | **int** | The number of threads currently executing in the processor. | [optional] 
**bytes_in** | **int** | The size of the FlowFiles that have been accepted in the last 5 minutes | [optional] 
**bytes_out** | **int** | The size of the FlowFiles transferred to a Connection in the last 5 minutes | [optional] 
**bytes_read** | **int** | The number of bytes read by this Processor in the last 5 minutes | [optional] 
**bytes_written** | **int** | The number of bytes written by this Processor in the last 5 minutes | [optional] 
**execution_node** | **str** | Indicates the node where the process will execute. | [optional] 
**flow_files_in** | **int** | The number of FlowFiles that have been accepted in the last 5 minutes | [optional] 
**flow_files_out** | **int** | The number of FlowFiles transferred to a Connection in the last 5 minutes | [optional] 
**group_id** | **str** | The id of the parent process group to which the processor belongs. | [optional] 
**id** | **str** | The id of the processor. | [optional] 
**input** | **str** | The count/size of FlowFiles that have been accepted in the last 5 minutes. | [optional] 
**name** | **str** | The name of the processor. | [optional] 
**output** | **str** | The count/size of FlowFiles that have been processed in the last 5 minutes. | [optional] 
**processing_performance_status** | [**ProcessingPerformanceStatusDTO**](ProcessingPerformanceStatusDTO.md) |  | [optional] 
**read** | **str** | The number of bytes read in the last 5 minutes. | [optional] 
**run_status** | **str** | The state of the processor. | [optional] 
**task_count** | **int** | The number of times this Processor has run in the last 5 minutes | [optional] 
**tasks** | **str** | The total number of task this connectable has completed over the last 5 minutes. | [optional] 
**tasks_duration** | **str** | The total duration of all tasks for this connectable over the last 5 minutes. | [optional] 
**tasks_duration_nanos** | **int** | The number of nanoseconds that this Processor has spent running in the last 5 minutes | [optional] 
**terminated_thread_count** | **int** | The number of threads currently terminated for the processor. | [optional] 
**type** | **str** | The type of the processor. | [optional] 
**written** | **str** | The number of bytes written in the last 5 minutes. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

