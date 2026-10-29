# VersionedReportingTask

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annotationData** | **String** | The annotation for the reporting task. This is how the custom UI relays configuration to the reporting task. |  [optional]
**bundle** | [**Bundle**](Bundle.md) |  |  [optional]
**comments** | **String** | The user-supplied comments for the component |  [optional]
**componentState** | [**VersionedComponentState**](VersionedComponentState.md) |  |  [optional]
**componentType** | [**ComponentTypeEnum**](#ComponentTypeEnum) |  |  [optional]
**groupIdentifier** | **String** | The ID of the Process Group that this component belongs to |  [optional]
**identifier** | **String** | The component&#x27;s unique identifier |  [optional]
**instanceIdentifier** | **String** | The instance ID of an existing component that is described by this VersionedComponent, or null if this is not mapped to an instantiated component |  [optional]
**name** | **String** | The component&#x27;s name |  [optional]
**position** | [**Position**](Position.md) |  |  [optional]
**properties** | **Map&lt;String, String&gt;** | The properties for the component. Properties whose value is not set will only contain the property name. |  [optional]
**propertyDescriptors** | [**Map&lt;String, VersionedPropertyDescriptor&gt;**](VersionedPropertyDescriptor.md) | The property descriptors for the component. |  [optional]
**scheduledState** | [**ScheduledStateEnum**](#ScheduledStateEnum) | Indicates the scheduled state for the Reporting Task |  [optional]
**schedulingPeriod** | **String** | The frequency with which to schedule the reporting task. The format of the value will depend on the value of schedulingStrategy. |  [optional]
**schedulingStrategy** | **String** | Indicates scheduling strategy that should dictate how the reporting task is triggered. |  [optional]
**type** | **String** | The type of the extension component |  [optional]

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
