# UseCase

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_configuration** | **String** | A description of how to configure the Processor to perform the task described in the use case |  [optional]
**description** | **String** | A description of the use case |  [optional]
**inputRequirement** | [**InputRequirementEnum**](#InputRequirementEnum) | Specifies whether an incoming FlowFile is expected for this use case |  [optional]
**keywords** | **List&lt;String&gt;** | Keywords that pertain to the use case |  [optional]
**notes** | **String** | Any pertinent notes about the use case |  [optional]

<a name="InputRequirementEnum"></a>
## Enum: InputRequirementEnum
Name | Value
---- | -----
REQUIRED | &quot;INPUT_REQUIRED&quot;
ALLOWED | &quot;INPUT_ALLOWED&quot;
FORBIDDEN | &quot;INPUT_FORBIDDEN&quot;
