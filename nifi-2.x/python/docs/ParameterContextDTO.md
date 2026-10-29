# ParameterContextDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bound_process_groups** | [**list[ProcessGroupEntity]**](ProcessGroupEntity.md) | The Process Groups that are bound to this Parameter Context | [optional] 
**description** | **str** | The Description of the Parameter Context. | [optional] 
**id** | **str** | The ID the Parameter Context. | [optional] 
**inherited_parameter_contexts** | [**list[ParameterContextReferenceEntity]**](ParameterContextReferenceEntity.md) | A list of references of Parameter Contexts from which this one inherits parameters | [optional] 
**name** | **str** | The Name of the Parameter Context. | [optional] 
**parameter_provider_configuration** | [**ParameterProviderConfigurationEntity**](ParameterProviderConfigurationEntity.md) |  | [optional] 
**parameters** | [**list[ParameterEntity]**](ParameterEntity.md) | The Parameters for the Parameter Context | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

