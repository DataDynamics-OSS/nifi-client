# VersionedRemoteGroupPort

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batch_size** | [**BatchSize**](BatchSize.md) |  | [optional] 
**comments** | **str** | The user-supplied comments for the component | [optional] 
**component_type** | **str** |  | [optional] 
**concurrently_schedulable_task_count** | **int** | The number of task that may transmit FlowFiles to the target port concurrently. | [optional] 
**group_identifier** | **str** | The ID of the Process Group that this component belongs to | [optional] 
**identifier** | **str** | The component&#x27;s unique identifier | [optional] 
**instance_identifier** | **str** | The instance ID of an existing component that is described by this VersionedComponent, or null if this is not mapped to an instantiated component | [optional] 
**name** | **str** | The component&#x27;s name | [optional] 
**position** | [**Position**](Position.md) |  | [optional] 
**remote_group_id** | **str** | The id of the remote process group that the port resides in. | [optional] 
**scheduled_state** | **str** | The scheduled state of the component | [optional] 
**target_id** | **str** | The ID of the port on the target NiFi instance | [optional] 
**use_compression** | **bool** | Whether the FlowFiles are compressed when sent to the target port. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

