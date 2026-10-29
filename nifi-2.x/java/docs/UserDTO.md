# UserDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessPolicies** | [**List&lt;AccessPolicySummaryEntity&gt;**](AccessPolicySummaryEntity.md) | The access policies this user belongs to. |  [optional]
**configurable** | **Boolean** | Whether this tenant is configurable. |  [optional]
**id** | **String** | The id of the component. |  [optional]
**identity** | **String** | The identity of the tenant. |  [optional]
**parentGroupId** | **String** | The id of parent process group of this component if applicable. |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) |  |  [optional]
**userGroups** | [**List&lt;TenantEntity&gt;**](TenantEntity.md) | The groups to which the user belongs. This field is read only and it provided for convenience. |  [optional]
**versionedComponentId** | **String** | The ID of the corresponding component that is under version control |  [optional]
