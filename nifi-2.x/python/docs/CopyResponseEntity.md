# CopyResponseEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**connections** | [**list[VersionedConnection]**](VersionedConnection.md) | The connections being copied. | [optional] 
**external_controller_service_references** | [**dict(str, ExternalControllerServiceReference)**](ExternalControllerServiceReference.md) | The external controller service references. | [optional] 
**funnels** | [**list[VersionedFunnel]**](VersionedFunnel.md) | The funnels being copied. | [optional] 
**id** | **str** | The id for this copy action. | [optional] 
**input_ports** | [**list[VersionedPort]**](VersionedPort.md) | The input ports being copied. | [optional] 
**labels** | [**list[VersionedLabel]**](VersionedLabel.md) | The labels being copied. | [optional] 
**output_ports** | [**list[VersionedPort]**](VersionedPort.md) | The output ports being copied. | [optional] 
**parameter_contexts** | [**dict(str, VersionedParameterContext)**](VersionedParameterContext.md) | The referenced parameter contexts. | [optional] 
**parameter_providers** | [**dict(str, ParameterProviderReference)**](ParameterProviderReference.md) | The referenced parameter providers. | [optional] 
**process_groups** | [**list[VersionedProcessGroup]**](VersionedProcessGroup.md) | The process groups being copied. | [optional] 
**processors** | [**list[VersionedProcessor]**](VersionedProcessor.md) | The processors being copied. | [optional] 
**remote_process_groups** | [**list[VersionedRemoteProcessGroup]**](VersionedRemoteProcessGroup.md) | The remote process groups being copied. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

