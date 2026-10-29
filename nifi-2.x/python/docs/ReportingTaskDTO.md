# ReportingTaskDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active_thread_count** | **int** | The number of active threads for the reporting task. | [optional] 
**annotation_data** | **str** | The annotation data for the reporting task. This is how the custom UI relays configuration to the reporting task. | [optional] 
**bundle** | [**BundleDTO**](BundleDTO.md) |  | [optional] 
**comments** | **str** | The comments of the reporting task. | [optional] 
**custom_ui_url** | **str** | The URL for the custom configuration UI for the reporting task. | [optional] 
**default_scheduling_period** | **dict(str, str)** | The default scheduling period for the different scheduling strategies. | [optional] 
**deprecated** | **bool** | Whether the reporting task has been deprecated. | [optional] 
**descriptors** | [**dict(str, PropertyDescriptorDTO)**](PropertyDescriptorDTO.md) | The descriptors for the reporting tasks properties. | [optional] 
**extension_missing** | **bool** | Whether the underlying extension is missing. | [optional] 
**id** | **str** | The id of the component. | [optional] 
**multiple_versions_available** | **bool** | Whether the reporting task has multiple versions available. | [optional] 
**name** | **str** | The name of the reporting task. | [optional] 
**parent_group_id** | **str** | The id of parent process group of this component if applicable. | [optional] 
**persists_state** | **bool** | Whether the reporting task persists state. | [optional] 
**position** | [**PositionDTO**](PositionDTO.md) |  | [optional] 
**properties** | **dict(str, str)** | The properties of the reporting task. | [optional] 
**restricted** | **bool** | Whether the reporting task requires elevated privileges. | [optional] 
**scheduling_period** | **str** | The frequency with which to schedule the reporting task. The format of the value will depend on the value of the schedulingStrategy. | [optional] 
**scheduling_strategy** | **str** | The scheduling strategy that determines how the schedulingPeriod value should be interpreted. | [optional] 
**sensitive_dynamic_property_names** | **list[str]** | Set of sensitive dynamic property names | [optional] 
**state** | **str** | The state of the reporting task. | [optional] 
**supports_sensitive_dynamic_properties** | **bool** | Whether the reporting task supports sensitive dynamic properties. | [optional] 
**type** | **str** | The fully qualified type of the reporting task. | [optional] 
**validation_errors** | **list[str]** | Gets the validation errors from the reporting task. These validation errors represent the problems with the reporting task that must be resolved before it can be scheduled to run. | [optional] 
**validation_status** | **str** | Indicates whether the Reporting Task is valid, invalid, or still in the process of validating (i.e., it is unknown whether or not the Reporting Task is valid) | [optional] 
**versioned_component_id** | **str** | The ID of the corresponding component that is under version control | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

