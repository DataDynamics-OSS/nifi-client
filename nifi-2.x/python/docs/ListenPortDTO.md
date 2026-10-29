# ListenPortDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**application_protocols** | **list[str]** | Supported application protocols, if applicable | [optional] 
**component_class** | **str** | The class type of the component providing the listen port | [optional] 
**component_id** | **str** | The id of the component providing the listen port | [optional] 
**component_name** | **str** | The name of the component providing the listen port | [optional] 
**component_type** | **str** | The type of component providing the listen port (e.g., Processor, ControllerService) | [optional] 
**parent_group_id** | **str** | The id of the process group containing the component providing the listen port, if applicable | [optional] 
**parent_group_name** | **str** | The name of the process group containing the component providing the listen port, if applicable | [optional] 
**port_name** | **str** | The name of the the listen port. Useful context for components that provide multiple ports. | [optional] 
**port_number** | **int** | The ingress port number | [optional] 
**transport_protocol** | **str** | The ingress transport protocol (TCP or UDP) | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

