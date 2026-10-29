# ControllerServiceRunStatusEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disconnected_node_acknowledged** | **bool** | Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] 
**revision** | [**RevisionDTO**](RevisionDTO.md) |  | [optional] 
**state** | **str** | The run status of the ControllerService. | [optional] 
**ui_only** | **bool** | Indicates whether or not responses should only include fields necessary for rendering the NiFi User Interface. As such, when this value is set to true, some fields may be returned as null values, and the selected fields may change at any time without notice. As a result, this value should not be set to true by any client other than the UI.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

