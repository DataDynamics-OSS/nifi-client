# FlowFileSummaryDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cluster_node_address** | **str** | The label for the node where this FlowFile resides. | [optional] 
**cluster_node_id** | **str** | The id of the node where this FlowFile resides. | [optional] 
**filename** | **str** | The FlowFile filename. | [optional] 
**lineage_duration** | **int** | Duration since the FlowFile&#x27;s greatest ancestor entered the flow. | [optional] 
**mime_type** | **str** | The FlowFile mime type. | [optional] 
**penalized** | **bool** | If the FlowFile is penalized. | [optional] 
**penalty_expires_in** | **int** | How long in milliseconds until the FlowFile penalty expires. | [optional] 
**position** | **int** | The FlowFile&#x27;s position in the queue. | [optional] 
**queued_duration** | **int** | How long this FlowFile has been enqueued. | [optional] 
**size** | **int** | The FlowFile file size. | [optional] 
**uri** | **str** | The URI that can be used to access this FlowFile. | [optional] 
**uuid** | **str** | The FlowFile UUID. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

