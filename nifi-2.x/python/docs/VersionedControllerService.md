# VersionedControllerService

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annotation_data** | **str** | The annotation for the controller service. This is how the custom UI relays configuration to the controller service. | [optional] 
**bulletin_level** | **str** | The level at which the controller service will report bulletins. | [optional] 
**bundle** | [**Bundle**](Bundle.md) |  | [optional] 
**comments** | **str** | The user-supplied comments for the component | [optional] 
**component_state** | [**VersionedComponentState**](VersionedComponentState.md) |  | [optional] 
**component_type** | **str** |  | [optional] 
**controller_service_apis** | [**list[ControllerServiceAPI]**](ControllerServiceAPI.md) | Lists the APIs this Controller Service implements. | [optional] 
**group_identifier** | **str** | The ID of the Process Group that this component belongs to | [optional] 
**identifier** | **str** | The component&#x27;s unique identifier | [optional] 
**instance_identifier** | **str** | The instance ID of an existing component that is described by this VersionedComponent, or null if this is not mapped to an instantiated component | [optional] 
**name** | **str** | The component&#x27;s name | [optional] 
**position** | [**Position**](Position.md) |  | [optional] 
**properties** | **dict(str, str)** | The properties for the component. Properties whose value is not set will only contain the property name. | [optional] 
**property_descriptors** | [**dict(str, VersionedPropertyDescriptor)**](VersionedPropertyDescriptor.md) | The property descriptors for the component. | [optional] 
**scheduled_state** | **str** | The ScheduledState denoting whether the Controller Service is ENABLED or DISABLED | [optional] 
**type** | **str** | The type of the extension component | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

