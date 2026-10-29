# ParameterGroupConfigurationEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**group_name** | **str** | The name of the external parameter group to which the provided parameter names apply. | [optional] 
**parameter_context_name** | **str** | The name of the ParameterContext that receives the parameters in this group | [optional] 
**parameter_sensitivities** | **dict(str, str)** | All fetched parameter names that should be applied. | [optional] 
**synchronized** | **bool** | True if this group should be synchronized to a ParameterContext, including creating one if it does not exist. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


