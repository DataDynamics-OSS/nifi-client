# FlowRegistryClientDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The registry identifier | [optional] 
**name** | **str** | The registry name | [optional] 
**description** | **str** | The registry description | [optional] 
**uri** | **str** |  | [optional] 
**type** | **str** | The type of the controller service. | [optional] 
**bundle** | [**BundleDTO**](BundleDTO.md) | The details of the artifact that bundled this processor type. | [optional] 
**properties** | **dict(str, str)** | The properties of the controller service. | [optional] 
**descriptors** | [**dict(str, PropertyDescriptorDTO)**](PropertyDescriptorDTO.md) | The descriptors for the controller service properties. | [optional] 
**sensitive_dynamic_property_names** | **list[str]** | Set of sensitive dynamic property names | [optional] 
**supports_sensitive_dynamic_properties** | **bool** | Whether the reporting task supports sensitive dynamic properties. | [optional] 
**restricted** | **bool** | Whether the reporting task requires elevated privileges. | [optional] 
**deprecated** | **bool** | Whether the reporting task has been deprecated. | [optional] 
**validation_errors** | **list[str]** | Gets the validation errors from the reporting task. These validation errors represent the problems with the reporting task that must be resolved before it can be scheduled to run. | [optional] 
**validation_status** | **str** | Indicates whether the Processor is valid, invalid, or still in the process of validating (i.e., it is unknown whether or not the Processor is valid) | [optional] 
**annotation_data** | **str** | The annotation data for the repoting task. This is how the custom UI relays configuration to the reporting task. | [optional] 
**multiple_versions_available** | **bool** | Whether the flow registry client has multiple versions available. | [optional] 
**extension_missing** | **bool** | Whether the underlying extension is missing. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


