# ProcessorStatusDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregateSnapshot** | [**ProcessorStatusSnapshotDTO**](ProcessorStatusSnapshotDTO.md) |  |  [optional]
**groupId** | **String** | The unique ID of the process group that the Processor belongs to |  [optional]
**id** | **String** | The unique ID of the Processor |  [optional]
**name** | **String** | The name of the Processor |  [optional]
**nodeSnapshots** | [**List&lt;NodeProcessorStatusSnapshotDTO&gt;**](NodeProcessorStatusSnapshotDTO.md) | A status snapshot for each node in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this may be null. |  [optional]
**runStatus** | [**RunStatusEnum**](#RunStatusEnum) | The run status of the Processor |  [optional]
**statsLastRefreshed** | **String** | The timestamp of when the stats were last refreshed |  [optional]
**type** | **String** | The type of the Processor |  [optional]

<a name="RunStatusEnum"></a>
## Enum: RunStatusEnum
Name | Value
---- | -----
RUNNING | &quot;Running&quot;
STOPPED | &quot;Stopped&quot;
VALIDATING | &quot;Validating&quot;
DISABLED | &quot;Disabled&quot;
INVALID | &quot;Invalid&quot;
