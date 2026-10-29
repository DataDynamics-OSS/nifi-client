# VersionedRemoteProcessGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**comments** | **str** | The user-supplied comments for the component | [optional] 
**communications_timeout** | **str** | The time period used for the timeout when communicating with the target. | [optional] 
**component_type** | **str** |  | [optional] 
**group_identifier** | **str** | The ID of the Process Group that this component belongs to | [optional] 
**identifier** | **str** | The component&#x27;s unique identifier | [optional] 
**input_ports** | [**list[VersionedRemoteGroupPort]**](VersionedRemoteGroupPort.md) | A Set of Input Ports that can be connected to, in order to send data to the remote NiFi instance | [optional] 
**instance_identifier** | **str** | The instance ID of an existing component that is described by this VersionedComponent, or null if this is not mapped to an instantiated component | [optional] 
**local_network_interface** | **str** | The local network interface to send/receive data. If not specified, any local address is used. If clustered, all nodes must have an interface with this identifier. | [optional] 
**name** | **str** | The component&#x27;s name | [optional] 
**output_ports** | [**list[VersionedRemoteGroupPort]**](VersionedRemoteGroupPort.md) | A Set of Output Ports that can be connected to, in order to pull data from the remote NiFi instance | [optional] 
**position** | [**Position**](Position.md) |  | [optional] 
**proxy_host** | **str** |  | [optional] 
**proxy_password** | **str** |  | [optional] 
**proxy_port** | **int** |  | [optional] 
**proxy_user** | **str** |  | [optional] 
**target_uris** | **str** | The target URIs of the remote process group. If target uris is not set but target uri is set, then returns the single target uri. If neither target uris nor target uri is set, then returns null. | [optional] 
**transport_protocol** | **str** | The Transport Protocol that is used for Site-to-Site communications. Possible returned values: RAW, HTTP. | [optional] 
**yield_duration** | **str** | When yielding, this amount of time must elapse before the remote process group is scheduled again. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

