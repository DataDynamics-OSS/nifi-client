# ControllerServiceDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annotation_data** | **str** | The annotation for the controller service. This is how the custom UI relays configuration to the controller service. | [optional] 
**bulletin_level** | **str** | The level at which the controller service will report bulletins. | [optional] 
**bundle** | [**BundleDTO**](BundleDTO.md) |  | [optional] 
**comments** | **str** | The comments for the controller service. | [optional] 
**controller_service_apis** | [**list[ControllerServiceApiDTO]**](ControllerServiceApiDTO.md) | Lists the APIs this Controller Service implements. | [optional] 
**custom_ui_url** | **str** | The URL for the controller services custom configuration UI if applicable. | [optional] 
**deprecated** | **bool** | Whether the controller service has been deprecated. | [optional] 
**descriptors** | [**dict(str, PropertyDescriptorDTO)**](PropertyDescriptorDTO.md) | The descriptors for the controller service properties. | [optional] 
**extension_missing** | **bool** | Whether the underlying extension is missing. | [optional] 
**id** | **str** | The id of the component. | [optional] 
**multiple_versions_available** | **bool** | Whether the controller service has multiple versions available. | [optional] 
**name** | **str** | The name of the controller service. | [optional] 
**parent_group_id** | **str** | The id of parent process group of this component if applicable. | [optional] 
**persists_state** | **bool** | Whether the controller service persists state. | [optional] 
**position** | [**PositionDTO**](PositionDTO.md) |  | [optional] 
**properties** | **dict(str, str)** | The properties of the controller service. | [optional] 
**referencing_components** | [**list[ControllerServiceReferencingComponentEntity]**](ControllerServiceReferencingComponentEntity.md) | All components referencing this controller service. | [optional] 
**restricted** | **bool** | Whether the controller service requires elevated privileges. | [optional] 
**sensitive_dynamic_property_names** | **list[str]** | Set of sensitive dynamic property names | [optional] 
**state** | **str** | The state of the controller service. | [optional] 
**supports_sensitive_dynamic_properties** | **bool** | Whether the controller service supports sensitive dynamic properties. | [optional] 
**type** | **str** | The type of the controller service. | [optional] 
**validation_errors** | **list[str]** | The validation errors from the controller service. These validation errors represent the problems with the controller service that must be resolved before it can be enabled.  | [optional] 
**validation_status** | **str** | Indicates whether the ControllerService is valid, invalid, or still in the process of validating (i.e., it is unknown whether or not the ControllerService is valid) | [optional] 
**versioned_component_id** | **str** | The ID of the corresponding component that is under version control | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

