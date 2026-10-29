# ParameterContextUpdateRequestDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**complete** | **Boolean** | Whether or not the request is completed |  [optional]
**failureReason** | **String** | The reason for the request failing, or null if the request has not failed |  [optional]
**lastUpdated** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp of when the request was last updated |  [optional]
**parameterContext** | [**ParameterContextDTO**](ParameterContextDTO.md) |  |  [optional]
**percentCompleted** | **Integer** | A value between 0 and 100 (inclusive) indicating how close the request is to completion |  [optional]
**referencingComponents** | [**List&lt;AffectedComponentEntity&gt;**](AffectedComponentEntity.md) | The components that are referenced by the update. |  [optional]
**requestId** | **String** | The ID of the request |  [optional]
**state** | **String** | A description of the current state of the request |  [optional]
**submissionTime** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp of when the request was submitted |  [optional]
**updateSteps** | [**List&lt;ParameterContextUpdateStepDTO&gt;**](ParameterContextUpdateStepDTO.md) | The steps that are required in order to complete the request, along with the status of each |  [optional]
**uri** | **String** | The URI for the request |  [optional]
