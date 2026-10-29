# FlowAnalysisRuleDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bundle** | [**BundleDTO**](BundleDTO.md) |  |  [optional]
**comments** | **String** | The comments of the flow analysis rule. |  [optional]
**deprecated** | **Boolean** | Whether the flow analysis rule has been deprecated. |  [optional]
**descriptors** | [**Map&lt;String, PropertyDescriptorDTO&gt;**](PropertyDescriptorDTO.md) | The descriptors for the flow analysis rules properties. |  [optional]
**enforcementPolicy** | **String** | Enforcement Policy. |  [optional]
**extensionMissing** | **Boolean** | Whether the underlying extension is missing. |  [optional]
**id** | **String** | The id of the component. |  [optional]
**multipleVersionsAvailable** | **Boolean** | Whether the flow analysis rule has multiple versions available. |  [optional]
**name** | **String** | The name of the flow analysis rule. |  [optional]
**parentGroupId** | **String** | The id of parent process group of this component if applicable. |  [optional]
**persistsState** | **Boolean** | Whether the flow analysis rule persists state. |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) |  |  [optional]
**properties** | **Map&lt;String, String&gt;** | The properties of the flow analysis rule. |  [optional]
**restricted** | **Boolean** | Whether the flow analysis rule requires elevated privileges. |  [optional]
**sensitiveDynamicPropertyNames** | **List&lt;String&gt;** | Set of sensitive dynamic property names |  [optional]
**state** | [**StateEnum**](#StateEnum) | The state of the flow analysis rule. |  [optional]
**supportsSensitiveDynamicProperties** | **Boolean** | Whether the flow analysis rule supports sensitive dynamic properties. |  [optional]
**type** | **String** | The fully qualified type of the flow analysis rule. |  [optional]
**validationErrors** | **List&lt;String&gt;** | Gets the validation errors from the flow analysis rule. These validation errors represent the problems with the flow analysis rule that must be resolved before it can be scheduled to run. |  [optional]
**validationStatus** | [**ValidationStatusEnum**](#ValidationStatusEnum) | Indicates whether the Flow Analysis Rule is valid, invalid, or still in the process of validating (i.e., it is unknown whether or not the Flow Analysis Rule is valid) |  [optional]
**versionedComponentId** | **String** | The ID of the corresponding component that is under version control |  [optional]

<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
ENABLED | &quot;ENABLED&quot;
DISABLED | &quot;DISABLED&quot;

<a name="ValidationStatusEnum"></a>
## Enum: ValidationStatusEnum
Name | Value
---- | -----
VALID | &quot;VALID&quot;
INVALID | &quot;INVALID&quot;
VALIDATING | &quot;VALIDATING&quot;
