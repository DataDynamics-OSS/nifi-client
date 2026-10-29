# ProcessGroupEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeRemotePortCount** | **Integer** | The number of active remote ports in the process group. |  [optional]
**bulletins** | [**List&lt;BulletinEntity&gt;**](BulletinEntity.md) | The bulletins for this component. |  [optional]
**component** | [**ProcessGroupDTO**](ProcessGroupDTO.md) |  |  [optional]
**disabledCount** | **Integer** | The number of disabled components in the process group. |  [optional]
**disconnectedNodeAcknowledged** | **Boolean** | Acknowledges that this node is disconnected to allow for mutable requests to proceed. |  [optional]
**id** | **String** | The id of the component. |  [optional]
**inactiveRemotePortCount** | **Integer** | The number of inactive remote ports in the process group. |  [optional]
**inputPortCount** | **Integer** | The number of input ports in the process group. |  [optional]
**invalidCount** | **Integer** | The number of invalid components in the process group. |  [optional]
**localInputPortCount** | **Integer** | The number of local input ports in the process group. |  [optional]
**localOutputPortCount** | **Integer** | The number of local output ports in the process group. |  [optional]
**locallyModifiedAndStaleCount** | **Integer** | The number of locally modified and stale versioned process groups in the process group. |  [optional]
**locallyModifiedCount** | **Integer** | The number of locally modified versioned process groups in the process group. |  [optional]
**outputPortCount** | **Integer** | The number of output ports in the process group. |  [optional]
**parameterContext** | [**ParameterContextReferenceEntity**](ParameterContextReferenceEntity.md) |  |  [optional]
**permissions** | [**PermissionsDTO**](PermissionsDTO.md) |  |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) |  |  [optional]
**processGroupUpdateStrategy** | [**ProcessGroupUpdateStrategyEnum**](#ProcessGroupUpdateStrategyEnum) | Determines the process group update strategy |  [optional]
**publicInputPortCount** | **Integer** | The number of public input ports in the process group. |  [optional]
**publicOutputPortCount** | **Integer** | The number of public output ports in the process group. |  [optional]
**revision** | [**RevisionDTO**](RevisionDTO.md) |  |  [optional]
**runningCount** | **Integer** | The number of running components in this process group. |  [optional]
**staleCount** | **Integer** | The number of stale versioned process groups in the process group. |  [optional]
**status** | [**ProcessGroupStatusDTO**](ProcessGroupStatusDTO.md) |  |  [optional]
**stoppedCount** | **Integer** | The number of stopped components in the process group. |  [optional]
**syncFailureCount** | **Integer** | The number of versioned process groups in the process group that are unable to sync to a registry. |  [optional]
**upToDateCount** | **Integer** | The number of up to date versioned process groups in the process group. |  [optional]
**uri** | **String** | The URI for futures requests to the component. |  [optional]
**versionedFlowSnapshot** | [**RegisteredFlowSnapshot**](RegisteredFlowSnapshot.md) |  |  [optional]
**versionedFlowState** | [**VersionedFlowStateEnum**](#VersionedFlowStateEnum) | The current state of the Process Group, as it relates to the Versioned Flow |  [optional]

<a name="ProcessGroupUpdateStrategyEnum"></a>
## Enum: ProcessGroupUpdateStrategyEnum
Name | Value
---- | -----
GROUP | &quot;CURRENT_GROUP&quot;
GROUP_WITH_CHILDREN | &quot;CURRENT_GROUP_WITH_CHILDREN&quot;

<a name="VersionedFlowStateEnum"></a>
## Enum: VersionedFlowStateEnum
Name | Value
---- | -----
LOCALLY_MODIFIED | &quot;LOCALLY_MODIFIED&quot;
STALE | &quot;STALE&quot;
LOCALLY_MODIFIED_AND_STALE | &quot;LOCALLY_MODIFIED_AND_STALE&quot;
UP_TO_DATE | &quot;UP_TO_DATE&quot;
SYNC_FAILURE | &quot;SYNC_FAILURE&quot;
