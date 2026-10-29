# VerifyConnectorConfigStepRequestDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**complete** | **Boolean** | Whether or not the request is completed |  [optional]
**configurationStep** | [**ConfigurationStepConfigurationDTO**](ConfigurationStepConfigurationDTO.md) |  |  [optional]
**configurationStepName** | **String** | The name of the configuration step being verified |  [optional]
**connectorId** | **String** | The ID of the connector whose configuration step is being verified |  [optional]
**failureReason** | **String** | The reason for the request failing, or null if the request has not failed |  [optional]
**lastUpdated** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp of when the request was last updated |  [optional]
**percentCompleted** | **Integer** | A value between 0 and 100 (inclusive) indicating how close the request is to completion |  [optional]
**requestId** | **String** | The ID of the request |  [optional]
**results** | [**List&lt;ConfigVerificationResultDTO&gt;**](ConfigVerificationResultDTO.md) | The results of the verification |  [optional]
**state** | **String** | A description of the current state of the request |  [optional]
**submissionTime** | [**OffsetDateTime**](OffsetDateTime.md) | The timestamp of when the request was submitted |  [optional]
**updateSteps** | [**List&lt;VerifyConfigUpdateStepDTO&gt;**](VerifyConfigUpdateStepDTO.md) | The steps that are required in order to complete the request, along with the status of each |  [optional]
**uri** | **String** | The URI for the request |  [optional]
