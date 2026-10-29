# RebaseAnalysisEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**analysis_fingerprint** | **str** | A fingerprint representing the state of this analysis, used to verify the analysis is still valid when executing the rebase | [optional] 
**current_version** | **str** | The current version of the flow in the Process Group | [optional] 
**failure_reason** | **str** | The reason the rebase is not allowed, or null if the rebase is allowed | [optional] 
**local_changes** | [**list[RebaseChangeDTO]**](RebaseChangeDTO.md) | The list of local changes that were made to the flow since the last version control operation | [optional] 
**process_group_id** | **str** | The ID of the Process Group being rebased | [optional] 
**rebase_allowed** | **bool** | Whether the rebase is allowed based on the analysis of local and upstream changes | [optional] 
**target_version** | **str** | The target version to rebase to | [optional] 
**upstream_changes** | [**list[ComponentDifferenceDTO]**](ComponentDifferenceDTO.md) | The set of upstream changes between the current version and the target version in the flow registry | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

