# VersionedProcessGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | **str** | The component&#39;s unique identifier | [optional] 
**instance_identifier** | **str** | The instance ID of an existing component that is described by this VersionedComponent, or null if this is not mapped to an instantiated component | [optional] 
**name** | **str** | The component&#39;s name | [optional] 
**comments** | **str** | The user-supplied comments for the component | [optional] 
**position** | [**Position**](Position.md) | The component&#39;s position on the graph | [optional] 
**process_groups** | [**list[VersionedProcessGroup]**](VersionedProcessGroup.md) | The child Process Groups | [optional] 
**remote_process_groups** | [**list[VersionedRemoteProcessGroup]**](VersionedRemoteProcessGroup.md) | The Remote Process Groups | [optional] 
**processors** | [**list[VersionedProcessor]**](VersionedProcessor.md) | The Processors | [optional] 
**input_ports** | [**list[VersionedPort]**](VersionedPort.md) | The Input Ports | [optional] 
**output_ports** | [**list[VersionedPort]**](VersionedPort.md) | The Output Ports | [optional] 
**connections** | [**list[VersionedConnection]**](VersionedConnection.md) | The Connections | [optional] 
**labels** | [**list[VersionedLabel]**](VersionedLabel.md) | The Labels | [optional] 
**funnels** | [**list[VersionedFunnel]**](VersionedFunnel.md) | The Funnels | [optional] 
**controller_services** | [**list[VersionedControllerService]**](VersionedControllerService.md) | The Controller Services | [optional] 
**versioned_flow_coordinates** | [**VersionedFlowCoordinates**](VersionedFlowCoordinates.md) | The coordinates where the remote flow is stored, or null if the Process Group is not directly under Version Control | [optional] 
**variables** | **dict(str, str)** | The Variables in the Variable Registry for this Process Group (not including any ancestor or descendant Process Groups) | [optional] 
**parameter_context_name** | **str** | The name of the parameter context used by this process group | [optional] 
**default_flow_file_expiration** | **str** | The default FlowFile Expiration for this Process Group. | [optional] 
**default_back_pressure_object_threshold** | **int** | Default value used in this Process Group for the maximum number of objects that can be queued before back pressure is applied. | [optional] 
**default_back_pressure_data_size_threshold** | **str** | Default value used in this Process Group for the maximum data size of objects that can be queued before back pressure is applied. | [optional] 
**log_file_suffix** | **str** | The log file suffix for this Process Group for dedicated logging. | [optional] 
**flow_file_concurrency** | **str** | The configured FlowFile Concurrency for the Process Group | [optional] 
**flow_file_outbound_policy** | **str** | The FlowFile Outbound Policy for the Process Group | [optional] 
**component_type** | **str** |  | [optional] 
**group_identifier** | **str** | The ID of the Process Group that this component belongs to | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


