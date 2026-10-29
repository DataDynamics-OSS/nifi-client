# ProcessGroupDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active_remote_port_count** | **int** | The number of active remote ports in the process group. | [optional] 
**comments** | **str** | The comments for the process group. | [optional] 
**contents** | [**FlowSnippetDTO**](FlowSnippetDTO.md) |  | [optional] 
**default_back_pressure_data_size_threshold** | **str** | Default value used in this Process Group for the maximum data size of objects that can be queued before back pressure is applied. | [optional] 
**default_back_pressure_object_threshold** | **int** | Default value used in this Process Group for the maximum number of objects that can be queued before back pressure is applied. | [optional] 
**default_flow_file_expiration** | **str** | The default FlowFile Expiration for this Process Group. | [optional] 
**disabled_count** | **int** | The number of disabled components in the process group. | [optional] 
**execution_engine** | **str** | The Execution Engine that should be used to run the flow represented by this Process Group. | [optional] 
**flowfile_concurrency** | **str** | The FlowFile Concurrency for this Process Group. | [optional] 
**flowfile_outbound_policy** | **str** | The Outbound Policy that is used for determining how FlowFiles should be transferred out of the Process Group. | [optional] 
**id** | **str** | The id of the component. | [optional] 
**inactive_remote_port_count** | **int** | The number of inactive remote ports in the process group. | [optional] 
**input_port_count** | **int** | The number of input ports in the process group. | [optional] 
**invalid_count** | **int** | The number of invalid components in the process group. | [optional] 
**local_input_port_count** | **int** | The number of local input ports in the process group. | [optional] 
**local_output_port_count** | **int** | The number of local output ports in the process group. | [optional] 
**locally_modified_and_stale_count** | **int** | The number of locally modified and stale versioned process groups in the process group. | [optional] 
**locally_modified_count** | **int** | The number of locally modified versioned process groups in the process group. | [optional] 
**log_file_suffix** | **str** | The log file suffix for this Process Group for dedicated logging. | [optional] 
**max_concurrent_tasks** | **int** | The maximum number of concurrent tasks to use when running the flow using the Stateless Engine | [optional] 
**name** | **str** | The name of the process group. | [optional] 
**output_port_count** | **int** | The number of output ports in the process group. | [optional] 
**parameter_context** | [**ParameterContextReferenceEntity**](ParameterContextReferenceEntity.md) |  | [optional] 
**parent_group_id** | **str** | The id of parent process group of this component if applicable. | [optional] 
**position** | [**PositionDTO**](PositionDTO.md) |  | [optional] 
**public_input_port_count** | **int** | The number of public input ports in the process group. | [optional] 
**public_output_port_count** | **int** | The number of public output ports in the process group. | [optional] 
**running_count** | **int** | The number of running components in this process group. | [optional] 
**stale_count** | **int** | The number of stale versioned process groups in the process group. | [optional] 
**stateless_flow_timeout** | **str** | The maximum amount of time that the flow can be run using the Stateless Engine before the flow times out | [optional] 
**stateless_group_scheduled_state** | **str** | If the Process Group is configured to run in using the Stateless Engine, represents the current state. Otherwise, will be STOPPED. | [optional] 
**stopped_count** | **int** | The number of stopped components in the process group. | [optional] 
**sync_failure_count** | **int** | The number of versioned process groups in the process group that are unable to sync to a registry. | [optional] 
**up_to_date_count** | **int** | The number of up to date versioned process groups in the process group. | [optional] 
**version_control_information** | [**VersionControlInformationDTO**](VersionControlInformationDTO.md) |  | [optional] 
**versioned_component_id** | **str** | The ID of the corresponding component that is under version control | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

