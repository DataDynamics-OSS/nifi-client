# PortDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowRemoteAccess** | **Boolean** | Whether this port can be accessed remotely via Site-to-Site protocol. |  [optional]
**comments** | **String** | The comments for the port. |  [optional]
**concurrentlySchedulableTaskCount** | **Integer** | The number of tasks that should be concurrently scheduled for the port. |  [optional]
**id** | **String** | The id of the component. |  [optional]
**name** | **String** | The name of the port. |  [optional]
**parentGroupId** | **String** | The id of parent process group of this component if applicable. |  [optional]
**portFunction** | [**PortFunctionEnum**](#PortFunctionEnum) | Specifies how the Port functions |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) | The state of the port. |  [optional]
**transmitting** | **Boolean** | Whether the port has incoming or output connections to a remote NiFi. This is only applicable when the port is allowed to be accessed remotely. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of port. |  [optional]
**validationErrors** | **List&lt;String&gt;** | Gets the validation errors from this port. These validation errors represent the problems with the port that must be resolved before it can be started. |  [optional]
**versionedComponentId** | **String** | The ID of the corresponding component that is under version control |  [optional]

<a name="PortFunctionEnum"></a>
## Enum: PortFunctionEnum
Name | Value
---- | -----
STANDARD | &quot;STANDARD&quot;
FAILURE | &quot;FAILURE&quot;

<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
RUNNING | &quot;RUNNING&quot;
STOPPED | &quot;STOPPED&quot;
DISABLED | &quot;DISABLED&quot;

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
INPUT_PORT | &quot;INPUT_PORT&quot;
OUTPUT_PORT | &quot;OUTPUT_PORT&quot;
