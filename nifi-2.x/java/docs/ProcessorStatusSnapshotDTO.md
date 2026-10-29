# ProcessorStatusSnapshotDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeThreadCount** | **Integer** | The number of threads currently executing in the processor. |  [optional]
**bytesIn** | **Long** | The size of the FlowFiles that have been accepted in the last 5 minutes |  [optional]
**bytesOut** | **Long** | The size of the FlowFiles transferred to a Connection in the last 5 minutes |  [optional]
**bytesRead** | **Long** | The number of bytes read by this Processor in the last 5 minutes |  [optional]
**bytesWritten** | **Long** | The number of bytes written by this Processor in the last 5 minutes |  [optional]
**executionNode** | [**ExecutionNodeEnum**](#ExecutionNodeEnum) | Indicates the node where the process will execute. |  [optional]
**flowFilesIn** | **Integer** | The number of FlowFiles that have been accepted in the last 5 minutes |  [optional]
**flowFilesOut** | **Integer** | The number of FlowFiles transferred to a Connection in the last 5 minutes |  [optional]
**groupId** | **String** | The id of the parent process group to which the processor belongs. |  [optional]
**id** | **String** | The id of the processor. |  [optional]
**input** | **String** | The count/size of FlowFiles that have been accepted in the last 5 minutes. |  [optional]
**name** | **String** | The name of the processor. |  [optional]
**output** | **String** | The count/size of FlowFiles that have been processed in the last 5 minutes. |  [optional]
**processingPerformanceStatus** | [**ProcessingPerformanceStatusDTO**](ProcessingPerformanceStatusDTO.md) |  |  [optional]
**read** | **String** | The number of bytes read in the last 5 minutes. |  [optional]
**runStatus** | [**RunStatusEnum**](#RunStatusEnum) | The state of the processor. |  [optional]
**taskCount** | **Integer** | The number of times this Processor has run in the last 5 minutes |  [optional]
**tasks** | **String** | The total number of task this connectable has completed over the last 5 minutes. |  [optional]
**tasksDuration** | **String** | The total duration of all tasks for this connectable over the last 5 minutes. |  [optional]
**tasksDurationNanos** | **Long** | The number of nanoseconds that this Processor has spent running in the last 5 minutes |  [optional]
**terminatedThreadCount** | **Integer** | The number of threads currently terminated for the processor. |  [optional]
**type** | **String** | The type of the processor. |  [optional]
**written** | **String** | The number of bytes written in the last 5 minutes. |  [optional]

<a name="ExecutionNodeEnum"></a>
## Enum: ExecutionNodeEnum
Name | Value
---- | -----
ALL | &quot;ALL&quot;
PRIMARY | &quot;PRIMARY&quot;

<a name="RunStatusEnum"></a>
## Enum: RunStatusEnum
Name | Value
---- | -----
RUNNING | &quot;Running&quot;
STOPPED | &quot;Stopped&quot;
VALIDATING | &quot;Validating&quot;
DISABLED | &quot;Disabled&quot;
INVALID | &quot;Invalid&quot;
