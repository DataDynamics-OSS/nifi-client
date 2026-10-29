# ConnectionStatisticsDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The ID of the connection | [optional] 
**stats_last_refreshed** | **str** | The timestamp of when the stats were last refreshed | [optional] 
**aggregate_snapshot** | [**ConnectionStatisticsSnapshotDTO**](ConnectionStatisticsSnapshotDTO.md) | The status snapshot that represents the aggregate stats of the cluster | [optional] 
**node_snapshots** | [**list[NodeConnectionStatisticsSnapshotDTO]**](NodeConnectionStatisticsSnapshotDTO.md) | A list of status snapshots for each node | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


