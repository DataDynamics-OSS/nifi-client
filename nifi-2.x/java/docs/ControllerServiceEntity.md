# ControllerServiceEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bulletins** | [**List&lt;BulletinEntity&gt;**](BulletinEntity.md) | The bulletins for this component. |  [optional]
**component** | [**ControllerServiceDTO**](ControllerServiceDTO.md) |  |  [optional]
**disconnectedNodeAcknowledged** | **Boolean** | Acknowledges that this node is disconnected to allow for mutable requests to proceed. |  [optional]
**id** | **String** | The id of the component. |  [optional]
**operatePermissions** | [**PermissionsDTO**](PermissionsDTO.md) |  |  [optional]
**parentGroupId** | **String** | The id of parent process group of this ControllerService. |  [optional]
**permissions** | [**PermissionsDTO**](PermissionsDTO.md) |  |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) |  |  [optional]
**revision** | [**RevisionDTO**](RevisionDTO.md) |  |  [optional]
**status** | [**ControllerServiceStatusDTO**](ControllerServiceStatusDTO.md) |  |  [optional]
**uri** | **String** | The URI for futures requests to the component. |  [optional]
