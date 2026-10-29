# UserGroupDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access_policies** | [**list[AccessPolicyEntity]**](AccessPolicyEntity.md) | The access policies this user group belongs to. This field was incorrectly defined as an AccessPolicyEntity. For compatibility reasons the field will remain of this type, however only the fields that are present in the AccessPolicySummaryEntity will be populated here. | [optional] 
**configurable** | **bool** | Whether this tenant is configurable. | [optional] 
**id** | **str** | The id of the component. | [optional] 
**identity** | **str** | The identity of the tenant. | [optional] 
**parent_group_id** | **str** | The id of parent process group of this component if applicable. | [optional] 
**position** | [**PositionDTO**](PositionDTO.md) |  | [optional] 
**users** | [**list[TenantEntity]**](TenantEntity.md) | The users that belong to the user group. | [optional] 
**versioned_component_id** | **str** | The ID of the corresponding component that is under version control | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

