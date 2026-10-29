# ParameterDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | The description of the Parameter |  [optional]
**inherited** | **Boolean** | Whether or not the Parameter is inherited from another context |  [optional]
**name** | **String** | The name of the Parameter |  [optional]
**parameterContext** | [**ParameterContextReferenceEntity**](ParameterContextReferenceEntity.md) |  |  [optional]
**provided** | **Boolean** | Whether or not the Parameter is provided by a ParameterProvider |  [optional]
**referencedAssets** | [**List&lt;AssetReferenceDTO&gt;**](AssetReferenceDTO.md) | A list of identifiers of the assets that are referenced by the parameter |  [optional]
**referencingComponents** | [**List&lt;AffectedComponentEntity&gt;**](AffectedComponentEntity.md) | The set of all components in the flow that are referencing this Parameter |  [optional]
**sensitive** | **Boolean** | Whether or not the Parameter is sensitive |  [optional]
**value** | **String** | The value of the Parameter |  [optional]
**valueRemoved** | **Boolean** | Whether or not the value of the Parameter was removed. When a request is made to change a parameter, the value may be null. The absence of the value may be used either to indicate that the value is not to be changed, or that the value is to be set to null (i.e., removed). This denotes which of the two scenarios is being encountered.  |  [optional]
