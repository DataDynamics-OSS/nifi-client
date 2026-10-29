# VersionedProcessor

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annotationData** | **String** | The annotation data for the processor used to relay configuration between a custom UI and the processor. |  [optional]
**autoTerminatedRelationships** | **List&lt;String&gt;** | The names of all relationships that cause a FlowFile to be terminated if the relationship is not connected elsewhere. This property differs from the &#x27;isAutoTerminate&#x27; property of the RelationshipDTO in that the RelationshipDTO is meant to depict the current configuration, whereas this property can be set in a DTO when updating a Processor in order to change which Relationships should be auto-terminated. |  [optional]
**backoffMechanism** | **String** | Determines whether the FlowFile should be penalized or the processor should be yielded between retries. Possible returned values: PENALIZE_FLOWFILE, YIELD_PROCESSOR. |  [optional]
**bulletinLevel** | **String** | The level at which the processor will report bulletins. |  [optional]
**bundle** | [**Bundle**](Bundle.md) |  |  [optional]
**comments** | **String** | The user-supplied comments for the component |  [optional]
**componentState** | [**VersionedComponentState**](VersionedComponentState.md) |  |  [optional]
**componentType** | [**ComponentTypeEnum**](#ComponentTypeEnum) |  |  [optional]
**concurrentlySchedulableTaskCount** | **Integer** | The number of tasks that should be concurrently schedule for the processor. If the processor doesn&#x27;t allow parallel processing then any positive input will be ignored. |  [optional]
**executionNode** | **String** | Indicates the node where the process will execute. |  [optional]
**groupIdentifier** | **String** | The ID of the Process Group that this component belongs to |  [optional]
**identifier** | **String** | The component&#x27;s unique identifier |  [optional]
**instanceIdentifier** | **String** | The instance ID of an existing component that is described by this VersionedComponent, or null if this is not mapped to an instantiated component |  [optional]
**maxBackoffPeriod** | **String** | Maximum amount of time to be waited during a retry period. |  [optional]
**name** | **String** | The component&#x27;s name |  [optional]
**penaltyDuration** | **String** | The amount of time that is used when the process penalizes a FlowFile. |  [optional]
**position** | [**Position**](Position.md) |  |  [optional]
**properties** | **Map&lt;String, String&gt;** | The properties for the component. Properties whose value is not set will only contain the property name. |  [optional]
**propertyDescriptors** | [**Map&lt;String, VersionedPropertyDescriptor&gt;**](VersionedPropertyDescriptor.md) | The property descriptors for the component. |  [optional]
**retriedRelationships** | **List&lt;String&gt;** | All the relationships should be retried. |  [optional]
**retryCount** | **Integer** | Overall number of retries. |  [optional]
**runDurationMillis** | **Long** | The run duration for the processor in milliseconds. |  [optional]
**scheduledState** | [**ScheduledStateEnum**](#ScheduledStateEnum) | The scheduled state of the component |  [optional]
**schedulingPeriod** | **String** | The frequency with which to schedule the processor. The format of the value will depend on th value of schedulingStrategy. |  [optional]
**schedulingStrategy** | **String** | Indicates how the processor should be scheduled to run. |  [optional]
**style** | **Map&lt;String, String&gt;** | Stylistic data for rendering in a UI |  [optional]
**type** | **String** | The type of the extension component |  [optional]
**yieldDuration** | **String** | The amount of time that must elapse before this processor is scheduled again after yielding. |  [optional]

<a name="ComponentTypeEnum"></a>
## Enum: ComponentTypeEnum
Name | Value
---- | -----
CONNECTION | &quot;CONNECTION&quot;
PROCESSOR | &quot;PROCESSOR&quot;
PROCESS_GROUP | &quot;PROCESS_GROUP&quot;
REMOTE_PROCESS_GROUP | &quot;REMOTE_PROCESS_GROUP&quot;
INPUT_PORT | &quot;INPUT_PORT&quot;
OUTPUT_PORT | &quot;OUTPUT_PORT&quot;
REMOTE_INPUT_PORT | &quot;REMOTE_INPUT_PORT&quot;
REMOTE_OUTPUT_PORT | &quot;REMOTE_OUTPUT_PORT&quot;
FUNNEL | &quot;FUNNEL&quot;
LABEL | &quot;LABEL&quot;
CONTROLLER_SERVICE | &quot;CONTROLLER_SERVICE&quot;
REPORTING_TASK | &quot;REPORTING_TASK&quot;
FLOW_ANALYSIS_RULE | &quot;FLOW_ANALYSIS_RULE&quot;
PARAMETER_CONTEXT | &quot;PARAMETER_CONTEXT&quot;
PARAMETER_PROVIDER | &quot;PARAMETER_PROVIDER&quot;
FLOW_REGISTRY_CLIENT | &quot;FLOW_REGISTRY_CLIENT&quot;
CONNECTOR | &quot;CONNECTOR&quot;

<a name="ScheduledStateEnum"></a>
## Enum: ScheduledStateEnum
Name | Value
---- | -----
ENABLED | &quot;ENABLED&quot;
DISABLED | &quot;DISABLED&quot;
RUNNING | &quot;RUNNING&quot;
