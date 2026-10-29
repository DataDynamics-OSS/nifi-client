# FlowFileSummaryDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clusterNodeAddress** | **String** | The label for the node where this FlowFile resides. |  [optional]
**clusterNodeId** | **String** | The id of the node where this FlowFile resides. |  [optional]
**filename** | **String** | The FlowFile filename. |  [optional]
**lineageDuration** | **Long** | Duration since the FlowFile&#x27;s greatest ancestor entered the flow. |  [optional]
**mimeType** | **String** | The FlowFile mime type. |  [optional]
**penalized** | **Boolean** | If the FlowFile is penalized. |  [optional]
**penaltyExpiresIn** | **Long** | How long in milliseconds until the FlowFile penalty expires. |  [optional]
**position** | **Integer** | The FlowFile&#x27;s position in the queue. |  [optional]
**queuedDuration** | **Long** | How long this FlowFile has been enqueued. |  [optional]
**size** | **Long** | The FlowFile file size. |  [optional]
**uri** | **String** | The URI that can be used to access this FlowFile. |  [optional]
**uuid** | **String** | The FlowFile UUID. |  [optional]
