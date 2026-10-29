# ReportingTaskDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeThreadCount** | **Integer** | The number of active threads for the reporting task. |  [optional]
**annotationData** | **String** | The annotation data for the reporting task. This is how the custom UI relays configuration to the reporting task. |  [optional]
**bundle** | [**BundleDTO**](BundleDTO.md) |  |  [optional]
**comments** | **String** | The comments of the reporting task. |  [optional]
**customUiUrl** | **String** | The URL for the custom configuration UI for the reporting task. |  [optional]
**defaultSchedulingPeriod** | **Map&lt;String, String&gt;** | The default scheduling period for the different scheduling strategies. |  [optional]
**deprecated** | **Boolean** | Whether the reporting task has been deprecated. |  [optional]
**descriptors** | [**Map&lt;String, PropertyDescriptorDTO&gt;**](PropertyDescriptorDTO.md) | The descriptors for the reporting tasks properties. |  [optional]
**extensionMissing** | **Boolean** | Whether the underlying extension is missing. |  [optional]
**id** | **String** | The id of the component. |  [optional]
**multipleVersionsAvailable** | **Boolean** | Whether the reporting task has multiple versions available. |  [optional]
**name** | **String** | The name of the reporting task. |  [optional]
**parentGroupId** | **String** | The id of parent process group of this component if applicable. |  [optional]
**persistsState** | **Boolean** | Whether the reporting task persists state. |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) |  |  [optional]
**properties** | **Map&lt;String, String&gt;** | The properties of the reporting task. |  [optional]
**restricted** | **Boolean** | Whether the reporting task requires elevated privileges. |  [optional]
**schedulingPeriod** | **String** | The frequency with which to schedule the reporting task. The format of the value will depend on the value of the schedulingStrategy. |  [optional]
**schedulingStrategy** | **String** | The scheduling strategy that determines how the schedulingPeriod value should be interpreted. |  [optional]
**sensitiveDynamicPropertyNames** | **List&lt;String&gt;** | Set of sensitive dynamic property names |  [optional]
**state** | [**StateEnum**](#StateEnum) | The state of the reporting task. |  [optional]
**supportsSensitiveDynamicProperties** | **Boolean** | Whether the reporting task supports sensitive dynamic properties. |  [optional]
**type** | **String** | The fully qualified type of the reporting task. |  [optional]
**validationErrors** | **List&lt;String&gt;** | Gets the validation errors from the reporting task. These validation errors represent the problems with the reporting task that must be resolved before it can be scheduled to run. |  [optional]
**validationStatus** | [**ValidationStatusEnum**](#ValidationStatusEnum) | Indicates whether the Reporting Task is valid, invalid, or still in the process of validating (i.e., it is unknown whether or not the Reporting Task is valid) |  [optional]
**versionedComponentId** | **String** | The ID of the corresponding component that is under version control |  [optional]

<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
RUNNING | &quot;RUNNING&quot;
STOPPED | &quot;STOPPED&quot;
DISABLED | &quot;DISABLED&quot;

<a name="ValidationStatusEnum"></a>
## Enum: ValidationStatusEnum
Name | Value
---- | -----
VALID | &quot;VALID&quot;
INVALID | &quot;INVALID&quot;
VALIDATING | &quot;VALIDATING&quot;
