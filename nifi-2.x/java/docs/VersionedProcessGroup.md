# VersionedProcessGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comments** | **String** | The user-supplied comments for the component |  [optional]
**componentType** | [**ComponentTypeEnum**](#ComponentTypeEnum) |  |  [optional]
**connections** | [**List&lt;VersionedConnection&gt;**](VersionedConnection.md) | The Connections |  [optional]
**controllerServices** | [**List&lt;VersionedControllerService&gt;**](VersionedControllerService.md) | The Controller Services |  [optional]
**defaultBackPressureDataSizeThreshold** | **String** | Default value used in this Process Group for the maximum data size of objects that can be queued before back pressure is applied. |  [optional]
**defaultBackPressureObjectThreshold** | **Long** | Default value used in this Process Group for the maximum number of objects that can be queued before back pressure is applied. |  [optional]
**defaultFlowFileExpiration** | **String** | The default FlowFile Expiration for this Process Group. |  [optional]
**executionEngine** | [**ExecutionEngineEnum**](#ExecutionEngineEnum) | The Execution Engine that should be used to run the components within the group. |  [optional]
**flowFileConcurrency** | **String** | The configured FlowFile Concurrency for the Process Group |  [optional]
**flowFileOutboundPolicy** | **String** | The FlowFile Outbound Policy for the Process Group |  [optional]
**funnels** | [**List&lt;VersionedFunnel&gt;**](VersionedFunnel.md) | The Funnels |  [optional]
**groupIdentifier** | **String** | The ID of the Process Group that this component belongs to |  [optional]
**identifier** | **String** | The component&#x27;s unique identifier |  [optional]
**inputPorts** | [**List&lt;VersionedPort&gt;**](VersionedPort.md) | The Input Ports |  [optional]
**instanceIdentifier** | **String** | The instance ID of an existing component that is described by this VersionedComponent, or null if this is not mapped to an instantiated component |  [optional]
**labels** | [**List&lt;VersionedLabel&gt;**](VersionedLabel.md) | The Labels |  [optional]
**logFileSuffix** | **String** | The log file suffix for this Process Group for dedicated logging. |  [optional]
**maxConcurrentTasks** | **Integer** | The maximum number of concurrent tasks that should be scheduled for this Process Group when using the Stateless Engine |  [optional]
**name** | **String** | The component&#x27;s name |  [optional]
**outputPorts** | [**List&lt;VersionedPort&gt;**](VersionedPort.md) | The Output Ports |  [optional]
**parameterContextName** | **String** | The name of the parameter context used by this process group |  [optional]
**position** | [**Position**](Position.md) |  |  [optional]
**processGroups** | [**List&lt;VersionedProcessGroup&gt;**](VersionedProcessGroup.md) | The child Process Groups |  [optional]
**processors** | [**List&lt;VersionedProcessor&gt;**](VersionedProcessor.md) | The Processors |  [optional]
**remoteProcessGroups** | [**List&lt;VersionedRemoteProcessGroup&gt;**](VersionedRemoteProcessGroup.md) | The Remote Process Groups |  [optional]
**scheduledState** | [**ScheduledStateEnum**](#ScheduledStateEnum) | The Scheduled State of the Process Group, if the group is configured to use the Stateless Execution Engine. Otherwise, this value has no relevance. |  [optional]
**statelessFlowTimeout** | **String** | The maximum amount of time that the flow is allows to run using the Stateless engine before it times out and is considered a failure |  [optional]
**versionedFlowCoordinates** | [**VersionedFlowCoordinates**](VersionedFlowCoordinates.md) |  |  [optional]

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

<a name="ExecutionEngineEnum"></a>
## Enum: ExecutionEngineEnum
Name | Value
---- | -----
STANDARD | &quot;STANDARD&quot;
STATELESS | &quot;STATELESS&quot;
INHERITED | &quot;INHERITED&quot;

<a name="ScheduledStateEnum"></a>
## Enum: ScheduledStateEnum
Name | Value
---- | -----
ENABLED | &quot;ENABLED&quot;
DISABLED | &quot;DISABLED&quot;
RUNNING | &quot;RUNNING&quot;
