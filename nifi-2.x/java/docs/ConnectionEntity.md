# ConnectionEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bends** | [**List&lt;PositionDTO&gt;**](PositionDTO.md) | The bend points on the connection. |  [optional]
**bulletins** | [**List&lt;BulletinEntity&gt;**](BulletinEntity.md) | The bulletins for this component. |  [optional]
**component** | [**ConnectionDTO**](ConnectionDTO.md) |  |  [optional]
**destinationGroupId** | **String** | The identifier of the group of the destination of this connection. |  [optional]
**destinationId** | **String** | The identifier of the destination of this connection. |  [optional]
**destinationType** | [**DestinationTypeEnum**](#DestinationTypeEnum) | The type of component the destination connectable is. | 
**disconnectedNodeAcknowledged** | **Boolean** | Acknowledges that this node is disconnected to allow for mutable requests to proceed. |  [optional]
**getzIndex** | **Long** | The z index of the connection. |  [optional]
**id** | **String** | The id of the component. |  [optional]
**labelIndex** | **Integer** | The index of the bend point where to place the connection label. |  [optional]
**permissions** | [**PermissionsDTO**](PermissionsDTO.md) |  |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) |  |  [optional]
**revision** | [**RevisionDTO**](RevisionDTO.md) |  |  [optional]
**sourceGroupId** | **String** | The identifier of the group of the source of this connection. |  [optional]
**sourceId** | **String** | The identifier of the source of this connection. |  [optional]
**sourceType** | [**SourceTypeEnum**](#SourceTypeEnum) | The type of component the source connectable is. | 
**status** | [**ConnectionStatusDTO**](ConnectionStatusDTO.md) |  |  [optional]
**uri** | **String** | The URI for futures requests to the component. |  [optional]

<a name="DestinationTypeEnum"></a>
## Enum: DestinationTypeEnum
Name | Value
---- | -----
PROCESSOR | &quot;PROCESSOR&quot;
REMOTE_INPUT_PORT | &quot;REMOTE_INPUT_PORT&quot;
REMOTE_OUTPUT_PORT | &quot;REMOTE_OUTPUT_PORT&quot;
INPUT_PORT | &quot;INPUT_PORT&quot;
OUTPUT_PORT | &quot;OUTPUT_PORT&quot;
FUNNEL | &quot;FUNNEL&quot;

<a name="SourceTypeEnum"></a>
## Enum: SourceTypeEnum
Name | Value
---- | -----
PROCESSOR | &quot;PROCESSOR&quot;
REMOTE_INPUT_PORT | &quot;REMOTE_INPUT_PORT&quot;
REMOTE_OUTPUT_PORT | &quot;REMOTE_OUTPUT_PORT&quot;
INPUT_PORT | &quot;INPUT_PORT&quot;
OUTPUT_PORT | &quot;OUTPUT_PORT&quot;
FUNNEL | &quot;FUNNEL&quot;
