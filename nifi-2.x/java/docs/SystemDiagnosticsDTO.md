# SystemDiagnosticsDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregateSnapshot** | [**SystemDiagnosticsSnapshotDTO**](SystemDiagnosticsSnapshotDTO.md) |  |  [optional]
**nodeSnapshots** | [**List&lt;NodeSystemDiagnosticsSnapshotDTO&gt;**](NodeSystemDiagnosticsSnapshotDTO.md) | A systems diagnostics snapshot for each node in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this may be null. |  [optional]
