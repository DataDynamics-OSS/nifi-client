# ConnectionStatusDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregate_snapshot** | [**ConnectionStatusSnapshotDTO**](ConnectionStatusSnapshotDTO.md) |  | [optional] 
**destination_id** | **str** | The ID of the destination component | [optional] 
**destination_name** | **str** | The name of the destination component | [optional] 
**group_id** | **str** | The ID of the Process Group that the connection belongs to | [optional] 
**id** | **str** | The ID of the connection | [optional] 
**name** | **str** | The name of the connection | [optional] 
**node_snapshots** | [**list[NodeConnectionStatusSnapshotDTO]**](NodeConnectionStatusSnapshotDTO.md) | A list of status snapshots for each node | [optional] 
**source_id** | **str** | The ID of the source component | [optional] 
**source_name** | **str** | The name of the source component | [optional] 
**stats_last_refreshed** | **str** | The timestamp of when the stats were last refreshed | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

