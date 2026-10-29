# ProcessorConfigDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annotationData** | **String** | The annotation data for the processor used to relay configuration between a custom UI and the processor. |  [optional]
**autoTerminatedRelationships** | **List&lt;String&gt;** | The names of all relationships that cause a flow file to be terminated if the relationship is not connected elsewhere. This property differs from the &#x27;isAutoTerminate&#x27; property of the RelationshipDTO in that the RelationshipDTO is meant to depict the current configuration, whereas this property can be set in a DTO when updating a Processor in order to change which Relationships should be auto-terminated. |  [optional]
**backoffMechanism** | **String** | Determines whether the FlowFile should be penalized or the processor should be yielded between retries. Possible returned values: PENALIZE_FLOWFILE, YIELD_PROCESSOR. See BackoffMechanism.class for more details. |  [optional]
**bulletinLevel** | **String** | The level at which the processor will report bulletins. |  [optional]
**comments** | **String** | The comments for the processor. |  [optional]
**concurrentlySchedulableTaskCount** | **Integer** | The number of tasks that should be concurrently schedule for the processor. If the processor doesn&#x27;t allow parallel processing then any positive input will be ignored. |  [optional]
**customUiUrl** | **String** | The URL for the processor&#x27;s custom configuration UI if applicable. |  [optional]
**defaultConcurrentTasks** | **Map&lt;String, String&gt;** | Maps default values for concurrent tasks for each applicable scheduling strategy. |  [optional]
**defaultSchedulingPeriod** | **Map&lt;String, String&gt;** | Maps default values for scheduling period for each applicable scheduling strategy. |  [optional]
**descriptors** | [**Map&lt;String, PropertyDescriptorDTO&gt;**](PropertyDescriptorDTO.md) | Descriptors for the processor&#x27;s properties. |  [optional]
**executionNode** | **String** | Indicates the node where the process will execute. |  [optional]
**lossTolerant** | **Boolean** | Whether the processor is loss tolerant. |  [optional]
**maxBackoffPeriod** | **String** | Maximum amount of time to be waited during a retry period. |  [optional]
**penaltyDuration** | **String** | The amount of time that is used when the process penalizes a flowfile. |  [optional]
**properties** | **Map&lt;String, String&gt;** | The properties for the processor. Properties whose value is not set will only contain the property name. |  [optional]
**retriedRelationships** | **List&lt;String&gt;** | All the relationships should be retried. |  [optional]
**retryCount** | **Integer** | Overall number of retries. |  [optional]
**runDurationMillis** | **Long** | The run duration for the processor in milliseconds. |  [optional]
**schedulingPeriod** | **String** | The frequency with which to schedule the processor. The format of the value will depend on th value of schedulingStrategy. |  [optional]
**schedulingStrategy** | **String** | Indicates how the processor should be scheduled to run. |  [optional]
**sensitiveDynamicPropertyNames** | **List&lt;String&gt;** | Set of sensitive dynamic property names |  [optional]
**yieldDuration** | **String** | The amount of time that must elapse before this processor is scheduled again after yielding. |  [optional]
