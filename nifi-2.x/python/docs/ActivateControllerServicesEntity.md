# ActivateControllerServicesEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**components** | [**dict(str, RevisionDTO)**](RevisionDTO.md) | Optional services to schedule. If not specified, all authorized descendant controller services will be used. | [optional] 
**disconnected_node_acknowledged** | **bool** | Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] 
**id** | **str** | The id of the ProcessGroup | [optional] 
**state** | **str** | The desired state of the descendant components | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

