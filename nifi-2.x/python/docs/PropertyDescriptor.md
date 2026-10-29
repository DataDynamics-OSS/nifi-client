# PropertyDescriptor

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowable_values** | [**list[PropertyAllowableValue]**](PropertyAllowableValue.md) | A list of the allowable values for the property | [optional] 
**default_value** | **str** | The default value if a user-set value is not specified | [optional] 
**dependencies** | [**list[PropertyDependency]**](PropertyDependency.md) | The dependencies that this property has on other properties | [optional] 
**description** | **str** | The description of what the property does | [optional] 
**display_name** | **str** | The display name of the property key, if different from the name | [optional] 
**dynamic** | **bool** | Whether or not the descriptor is for a dynamically added property | [optional] 
**expression_language_scope** | **str** | The scope of expression language supported by this property | [optional] 
**expression_language_scope_description** | **str** | The description of the expression language scope supported by this property | [optional] 
**listen_port_definition** | [**PropertyListenPortDefinition**](PropertyListenPortDefinition.md) |  | [optional] 
**name** | **str** | The name of the property key | [optional] 
**required** | **bool** | Whether or not  the property is required for the component | [optional] 
**resource_definition** | [**PropertyResourceDefinition**](PropertyResourceDefinition.md) |  | [optional] 
**sensitive** | **bool** | Whether or not  the value of the property is considered sensitive (e.g., passwords and keys) | [optional] 
**type_provided_by_value** | [**DefinedType**](DefinedType.md) |  | [optional] 
**valid_regex** | **str** | A regular expression that can be used to validate the value of this property | [optional] 
**validator** | **str** | Name of the validator used for this property descriptor | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

