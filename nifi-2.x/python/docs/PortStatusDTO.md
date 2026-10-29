# PortStatusDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregate_snapshot** | [**PortStatusSnapshotDTO**](PortStatusSnapshotDTO.md) |  | [optional] 
**group_id** | **str** | The id of the parent process group of the port. | [optional] 
**id** | **str** | The id of the port. | [optional] 
**name** | **str** | The name of the port. | [optional] 
**node_snapshots** | [**list[NodePortStatusSnapshotDTO]**](NodePortStatusSnapshotDTO.md) | A status snapshot for each node in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this may be null. | [optional] 
**run_status** | **str** | The run status of the port. | [optional] 
**stats_last_refreshed** | **str** | The time the status for the process group was last refreshed. | [optional] 
**transmitting** | **bool** | Whether the port has incoming or outgoing connections to a remote NiFi. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

