# ConnectionStatusSnapshotDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bytesIn** | **Long** | The size of the FlowFiles that have come into the connection in the last 5 minutes. |  [optional]
**bytesOut** | **Long** | The number of bytes that have left the connection in the last 5 minutes. |  [optional]
**bytesQueued** | **Long** | The size of the FlowFiles that are currently queued in the connection. |  [optional]
**destinationId** | **String** | The id of the destination of the connection. |  [optional]
**destinationName** | **String** | The name of the destination of the connection. |  [optional]
**flowFileAvailability** | **String** | The availability of FlowFiles in this connection |  [optional]
**flowFilesIn** | **Integer** | The number of FlowFiles that have come into the connection in the last 5 minutes. |  [optional]
**flowFilesOut** | **Integer** | The number of FlowFiles that have left the connection in the last 5 minutes. |  [optional]
**flowFilesQueued** | **Integer** | The number of FlowFiles that are currently queued in the connection. |  [optional]
**groupId** | **String** | The id of the process group the connection belongs to. |  [optional]
**id** | **String** | The id of the connection. |  [optional]
**input** | **String** | The input count/size for the connection in the last 5 minutes, pretty printed. |  [optional]
**loadBalanceStatus** | [**LoadBalanceStatusEnum**](#LoadBalanceStatusEnum) | The load balance status of the connection |  [optional]
**name** | **String** | The name of the connection. |  [optional]
**output** | **String** | The output count/size for the connection in the last 5 minutes, pretty printed. |  [optional]
**percentUseBytes** | **Integer** | Connection percent use regarding queued FlowFiles size and backpressure threshold if configured. |  [optional]
**percentUseCount** | **Integer** | Connection percent use regarding queued FlowFiles count and backpressure threshold if configured. |  [optional]
**predictions** | [**ConnectionStatusPredictionsSnapshotDTO**](ConnectionStatusPredictionsSnapshotDTO.md) |  |  [optional]
**queued** | **String** | The total count and size of queued FlowFiles formatted. |  [optional]
**queuedCount** | **String** | The number of FlowFiles that are queued, pretty printed. |  [optional]
**queuedSize** | **String** | The total size of FlowFiles that are queued formatted. |  [optional]
**sourceId** | **String** | The id of the source of the connection. |  [optional]
**sourceName** | **String** | The name of the source of the connection. |  [optional]

<a name="LoadBalanceStatusEnum"></a>
## Enum: LoadBalanceStatusEnum
Name | Value
---- | -----
NOT_CONFIGURED | &quot;LOAD_BALANCE_NOT_CONFIGURED&quot;
ACTIVE | &quot;LOAD_BALANCE_ACTIVE&quot;
INACTIVE | &quot;LOAD_BALANCE_INACTIVE&quot;
