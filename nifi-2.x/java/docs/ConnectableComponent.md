# ConnectableComponent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comments** | **String** | The comments for the connectable component. |  [optional]
**groupId** | **String** | The id of the group that the connectable component resides in |  [optional]
**id** | **String** | The id of the connectable component. |  [optional]
**instanceIdentifier** | **String** | The instance ID of an existing component that is described by this VersionedComponent, or null if this is not mapped to an instantiated component |  [optional]
**name** | **String** | The name of the connectable component |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of component the connectable is. |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
PROCESSOR | &quot;PROCESSOR&quot;
REMOTE_INPUT_PORT | &quot;REMOTE_INPUT_PORT&quot;
REMOTE_OUTPUT_PORT | &quot;REMOTE_OUTPUT_PORT&quot;
INPUT_PORT | &quot;INPUT_PORT&quot;
OUTPUT_PORT | &quot;OUTPUT_PORT&quot;
FUNNEL | &quot;FUNNEL&quot;
