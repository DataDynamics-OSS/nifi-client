# BacklogDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**byteCount** | **Long** | The total number of bytes remaining on the source, if the component can determine it. |  [optional]
**flowFileCount** | **Long** | The number of FlowFiles remaining on the source, if the component can determine it. |  [optional]
**formattedByteCount** | **String** | The byte count formatted for display in human-readable units (for example, &#x27;4.89 GB&#x27;). Populated whenever byteCount is populated. |  [optional]
**formattedFlowFileCount** | **String** | The FlowFile count formatted for display with locale-appropriate grouping (for example, &#x27;1,025&#x27;). Populated whenever flowFileCount is populated. |  [optional]
**formattedLastCaughtUp** | **String** | Human-readable description of how long ago the component was last caught up, for example &#x27;5 mins ago&#x27;, &#x27;in 2 hours&#x27;, or &#x27;now&#x27;. Populated whenever lastCaughtUp is populated. |  [optional]
**formattedRecordCount** | **String** | The record count formatted for display with locale-appropriate grouping (for example, &#x27;1,025&#x27;). Populated whenever recordCount is populated. |  [optional]
**lastCaughtUp** | **String** | The most recent moment the component observed itself as fully caught up with the source, formatted as an ISO-8601 UTC timestamp. |  [optional]
**precision** | [**PrecisionEnum**](#PrecisionEnum) | The precision of the numeric dimensions of this backlog. |  [optional]
**recordCount** | **Long** | The number of records remaining on the source, if the component can determine it. |  [optional]

<a name="PrecisionEnum"></a>
## Enum: PrecisionEnum
Name | Value
---- | -----
EXACT | &quot;EXACT&quot;
AT_LEAST | &quot;AT_LEAST&quot;
