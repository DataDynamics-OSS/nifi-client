# RebaseAnalysisEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**analysisFingerprint** | **String** | A fingerprint representing the state of this analysis, used to verify the analysis is still valid when executing the rebase |  [optional]
**currentVersion** | **String** | The current version of the flow in the Process Group |  [optional]
**failureReason** | **String** | The reason the rebase is not allowed, or null if the rebase is allowed |  [optional]
**localChanges** | [**List&lt;RebaseChangeDTO&gt;**](RebaseChangeDTO.md) | The list of local changes that were made to the flow since the last version control operation |  [optional]
**processGroupId** | **String** | The ID of the Process Group being rebased |  [optional]
**rebaseAllowed** | **Boolean** | Whether the rebase is allowed based on the analysis of local and upstream changes |  [optional]
**targetVersion** | **String** | The target version to rebase to |  [optional]
**upstreamChanges** | [**List&lt;ComponentDifferenceDTO&gt;**](ComponentDifferenceDTO.md) | The set of upstream changes between the current version and the target version in the flow registry |  [optional]
