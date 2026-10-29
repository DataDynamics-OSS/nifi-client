# PortEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allow_remote_access** | **bool** | Whether this port can be accessed remotely via Site-to-Site protocol. | [optional] 
**bulletins** | [**list[BulletinEntity]**](BulletinEntity.md) | The bulletins for this component. | [optional] 
**component** | [**PortDTO**](PortDTO.md) |  | [optional] 
**disconnected_node_acknowledged** | **bool** | Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] 
**id** | **str** | The id of the component. | [optional] 
**operate_permissions** | [**PermissionsDTO**](PermissionsDTO.md) |  | [optional] 
**permissions** | [**PermissionsDTO**](PermissionsDTO.md) |  | [optional] 
**port_type** | **str** |  | [optional] 
**position** | [**PositionDTO**](PositionDTO.md) |  | [optional] 
**revision** | [**RevisionDTO**](RevisionDTO.md) |  | [optional] 
**status** | [**PortStatusDTO**](PortStatusDTO.md) |  | [optional] 
**uri** | **str** | The URI for futures requests to the component. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

