# CurrentUserEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**anonymous** | **bool** | Whether the current user is anonymous. | [optional] 
**can_version_flows** | **bool** | Whether the current user can version flows. | [optional] 
**component_restriction_permissions** | [**list[ComponentRestrictionPermissionDTO]**](ComponentRestrictionPermissionDTO.md) | Permissions for specific component restrictions. | [optional] 
**connectors_permissions** | [**PermissionsDTO**](PermissionsDTO.md) |  | [optional] 
**controller_permissions** | [**PermissionsDTO**](PermissionsDTO.md) |  | [optional] 
**counters_permissions** | [**PermissionsDTO**](PermissionsDTO.md) |  | [optional] 
**identity** | **str** | The user identity being serialized. | [optional] 
**logout_supported** | **bool** | Whether the system is configured to support logout operations based on current user authentication status | [optional] 
**parameter_context_permissions** | [**PermissionsDTO**](PermissionsDTO.md) |  | [optional] 
**policies_permissions** | [**PermissionsDTO**](PermissionsDTO.md) |  | [optional] 
**provenance_permissions** | [**PermissionsDTO**](PermissionsDTO.md) |  | [optional] 
**restricted_components_permissions** | [**PermissionsDTO**](PermissionsDTO.md) |  | [optional] 
**system_permissions** | [**PermissionsDTO**](PermissionsDTO.md) |  | [optional] 
**tenants_permissions** | [**PermissionsDTO**](PermissionsDTO.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

