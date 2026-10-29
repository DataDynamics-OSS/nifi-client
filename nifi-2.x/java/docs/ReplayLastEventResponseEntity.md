# ReplayLastEventResponseEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregateSnapshot** | [**ReplayLastEventSnapshotDTO**](ReplayLastEventSnapshotDTO.md) |  |  [optional]
**componentId** | **String** | The UUID of the component whose last event should be replayed. |  [optional]
**nodeSnapshots** | [**List&lt;NodeReplayLastEventSnapshotDTO&gt;**](NodeReplayLastEventSnapshotDTO.md) | The node-wise results |  [optional]
**nodes** | [**NodesEnum**](#NodesEnum) | Which nodes were requested to replay their last provenance event. |  [optional]

<a name="NodesEnum"></a>
## Enum: NodesEnum
Name | Value
---- | -----
ALL | &quot;ALL&quot;
PRIMARY | &quot;PRIMARY&quot;
