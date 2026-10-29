# PortEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowRemoteAccess** | **Boolean** | Whether this port can be accessed remotely via Site-to-Site protocol. |  [optional]
**bulletins** | [**List&lt;BulletinEntity&gt;**](BulletinEntity.md) | The bulletins for this component. |  [optional]
**component** | [**PortDTO**](PortDTO.md) |  |  [optional]
**disconnectedNodeAcknowledged** | **Boolean** | Acknowledges that this node is disconnected to allow for mutable requests to proceed. |  [optional]
**id** | **String** | The id of the component. |  [optional]
**operatePermissions** | [**PermissionsDTO**](PermissionsDTO.md) |  |  [optional]
**permissions** | [**PermissionsDTO**](PermissionsDTO.md) |  |  [optional]
**portType** | **String** |  |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) |  |  [optional]
**revision** | [**RevisionDTO**](RevisionDTO.md) |  |  [optional]
**status** | [**PortStatusDTO**](PortStatusDTO.md) |  |  [optional]
**uri** | **String** | The URI for futures requests to the component. |  [optional]
