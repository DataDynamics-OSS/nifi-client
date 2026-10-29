# PropertyDescriptor

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowableValues** | [**List&lt;PropertyAllowableValue&gt;**](PropertyAllowableValue.md) | A list of the allowable values for the property |  [optional]
**defaultValue** | **String** | The default value if a user-set value is not specified |  [optional]
**dependencies** | [**List&lt;PropertyDependency&gt;**](PropertyDependency.md) | The dependencies that this property has on other properties |  [optional]
**description** | **String** | The description of what the property does |  [optional]
**displayName** | **String** | The display name of the property key, if different from the name |  [optional]
**dynamic** | **Boolean** | Whether or not the descriptor is for a dynamically added property |  [optional]
**expressionLanguageScope** | [**ExpressionLanguageScopeEnum**](#ExpressionLanguageScopeEnum) | The scope of expression language supported by this property |  [optional]
**expressionLanguageScopeDescription** | **String** | The description of the expression language scope supported by this property |  [optional]
**listenPortDefinition** | [**PropertyListenPortDefinition**](PropertyListenPortDefinition.md) |  |  [optional]
**name** | **String** | The name of the property key |  [optional]
**required** | **Boolean** | Whether or not  the property is required for the component |  [optional]
**resourceDefinition** | [**PropertyResourceDefinition**](PropertyResourceDefinition.md) |  |  [optional]
**sensitive** | **Boolean** | Whether or not  the value of the property is considered sensitive (e.g., passwords and keys) |  [optional]
**typeProvidedByValue** | [**DefinedType**](DefinedType.md) |  |  [optional]
**validRegex** | **String** | A regular expression that can be used to validate the value of this property |  [optional]
**validator** | **String** | Name of the validator used for this property descriptor |  [optional]

<a name="ExpressionLanguageScopeEnum"></a>
## Enum: ExpressionLanguageScopeEnum
Name | Value
---- | -----
NONE | &quot;NONE&quot;
ENVIRONMENT | &quot;ENVIRONMENT&quot;
FLOWFILE_ATTRIBUTES | &quot;FLOWFILE_ATTRIBUTES&quot;
