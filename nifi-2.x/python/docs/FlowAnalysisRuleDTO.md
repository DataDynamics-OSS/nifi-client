# FlowAnalysisRuleDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bundle** | [**BundleDTO**](BundleDTO.md) |  | [optional] 
**comments** | **str** | The comments of the flow analysis rule. | [optional] 
**deprecated** | **bool** | Whether the flow analysis rule has been deprecated. | [optional] 
**descriptors** | [**dict(str, PropertyDescriptorDTO)**](PropertyDescriptorDTO.md) | The descriptors for the flow analysis rules properties. | [optional] 
**enforcement_policy** | **str** | Enforcement Policy. | [optional] 
**extension_missing** | **bool** | Whether the underlying extension is missing. | [optional] 
**id** | **str** | The id of the component. | [optional] 
**multiple_versions_available** | **bool** | Whether the flow analysis rule has multiple versions available. | [optional] 
**name** | **str** | The name of the flow analysis rule. | [optional] 
**parent_group_id** | **str** | The id of parent process group of this component if applicable. | [optional] 
**persists_state** | **bool** | Whether the flow analysis rule persists state. | [optional] 
**position** | [**PositionDTO**](PositionDTO.md) |  | [optional] 
**properties** | **dict(str, str)** | The properties of the flow analysis rule. | [optional] 
**restricted** | **bool** | Whether the flow analysis rule requires elevated privileges. | [optional] 
**sensitive_dynamic_property_names** | **list[str]** | Set of sensitive dynamic property names | [optional] 
**state** | **str** | The state of the flow analysis rule. | [optional] 
**supports_sensitive_dynamic_properties** | **bool** | Whether the flow analysis rule supports sensitive dynamic properties. | [optional] 
**type** | **str** | The fully qualified type of the flow analysis rule. | [optional] 
**validation_errors** | **list[str]** | Gets the validation errors from the flow analysis rule. These validation errors represent the problems with the flow analysis rule that must be resolved before it can be scheduled to run. | [optional] 
**validation_status** | **str** | Indicates whether the Flow Analysis Rule is valid, invalid, or still in the process of validating (i.e., it is unknown whether or not the Flow Analysis Rule is valid) | [optional] 
**versioned_component_id** | **str** | The ID of the corresponding component that is under version control | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

