# DropRequestDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**current** | **str** | The count and size of FlowFiles currently queued. | [optional] 
**current_count** | **int** | The number of FlowFiles currently queued. | [optional] 
**current_size** | **int** | The size of FlowFiles currently queued in bytes. | [optional] 
**dropped** | **str** | The count and size of FlowFiles that have been dropped thus far. | [optional] 
**dropped_count** | **int** | The number of FlowFiles that have been dropped thus far. | [optional] 
**dropped_size** | **int** | The size of FlowFiles that have been dropped thus far in bytes. | [optional] 
**failure_reason** | **str** | The reason, if any, that this drop request failed. | [optional] 
**finished** | **bool** | Whether the query has finished. | [optional] 
**id** | **str** | The id for this drop request. | [optional] 
**last_updated** | **str** | The last time this drop request was updated. | [optional] 
**original** | **str** | The count and size of FlowFiles to be dropped as a result of this request. | [optional] 
**original_count** | **int** | The number of FlowFiles to be dropped as a result of this request. | [optional] 
**original_size** | **int** | The size of FlowFiles to be dropped as a result of this request in bytes. | [optional] 
**percent_completed** | **int** | The current percent complete. | [optional] 
**state** | **str** | The current state of the drop request. | [optional] 
**submission_time** | **str** | The timestamp when the query was submitted. | [optional] 
**uri** | **str** | The URI for future requests to this drop request. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

