# AffectedComponentEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bulletins** | [**List&lt;BulletinEntity&gt;**](BulletinEntity.md) | The bulletins for this component. |  [optional]
**component** | [**AffectedComponentDTO**](AffectedComponentDTO.md) |  |  [optional]
**disconnectedNodeAcknowledged** | **Boolean** | Acknowledges that this node is disconnected to allow for mutable requests to proceed. |  [optional]
**id** | **String** | The id of the component. |  [optional]
**permissions** | [**PermissionsDTO**](PermissionsDTO.md) |  |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) |  |  [optional]
**processGroup** | [**ProcessGroupNameDTO**](ProcessGroupNameDTO.md) |  |  [optional]
**referenceType** | [**ReferenceTypeEnum**](#ReferenceTypeEnum) | The type of component referenced |  [optional]
**revision** | [**RevisionDTO**](RevisionDTO.md) |  |  [optional]
**uri** | **String** | The URI for futures requests to the component. |  [optional]

<a name="ReferenceTypeEnum"></a>
## Enum: ReferenceTypeEnum
Name | Value
---- | -----
PROCESSOR | &quot;PROCESSOR&quot;
CONTROLLER_SERVICE | &quot;CONTROLLER_SERVICE&quot;
INPUT_PORT | &quot;INPUT_PORT&quot;
OUTPUT_PORT | &quot;OUTPUT_PORT&quot;
REMOTE_INPUT_PORT | &quot;REMOTE_INPUT_PORT&quot;
REMOTE_OUTPUT_PORT | &quot;REMOTE_OUTPUT_PORT&quot;
