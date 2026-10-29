# ParameterProviderDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | The id of the component. | [optional] 
**versioned_component_id** | **str** | The ID of the corresponding component that is under version control | [optional] 
**parent_group_id** | **str** | The id of parent process group of this component if applicable. | [optional] 
**position** | [**PositionDTO**](PositionDTO.md) | The position of this component in the UI if applicable. | [optional] 
**name** | **str** | The name of the parameter provider. | [optional] 
**type** | **str** | The fully qualified type of the parameter provider. | [optional] 
**bundle** | [**BundleDTO**](BundleDTO.md) | The details of the artifact that bundled this parameter provider type. | [optional] 
**comments** | **str** | The comments of the parameter provider. | [optional] 
**persists_state** | **bool** | Whether the parameter provider persists state. | [optional] 
**restricted** | **bool** | Whether the parameter provider requires elevated privileges. | [optional] 
**deprecated** | **bool** | Whether the parameter provider has been deprecated. | [optional] 
**multiple_versions_available** | **bool** | Whether the parameter provider has multiple versions available. | [optional] 
**properties** | **dict(str, str)** | The properties of the parameter provider. | [optional] 
**descriptors** | [**dict(str, PropertyDescriptorDTO)**](PropertyDescriptorDTO.md) | The descriptors for the parameter providers properties. | [optional] 
**parameter_group_configurations** | [**list[ParameterGroupConfigurationEntity]**](ParameterGroupConfigurationEntity.md) | Configuration for any fetched parameter groups. | [optional] 
**affected_components** | [**list[AffectedComponentEntity]**](AffectedComponentEntity.md) | The set of all components in the flow that are referencing Parameters provided by this provider | [optional] 
**parameter_status** | [**list[ParameterStatusDTO]**](ParameterStatusDTO.md) | The status of all provided parameters for this parameter provider | [optional] 
**referencing_parameter_contexts** | [**list[ParameterProviderReferencingComponentEntity]**](ParameterProviderReferencingComponentEntity.md) | The Parameter Contexts that reference this Parameter Provider | [optional] 
**custom_ui_url** | **str** | The URL for the custom configuration UI for the parameter provider. | [optional] 
**annotation_data** | **str** | The annotation data for the parameter provider. This is how the custom UI relays configuration to the parameter provider. | [optional] 
**validation_errors** | **list[str]** | Gets the validation errors from the parameter provider. These validation errors represent the problems with the parameter provider that must be resolved before it can be scheduled to run. | [optional] 
**validation_status** | **str** | Indicates whether the Parameter Provider is valid, invalid, or still in the process of validating (i.e., it is unknown whether or not the Parameter Provider is valid) | [optional] 
**extension_missing** | **bool** | Whether the underlying extension is missing. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


