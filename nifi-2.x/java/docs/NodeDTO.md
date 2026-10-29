# NodeDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeThreadCount** | **Integer** | The active threads for the NiFi on the node. |  [optional]
**address** | **String** | The node&#x27;s host/ip address. |  [optional]
**apiPort** | **Integer** | The port the node is listening for API requests. |  [optional]
**bytesQueued** | **Long** | The total size of all FlowFiles that are queued up on the node |  [optional]
**connectionRequested** | **String** | The time of the node&#x27;s last connection request. |  [optional]
**events** | [**List&lt;NodeEventDTO&gt;**](NodeEventDTO.md) | The node&#x27;s events. |  [optional]
**flowFileBytes** | **Long** |  |  [optional]
**flowFilesQueued** | **Integer** | The number of FlowFiles that are queued up on the node |  [optional]
**heartbeat** | **String** | the time of the nodes&#x27;s last heartbeat. |  [optional]
**nodeId** | **String** | The id of the node. |  [optional]
**nodeStartTime** | **String** | The time at which this Node was last refreshed. |  [optional]
**queued** | **String** | The queue the NiFi on the node. |  [optional]
**roles** | **List&lt;String&gt;** | The roles of this node. |  [optional]
**status** | **String** | The node&#x27;s status. |  [optional]
