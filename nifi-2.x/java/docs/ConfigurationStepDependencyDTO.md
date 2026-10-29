# ConfigurationStepDependencyDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dependentValues** | **List&lt;String&gt;** | The values of the dependent property that satisfy this dependency. If null, any non-null value satisfies the dependency. |  [optional]
**propertyName** | **String** | The name of the property within the dependent step that must have a value. |  [optional]
**stepName** | **String** | The name of the configuration step that this step depends on. |  [optional]
