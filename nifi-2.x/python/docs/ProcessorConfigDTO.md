# ProcessorConfigDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annotation_data** | **str** | The annotation data for the processor used to relay configuration between a custom UI and the processor. | [optional] 
**auto_terminated_relationships** | **list[str]** | The names of all relationships that cause a flow file to be terminated if the relationship is not connected elsewhere. This property differs from the &#x27;isAutoTerminate&#x27; property of the RelationshipDTO in that the RelationshipDTO is meant to depict the current configuration, whereas this property can be set in a DTO when updating a Processor in order to change which Relationships should be auto-terminated. | [optional] 
**backoff_mechanism** | **str** | Determines whether the FlowFile should be penalized or the processor should be yielded between retries. Possible returned values: PENALIZE_FLOWFILE, YIELD_PROCESSOR. See BackoffMechanism.class for more details. | [optional] 
**bulletin_level** | **str** | The level at which the processor will report bulletins. | [optional] 
**comments** | **str** | The comments for the processor. | [optional] 
**concurrently_schedulable_task_count** | **int** | The number of tasks that should be concurrently schedule for the processor. If the processor doesn&#x27;t allow parallel processing then any positive input will be ignored. | [optional] 
**custom_ui_url** | **str** | The URL for the processor&#x27;s custom configuration UI if applicable. | [optional] 
**default_concurrent_tasks** | **dict(str, str)** | Maps default values for concurrent tasks for each applicable scheduling strategy. | [optional] 
**default_scheduling_period** | **dict(str, str)** | Maps default values for scheduling period for each applicable scheduling strategy. | [optional] 
**descriptors** | [**dict(str, PropertyDescriptorDTO)**](PropertyDescriptorDTO.md) | Descriptors for the processor&#x27;s properties. | [optional] 
**execution_node** | **str** | Indicates the node where the process will execute. | [optional] 
**loss_tolerant** | **bool** | Whether the processor is loss tolerant. | [optional] 
**max_backoff_period** | **str** | Maximum amount of time to be waited during a retry period. | [optional] 
**penalty_duration** | **str** | The amount of time that is used when the process penalizes a flowfile. | [optional] 
**properties** | **dict(str, str)** | The properties for the processor. Properties whose value is not set will only contain the property name. | [optional] 
**retried_relationships** | **list[str]** | All the relationships should be retried. | [optional] 
**retry_count** | **int** | Overall number of retries. | [optional] 
**run_duration_millis** | **int** | The run duration for the processor in milliseconds. | [optional] 
**scheduling_period** | **str** | The frequency with which to schedule the processor. The format of the value will depend on th value of schedulingStrategy. | [optional] 
**scheduling_strategy** | **str** | Indicates how the processor should be scheduled to run. | [optional] 
**sensitive_dynamic_property_names** | **list[str]** | Set of sensitive dynamic property names | [optional] 
**yield_duration** | **str** | The amount of time that must elapse before this processor is scheduled again after yielding. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

