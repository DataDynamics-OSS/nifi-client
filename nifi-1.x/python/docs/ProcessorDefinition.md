# ProcessorDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**group** | **str** | The group name of the bundle that provides the referenced type. | [optional] 
**artifact** | **str** | The artifact name of the bundle that provides the referenced type. | [optional] 
**version** | **str** | The version of the bundle that provides the referenced type. | [optional] 
**type** | **str** | The fully-qualified class type | 
**type_description** | **str** | The description of the type. | [optional] 
**build_info** | [**BuildInfo**](BuildInfo.md) | The build metadata for this component | [optional] 
**provided_api_implementations** | [**list[DefinedType]**](DefinedType.md) | If this type represents a provider for an interface, this lists the APIs it implements | [optional] 
**tags** | **list[str]** | The tags associated with this type | [optional] 
**see_also** | **list[str]** | The names of other component types that may be related | [optional] 
**deprecated** | **bool** | Whether or not the component has been deprecated | [optional] 
**deprecation_reason** | **str** | If this component has been deprecated, this optional field can be used to provide an explanation | [optional] 
**deprecation_alternatives** | **list[str]** | If this component has been deprecated, this optional field provides alternatives to use | [optional] 
**restricted** | **bool** | Whether or not the component has a general restriction | [optional] 
**restricted_explanation** | **str** | An optional description of the general restriction | [optional] 
**explicit_restrictions** | [**list[Restriction]**](Restriction.md) | Explicit restrictions that indicate a require permission to use the component | [optional] 
**stateful** | [**Stateful**](Stateful.md) | Indicates if the component stores state | [optional] 
**system_resource_considerations** | [**list[SystemResourceConsideration]**](SystemResourceConsideration.md) | The system resource considerations for the given component | [optional] 
**additional_details** | **bool** | Indicates if the component has additional details documentation | [optional] 
**property_descriptors** | [**dict(str, PropertyDescriptor)**](PropertyDescriptor.md) | Descriptions of configuration properties applicable to this component. | [optional] 
**supports_dynamic_properties** | **bool** | Whether or not this component makes use of dynamic (user-set) properties. | [optional] 
**supports_sensitive_dynamic_properties** | **bool** | Whether or not this component makes use of sensitive dynamic (user-set) properties. | [optional] 
**dynamic_properties** | [**list[DynamicProperty]**](DynamicProperty.md) | Describes the dynamic properties supported by this component | [optional] 
**input_requirement** | **str** | Any input requirements this processor has. | [optional] 
**supported_relationships** | [**list[Relationship]**](Relationship.md) | The supported relationships for this processor. | [optional] 
**supports_dynamic_relationships** | **bool** | Whether or not this processor supports dynamic relationships. | [optional] 
**dynamic_relationship** | [**DynamicRelationship**](DynamicRelationship.md) | If the processor supports dynamic relationships, this describes the dynamic relationship | [optional] 
**trigger_serially** | **bool** | Whether or not this processor should be triggered serially (i.e. no concurrent execution). | [optional] 
**trigger_when_empty** | **bool** | Whether or not this processor should be triggered when incoming queues are empty. | [optional] 
**trigger_when_any_destination_available** | **bool** | Whether or not this processor should be triggered when any destination queue has room. | [optional] 
**supports_batching** | **bool** | Whether or not this processor supports batching. If a Processor uses this annotation, it allows the Framework to batch calls to session commits, as well as allowing the Framework to return the same session multiple times. | [optional] 
**supports_event_driven** | **bool** | Whether or not this processor supports event driven scheduling. Indicates to the framework that the Processor is eligible to be scheduled to run based on the occurrence of an \&quot;Event\&quot; (e.g., when a FlowFile is enqueued in an incoming Connection), rather than being triggered periodically. | [optional] 
**primary_node_only** | **bool** | Whether or not this processor should be scheduled only on the primary node in a cluster. | [optional] 
**side_effect_free** | **bool** | Whether or not this processor is considered side-effect free. Side-effect free indicate that the processor&#39;s operations on FlowFiles can be safely repeated across process sessions. | [optional] 
**supported_scheduling_strategies** | **list[str]** | The supported scheduling strategies, such as TIME_DRIVER, CRON, or EVENT_DRIVEN. | [optional] 
**default_scheduling_strategy** | **str** | The default scheduling strategy for the processor. | [optional] 
**default_concurrent_tasks_by_scheduling_strategy** | **dict(str, int)** | The default concurrent tasks for each scheduling strategy. | [optional] 
**default_scheduling_period_by_scheduling_strategy** | **dict(str, str)** | The default scheduling period for each scheduling strategy. The scheduling period is expected to be a time period, such as \&quot;30 sec\&quot;. | [optional] 
**default_penalty_duration** | **str** | The default penalty duration as a time period, such as \&quot;30 sec\&quot;. | [optional] 
**default_yield_duration** | **str** | The default yield duration as a time period, such as \&quot;1 sec\&quot;. | [optional] 
**default_bulletin_level** | **str** | The default bulletin level, such as WARN, INFO, DEBUG, etc. | [optional] 
**reads_attributes** | [**list[Attribute]**](Attribute.md) | The FlowFile attributes this processor reads | [optional] 
**writes_attributes** | [**list[Attribute]**](Attribute.md) | The FlowFile attributes this processor writes/updates | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


