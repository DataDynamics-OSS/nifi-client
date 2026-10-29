# ConnectorPropertyDescriptorDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowable_values** | [**list[AllowableValueEntity]**](AllowableValueEntity.md) | Allowable values for the property. If empty then the allowed values are not constrained. | [optional] 
**allowable_values_fetchable** | **bool** | Whether the allowable values are dynamically fetchable based on other property values. | [optional] 
**default_value** | **str** | The default value for the property. | [optional] 
**dependencies** | [**list[ConnectorPropertyDependencyDTO]**](ConnectorPropertyDependencyDTO.md) | The dependencies this property has on other properties. | [optional] 
**description** | **str** | The description of the property. | [optional] 
**name** | **str** | The name of the property. | [optional] 
**required** | **bool** | Whether the property is required. | [optional] 
**type** | **str** | The type of the property (STRING, INTEGER, BOOLEAN, DOUBLE, STRING_LIST). | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

