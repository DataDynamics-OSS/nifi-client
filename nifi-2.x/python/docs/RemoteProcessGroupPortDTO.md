# RemoteProcessGroupPortDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_settings** | [**BatchSettingsDTO**](BatchSettingsDTO.md) |  | [optional] 
**comments** | **str** | The comments as configured on the target port. | [optional] 
**concurrently_schedulable_task_count** | **int** | The number of task that may transmit FlowFiles to the target port concurrently. | [optional] 
**connected** | **bool** | Whether the port has either an incoming or outgoing connection. | [optional] 
**exists** | **bool** | Whether the target port exists. | [optional] 
**group_id** | **str** | The id of the remote process group that the port resides in. | [optional] 
**id** | **str** | The id of the port. | [optional] 
**name** | **str** | The name of the target port. | [optional] 
**target_id** | **str** | The id of the target port. | [optional] 
**target_running** | **bool** | Whether the target port is running. | [optional] 
**transmitting** | **bool** | Whether the remote port is configured for transmission. | [optional] 
**use_compression** | **bool** | Whether the FlowFiles are compressed when sent to the target port. | [optional] 
**versioned_component_id** | **str** | The ID of the corresponding component that is under version control | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

