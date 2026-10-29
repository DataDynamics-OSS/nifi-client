# NodeStatusSnapshotsDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **String** | The node&#x27;s host/ip address. |  [optional]
**apiPort** | **Integer** | The port the node is listening for API requests. |  [optional]
**nodeId** | **String** | The id of the node. |  [optional]
**statusSnapshots** | [**List&lt;StatusSnapshotDTO&gt;**](StatusSnapshotDTO.md) | A list of StatusSnapshotDTO objects that provide the actual metric values for the component for this node. |  [optional]
