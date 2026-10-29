# ProcessorDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalDetails** | **Boolean** | Indicates if the component has additional details documentation |  [optional]
**artifact** | **String** | The artifact name of the bundle that provides the referenced type. |  [optional]
**buildInfo** | [**BuildInfo**](BuildInfo.md) |  |  [optional]
**defaultBulletinLevel** | **String** | The default bulletin level, such as WARN, INFO, DEBUG, etc. |  [optional]
**defaultConcurrentTasksBySchedulingStrategy** | **Map&lt;String, Integer&gt;** | The default concurrent tasks for each scheduling strategy. |  [optional]
**defaultPenaltyDuration** | **String** | The default penalty duration as a time period, such as \&quot;30 sec\&quot;. |  [optional]
**defaultSchedulingPeriodBySchedulingStrategy** | **Map&lt;String, String&gt;** | The default scheduling period for each scheduling strategy. The scheduling period is expected to be a time period, such as \&quot;30 sec\&quot;. |  [optional]
**defaultSchedulingStrategy** | **String** | The default scheduling strategy for the processor. |  [optional]
**defaultYieldDuration** | **String** | The default yield duration as a time period, such as \&quot;1 sec\&quot;. |  [optional]
**deprecated** | **Boolean** | Whether or not the component has been deprecated |  [optional]
**deprecationAlternatives** | **List&lt;String&gt;** | If this component has been deprecated, this optional field provides alternatives to use |  [optional]
**deprecationReason** | **String** | If this component has been deprecated, this optional field can be used to provide an explanation |  [optional]
**dynamicProperties** | [**List&lt;DynamicProperty&gt;**](DynamicProperty.md) | Describes the dynamic properties supported by this component |  [optional]
**dynamicRelationship** | [**DynamicRelationship**](DynamicRelationship.md) |  |  [optional]
**explicitRestrictions** | [**List&lt;Restriction&gt;**](Restriction.md) | Explicit restrictions that indicate a require permission to use the component |  [optional]
**group** | **String** | The group name of the bundle that provides the referenced type. |  [optional]
**inputRequirement** | [**InputRequirementEnum**](#InputRequirementEnum) | Any input requirements this processor has. |  [optional]
**multiProcessorUseCases** | [**List&lt;MultiProcessorUseCase&gt;**](MultiProcessorUseCase.md) | A list of use cases that have been documented that involve this Processor in conjunction with other Processors |  [optional]
**primaryNodeOnly** | **Boolean** | Whether or not this processor should be scheduled only on the primary node in a cluster. |  [optional]
**propertyDescriptors** | [**Map&lt;String, PropertyDescriptor&gt;**](PropertyDescriptor.md) | Descriptions of configuration properties applicable to this component. |  [optional]
**providedApiImplementations** | [**List&lt;DefinedType&gt;**](DefinedType.md) | If this type represents a provider for an interface, this lists the APIs it implements |  [optional]
**readsAttributes** | [**List&lt;Attribute&gt;**](Attribute.md) | The FlowFile attributes this processor reads |  [optional]
**restricted** | **Boolean** | Whether or not the component has a general restriction |  [optional]
**restrictedExplanation** | **String** | An optional description of the general restriction |  [optional]
**seeAlso** | **List&lt;String&gt;** | The names of other component types that may be related |  [optional]
**sideEffectFree** | **Boolean** | Whether or not this processor is considered side-effect free. Side-effect free indicate that the processor&#x27;s operations on FlowFiles can be safely repeated across process sessions. |  [optional]
**stateful** | [**Stateful**](Stateful.md) |  |  [optional]
**supportedRelationships** | [**List&lt;Relationship&gt;**](Relationship.md) | The supported relationships for this processor. |  [optional]
**supportedSchedulingStrategies** | **List&lt;String&gt;** | The supported scheduling strategies, such as TIME_DRIVER, CRON, or EVENT_DRIVEN. |  [optional]
**supportsBatching** | **Boolean** | Whether or not this processor supports batching. If a Processor uses this annotation, it allows the Framework to batch calls to session commits, as well as allowing the Framework to return the same session multiple times. |  [optional]
**supportsDynamicProperties** | **Boolean** | Whether or not this component makes use of dynamic (user-set) properties. |  [optional]
**supportsDynamicRelationships** | **Boolean** | Whether or not this processor supports dynamic relationships. |  [optional]
**supportsSensitiveDynamicProperties** | **Boolean** | Whether or not this component makes use of sensitive dynamic (user-set) properties. |  [optional]
**systemResourceConsiderations** | [**List&lt;SystemResourceConsideration&gt;**](SystemResourceConsideration.md) | The system resource considerations for the given component |  [optional]
**tags** | **List&lt;String&gt;** | The tags associated with this type |  [optional]
**triggerSerially** | **Boolean** | Whether or not this processor should be triggered serially (i.e. no concurrent execution). |  [optional]
**triggerWhenAnyDestinationAvailable** | **Boolean** | Whether or not this processor should be triggered when any destination queue has room. |  [optional]
**triggerWhenEmpty** | **Boolean** | Whether or not this processor should be triggered when incoming queues are empty. |  [optional]
**type** | **String** | The fully-qualified class type |  [optional]
**typeDescription** | **String** | The description of the type. |  [optional]
**useCases** | [**List&lt;UseCase&gt;**](UseCase.md) | A list of use cases that have been documented for this Processor |  [optional]
**version** | **String** | The version of the bundle that provides the referenced type. |  [optional]
**writesAttributes** | [**List&lt;Attribute&gt;**](Attribute.md) | The FlowFile attributes this processor writes/updates |  [optional]

<a name="InputRequirementEnum"></a>
## Enum: InputRequirementEnum
Name | Value
---- | -----
REQUIRED | &quot;INPUT_REQUIRED&quot;
ALLOWED | &quot;INPUT_ALLOWED&quot;
FORBIDDEN | &quot;INPUT_FORBIDDEN&quot;
