# ReportingTaskEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bulletins** | [**list[BulletinEntity]**](BulletinEntity.md) | The bulletins for this component. | [optional] 
**component** | [**ReportingTaskDTO**](ReportingTaskDTO.md) |  | [optional] 
**disconnected_node_acknowledged** | **bool** | Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] 
**id** | **str** | The id of the component. | [optional] 
**operate_permissions** | [**PermissionsDTO**](PermissionsDTO.md) |  | [optional] 
**permissions** | [**PermissionsDTO**](PermissionsDTO.md) |  | [optional] 
**position** | [**PositionDTO**](PositionDTO.md) |  | [optional] 
**revision** | [**RevisionDTO**](RevisionDTO.md) |  | [optional] 
**status** | [**ReportingTaskStatusDTO**](ReportingTaskStatusDTO.md) |  | [optional] 
**uri** | **str** | The URI for futures requests to the component. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

