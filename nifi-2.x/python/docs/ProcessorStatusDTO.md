# ProcessorStatusDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregate_snapshot** | [**ProcessorStatusSnapshotDTO**](ProcessorStatusSnapshotDTO.md) |  | [optional] 
**group_id** | **str** | The unique ID of the process group that the Processor belongs to | [optional] 
**id** | **str** | The unique ID of the Processor | [optional] 
**name** | **str** | The name of the Processor | [optional] 
**node_snapshots** | [**list[NodeProcessorStatusSnapshotDTO]**](NodeProcessorStatusSnapshotDTO.md) | A status snapshot for each node in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this may be null. | [optional] 
**run_status** | **str** | The run status of the Processor | [optional] 
**stats_last_refreshed** | **str** | The timestamp of when the stats were last refreshed | [optional] 
**type** | **str** | The type of the Processor | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

