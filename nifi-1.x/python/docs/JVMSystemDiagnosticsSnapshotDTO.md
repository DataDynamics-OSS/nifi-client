# JVMSystemDiagnosticsSnapshotDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**flow_file_repository_storage_usage** | [**RepositoryUsageDTO**](RepositoryUsageDTO.md) | Information about the FlowFile Repository&#39;s usage | [optional] 
**content_repository_storage_usage** | [**list[RepositoryUsageDTO]**](RepositoryUsageDTO.md) | Information about the Content Repository&#39;s usage | [optional] 
**provenance_repository_storage_usage** | [**list[RepositoryUsageDTO]**](RepositoryUsageDTO.md) | Information about the Provenance Repository&#39;s usage | [optional] 
**max_heap_bytes** | **int** | The maximum number of bytes that the JVM heap is configured to use for heap | [optional] 
**max_heap** | **str** | The maximum number of bytes that the JVM heap is configured to use, as a human-readable value | [optional] 
**garbage_collection_diagnostics** | [**list[GarbageCollectionDiagnosticsDTO]**](GarbageCollectionDiagnosticsDTO.md) | Diagnostic information about the JVM&#39;s garbage collections | [optional] 
**cpu_cores** | **int** | The number of CPU Cores available on the system | [optional] 
**cpu_load_average** | **float** | The 1-minute CPU Load Average | [optional] 
**physical_memory_bytes** | **int** | The number of bytes of RAM available on the system | [optional] 
**physical_memory** | **str** | The number of bytes of RAM available on the system as a human-readable value | [optional] 
**open_file_descriptors** | **int** | The number of files that are open by the NiFi process | [optional] 
**max_open_file_descriptors** | **int** | The maximum number of open file descriptors that are available to each process | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


