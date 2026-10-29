# VersionedProcessGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comments** | **str** | The user-supplied comments for the component | [optional] 
**component_type** | **str** |  | [optional] 
**connections** | [**list[VersionedConnection]**](VersionedConnection.md) | The Connections | [optional] 
**controller_services** | [**list[VersionedControllerService]**](VersionedControllerService.md) | The Controller Services | [optional] 
**default_back_pressure_data_size_threshold** | **str** | Default value used in this Process Group for the maximum data size of objects that can be queued before back pressure is applied. | [optional] 
**default_back_pressure_object_threshold** | **int** | Default value used in this Process Group for the maximum number of objects that can be queued before back pressure is applied. | [optional] 
**default_flow_file_expiration** | **str** | The default FlowFile Expiration for this Process Group. | [optional] 
**execution_engine** | **str** | The Execution Engine that should be used to run the components within the group. | [optional] 
**flow_file_concurrency** | **str** | The configured FlowFile Concurrency for the Process Group | [optional] 
**flow_file_outbound_policy** | **str** | The FlowFile Outbound Policy for the Process Group | [optional] 
**funnels** | [**list[VersionedFunnel]**](VersionedFunnel.md) | The Funnels | [optional] 
**group_identifier** | **str** | The ID of the Process Group that this component belongs to | [optional] 
**identifier** | **str** | The component&#x27;s unique identifier | [optional] 
**input_ports** | [**list[VersionedPort]**](VersionedPort.md) | The Input Ports | [optional] 
**instance_identifier** | **str** | The instance ID of an existing component that is described by this VersionedComponent, or null if this is not mapped to an instantiated component | [optional] 
**labels** | [**list[VersionedLabel]**](VersionedLabel.md) | The Labels | [optional] 
**log_file_suffix** | **str** | The log file suffix for this Process Group for dedicated logging. | [optional] 
**max_concurrent_tasks** | **int** | The maximum number of concurrent tasks that should be scheduled for this Process Group when using the Stateless Engine | [optional] 
**name** | **str** | The component&#x27;s name | [optional] 
**output_ports** | [**list[VersionedPort]**](VersionedPort.md) | The Output Ports | [optional] 
**parameter_context_name** | **str** | The name of the parameter context used by this process group | [optional] 
**position** | [**Position**](Position.md) |  | [optional] 
**process_groups** | [**list[VersionedProcessGroup]**](VersionedProcessGroup.md) | The child Process Groups | [optional] 
**processors** | [**list[VersionedProcessor]**](VersionedProcessor.md) | The Processors | [optional] 
**remote_process_groups** | [**list[VersionedRemoteProcessGroup]**](VersionedRemoteProcessGroup.md) | The Remote Process Groups | [optional] 
**scheduled_state** | **str** | The Scheduled State of the Process Group, if the group is configured to use the Stateless Execution Engine. Otherwise, this value has no relevance. | [optional] 
**stateless_flow_timeout** | **str** | The maximum amount of time that the flow is allows to run using the Stateless engine before it times out and is considered a failure | [optional] 
**versioned_flow_coordinates** | [**VersionedFlowCoordinates**](VersionedFlowCoordinates.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

