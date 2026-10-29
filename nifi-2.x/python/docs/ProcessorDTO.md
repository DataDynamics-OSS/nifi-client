# ProcessorDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bundle** | [**BundleDTO**](BundleDTO.md) |  | [optional] 
**config** | [**ProcessorConfigDTO**](ProcessorConfigDTO.md) |  | [optional] 
**deprecated** | **bool** | Whether the processor has been deprecated. | [optional] 
**description** | **str** | The description of the processor. | [optional] 
**execution_node_restricted** | **bool** | Indicates if the execution node of a processor is restricted to run only on the primary node | [optional] 
**extension_missing** | **bool** | Whether the underlying extension is missing. | [optional] 
**id** | **str** | The id of the component. | [optional] 
**input_requirement** | **str** | The input requirement for this processor. | [optional] 
**multiple_versions_available** | **bool** | Whether the processor has multiple versions available. | [optional] 
**name** | **str** | The name of the processor. | [optional] 
**parent_group_id** | **str** | The id of parent process group of this component if applicable. | [optional] 
**persists_state** | **bool** | Whether the processor persists state. | [optional] 
**physical_state** | **str** | The physical state of the processor, including transition states | [optional] 
**position** | [**PositionDTO**](PositionDTO.md) |  | [optional] 
**relationships** | [**list[RelationshipDTO]**](RelationshipDTO.md) | The available relationships that the processor currently supports. | [optional] 
**restricted** | **bool** | Whether the processor requires elevated privileges. | [optional] 
**state** | **str** | The state of the processor | [optional] 
**style** | **dict(str, str)** | Styles for the processor (background-color : #eee). | [optional] 
**supports_backlog_reporting** | **bool** | Whether the processor implements BacklogReportingProcessor and can report a backlog. | [optional] 
**supports_batching** | **bool** | Whether the processor supports batching. This makes the run duration settings available. | [optional] 
**supports_parallel_processing** | **bool** | Whether the processor supports parallel processing. | [optional] 
**supports_sensitive_dynamic_properties** | **bool** | Whether the processor supports sensitive dynamic properties. | [optional] 
**type** | **str** | The type of the processor. | [optional] 
**validation_errors** | **list[str]** | The validation errors for the processor. These validation errors represent the problems with the processor that must be resolved before it can be started. | [optional] 
**validation_status** | **str** | Indicates whether the Processor is valid, invalid, or still in the process of validating (i.e., it is unknown whether or not the Processor is valid) | [optional] 
**versioned_component_id** | **str** | The ID of the corresponding component that is under version control | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

