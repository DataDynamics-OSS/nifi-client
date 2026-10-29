# RebaseChangeDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**classification** | **str** | The classification of this change: COMPATIBLE, CONFLICTING, or UNSUPPORTED | [optional] 
**component_id** | **str** | The ID of the component that was changed | [optional] 
**component_name** | **str** | The name of the component that was changed | [optional] 
**component_type** | **str** | The type of the component that was changed | [optional] 
**conflict_code** | **str** | A code identifying the type of conflict, or null if the change is not conflicting | [optional] 
**conflict_detail** | **str** | A detailed description of the conflict, or null if the change is not conflicting | [optional] 
**difference_type** | **str** | The type of difference detected for this change | [optional] 
**field_name** | **str** | The name of the field that was changed, or null if not applicable | [optional] 
**local_value** | **str** | The local value of the field, or null if not applicable | [optional] 
**registry_value** | **str** | The registry value of the field, or null if not applicable | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

