# VersionedConnection

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**back_pressure_data_size_threshold** | **str** | The object data size threshold for determining when back pressure is applied. Updating this value is a passive change in the sense that it won&#x27;t impact whether existing files over the limit are affected but it does help feeder processors to stop pushing too much into this work queue. | [optional] 
**back_pressure_object_threshold** | **int** | The object count threshold for determining when back pressure is applied. Updating this value is a passive change in the sense that it won&#x27;t impact whether existing files over the limit are affected but it does help feeder processors to stop pushing too much into this work queue. | [optional] 
**bends** | [**list[Position]**](Position.md) | The bend points on the connection. | [optional] 
**comments** | **str** | The user-supplied comments for the component | [optional] 
**component_type** | **str** |  | [optional] 
**destination** | [**ConnectableComponent**](ConnectableComponent.md) |  | [optional] 
**flow_file_expiration** | **str** | The amount of time a FlowFile may be in the flow before it will be automatically aged out of the flow. Once a FlowFile reaches this age it will be terminated from the flow the next time a processor attempts to start work on it. | [optional] 
**group_identifier** | **str** | The ID of the Process Group that this component belongs to | [optional] 
**identifier** | **str** | The component&#x27;s unique identifier | [optional] 
**instance_identifier** | **str** | The instance ID of an existing component that is described by this VersionedComponent, or null if this is not mapped to an instantiated component | [optional] 
**label_index** | **int** | The index of the bend point where to place the connection label. | [optional] 
**load_balance_compression** | **str** | Whether or not compression should be used when transferring FlowFiles between nodes Possible returned values: DO_NOT_COMPRESS, COMPRESS_ATTRIBUTES_ONLY, COMPRESS_ATTRIBUTES_AND_CONTENT. See LoadBalanceCompression.class for more details. | [optional] 
**load_balance_strategy** | **str** | The Strategy to use for load balancing data across the cluster, or null, if no Load Balance Strategy has been specified. Possible returned values: DO_NOT_LOAD_BALANCE, PARTITION_BY_ATTRIBUTE, ROUND_ROBIN, SINGLE_NODE. See LoadBalanceStrategy.class for more details. | [optional] 
**name** | **str** | The component&#x27;s name | [optional] 
**partitioning_attribute** | **str** | The attribute to use for partitioning data as it is load balanced across the cluster. If the Load Balance Strategy is configured to use PARTITION_BY_ATTRIBUTE, the value returned by this method is the name of the FlowFile Attribute that will be used to determine which node in the cluster should receive a given FlowFile. If the Load Balance Strategy is unset or is set to any other value, the Partitioning Attribute has no effect. | [optional] 
**position** | [**Position**](Position.md) |  | [optional] 
**prioritizers** | **list[str]** | The comparators used to prioritize the queue. | [optional] 
**selected_relationships** | **list[str]** | The selected relationship that comprise the connection. | [optional] 
**source** | [**ConnectableComponent**](ConnectableComponent.md) |  | [optional] 
**z_index** | **int** | The z index of the connection. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

