# VersionedControllerService

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
**controller_service_apis** | [**list[ControllerServiceAPI]**](ControllerServiceAPI.md) | Lists the APIs this Controller Service implements. | [optional] 
**annotation_data** | **str** | The annotation for the controller service. This is how the custom UI relays configuration to the controller service. | [optional] 
**scheduled_state** | **str** | The ScheduledState denoting whether the Controller Service is ENABLED or DISABLED | [optional] 
**bulletin_level** | **str** | The level at which the controller service will report bulletins. | [optional] 
**component_type** | **str** |  | [optional] 
**group_identifier** | **str** | The ID of the Process Group that this component belongs to | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


