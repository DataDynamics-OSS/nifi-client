# FlowRegistryClientDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annotation_data** | **str** | The annotation data for the registry client. This is how the custom UI relays configuration to the registry client. | [optional] 
**bundle** | [**BundleDTO**](BundleDTO.md) |  | [optional] 
**deprecated** | **bool** | Whether the registry client has been deprecated. | [optional] 
**description** | **str** | The registry description | [optional] 
**descriptors** | [**dict(str, PropertyDescriptorDTO)**](PropertyDescriptorDTO.md) | The descriptors for the registry client properties. | [optional] 
**extension_missing** | **bool** | Whether the underlying extension is missing. | [optional] 
**id** | **str** | The registry identifier | [optional] 
**multiple_versions_available** | **bool** | Whether the flow registry client has multiple versions available. | [optional] 
**name** | **str** | The registry name | [optional] 
**properties** | **dict(str, str)** | The properties of the registry client. | [optional] 
**restricted** | **bool** | Whether the registry client requires elevated privileges. | [optional] 
**sensitive_dynamic_property_names** | **list[str]** | Set of sensitive dynamic property names | [optional] 
**supports_branching** | **bool** | Whether the registry client supports branching. | [optional] 
**supports_sensitive_dynamic_properties** | **bool** | Whether the registry client supports sensitive dynamic properties. | [optional] 
**type** | **str** | The type of the registry client. | [optional] 
**validation_errors** | **list[str]** | Gets the validation errors from the registry client. These validation errors represent the problems with the registry client that must be resolved before it can be used for interacting with the flow registry. | [optional] 
**validation_status** | **str** | Indicates whether the Registry Client is valid, invalid, or still in the process of validating (i.e., it is unknown whether or not the Registry Client is valid) | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

