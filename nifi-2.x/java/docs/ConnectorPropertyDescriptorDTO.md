# ConnectorPropertyDescriptorDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowableValues** | [**List&lt;AllowableValueEntity&gt;**](AllowableValueEntity.md) | Allowable values for the property. If empty then the allowed values are not constrained. |  [optional]
**allowableValuesFetchable** | **Boolean** | Whether the allowable values are dynamically fetchable based on other property values. |  [optional]
**defaultValue** | **String** | The default value for the property. |  [optional]
**dependencies** | [**List&lt;ConnectorPropertyDependencyDTO&gt;**](ConnectorPropertyDependencyDTO.md) | The dependencies this property has on other properties. |  [optional]
**description** | **String** | The description of the property. |  [optional]
**name** | **String** | The name of the property. |  [optional]
**required** | **Boolean** | Whether the property is required. |  [optional]
**type** | **String** | The type of the property (STRING, INTEGER, BOOLEAN, DOUBLE, STRING_LIST). |  [optional]
