# ConnectionDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**available_relationships** | **list[str]** | The relationships that the source of the connection currently supports. | [optional] 
**back_pressure_data_size_threshold** | **str** | The object data size threshold for determining when back pressure is applied. Updating this value is a passive change in the sense that it won&#x27;t impact whether existing files over the limit are affected but it does help feeder processors to stop pushing too much into this work queue. | [optional] 
**back_pressure_object_threshold** | **int** | The object count threshold for determining when back pressure is applied. Updating this value is a passive change in the sense that it won&#x27;t impact whether existing files over the limit are affected but it does help feeder processors to stop pushing too much into this work queue. | [optional] 
**bends** | [**list[PositionDTO]**](PositionDTO.md) | The bend points on the connection. | [optional] 
**destination** | [**ConnectableDTO**](ConnectableDTO.md) |  | [optional] 
**flow_file_expiration** | **str** | The amount of time a flow file may be in the flow before it will be automatically aged out of the flow. Once a flow file reaches this age it will be terminated from the flow the next time a processor attempts to start work on it. | [optional] 
**getz_index** | **int** | The z index of the connection. | [optional] 
**id** | **str** | The id of the component. | [optional] 
**label_index** | **int** | The index of the bend point where to place the connection label. | [optional] 
**load_balance_compression** | **str** | Whether or not data should be compressed when being transferred between nodes in the cluster. Possible returned values: DO_NOT_COMPRESS, COMPRESS_ATTRIBUTES_ONLY, COMPRESS_ATTRIBUTES_AND_CONTENT. See LoadBalanceCompression.class for more details. | [optional] 
**load_balance_partition_attribute** | **str** | The FlowFile Attribute to use for determining which node a FlowFile will go to if the Load Balancing Strategy is set to PARTITION_BY_ATTRIBUTE | [optional] 
**load_balance_status** | **str** | The current status of the Connection&#x27;s Load Balancing Activities. Status can indicate that Load Balancing is not configured for the connection, that Load Balancing is configured but inactive (not currently transferring data to another node), or that Load Balancing is configured and actively transferring data to another node. Possible returned values: LOAD_BALANCE_NOT_CONFIGURED, LOAD_BALANCE_INACTIVE, LOAD_BALANCE_ACTIVE. See LoadBalanceStatus.class for more details. | [optional] 
**load_balance_strategy** | **str** | How to load balance the data in this Connection across the nodes in the cluster. Possible returned values: DO_NOT_LOAD_BALANCE, PARTITION_BY_ATTRIBUTE, ROUND_ROBIN, SINGLE_NODE. See LoadBalanceStrategy.class for more details. | [optional] 
**name** | **str** | The name of the connection. | [optional] 
**parent_group_id** | **str** | The id of parent process group of this component if applicable. | [optional] 
**position** | [**PositionDTO**](PositionDTO.md) |  | [optional] 
**prioritizers** | **list[str]** | The comparators used to prioritize the queue. | [optional] 
**retried_relationships** | **list[str]** | The relationships from the source of the connection that are configured to be retried. | [optional] 
**selected_relationships** | **list[str]** | The selected relationship that comprise the connection. | [optional] 
**source** | [**ConnectableDTO**](ConnectableDTO.md) |  | [optional] 
**versioned_component_id** | **str** | The ID of the corresponding component that is under version control | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

