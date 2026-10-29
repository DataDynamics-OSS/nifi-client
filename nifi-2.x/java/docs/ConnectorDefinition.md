# ConnectorDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalDetails** | **Boolean** | Indicates if the component has additional details documentation |  [optional]
**artifact** | **String** | The artifact name of the bundle that provides the referenced type. |  [optional]
**buildInfo** | [**BuildInfo**](BuildInfo.md) |  |  [optional]
**configurationSteps** | [**List&lt;ConfigurationStep&gt;**](ConfigurationStep.md) | The configuration steps for this connector |  [optional]
**deprecated** | **Boolean** | Whether or not the component has been deprecated |  [optional]
**deprecationAlternatives** | **List&lt;String&gt;** | If this component has been deprecated, this optional field provides alternatives to use |  [optional]
**deprecationReason** | **String** | If this component has been deprecated, this optional field can be used to provide an explanation |  [optional]
**explicitRestrictions** | [**List&lt;Restriction&gt;**](Restriction.md) | Explicit restrictions that indicate a require permission to use the component |  [optional]
**group** | **String** | The group name of the bundle that provides the referenced type. |  [optional]
**providedApiImplementations** | [**List&lt;DefinedType&gt;**](DefinedType.md) | If this type represents a provider for an interface, this lists the APIs it implements |  [optional]
**restricted** | **Boolean** | Whether or not the component has a general restriction |  [optional]
**restrictedExplanation** | **String** | An optional description of the general restriction |  [optional]
**seeAlso** | **List&lt;String&gt;** | The names of other component types that may be related |  [optional]
**stateful** | [**Stateful**](Stateful.md) |  |  [optional]
**systemResourceConsiderations** | [**List&lt;SystemResourceConsideration&gt;**](SystemResourceConsideration.md) | The system resource considerations for the given component |  [optional]
**tags** | **List&lt;String&gt;** | The tags associated with this type |  [optional]
**type** | **String** | The fully-qualified class type |  [optional]
**typeDescription** | **String** | The description of the type. |  [optional]
**version** | **String** | The version of the bundle that provides the referenced type. |  [optional]
