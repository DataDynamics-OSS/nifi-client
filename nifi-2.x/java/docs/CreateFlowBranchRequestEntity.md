# CreateFlowBranchRequestEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**branch** | **String** | The name of the new branch to create |  [optional]
**disconnectedNodeAcknowledged** | **Boolean** | Acknowledges that this node is disconnected to allow for mutable requests to proceed. |  [optional]
**processGroupRevision** | [**RevisionDTO**](RevisionDTO.md) |  |  [optional]
**sourceBranch** | **String** | The name of the source branch to create the new branch from. Defaults to the branch currently tracking in NiFi. |  [optional]
**sourceVersion** | **String** | The version on the source branch to use when creating the new branch. Defaults to the version currently tracked by NiFi. |  [optional]
