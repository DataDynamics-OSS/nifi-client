# UserDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access_policies** | [**list[AccessPolicySummaryEntity]**](AccessPolicySummaryEntity.md) | The access policies this user belongs to. | [optional] 
**configurable** | **bool** | Whether this tenant is configurable. | [optional] 
**id** | **str** | The id of the component. | [optional] 
**identity** | **str** | The identity of the tenant. | [optional] 
**parent_group_id** | **str** | The id of parent process group of this component if applicable. | [optional] 
**position** | [**PositionDTO**](PositionDTO.md) |  | [optional] 
**user_groups** | [**list[TenantEntity]**](TenantEntity.md) | The groups to which the user belongs. This field is read only and it provided for convenience. | [optional] 
**versioned_component_id** | **str** | The ID of the corresponding component that is under version control | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

