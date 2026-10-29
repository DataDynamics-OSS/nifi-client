# ParameterProviderDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additional_details** | **bool** | Indicates if the component has additional details documentation | [optional] 
**artifact** | **str** | The artifact name of the bundle that provides the referenced type. | [optional] 
**build_info** | [**BuildInfo**](BuildInfo.md) |  | [optional] 
**deprecated** | **bool** | Whether or not the component has been deprecated | [optional] 
**deprecation_alternatives** | **list[str]** | If this component has been deprecated, this optional field provides alternatives to use | [optional] 
**deprecation_reason** | **str** | If this component has been deprecated, this optional field can be used to provide an explanation | [optional] 
**dynamic_properties** | [**list[DynamicProperty]**](DynamicProperty.md) | Describes the dynamic properties supported by this component | [optional] 
**explicit_restrictions** | [**list[Restriction]**](Restriction.md) | Explicit restrictions that indicate a require permission to use the component | [optional] 
**group** | **str** | The group name of the bundle that provides the referenced type. | [optional] 
**property_descriptors** | [**dict(str, PropertyDescriptor)**](PropertyDescriptor.md) | Descriptions of configuration properties applicable to this component. | [optional] 
**provided_api_implementations** | [**list[DefinedType]**](DefinedType.md) | If this type represents a provider for an interface, this lists the APIs it implements | [optional] 
**restricted** | **bool** | Whether or not the component has a general restriction | [optional] 
**restricted_explanation** | **str** | An optional description of the general restriction | [optional] 
**see_also** | **list[str]** | The names of other component types that may be related | [optional] 
**stateful** | [**Stateful**](Stateful.md) |  | [optional] 
**supports_dynamic_properties** | **bool** | Whether or not this component makes use of dynamic (user-set) properties. | [optional] 
**supports_sensitive_dynamic_properties** | **bool** | Whether or not this component makes use of sensitive dynamic (user-set) properties. | [optional] 
**system_resource_considerations** | [**list[SystemResourceConsideration]**](SystemResourceConsideration.md) | The system resource considerations for the given component | [optional] 
**tags** | **list[str]** | The tags associated with this type | [optional] 
**type** | **str** | The fully-qualified class type | [optional] 
**type_description** | **str** | The description of the type. | [optional] 
**version** | **str** | The version of the bundle that provides the referenced type. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

