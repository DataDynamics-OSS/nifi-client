# VersionedProcessor

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | **str** | The component&#39;s unique identifier | [optional] 
**instance_identifier** | **str** | The instance ID of an existing component that is described by this VersionedComponent, or null if this is not mapped to an instantiated component | [optional] 
**name** | **str** | The component&#39;s name | [optional] 
**comments** | **str** | The user-supplied comments for the component | [optional] 
**position** | [**Position**](Position.md) | The component&#39;s position on the graph | [optional] 
**type** | **str** | The type of the extension component | [optional] 
**bundle** | [**Bundle**](Bundle.md) | Information about the bundle from which the component came | [optional] 
**properties** | **dict(str, str)** | The properties for the component. Properties whose value is not set will only contain the property name. | [optional] 
**property_descriptors** | [**dict(str, VersionedPropertyDescriptor)**](VersionedPropertyDescriptor.md) | The property descriptors for the component. | [optional] 
**style** | **dict(str, str)** | Stylistic data for rendering in a UI | [optional] 
**annotation_data** | **str** | The annotation data for the processor used to relay configuration between a custom UI and the procesosr. | [optional] 
**scheduling_period** | **str** | The frequency with which to schedule the processor. The format of the value will depend on th value of schedulingStrategy. | [optional] 
**scheduling_strategy** | **str** | Indicates whether the processor should be scheduled to run in event or timer driven mode. | [optional] 
**execution_node** | **str** | Indicates the node where the process will execute. | [optional] 
**penalty_duration** | **str** | The amout of time that is used when the process penalizes a flowfile. | [optional] 
**yield_duration** | **str** | The amount of time that must elapse before this processor is scheduled again after yielding. | [optional] 
**bulletin_level** | **str** | The level at which the processor will report bulletins. | [optional] 
**run_duration_millis** | **int** | The run duration for the processor in milliseconds. | [optional] 
**concurrently_schedulable_task_count** | **int** | The number of tasks that should be concurrently schedule for the processor. If the processor doesn&#39;t allow parallol processing then any positive input will be ignored. | [optional] 
**auto_terminated_relationships** | **list[str]** | The names of all relationships that cause a flow file to be terminated if the relationship is not connected elsewhere. This property differs from the &#39;isAutoTerminate&#39; property of the RelationshipDTO in that the RelationshipDTO is meant to depict the current configuration, whereas this property can be set in a DTO when updating a Processor in order to change which Relationships should be auto-terminated. | [optional] 
**scheduled_state** | **str** | The scheduled state of the component | [optional] 
**retry_count** | **int** | Overall number of retries. | [optional] 
**retried_relationships** | **list[str]** | All the relationships should be retried. | [optional] 
**backoff_mechanism** | **str** | Determines whether the FlowFile should be penalized or the processor should be yielded between retries. | [optional] 
**max_backoff_period** | **str** | Maximum amount of time to be waited during a retry period. | [optional] 
**component_type** | **str** |  | [optional] 
**group_identifier** | **str** | The ID of the Process Group that this component belongs to | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


