# ParameterDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | The description of the Parameter | [optional] 
**inherited** | **bool** | Whether or not the Parameter is inherited from another context | [optional] 
**name** | **str** | The name of the Parameter | [optional] 
**parameter_context** | [**ParameterContextReferenceEntity**](ParameterContextReferenceEntity.md) |  | [optional] 
**provided** | **bool** | Whether or not the Parameter is provided by a ParameterProvider | [optional] 
**referenced_assets** | [**list[AssetReferenceDTO]**](AssetReferenceDTO.md) | A list of identifiers of the assets that are referenced by the parameter | [optional] 
**referencing_components** | [**list[AffectedComponentEntity]**](AffectedComponentEntity.md) | The set of all components in the flow that are referencing this Parameter | [optional] 
**sensitive** | **bool** | Whether or not the Parameter is sensitive | [optional] 
**value** | **str** | The value of the Parameter | [optional] 
**value_removed** | **bool** | Whether or not the value of the Parameter was removed. When a request is made to change a parameter, the value may be null. The absence of the value may be used either to indicate that the value is not to be changed, or that the value is to be set to null (i.e., removed). This denotes which of the two scenarios is being encountered.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

