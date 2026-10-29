# ProcessorEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bulletins** | [**List&lt;BulletinEntity&gt;**](BulletinEntity.md) | The bulletins for this component. |  [optional]
**component** | [**ProcessorDTO**](ProcessorDTO.md) |  |  [optional]
**disconnectedNodeAcknowledged** | **Boolean** | Acknowledges that this node is disconnected to allow for mutable requests to proceed. |  [optional]
**id** | **String** | The id of the component. |  [optional]
**inputRequirement** | **String** | The input requirement for this processor. |  [optional]
**operatePermissions** | [**PermissionsDTO**](PermissionsDTO.md) |  |  [optional]
**permissions** | [**PermissionsDTO**](PermissionsDTO.md) |  |  [optional]
**physicalState** | [**PhysicalStateEnum**](#PhysicalStateEnum) | The physical state of the processor, including transition states |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) |  |  [optional]
**revision** | [**RevisionDTO**](RevisionDTO.md) |  |  [optional]
**status** | [**ProcessorStatusDTO**](ProcessorStatusDTO.md) |  |  [optional]
**uri** | **String** | The URI for futures requests to the component. |  [optional]

<a name="PhysicalStateEnum"></a>
## Enum: PhysicalStateEnum
Name | Value
---- | -----
RUNNING | &quot;RUNNING&quot;
STOPPED | &quot;STOPPED&quot;
DISABLED | &quot;DISABLED&quot;
STARTING | &quot;STARTING&quot;
STOPPING | &quot;STOPPING&quot;
RUN_ONCE | &quot;RUN_ONCE&quot;
