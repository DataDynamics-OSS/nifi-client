# RemotePortRunStatusEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disconnectedNodeAcknowledged** | **Boolean** | Acknowledges that this node is disconnected to allow for mutable requests to proceed. |  [optional]
**revision** | [**RevisionDTO**](RevisionDTO.md) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) | The run status of the RemotePort. |  [optional]

<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
TRANSMITTING | &quot;TRANSMITTING&quot;
STOPPED | &quot;STOPPED&quot;
