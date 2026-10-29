# PortDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allow_remote_access** | **bool** | Whether this port can be accessed remotely via Site-to-Site protocol. | [optional] 
**comments** | **str** | The comments for the port. | [optional] 
**concurrently_schedulable_task_count** | **int** | The number of tasks that should be concurrently scheduled for the port. | [optional] 
**id** | **str** | The id of the component. | [optional] 
**name** | **str** | The name of the port. | [optional] 
**parent_group_id** | **str** | The id of parent process group of this component if applicable. | [optional] 
**port_function** | **str** | Specifies how the Port functions | [optional] 
**position** | [**PositionDTO**](PositionDTO.md) |  | [optional] 
**state** | **str** | The state of the port. | [optional] 
**transmitting** | **bool** | Whether the port has incoming or output connections to a remote NiFi. This is only applicable when the port is allowed to be accessed remotely. | [optional] 
**type** | **str** | The type of port. | [optional] 
**validation_errors** | **list[str]** | Gets the validation errors from this port. These validation errors represent the problems with the port that must be resolved before it can be started. | [optional] 
**versioned_component_id** | **str** | The ID of the corresponding component that is under version control | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

