# ConnectionEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bends** | [**list[PositionDTO]**](PositionDTO.md) | The bend points on the connection. | [optional] 
**bulletins** | [**list[BulletinEntity]**](BulletinEntity.md) | The bulletins for this component. | [optional] 
**component** | [**ConnectionDTO**](ConnectionDTO.md) |  | [optional] 
**destination_group_id** | **str** | The identifier of the group of the destination of this connection. | [optional] 
**destination_id** | **str** | The identifier of the destination of this connection. | [optional] 
**destination_type** | **str** | The type of component the destination connectable is. | 
**disconnected_node_acknowledged** | **bool** | Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] 
**getz_index** | **int** | The z index of the connection. | [optional] 
**id** | **str** | The id of the component. | [optional] 
**label_index** | **int** | The index of the bend point where to place the connection label. | [optional] 
**permissions** | [**PermissionsDTO**](PermissionsDTO.md) |  | [optional] 
**position** | [**PositionDTO**](PositionDTO.md) |  | [optional] 
**revision** | [**RevisionDTO**](RevisionDTO.md) |  | [optional] 
**source_group_id** | **str** | The identifier of the group of the source of this connection. | [optional] 
**source_id** | **str** | The identifier of the source of this connection. | [optional] 
**source_type** | **str** | The type of component the source connectable is. | 
**status** | [**ConnectionStatusDTO**](ConnectionStatusDTO.md) |  | [optional] 
**uri** | **str** | The URI for futures requests to the component. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

