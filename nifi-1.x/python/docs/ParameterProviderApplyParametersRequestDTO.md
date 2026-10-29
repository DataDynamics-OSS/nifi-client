# ParameterProviderApplyParametersRequestDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | The ID of the request | [optional] 
**uri** | **str** | The URI for the request | [optional] 
**submission_time** | **datetime** | The timestamp of when the request was submitted | [optional] 
**last_updated** | **datetime** | The timestamp of when the request was last updated | [optional] 
**complete** | **bool** | Whether or not the request is completed | [optional] 
**failure_reason** | **str** | The reason for the request failing, or null if the request has not failed | [optional] 
**percent_completed** | **int** | A value between 0 and 100 (inclusive) indicating how close the request is to completion | [optional] 
**state** | **str** | A description of the current state of the request | [optional] 
**update_steps** | [**list[ParameterProviderApplyParametersUpdateStepDTO]**](ParameterProviderApplyParametersUpdateStepDTO.md) | The steps that are required in order to complete the request, along with the status of each | [optional] 
**parameter_provider** | [**ParameterProviderDTO**](ParameterProviderDTO.md) | The Parameter Provider that is being operated on. This may not be populated until the request has successfully completed. | [optional] 
**parameter_context_updates** | [**list[ParameterContextUpdateEntity]**](ParameterContextUpdateEntity.md) | The Parameter Contexts updated by this Parameter Provider. This may not be populated until the request has successfully completed. | [optional] 
**referencing_components** | [**list[AffectedComponentEntity]**](AffectedComponentEntity.md) | The components that are referenced by the update. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


