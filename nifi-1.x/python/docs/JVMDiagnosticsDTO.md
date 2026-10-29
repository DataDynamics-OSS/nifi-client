# JVMDiagnosticsDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clustered** | **bool** | Whether or not the NiFi instance is clustered | [optional] 
**connected** | **bool** | Whether or not the node is connected to the cluster | [optional] 
**aggregate_snapshot** | [**JVMDiagnosticsSnapshotDTO**](JVMDiagnosticsSnapshotDTO.md) | Aggregate JVM diagnostic information about the entire cluster | [optional] 
**node_snapshots** | [**list[NodeJVMDiagnosticsSnapshotDTO]**](NodeJVMDiagnosticsSnapshotDTO.md) | Node-wise breakdown of JVM diagnostic information | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


