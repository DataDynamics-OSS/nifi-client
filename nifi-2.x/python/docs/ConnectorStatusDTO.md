# ConnectorStatusDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregate_snapshot** | [**ConnectorStatusSnapshotDTO**](ConnectorStatusSnapshotDTO.md) |  | [optional] 
**group_id** | **str** | The id of the group this connector belongs to. | [optional] 
**id** | **str** | The id of the connector. | [optional] 
**name** | **str** | The name of the connector. | [optional] 
**node_snapshots** | [**list[NodeConnectorStatusSnapshotDTO]**](NodeConnectorStatusSnapshotDTO.md) | A status snapshot for each node in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this may be null. | [optional] 
**run_status** | **str** | The run status of the connector. | [optional] 
**stats_last_refreshed** | **str** | The timestamp of when the stats were last refreshed. | [optional] 
**type** | **str** | The type of the connector. | [optional] 
**validation_status** | **str** | The validation status of the connector. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

