# ProvenanceNodeDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**childUuids** | **List&lt;String&gt;** | The uuid of the children FlowFiles of the provenance event. |  [optional]
**clusterNodeIdentifier** | **String** | The identifier of the node that this event/flowfile originated from. |  [optional]
**componentType** | **String** | If the type is EVENT, this is the type of the component that generated the event. |  [optional]
**eventType** | **String** | If the type is EVENT, this is the type of event. |  [optional]
**flowFileUuid** | **String** | The uuid of the flowfile associated with the provenance event. |  [optional]
**id** | **String** | The id of the node. |  [optional]
**millis** | **Long** | The timestamp of the node in milliseconds. |  [optional]
**parentUuids** | **List&lt;String&gt;** | The uuid of the parent FlowFiles of the provenance event. |  [optional]
**timestamp** | **String** | The timestamp of the node formatted. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of the node. |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
FLOWFILE | &quot;FLOWFILE&quot;
EVENT | &quot;EVENT&quot;
