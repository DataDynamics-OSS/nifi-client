# ConnectionDiagnosticsDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**connection** | [**ConnectionDTO**](ConnectionDTO.md) | Details about the connection | [optional] 
**aggregate_snapshot** | [**ConnectionDiagnosticsSnapshotDTO**](ConnectionDiagnosticsSnapshotDTO.md) | Aggregate values for all nodes in the cluster, or for this instance if not clustered | [optional] 
**node_snapshots** | [**list[ConnectionDiagnosticsSnapshotDTO]**](ConnectionDiagnosticsSnapshotDTO.md) | A list of values for each node in the cluster, if clustered. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


