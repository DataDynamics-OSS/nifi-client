# VersionedParameterContext

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comments** | **str** | The user-supplied comments for the component | [optional] 
**component_type** | **str** |  | [optional] 
**description** | **str** | The description of the parameter context | [optional] 
**group_identifier** | **str** | The ID of the Process Group that this component belongs to | [optional] 
**identifier** | **str** | The component&#x27;s unique identifier | [optional] 
**inherited_parameter_contexts** | **list[str]** | The names of additional parameter contexts from which to inherit parameters | [optional] 
**instance_identifier** | **str** | The instance ID of an existing component that is described by this VersionedComponent, or null if this is not mapped to an instantiated component | [optional] 
**name** | **str** | The component&#x27;s name | [optional] 
**parameter_group_name** | **str** | The corresponding parameter group name fetched from the parameter provider, if applicable | [optional] 
**parameter_provider** | **str** | The identifier of an optional parameter provider | [optional] 
**parameters** | [**list[VersionedParameter]**](VersionedParameter.md) | The parameters in the context | [optional] 
**position** | [**Position**](Position.md) |  | [optional] 
**synchronized** | **bool** | True if the parameter provider is set and the context should receive updates when its parameters are next fetched | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

