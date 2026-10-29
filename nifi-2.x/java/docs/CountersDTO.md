# CountersDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregateSnapshot** | [**CountersSnapshotDTO**](CountersSnapshotDTO.md) |  |  [optional]
**nodeSnapshots** | [**List&lt;NodeCountersSnapshotDTO&gt;**](NodeCountersSnapshotDTO.md) | A Counters snapshot for each node in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this may be null. |  [optional]
