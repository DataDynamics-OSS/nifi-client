# ProcessGroupEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active_remote_port_count** | **int** | The number of active remote ports in the process group. | [optional] 
**bulletins** | [**list[BulletinEntity]**](BulletinEntity.md) | The bulletins for this component. | [optional] 
**component** | [**ProcessGroupDTO**](ProcessGroupDTO.md) |  | [optional] 
**disabled_count** | **int** | The number of disabled components in the process group. | [optional] 
**disconnected_node_acknowledged** | **bool** | Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] 
**id** | **str** | The id of the component. | [optional] 
**inactive_remote_port_count** | **int** | The number of inactive remote ports in the process group. | [optional] 
**input_port_count** | **int** | The number of input ports in the process group. | [optional] 
**invalid_count** | **int** | The number of invalid components in the process group. | [optional] 
**local_input_port_count** | **int** | The number of local input ports in the process group. | [optional] 
**local_output_port_count** | **int** | The number of local output ports in the process group. | [optional] 
**locally_modified_and_stale_count** | **int** | The number of locally modified and stale versioned process groups in the process group. | [optional] 
**locally_modified_count** | **int** | The number of locally modified versioned process groups in the process group. | [optional] 
**output_port_count** | **int** | The number of output ports in the process group. | [optional] 
**parameter_context** | [**ParameterContextReferenceEntity**](ParameterContextReferenceEntity.md) |  | [optional] 
**permissions** | [**PermissionsDTO**](PermissionsDTO.md) |  | [optional] 
**position** | [**PositionDTO**](PositionDTO.md) |  | [optional] 
**process_group_update_strategy** | **str** | Determines the process group update strategy | [optional] 
**public_input_port_count** | **int** | The number of public input ports in the process group. | [optional] 
**public_output_port_count** | **int** | The number of public output ports in the process group. | [optional] 
**revision** | [**RevisionDTO**](RevisionDTO.md) |  | [optional] 
**running_count** | **int** | The number of running components in this process group. | [optional] 
**stale_count** | **int** | The number of stale versioned process groups in the process group. | [optional] 
**status** | [**ProcessGroupStatusDTO**](ProcessGroupStatusDTO.md) |  | [optional] 
**stopped_count** | **int** | The number of stopped components in the process group. | [optional] 
**sync_failure_count** | **int** | The number of versioned process groups in the process group that are unable to sync to a registry. | [optional] 
**up_to_date_count** | **int** | The number of up to date versioned process groups in the process group. | [optional] 
**uri** | **str** | The URI for futures requests to the component. | [optional] 
**versioned_flow_snapshot** | [**RegisteredFlowSnapshot**](RegisteredFlowSnapshot.md) |  | [optional] 
**versioned_flow_state** | **str** | The current state of the Process Group, as it relates to the Versioned Flow | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

