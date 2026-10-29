# DocumentedTypeDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bundle** | [**BundleDTO**](BundleDTO.md) |  |  [optional]
**controllerServiceApis** | [**List&lt;ControllerServiceApiDTO&gt;**](ControllerServiceApiDTO.md) | If this type represents a ControllerService, this lists the APIs it implements. |  [optional]
**deprecationReason** | **String** | The description of why the usage of this component is restricted. |  [optional]
**description** | **String** | The description of the type. |  [optional]
**explicitRestrictions** | [**List&lt;ExplicitRestrictionDTO&gt;**](ExplicitRestrictionDTO.md) | An optional collection of explicit restrictions. If specified, these explicit restrictions will be enforced. |  [optional]
**restricted** | **Boolean** | Whether this type is restricted. |  [optional]
**tags** | **List&lt;String&gt;** | The tags associated with this type. |  [optional]
**type** | **String** | The fully qualified name of the type. |  [optional]
**usageRestriction** | **String** | The optional description of why the usage of this component is restricted. |  [optional]
