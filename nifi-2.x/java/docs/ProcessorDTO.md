# ProcessorDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bundle** | [**BundleDTO**](BundleDTO.md) |  |  [optional]
**config** | [**ProcessorConfigDTO**](ProcessorConfigDTO.md) |  |  [optional]
**deprecated** | **Boolean** | Whether the processor has been deprecated. |  [optional]
**description** | **String** | The description of the processor. |  [optional]
**executionNodeRestricted** | **Boolean** | Indicates if the execution node of a processor is restricted to run only on the primary node |  [optional]
**extensionMissing** | **Boolean** | Whether the underlying extension is missing. |  [optional]
**id** | **String** | The id of the component. |  [optional]
**inputRequirement** | **String** | The input requirement for this processor. |  [optional]
**multipleVersionsAvailable** | **Boolean** | Whether the processor has multiple versions available. |  [optional]
**name** | **String** | The name of the processor. |  [optional]
**parentGroupId** | **String** | The id of parent process group of this component if applicable. |  [optional]
**persistsState** | **Boolean** | Whether the processor persists state. |  [optional]
**physicalState** | [**PhysicalStateEnum**](#PhysicalStateEnum) | The physical state of the processor, including transition states |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) |  |  [optional]
**relationships** | [**List&lt;RelationshipDTO&gt;**](RelationshipDTO.md) | The available relationships that the processor currently supports. |  [optional]
**restricted** | **Boolean** | Whether the processor requires elevated privileges. |  [optional]
**state** | [**StateEnum**](#StateEnum) | The state of the processor |  [optional]
**style** | **Map&lt;String, String&gt;** | Styles for the processor (background-color : #eee). |  [optional]
**supportsBacklogReporting** | **Boolean** | Whether the processor implements BacklogReportingProcessor and can report a backlog. |  [optional]
**supportsBatching** | **Boolean** | Whether the processor supports batching. This makes the run duration settings available. |  [optional]
**supportsParallelProcessing** | **Boolean** | Whether the processor supports parallel processing. |  [optional]
**supportsSensitiveDynamicProperties** | **Boolean** | Whether the processor supports sensitive dynamic properties. |  [optional]
**type** | **String** | The type of the processor. |  [optional]
**validationErrors** | **List&lt;String&gt;** | The validation errors for the processor. These validation errors represent the problems with the processor that must be resolved before it can be started. |  [optional]
**validationStatus** | [**ValidationStatusEnum**](#ValidationStatusEnum) | Indicates whether the Processor is valid, invalid, or still in the process of validating (i.e., it is unknown whether or not the Processor is valid) |  [optional]
**versionedComponentId** | **String** | The ID of the corresponding component that is under version control |  [optional]

<a name="PhysicalStateEnum"></a>
## Enum: PhysicalStateEnum
Name | Value
---- | -----
RUNNING | &quot;RUNNING&quot;
STOPPED | &quot;STOPPED&quot;
DISABLED | &quot;DISABLED&quot;
STARTING | &quot;STARTING&quot;
STOPPING | &quot;STOPPING&quot;
RUN_ONCE | &quot;RUN_ONCE&quot;

<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
RUNNING | &quot;RUNNING&quot;
STOPPED | &quot;STOPPED&quot;
DISABLED | &quot;DISABLED&quot;
RUN_ONCE | &quot;RUN_ONCE&quot;

<a name="ValidationStatusEnum"></a>
## Enum: ValidationStatusEnum
Name | Value
---- | -----
VALID | &quot;VALID&quot;
INVALID | &quot;INVALID&quot;
VALIDATING | &quot;VALIDATING&quot;
