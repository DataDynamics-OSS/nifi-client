# VersionedListenPortDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applicationProtocols** | **List&lt;String&gt;** | The application protocol(s) that the listen port could support (if any) |  [optional]
**transportProtocol** | [**TransportProtocolEnum**](#TransportProtocolEnum) | The transport protocol used by the listen port |  [optional]

<a name="TransportProtocolEnum"></a>
## Enum: TransportProtocolEnum
Name | Value
---- | -----
TCP | &quot;TCP&quot;
UDP | &quot;UDP&quot;
