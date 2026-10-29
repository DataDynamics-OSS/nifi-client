# VersionedFlowSnapshotEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disconnected_node_acknowledged** | **bool** | Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] 
**process_group_revision** | [**RevisionDTO**](RevisionDTO.md) |  | [optional] 
**registry_id** | **str** | The ID of the Registry that this flow belongs to | [optional] 
**update_descendant_versioned_flows** | **bool** | If the Process Group to be updated has a child or descendant Process Group that is also under Version Control, this specifies whether or not the contents of that child/descendant Process Group should be updated. | [optional] 
**versioned_flow** | [**RegisteredFlowSnapshot**](RegisteredFlowSnapshot.md) |  | [optional] 
**versioned_flow_snapshot** | [**RegisteredFlowSnapshot**](RegisteredFlowSnapshot.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

