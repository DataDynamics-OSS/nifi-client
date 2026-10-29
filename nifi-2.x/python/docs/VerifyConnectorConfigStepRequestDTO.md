# VerifyConnectorConfigStepRequestDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**complete** | **bool** | Whether or not the request is completed | [optional] 
**configuration_step** | [**ConfigurationStepConfigurationDTO**](ConfigurationStepConfigurationDTO.md) |  | [optional] 
**configuration_step_name** | **str** | The name of the configuration step being verified | [optional] 
**connector_id** | **str** | The ID of the connector whose configuration step is being verified | [optional] 
**failure_reason** | **str** | The reason for the request failing, or null if the request has not failed | [optional] 
**last_updated** | **datetime** | The timestamp of when the request was last updated | [optional] 
**percent_completed** | **int** | A value between 0 and 100 (inclusive) indicating how close the request is to completion | [optional] 
**request_id** | **str** | The ID of the request | [optional] 
**results** | [**list[ConfigVerificationResultDTO]**](ConfigVerificationResultDTO.md) | The results of the verification | [optional] 
**state** | **str** | A description of the current state of the request | [optional] 
**submission_time** | **datetime** | The timestamp of when the request was submitted | [optional] 
**update_steps** | [**list[VerifyConfigUpdateStepDTO]**](VerifyConfigUpdateStepDTO.md) | The steps that are required in order to complete the request, along with the status of each | [optional] 
**uri** | **str** | The URI for the request | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

