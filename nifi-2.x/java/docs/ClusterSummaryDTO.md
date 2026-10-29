# ClusterSummaryDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clustered** | **Boolean** | Whether this NiFi instance is clustered. |  [optional]
**connectedNodeCount** | **Integer** | The number of nodes that are currently connected to the cluster |  [optional]
**connectedNodes** | **String** | When clustered, reports the number of nodes connected vs the number of nodes in the cluster. |  [optional]
**connectedToCluster** | **Boolean** | Whether this NiFi instance is connected to a cluster. |  [optional]
**totalNodeCount** | **Integer** | The number of nodes in the cluster, regardless of whether or not they are connected |  [optional]
