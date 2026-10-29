# ProvenanceNodeDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**child_uuids** | **list[str]** | The uuid of the children FlowFiles of the provenance event. | [optional] 
**cluster_node_identifier** | **str** | The identifier of the node that this event/flowfile originated from. | [optional] 
**component_type** | **str** | If the type is EVENT, this is the type of the component that generated the event. | [optional] 
**event_type** | **str** | If the type is EVENT, this is the type of event. | [optional] 
**flow_file_uuid** | **str** | The uuid of the flowfile associated with the provenance event. | [optional] 
**id** | **str** | The id of the node. | [optional] 
**millis** | **int** | The timestamp of the node in milliseconds. | [optional] 
**parent_uuids** | **list[str]** | The uuid of the parent FlowFiles of the provenance event. | [optional] 
**timestamp** | **str** | The timestamp of the node formatted. | [optional] 
**type** | **str** | The type of the node. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

