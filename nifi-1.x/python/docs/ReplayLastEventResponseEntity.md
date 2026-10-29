# ReplayLastEventResponseEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component_id** | **str** | The UUID of the component whose last event should be replayed. | [optional] 
**nodes** | **str** | Which nodes were requested to replay their last provenance event. | [optional] 
**aggregate_snapshot** | [**ReplayLastEventSnapshotDTO**](ReplayLastEventSnapshotDTO.md) | The aggregate result of all nodes&#39; responses | [optional] 
**node_snapshots** | [**list[NodeReplayLastEventSnapshotDTO]**](NodeReplayLastEventSnapshotDTO.md) | The node-wise results | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


