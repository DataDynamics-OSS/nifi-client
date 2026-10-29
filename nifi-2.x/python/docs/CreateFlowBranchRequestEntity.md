# CreateFlowBranchRequestEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**branch** | **str** | The name of the new branch to create | [optional] 
**disconnected_node_acknowledged** | **bool** | Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] 
**process_group_revision** | [**RevisionDTO**](RevisionDTO.md) |  | [optional] 
**source_branch** | **str** | The name of the source branch to create the new branch from. Defaults to the branch currently tracking in NiFi. | [optional] 
**source_version** | **str** | The version on the source branch to use when creating the new branch. Defaults to the version currently tracked by NiFi. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

