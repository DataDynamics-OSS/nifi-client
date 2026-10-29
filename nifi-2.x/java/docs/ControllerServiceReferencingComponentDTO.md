# ControllerServiceReferencingComponentDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeThreadCount** | **Integer** | The number of active threads for the referencing component. |  [optional]
**descriptors** | [**Map&lt;String, PropertyDescriptorDTO&gt;**](PropertyDescriptorDTO.md) | The descriptors for the component properties. |  [optional]
**groupId** | **String** | The group id for the component referencing a controller service. If this component is another controller service or a reporting task, this field is blank. |  [optional]
**id** | **String** | The id of the component referencing a controller service. |  [optional]
**name** | **String** | The name of the component referencing a controller service. |  [optional]
**properties** | **Map&lt;String, String&gt;** | The properties for the component. |  [optional]
**referenceCycle** | **Boolean** | If the referencing component represents a controller service, this indicates whether it has already been represented in this hierarchy. |  [optional]
**referenceType** | [**ReferenceTypeEnum**](#ReferenceTypeEnum) | The type of reference this is. |  [optional]
**referencingComponents** | [**List&lt;ControllerServiceReferencingComponentEntity&gt;**](ControllerServiceReferencingComponentEntity.md) | If the referencing component represents a controller service, these are the components that reference it. |  [optional]
**state** | **String** | The scheduled state of a processor or reporting task referencing a controller service. If this component is another controller service, this field represents the controller service state. |  [optional]
**type** | **String** | The type of the component referencing a controller service in simple Java class name format without package name. |  [optional]
**validationErrors** | **List&lt;String&gt;** | The validation errors for the component. |  [optional]

<a name="ReferenceTypeEnum"></a>
## Enum: ReferenceTypeEnum
Name | Value
---- | -----
PROCESSOR | &quot;Processor&quot;
CONTROLLERSERVICE | &quot;ControllerService&quot;
REPORTINGTASK | &quot;ReportingTask&quot;
FLOWREGISTRYCLIENT | &quot;FlowRegistryClient&quot;
PARAMETERPROVIDER | &quot;ParameterProvider&quot;
FLOWANALYSISRULE | &quot;FlowAnalysisRule&quot;
