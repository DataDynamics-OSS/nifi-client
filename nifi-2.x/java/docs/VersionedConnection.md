# VersionedConnection

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backPressureDataSizeThreshold** | **String** | The object data size threshold for determining when back pressure is applied. Updating this value is a passive change in the sense that it won&#x27;t impact whether existing files over the limit are affected but it does help feeder processors to stop pushing too much into this work queue. |  [optional]
**backPressureObjectThreshold** | **Long** | The object count threshold for determining when back pressure is applied. Updating this value is a passive change in the sense that it won&#x27;t impact whether existing files over the limit are affected but it does help feeder processors to stop pushing too much into this work queue. |  [optional]
**bends** | [**List&lt;Position&gt;**](Position.md) | The bend points on the connection. |  [optional]
**comments** | **String** | The user-supplied comments for the component |  [optional]
**componentType** | [**ComponentTypeEnum**](#ComponentTypeEnum) |  |  [optional]
**destination** | [**ConnectableComponent**](ConnectableComponent.md) |  |  [optional]
**flowFileExpiration** | **String** | The amount of time a FlowFile may be in the flow before it will be automatically aged out of the flow. Once a FlowFile reaches this age it will be terminated from the flow the next time a processor attempts to start work on it. |  [optional]
**groupIdentifier** | **String** | The ID of the Process Group that this component belongs to |  [optional]
**identifier** | **String** | The component&#x27;s unique identifier |  [optional]
**instanceIdentifier** | **String** | The instance ID of an existing component that is described by this VersionedComponent, or null if this is not mapped to an instantiated component |  [optional]
**labelIndex** | **Integer** | The index of the bend point where to place the connection label. |  [optional]
**loadBalanceCompression** | **String** | Whether or not compression should be used when transferring FlowFiles between nodes Possible returned values: DO_NOT_COMPRESS, COMPRESS_ATTRIBUTES_ONLY, COMPRESS_ATTRIBUTES_AND_CONTENT. See LoadBalanceCompression.class for more details. |  [optional]
**loadBalanceStrategy** | **String** | The Strategy to use for load balancing data across the cluster, or null, if no Load Balance Strategy has been specified. Possible returned values: DO_NOT_LOAD_BALANCE, PARTITION_BY_ATTRIBUTE, ROUND_ROBIN, SINGLE_NODE. See LoadBalanceStrategy.class for more details. |  [optional]
**name** | **String** | The component&#x27;s name |  [optional]
**partitioningAttribute** | **String** | The attribute to use for partitioning data as it is load balanced across the cluster. If the Load Balance Strategy is configured to use PARTITION_BY_ATTRIBUTE, the value returned by this method is the name of the FlowFile Attribute that will be used to determine which node in the cluster should receive a given FlowFile. If the Load Balance Strategy is unset or is set to any other value, the Partitioning Attribute has no effect. |  [optional]
**position** | [**Position**](Position.md) |  |  [optional]
**prioritizers** | **List&lt;String&gt;** | The comparators used to prioritize the queue. |  [optional]
**selectedRelationships** | **List&lt;String&gt;** | The selected relationship that comprise the connection. |  [optional]
**source** | [**ConnectableComponent**](ConnectableComponent.md) |  |  [optional]
**zIndex** | **Long** | The z index of the connection. |  [optional]

<a name="ComponentTypeEnum"></a>
## Enum: ComponentTypeEnum
Name | Value
---- | -----
CONNECTION | &quot;CONNECTION&quot;
PROCESSOR | &quot;PROCESSOR&quot;
PROCESS_GROUP | &quot;PROCESS_GROUP&quot;
REMOTE_PROCESS_GROUP | &quot;REMOTE_PROCESS_GROUP&quot;
INPUT_PORT | &quot;INPUT_PORT&quot;
OUTPUT_PORT | &quot;OUTPUT_PORT&quot;
REMOTE_INPUT_PORT | &quot;REMOTE_INPUT_PORT&quot;
REMOTE_OUTPUT_PORT | &quot;REMOTE_OUTPUT_PORT&quot;
FUNNEL | &quot;FUNNEL&quot;
LABEL | &quot;LABEL&quot;
CONTROLLER_SERVICE | &quot;CONTROLLER_SERVICE&quot;
REPORTING_TASK | &quot;REPORTING_TASK&quot;
FLOW_ANALYSIS_RULE | &quot;FLOW_ANALYSIS_RULE&quot;
PARAMETER_CONTEXT | &quot;PARAMETER_CONTEXT&quot;
PARAMETER_PROVIDER | &quot;PARAMETER_PROVIDER&quot;
FLOW_REGISTRY_CLIENT | &quot;FLOW_REGISTRY_CLIENT&quot;
CONNECTOR | &quot;CONNECTOR&quot;
