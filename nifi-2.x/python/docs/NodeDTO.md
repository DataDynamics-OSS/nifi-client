# NodeDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active_thread_count** | **int** | The active threads for the NiFi on the node. | [optional] 
**address** | **str** | The node&#x27;s host/ip address. | [optional] 
**api_port** | **int** | The port the node is listening for API requests. | [optional] 
**bytes_queued** | **int** | The total size of all FlowFiles that are queued up on the node | [optional] 
**connection_requested** | **str** | The time of the node&#x27;s last connection request. | [optional] 
**events** | [**list[NodeEventDTO]**](NodeEventDTO.md) | The node&#x27;s events. | [optional] 
**flow_file_bytes** | **int** |  | [optional] 
**flow_files_queued** | **int** | The number of FlowFiles that are queued up on the node | [optional] 
**heartbeat** | **str** | the time of the nodes&#x27;s last heartbeat. | [optional] 
**node_id** | **str** | The id of the node. | [optional] 
**node_start_time** | **str** | The time at which this Node was last refreshed. | [optional] 
**queued** | **str** | The queue the NiFi on the node. | [optional] 
**roles** | **list[str]** | The roles of this node. | [optional] 
**status** | **str** | The node&#x27;s status. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

