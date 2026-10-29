# FlowFileDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **Map&lt;String, String&gt;** | The FlowFile attributes. |  [optional]
**clusterNodeAddress** | **String** | The label for the node where this FlowFile resides. |  [optional]
**clusterNodeId** | **String** | The id of the node where this FlowFile resides. |  [optional]
**contentClaimContainer** | **String** | The container in which the content claim lives. |  [optional]
**contentClaimFileSize** | **String** | The file size of the content claim formatted. |  [optional]
**contentClaimFileSizeBytes** | **Long** | The file size of the content claim in bytes. |  [optional]
**contentClaimIdentifier** | **String** | The identifier of the content claim. |  [optional]
**contentClaimOffset** | **Long** | The offset into the content claim where the flowfile&#x27;s content begins. |  [optional]
**contentClaimSection** | **String** | The section in which the content claim lives. |  [optional]
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
