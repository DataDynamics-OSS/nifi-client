# CopyResponseEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**connections** | [**List&lt;VersionedConnection&gt;**](VersionedConnection.md) | The connections being copied. |  [optional]
**externalControllerServiceReferences** | [**Map&lt;String, ExternalControllerServiceReference&gt;**](ExternalControllerServiceReference.md) | The external controller service references. |  [optional]
**funnels** | [**List&lt;VersionedFunnel&gt;**](VersionedFunnel.md) | The funnels being copied. |  [optional]
**id** | **String** | The id for this copy action. |  [optional]
**inputPorts** | [**List&lt;VersionedPort&gt;**](VersionedPort.md) | The input ports being copied. |  [optional]
**labels** | [**List&lt;VersionedLabel&gt;**](VersionedLabel.md) | The labels being copied. |  [optional]
**outputPorts** | [**List&lt;VersionedPort&gt;**](VersionedPort.md) | The output ports being copied. |  [optional]
**parameterContexts** | [**Map&lt;String, VersionedParameterContext&gt;**](VersionedParameterContext.md) | The referenced parameter contexts. |  [optional]
**parameterProviders** | [**Map&lt;String, ParameterProviderReference&gt;**](ParameterProviderReference.md) | The referenced parameter providers. |  [optional]
**processGroups** | [**List&lt;VersionedProcessGroup&gt;**](VersionedProcessGroup.md) | The process groups being copied. |  [optional]
**processors** | [**List&lt;VersionedProcessor&gt;**](VersionedProcessor.md) | The processors being copied. |  [optional]
**remoteProcessGroups** | [**List&lt;VersionedRemoteProcessGroup&gt;**](VersionedRemoteProcessGroup.md) | The remote process groups being copied. |  [optional]
