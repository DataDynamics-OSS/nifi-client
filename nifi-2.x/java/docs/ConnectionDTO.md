# ConnectionDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**availableRelationships** | **List&lt;String&gt;** | The relationships that the source of the connection currently supports. |  [optional]
**backPressureDataSizeThreshold** | **String** | The object data size threshold for determining when back pressure is applied. Updating this value is a passive change in the sense that it won&#x27;t impact whether existing files over the limit are affected but it does help feeder processors to stop pushing too much into this work queue. |  [optional]
**backPressureObjectThreshold** | **Long** | The object count threshold for determining when back pressure is applied. Updating this value is a passive change in the sense that it won&#x27;t impact whether existing files over the limit are affected but it does help feeder processors to stop pushing too much into this work queue. |  [optional]
**bends** | [**List&lt;PositionDTO&gt;**](PositionDTO.md) | The bend points on the connection. |  [optional]
**destination** | [**ConnectableDTO**](ConnectableDTO.md) |  |  [optional]
**flowFileExpiration** | **String** | The amount of time a flow file may be in the flow before it will be automatically aged out of the flow. Once a flow file reaches this age it will be terminated from the flow the next time a processor attempts to start work on it. |  [optional]
**getzIndex** | **Long** | The z index of the connection. |  [optional]
**id** | **String** | The id of the component. |  [optional]
**labelIndex** | **Integer** | The index of the bend point where to place the connection label. |  [optional]
**loadBalanceCompression** | **String** | Whether or not data should be compressed when being transferred between nodes in the cluster. Possible returned values: DO_NOT_COMPRESS, COMPRESS_ATTRIBUTES_ONLY, COMPRESS_ATTRIBUTES_AND_CONTENT. See LoadBalanceCompression.class for more details. |  [optional]
**loadBalancePartitionAttribute** | **String** | The FlowFile Attribute to use for determining which node a FlowFile will go to if the Load Balancing Strategy is set to PARTITION_BY_ATTRIBUTE |  [optional]
**loadBalanceStatus** | **String** | The current status of the Connection&#x27;s Load Balancing Activities. Status can indicate that Load Balancing is not configured for the connection, that Load Balancing is configured but inactive (not currently transferring data to another node), or that Load Balancing is configured and actively transferring data to another node. Possible returned values: LOAD_BALANCE_NOT_CONFIGURED, LOAD_BALANCE_INACTIVE, LOAD_BALANCE_ACTIVE. See LoadBalanceStatus.class for more details. |  [optional]
**loadBalanceStrategy** | **String** | How to load balance the data in this Connection across the nodes in the cluster. Possible returned values: DO_NOT_LOAD_BALANCE, PARTITION_BY_ATTRIBUTE, ROUND_ROBIN, SINGLE_NODE. See LoadBalanceStrategy.class for more details. |  [optional]
**name** | **String** | The name of the connection. |  [optional]
**parentGroupId** | **String** | The id of parent process group of this component if applicable. |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) |  |  [optional]
**prioritizers** | **List&lt;String&gt;** | The comparators used to prioritize the queue. |  [optional]
**retriedRelationships** | **List&lt;String&gt;** | The relationships from the source of the connection that are configured to be retried. |  [optional]
**selectedRelationships** | **List&lt;String&gt;** | The selected relationship that comprise the connection. |  [optional]
**source** | [**ConnectableDTO**](ConnectableDTO.md) |  |  [optional]
**versionedComponentId** | **String** | The ID of the corresponding component that is under version control |  [optional]
