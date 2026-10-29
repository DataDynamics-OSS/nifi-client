# ConfigVerificationResultDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**explanation** | **String** | An explanation of why the step was or was not successful |  [optional]
**outcome** | [**OutcomeEnum**](#OutcomeEnum) | The outcome of the verification |  [optional]
**subject** | **String** | The subject of the verification step |  [optional]
**verificationStepName** | **String** | The name of the verification step |  [optional]

<a name="OutcomeEnum"></a>
## Enum: OutcomeEnum
Name | Value
---- | -----
SUCCESSFUL | &quot;SUCCESSFUL&quot;
FAILED | &quot;FAILED&quot;
SKIPPED | &quot;SKIPPED&quot;
