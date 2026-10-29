# BacklogDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**byte_count** | **int** | The total number of bytes remaining on the source, if the component can determine it. | [optional] 
**flow_file_count** | **int** | The number of FlowFiles remaining on the source, if the component can determine it. | [optional] 
**formatted_byte_count** | **str** | The byte count formatted for display in human-readable units (for example, &#x27;4.89 GB&#x27;). Populated whenever byteCount is populated. | [optional] 
**formatted_flow_file_count** | **str** | The FlowFile count formatted for display with locale-appropriate grouping (for example, &#x27;1,025&#x27;). Populated whenever flowFileCount is populated. | [optional] 
**formatted_last_caught_up** | **str** | Human-readable description of how long ago the component was last caught up, for example &#x27;5 mins ago&#x27;, &#x27;in 2 hours&#x27;, or &#x27;now&#x27;. Populated whenever lastCaughtUp is populated. | [optional] 
**formatted_record_count** | **str** | The record count formatted for display with locale-appropriate grouping (for example, &#x27;1,025&#x27;). Populated whenever recordCount is populated. | [optional] 
**last_caught_up** | **str** | The most recent moment the component observed itself as fully caught up with the source, formatted as an ISO-8601 UTC timestamp. | [optional] 
**precision** | **str** | The precision of the numeric dimensions of this backlog. | [optional] 
**record_count** | **int** | The number of records remaining on the source, if the component can determine it. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

