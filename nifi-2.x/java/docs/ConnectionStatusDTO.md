# ConnectionStatusDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregateSnapshot** | [**ConnectionStatusSnapshotDTO**](ConnectionStatusSnapshotDTO.md) |  |  [optional]
**destinationId** | **String** | The ID of the destination component |  [optional]
**destinationName** | **String** | The name of the destination component |  [optional]
**groupId** | **String** | The ID of the Process Group that the connection belongs to |  [optional]
**id** | **String** | The ID of the connection |  [optional]
**name** | **String** | The name of the connection |  [optional]
**nodeSnapshots** | [**List&lt;NodeConnectionStatusSnapshotDTO&gt;**](NodeConnectionStatusSnapshotDTO.md) | A list of status snapshots for each node |  [optional]
**sourceId** | **String** | The ID of the source component |  [optional]
**sourceName** | **String** | The name of the source component |  [optional]
**statsLastRefreshed** | **String** | The timestamp of when the stats were last refreshed |  [optional]
