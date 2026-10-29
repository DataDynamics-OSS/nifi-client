# ProcessGroupDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeRemotePortCount** | **Integer** | The number of active remote ports in the process group. |  [optional]
**comments** | **String** | The comments for the process group. |  [optional]
**contents** | [**FlowSnippetDTO**](FlowSnippetDTO.md) |  |  [optional]
**defaultBackPressureDataSizeThreshold** | **String** | Default value used in this Process Group for the maximum data size of objects that can be queued before back pressure is applied. |  [optional]
**defaultBackPressureObjectThreshold** | **Long** | Default value used in this Process Group for the maximum number of objects that can be queued before back pressure is applied. |  [optional]
**defaultFlowFileExpiration** | **String** | The default FlowFile Expiration for this Process Group. |  [optional]
**disabledCount** | **Integer** | The number of disabled components in the process group. |  [optional]
**executionEngine** | [**ExecutionEngineEnum**](#ExecutionEngineEnum) | The Execution Engine that should be used to run the flow represented by this Process Group. |  [optional]
**flowfileConcurrency** | [**FlowfileConcurrencyEnum**](#FlowfileConcurrencyEnum) | The FlowFile Concurrency for this Process Group. |  [optional]
**flowfileOutboundPolicy** | [**FlowfileOutboundPolicyEnum**](#FlowfileOutboundPolicyEnum) | The Outbound Policy that is used for determining how FlowFiles should be transferred out of the Process Group. |  [optional]
**id** | **String** | The id of the component. |  [optional]
**inactiveRemotePortCount** | **Integer** | The number of inactive remote ports in the process group. |  [optional]
**inputPortCount** | **Integer** | The number of input ports in the process group. |  [optional]
**invalidCount** | **Integer** | The number of invalid components in the process group. |  [optional]
**localInputPortCount** | **Integer** | The number of local input ports in the process group. |  [optional]
**localOutputPortCount** | **Integer** | The number of local output ports in the process group. |  [optional]
**locallyModifiedAndStaleCount** | **Integer** | The number of locally modified and stale versioned process groups in the process group. |  [optional]
**locallyModifiedCount** | **Integer** | The number of locally modified versioned process groups in the process group. |  [optional]
**logFileSuffix** | **String** | The log file suffix for this Process Group for dedicated logging. |  [optional]
**maxConcurrentTasks** | **Integer** | The maximum number of concurrent tasks to use when running the flow using the Stateless Engine |  [optional]
**name** | **String** | The name of the process group. |  [optional]
**outputPortCount** | **Integer** | The number of output ports in the process group. |  [optional]
**parameterContext** | [**ParameterContextReferenceEntity**](ParameterContextReferenceEntity.md) |  |  [optional]
**parentGroupId** | **String** | The id of parent process group of this component if applicable. |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) |  |  [optional]
**publicInputPortCount** | **Integer** | The number of public input ports in the process group. |  [optional]
**publicOutputPortCount** | **Integer** | The number of public output ports in the process group. |  [optional]
**runningCount** | **Integer** | The number of running components in this process group. |  [optional]
**staleCount** | **Integer** | The number of stale versioned process groups in the process group. |  [optional]
**statelessFlowTimeout** | **String** | The maximum amount of time that the flow can be run using the Stateless Engine before the flow times out |  [optional]
**statelessGroupScheduledState** | [**StatelessGroupScheduledStateEnum**](#StatelessGroupScheduledStateEnum) | If the Process Group is configured to run in using the Stateless Engine, represents the current state. Otherwise, will be STOPPED. |  [optional]
**stoppedCount** | **Integer** | The number of stopped components in the process group. |  [optional]
**syncFailureCount** | **Integer** | The number of versioned process groups in the process group that are unable to sync to a registry. |  [optional]
**upToDateCount** | **Integer** | The number of up to date versioned process groups in the process group. |  [optional]
**versionControlInformation** | [**VersionControlInformationDTO**](VersionControlInformationDTO.md) |  |  [optional]
**versionedComponentId** | **String** | The ID of the corresponding component that is under version control |  [optional]

<a name="ExecutionEngineEnum"></a>
## Enum: ExecutionEngineEnum
Name | Value
---- | -----
STATELESS | &quot;STATELESS&quot;
STANDARD | &quot;STANDARD&quot;
INHERITED | &quot;INHERITED&quot;

<a name="FlowfileConcurrencyEnum"></a>
## Enum: FlowfileConcurrencyEnum
Name | Value
---- | -----
UNBOUNDED | &quot;UNBOUNDED&quot;
SINGLE_FLOWFILE_PER_NODE | &quot;SINGLE_FLOWFILE_PER_NODE&quot;
SINGLE_BATCH_PER_NODE | &quot;SINGLE_BATCH_PER_NODE&quot;

<a name="FlowfileOutboundPolicyEnum"></a>
## Enum: FlowfileOutboundPolicyEnum
Name | Value
---- | -----
STREAM_WHEN_AVAILABLE | &quot;STREAM_WHEN_AVAILABLE&quot;
BATCH_OUTPUT | &quot;BATCH_OUTPUT&quot;

<a name="StatelessGroupScheduledStateEnum"></a>
## Enum: StatelessGroupScheduledStateEnum
Name | Value
---- | -----
STOPPED | &quot;STOPPED&quot;
RUNNING | &quot;RUNNING&quot;
