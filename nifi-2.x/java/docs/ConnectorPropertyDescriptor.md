# ConnectorPropertyDescriptor

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowableValues** | [**List&lt;PropertyAllowableValue&gt;**](PropertyAllowableValue.md) | The allowable values for this property |  [optional]
**allowableValuesFetchable** | **Boolean** | Whether or not the allowable values can be fetched dynamically |  [optional]
**defaultValue** | **String** | The default value of the property |  [optional]
**dependencies** | [**List&lt;ConnectorPropertyDependency&gt;**](ConnectorPropertyDependency.md) | The properties that this property depends on |  [optional]
**description** | **String** | The description of the property |  [optional]
**name** | **String** | The name of the property |  [optional]
**propertyType** | [**PropertyTypeEnum**](#PropertyTypeEnum) | The type of the property |  [optional]
**required** | **Boolean** | Whether or not the property is required |  [optional]

<a name="PropertyTypeEnum"></a>
## Enum: PropertyTypeEnum
Name | Value
---- | -----
STRING | &quot;STRING&quot;
INTEGER | &quot;INTEGER&quot;
BOOLEAN | &quot;BOOLEAN&quot;
FLOAT | &quot;FLOAT&quot;
DOUBLE | &quot;DOUBLE&quot;
STRING_LIST | &quot;STRING_LIST&quot;
SECRET | &quot;SECRET&quot;
ASSET | &quot;ASSET&quot;
ASSET_LIST | &quot;ASSET_LIST&quot;
