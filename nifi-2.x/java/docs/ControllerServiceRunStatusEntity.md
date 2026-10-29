# ControllerServiceRunStatusEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disconnectedNodeAcknowledged** | **Boolean** | Acknowledges that this node is disconnected to allow for mutable requests to proceed. |  [optional]
**revision** | [**RevisionDTO**](RevisionDTO.md) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) | The run status of the ControllerService. |  [optional]
**uiOnly** | **Boolean** | Indicates whether or not responses should only include fields necessary for rendering the NiFi User Interface. As such, when this value is set to true, some fields may be returned as null values, and the selected fields may change at any time without notice. As a result, this value should not be set to true by any client other than the UI.  |  [optional]

<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
ENABLED | &quot;ENABLED&quot;
DISABLED | &quot;DISABLED&quot;
