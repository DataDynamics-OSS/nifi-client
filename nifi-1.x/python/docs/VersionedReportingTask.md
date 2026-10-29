# VersionedReportingTask

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | **str** | The component&#39;s unique identifier | [optional] 
**instance_identifier** | **str** | The instance ID of an existing component that is described by this VersionedComponent, or null if this is not mapped to an instantiated component | [optional] 
**name** | **str** | The component&#39;s name | [optional] 
**comments** | **str** | The user-supplied comments for the component | [optional] 
**position** | [**Position**](Position.md) | The component&#39;s position on the graph | [optional] 
**type** | **str** | The type of the extension component | [optional] 
**bundle** | [**Bundle**](Bundle.md) | Information about the bundle from which the component came | [optional] 
**properties** | **dict(str, str)** | The properties for the component. Properties whose value is not set will only contain the property name. | [optional] 
**property_descriptors** | [**dict(str, VersionedPropertyDescriptor)**](VersionedPropertyDescriptor.md) | The property descriptors for the component. | [optional] 
**annotation_data** | **str** | The annotation for the reporting task. This is how the custom UI relays configuration to the reporting task. | [optional] 
**scheduled_state** | **str** | Indicates the scheduled state for the Reporting Task | [optional] 
**scheduling_period** | **str** | The frequency with which to schedule the reporting task. The format of the value will depend on the value of schedulingStrategy. | [optional] 
**scheduling_strategy** | **str** | Indicates scheduling strategy that should dictate how the reporting task is triggered. | [optional] 
**component_type** | **str** |  | [optional] 
**group_identifier** | **str** | The ID of the Process Group that this component belongs to | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


