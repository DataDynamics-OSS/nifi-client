# ProcessGroupStatusDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregate_snapshot** | [**ProcessGroupStatusSnapshotDTO**](ProcessGroupStatusSnapshotDTO.md) |  | [optional] 
**id** | **str** | The ID of the Process Group | [optional] 
**name** | **str** | The name of the Process Group | [optional] 
**node_snapshots** | [**list[NodeProcessGroupStatusSnapshotDTO]**](NodeProcessGroupStatusSnapshotDTO.md) | The status reported by each node in the cluster. If the NiFi instance is a standalone instance, rather than a clustered instance, this value may be null. | [optional] 
**stats_last_refreshed** | **str** | The time the status for the process group was last refreshed. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

