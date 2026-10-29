# ProcessorRunStatusDetailsDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeThreadCount** | **Integer** | The current number of threads that the processor is currently using |  [optional]
**id** | **String** | The ID of the processor |  [optional]
**name** | **String** | The name of the processor |  [optional]
**runStatus** | [**RunStatusEnum**](#RunStatusEnum) | The run status of the processor |  [optional]
**validationErrors** | **List&lt;String&gt;** | The processor&#x27;s validation errors |  [optional]

<a name="RunStatusEnum"></a>
## Enum: RunStatusEnum
Name | Value
---- | -----
RUNNING | &quot;Running&quot;
STOPPED | &quot;Stopped&quot;
INVALID | &quot;Invalid&quot;
VALIDATING | &quot;Validating&quot;
DISABLED | &quot;Disabled&quot;
