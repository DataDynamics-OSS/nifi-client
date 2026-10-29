# RemoteProcessGroupPortDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batchSettings** | [**BatchSettingsDTO**](BatchSettingsDTO.md) |  |  [optional]
**comments** | **String** | The comments as configured on the target port. |  [optional]
**concurrentlySchedulableTaskCount** | **Integer** | The number of task that may transmit FlowFiles to the target port concurrently. |  [optional]
**connected** | **Boolean** | Whether the port has either an incoming or outgoing connection. |  [optional]
**exists** | **Boolean** | Whether the target port exists. |  [optional]
**groupId** | **String** | The id of the remote process group that the port resides in. |  [optional]
**id** | **String** | The id of the port. |  [optional]
**name** | **String** | The name of the target port. |  [optional]
**targetId** | **String** | The id of the target port. |  [optional]
**targetRunning** | **Boolean** | Whether the target port is running. |  [optional]
**transmitting** | **Boolean** | Whether the remote port is configured for transmission. |  [optional]
**useCompression** | **Boolean** | Whether the FlowFiles are compressed when sent to the target port. |  [optional]
**versionedComponentId** | **String** | The ID of the corresponding component that is under version control |  [optional]
