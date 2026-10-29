# ConnectorStatusDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregateSnapshot** | [**ConnectorStatusSnapshotDTO**](ConnectorStatusSnapshotDTO.md) |  |  [optional]
**groupId** | **String** | The id of the group this connector belongs to. |  [optional]
**id** | **String** | The id of the connector. |  [optional]
**name** | **String** | The name of the connector. |  [optional]
**nodeSnapshots** | [**List&lt;NodeConnectorStatusSnapshotDTO&gt;**](NodeConnectorStatusSnapshotDTO.md) | A status snapshot for each node in the cluster. If the NiFi instance is a standalone instance, rather than a cluster, this may be null. |  [optional]
**runStatus** | **String** | The run status of the connector. |  [optional]
**statsLastRefreshed** | **String** | The timestamp of when the stats were last refreshed. |  [optional]
**type** | **String** | The type of the connector. |  [optional]
**validationStatus** | [**ValidationStatusEnum**](#ValidationStatusEnum) | The validation status of the connector. |  [optional]

<a name="ValidationStatusEnum"></a>
## Enum: ValidationStatusEnum
Name | Value
---- | -----
VALID | &quot;VALID&quot;
INVALID | &quot;INVALID&quot;
VALIDATING | &quot;VALIDATING&quot;
