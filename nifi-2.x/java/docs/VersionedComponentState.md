# VersionedComponentState

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clusterState** | **Map&lt;String, String&gt;** | The cluster-scoped state of the component, or null if not exported |  [optional]
**localNodeStates** | [**List&lt;VersionedNodeState&gt;**](VersionedNodeState.md) | The local-scoped state of the component ordered by node ordinal index, or null if not exported |  [optional]
