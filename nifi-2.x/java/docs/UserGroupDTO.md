# UserGroupDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessPolicies** | [**List&lt;AccessPolicyEntity&gt;**](AccessPolicyEntity.md) | The access policies this user group belongs to. This field was incorrectly defined as an AccessPolicyEntity. For compatibility reasons the field will remain of this type, however only the fields that are present in the AccessPolicySummaryEntity will be populated here. |  [optional]
**configurable** | **Boolean** | Whether this tenant is configurable. |  [optional]
**id** | **String** | The id of the component. |  [optional]
**identity** | **String** | The identity of the tenant. |  [optional]
**parentGroupId** | **String** | The id of parent process group of this component if applicable. |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) |  |  [optional]
**users** | [**List&lt;TenantEntity&gt;**](TenantEntity.md) | The users that belong to the user group. |  [optional]
**versionedComponentId** | **String** | The ID of the corresponding component that is under version control |  [optional]
