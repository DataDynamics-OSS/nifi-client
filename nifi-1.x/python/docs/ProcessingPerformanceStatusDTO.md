# ProcessingPerformanceStatusDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | **str** | The unique ID of the process group that the Processor belongs to | [optional] 
**cpu_duration** | **int** | The number of nanoseconds has spent on CPU usage in the last 5 minutes. | [optional] 
**content_read_duration** | **int** | The number of nanoseconds has spent to read content in the last 5 minutes. | [optional] 
**content_write_duration** | **int** | The number of nanoseconds has spent to write content in the last 5 minutes. | [optional] 
**session_commit_duration** | **int** | The number of nanoseconds has spent running to commit sessions the last 5 minutes. | [optional] 
**garbage_collection_duration** | **int** | The number of nanoseconds has spent running garbage collection in the last 5 minutes. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


