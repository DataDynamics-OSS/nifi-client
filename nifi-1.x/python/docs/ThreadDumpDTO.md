# ThreadDumpDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**node_id** | **str** | The ID of the node in the cluster | [optional] 
**node_address** | **str** | The address of the node in the cluster | [optional] 
**api_port** | **int** | The port the node is listening for API requests. | [optional] 
**stack_trace** | **str** | The stack trace for the thread | [optional] 
**thread_name** | **str** | The name of the thread | [optional] 
**thread_active_millis** | **int** | The number of milliseconds that the thread has been executing in the Processor | [optional] 
**task_terminated** | **bool** | Indicates whether or not the user has requested that the task be terminated. If this is true, it may indicate that the thread is in a state where it will continue running indefinitely without returning. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


