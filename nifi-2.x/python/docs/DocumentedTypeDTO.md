# DocumentedTypeDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bundle** | [**BundleDTO**](BundleDTO.md) |  | [optional] 
**controller_service_apis** | [**list[ControllerServiceApiDTO]**](ControllerServiceApiDTO.md) | If this type represents a ControllerService, this lists the APIs it implements. | [optional] 
**deprecation_reason** | **str** | The description of why the usage of this component is restricted. | [optional] 
**description** | **str** | The description of the type. | [optional] 
**explicit_restrictions** | [**list[ExplicitRestrictionDTO]**](ExplicitRestrictionDTO.md) | An optional collection of explicit restrictions. If specified, these explicit restrictions will be enforced. | [optional] 
**restricted** | **bool** | Whether this type is restricted. | [optional] 
**tags** | **list[str]** | The tags associated with this type. | [optional] 
**type** | **str** | The fully qualified name of the type. | [optional] 
**usage_restriction** | **str** | The optional description of why the usage of this component is restricted. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

