# ProcessorDiagnosticsDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**processor** | [**ProcessorDTO**](ProcessorDTO.md) | Information about the Processor for which the Diagnostic Report is generated | [optional] 
**processor_status** | [**ProcessorStatusDTO**](ProcessorStatusDTO.md) | The Status for the Processor for which the Diagnostic Report is generated | [optional] 
**referenced_controller_services** | [**list[ControllerServiceDiagnosticsDTO]**](ControllerServiceDiagnosticsDTO.md) | Diagnostic Information about all Controller Services that the Processor is referencing | [optional] 
**incoming_connections** | [**list[ConnectionDiagnosticsDTO]**](ConnectionDiagnosticsDTO.md) | Diagnostic Information about all incoming Connections | [optional] 
**outgoing_connections** | [**list[ConnectionDiagnosticsDTO]**](ConnectionDiagnosticsDTO.md) | Diagnostic Information about all outgoing Connections | [optional] 
**jvm_diagnostics** | [**JVMDiagnosticsDTO**](JVMDiagnosticsDTO.md) | Diagnostic Information about the JVM and system-level diagnostics | [optional] 
**thread_dumps** | [**list[ThreadDumpDTO]**](ThreadDumpDTO.md) | Thread Dumps that were taken of the threads that are active in the Processor | [optional] 
**class_loader_diagnostics** | [**ClassLoaderDiagnosticsDTO**](ClassLoaderDiagnosticsDTO.md) | Information about the Controller Service&#39;s Class Loader | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


