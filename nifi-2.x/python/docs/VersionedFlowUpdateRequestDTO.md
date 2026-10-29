# VersionedFlowUpdateRequestDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**complete** | **bool** | Whether or not this request has completed | [optional] 
**failure_reason** | **str** | An explanation of why this request failed, or null if this request has not failed | [optional] 
**last_updated** | **str** | The last time this request was updated. | [optional] 
**percent_completed** | **int** | The percentage complete for the request, between 0 and 100 | [optional] 
**process_group_id** | **str** | The unique ID of the Process Group being updated | [optional] 
**request_id** | **str** | The unique ID of this request. | [optional] 
**state** | **str** | The state of the request | [optional] 
**uri** | **str** | The URI for future requests to this drop request. | [optional] 
**version_control_information** | [**VersionControlInformationDTO**](VersionControlInformationDTO.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

