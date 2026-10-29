# ConnectionDiagnosticsSnapshotDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total_flow_file_count** | **int** | Total number of FlowFiles owned by the Connection | [optional] 
**total_byte_count** | **int** | Total number of bytes that make up the content for the FlowFiles owned by this Connection | [optional] 
**node_identifier** | **str** | The Node Identifier that this information pertains to | [optional] 
**local_queue_partition** | [**LocalQueuePartitionDTO**](LocalQueuePartitionDTO.md) | The local queue partition, from which components can pull FlowFiles on this node. | [optional] 
**remote_queue_partitions** | [**list[RemoteQueuePartitionDTO]**](RemoteQueuePartitionDTO.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


