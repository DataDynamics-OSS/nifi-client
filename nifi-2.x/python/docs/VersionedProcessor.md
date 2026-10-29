# VersionedProcessor

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annotation_data** | **str** | The annotation data for the processor used to relay configuration between a custom UI and the processor. | [optional] 
**auto_terminated_relationships** | **list[str]** | The names of all relationships that cause a FlowFile to be terminated if the relationship is not connected elsewhere. This property differs from the &#x27;isAutoTerminate&#x27; property of the RelationshipDTO in that the RelationshipDTO is meant to depict the current configuration, whereas this property can be set in a DTO when updating a Processor in order to change which Relationships should be auto-terminated. | [optional] 
**backoff_mechanism** | **str** | Determines whether the FlowFile should be penalized or the processor should be yielded between retries. Possible returned values: PENALIZE_FLOWFILE, YIELD_PROCESSOR. | [optional] 
**bulletin_level** | **str** | The level at which the processor will report bulletins. | [optional] 
**bundle** | [**Bundle**](Bundle.md) |  | [optional] 
**comments** | **str** | The user-supplied comments for the component | [optional] 
**component_state** | [**VersionedComponentState**](VersionedComponentState.md) |  | [optional] 
**component_type** | **str** |  | [optional] 
**concurrently_schedulable_task_count** | **int** | The number of tasks that should be concurrently schedule for the processor. If the processor doesn&#x27;t allow parallel processing then any positive input will be ignored. | [optional] 
**execution_node** | **str** | Indicates the node where the process will execute. | [optional] 
**group_identifier** | **str** | The ID of the Process Group that this component belongs to | [optional] 
**identifier** | **str** | The component&#x27;s unique identifier | [optional] 
**instance_identifier** | **str** | The instance ID of an existing component that is described by this VersionedComponent, or null if this is not mapped to an instantiated component | [optional] 
**max_backoff_period** | **str** | Maximum amount of time to be waited during a retry period. | [optional] 
**name** | **str** | The component&#x27;s name | [optional] 
**penalty_duration** | **str** | The amount of time that is used when the process penalizes a FlowFile. | [optional] 
**position** | [**Position**](Position.md) |  | [optional] 
**properties** | **dict(str, str)** | The properties for the component. Properties whose value is not set will only contain the property name. | [optional] 
**property_descriptors** | [**dict(str, VersionedPropertyDescriptor)**](VersionedPropertyDescriptor.md) | The property descriptors for the component. | [optional] 
**retried_relationships** | **list[str]** | All the relationships should be retried. | [optional] 
**retry_count** | **int** | Overall number of retries. | [optional] 
**run_duration_millis** | **int** | The run duration for the processor in milliseconds. | [optional] 
**scheduled_state** | **str** | The scheduled state of the component | [optional] 
**scheduling_period** | **str** | The frequency with which to schedule the processor. The format of the value will depend on th value of schedulingStrategy. | [optional] 
**scheduling_strategy** | **str** | Indicates how the processor should be scheduled to run. | [optional] 
**style** | **dict(str, str)** | Stylistic data for rendering in a UI | [optional] 
**type** | **str** | The type of the extension component | [optional] 
**yield_duration** | **str** | The amount of time that must elapse before this processor is scheduled again after yielding. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

