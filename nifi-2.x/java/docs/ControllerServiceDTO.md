# ControllerServiceDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annotationData** | **String** | The annotation for the controller service. This is how the custom UI relays configuration to the controller service. |  [optional]
**bulletinLevel** | **String** | The level at which the controller service will report bulletins. |  [optional]
**bundle** | [**BundleDTO**](BundleDTO.md) |  |  [optional]
**comments** | **String** | The comments for the controller service. |  [optional]
**controllerServiceApis** | [**List&lt;ControllerServiceApiDTO&gt;**](ControllerServiceApiDTO.md) | Lists the APIs this Controller Service implements. |  [optional]
**customUiUrl** | **String** | The URL for the controller services custom configuration UI if applicable. |  [optional]
**deprecated** | **Boolean** | Whether the controller service has been deprecated. |  [optional]
**descriptors** | [**Map&lt;String, PropertyDescriptorDTO&gt;**](PropertyDescriptorDTO.md) | The descriptors for the controller service properties. |  [optional]
**extensionMissing** | **Boolean** | Whether the underlying extension is missing. |  [optional]
**id** | **String** | The id of the component. |  [optional]
**multipleVersionsAvailable** | **Boolean** | Whether the controller service has multiple versions available. |  [optional]
**name** | **String** | The name of the controller service. |  [optional]
**parentGroupId** | **String** | The id of parent process group of this component if applicable. |  [optional]
**persistsState** | **Boolean** | Whether the controller service persists state. |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) |  |  [optional]
**properties** | **Map&lt;String, String&gt;** | The properties of the controller service. |  [optional]
**referencingComponents** | [**List&lt;ControllerServiceReferencingComponentEntity&gt;**](ControllerServiceReferencingComponentEntity.md) | All components referencing this controller service. |  [optional]
**restricted** | **Boolean** | Whether the controller service requires elevated privileges. |  [optional]
**sensitiveDynamicPropertyNames** | **List&lt;String&gt;** | Set of sensitive dynamic property names |  [optional]
**state** | [**StateEnum**](#StateEnum) | The state of the controller service. |  [optional]
**supportsSensitiveDynamicProperties** | **Boolean** | Whether the controller service supports sensitive dynamic properties. |  [optional]
**type** | **String** | The type of the controller service. |  [optional]
**validationErrors** | **List&lt;String&gt;** | The validation errors from the controller service. These validation errors represent the problems with the controller service that must be resolved before it can be enabled.  |  [optional]
**validationStatus** | [**ValidationStatusEnum**](#ValidationStatusEnum) | Indicates whether the ControllerService is valid, invalid, or still in the process of validating (i.e., it is unknown whether or not the ControllerService is valid) |  [optional]
**versionedComponentId** | **String** | The ID of the corresponding component that is under version control |  [optional]

<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
ENABLED | &quot;ENABLED&quot;
ENABLING | &quot;ENABLING&quot;
DISABLED | &quot;DISABLED&quot;
DISABLING | &quot;DISABLING&quot;

<a name="ValidationStatusEnum"></a>
## Enum: ValidationStatusEnum
Name | Value
---- | -----
VALID | &quot;VALID&quot;
INVALID | &quot;INVALID&quot;
VALIDATING | &quot;VALIDATING&quot;
