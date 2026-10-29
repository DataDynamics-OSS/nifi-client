# ListingRequestDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destinationRunning** | **Boolean** | Whether the destination of the connection is running |  [optional]
**failureReason** | **String** | The reason, if any, that this listing request failed. |  [optional]
**finished** | **Boolean** | Whether the query has finished. |  [optional]
**flowFileSummaries** | [**List&lt;FlowFileSummaryDTO&gt;**](FlowFileSummaryDTO.md) | The FlowFile summaries. The summaries will be populated once the request has completed. |  [optional]
**id** | **String** | The id for this listing request. |  [optional]
**lastUpdated** | **String** | The last time this listing request was updated. |  [optional]
**maxResults** | **Integer** | The maximum number of FlowFileSummary objects to return |  [optional]
**percentCompleted** | **Integer** | The current percent complete. |  [optional]
**queueSize** | [**QueueSizeDTO**](QueueSizeDTO.md) |  |  [optional]
**sourceRunning** | **Boolean** | Whether the source of the connection is running |  [optional]
**state** | **String** | The current state of the listing request. |  [optional]
**submissionTime** | **String** | The timestamp when the query was submitted. |  [optional]
**uri** | **String** | The URI for future requests to this listing request. |  [optional]
