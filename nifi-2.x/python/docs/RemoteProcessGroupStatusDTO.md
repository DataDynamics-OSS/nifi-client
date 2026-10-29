# RemoteProcessGroupStatusDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregate_snapshot** | [**RemoteProcessGroupStatusSnapshotDTO**](RemoteProcessGroupStatusSnapshotDTO.md) |  | [optional] 
**group_id** | **str** | The unique ID of the process group that the Processor belongs to | [optional] 
**id** | **str** | The unique ID of the Processor | [optional] 
**name** | **str** | The name of the remote process group. | [optional] 
**node_snapshots** | [**list[NodeRemoteProcessGroupStatusSnapshotDTO]**](NodeRemoteProcessGroupStatusSnapshotDTO.md) | A status snapshot for each node in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this may be null. | [optional] 
**stats_last_refreshed** | **str** | The time the status for the process group was last refreshed. | [optional] 
**target_uri** | **str** | The URI of the target system. | [optional] 
**transmission_status** | **str** | The transmission status of the remote process group. | [optional] 
**validation_status** | **str** | Indicates whether the component is valid, invalid, or still in the process of validating (i.e., it is unknown whether or not the component is valid) | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

