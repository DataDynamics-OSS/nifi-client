# FlowRegistryClientDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annotationData** | **String** | The annotation data for the registry client. This is how the custom UI relays configuration to the registry client. |  [optional]
**bundle** | [**BundleDTO**](BundleDTO.md) |  |  [optional]
**deprecated** | **Boolean** | Whether the registry client has been deprecated. |  [optional]
**description** | **String** | The registry description |  [optional]
**descriptors** | [**Map&lt;String, PropertyDescriptorDTO&gt;**](PropertyDescriptorDTO.md) | The descriptors for the registry client properties. |  [optional]
**extensionMissing** | **Boolean** | Whether the underlying extension is missing. |  [optional]
**id** | **String** | The registry identifier |  [optional]
**multipleVersionsAvailable** | **Boolean** | Whether the flow registry client has multiple versions available. |  [optional]
**name** | **String** | The registry name |  [optional]
**properties** | **Map&lt;String, String&gt;** | The properties of the registry client. |  [optional]
**restricted** | **Boolean** | Whether the registry client requires elevated privileges. |  [optional]
**sensitiveDynamicPropertyNames** | **List&lt;String&gt;** | Set of sensitive dynamic property names |  [optional]
**supportsBranching** | **Boolean** | Whether the registry client supports branching. |  [optional]
**supportsSensitiveDynamicProperties** | **Boolean** | Whether the registry client supports sensitive dynamic properties. |  [optional]
**type** | **String** | The type of the registry client. |  [optional]
**validationErrors** | **List&lt;String&gt;** | Gets the validation errors from the registry client. These validation errors represent the problems with the registry client that must be resolved before it can be used for interacting with the flow registry. |  [optional]
**validationStatus** | [**ValidationStatusEnum**](#ValidationStatusEnum) | Indicates whether the Registry Client is valid, invalid, or still in the process of validating (i.e., it is unknown whether or not the Registry Client is valid) |  [optional]

<a name="ValidationStatusEnum"></a>
## Enum: ValidationStatusEnum
Name | Value
---- | -----
VALID | &quot;VALID&quot;
INVALID | &quot;INVALID&quot;
VALIDATING | &quot;VALIDATING&quot;
