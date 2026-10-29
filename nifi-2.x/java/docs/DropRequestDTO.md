# DropRequestDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**current** | **String** | The count and size of FlowFiles currently queued. |  [optional]
**currentCount** | **Integer** | The number of FlowFiles currently queued. |  [optional]
**currentSize** | **Long** | The size of FlowFiles currently queued in bytes. |  [optional]
**dropped** | **String** | The count and size of FlowFiles that have been dropped thus far. |  [optional]
**droppedCount** | **Integer** | The number of FlowFiles that have been dropped thus far. |  [optional]
**droppedSize** | **Long** | The size of FlowFiles that have been dropped thus far in bytes. |  [optional]
**failureReason** | **String** | The reason, if any, that this drop request failed. |  [optional]
**finished** | **Boolean** | Whether the query has finished. |  [optional]
**id** | **String** | The id for this drop request. |  [optional]
**lastUpdated** | **String** | The last time this drop request was updated. |  [optional]
**original** | **String** | The count and size of FlowFiles to be dropped as a result of this request. |  [optional]
**originalCount** | **Integer** | The number of FlowFiles to be dropped as a result of this request. |  [optional]
**originalSize** | **Long** | The size of FlowFiles to be dropped as a result of this request in bytes. |  [optional]
**percentCompleted** | **Integer** | The current percent complete. |  [optional]
**state** | **String** | The current state of the drop request. |  [optional]
**submissionTime** | **String** | The timestamp when the query was submitted. |  [optional]
**uri** | **String** | The URI for future requests to this drop request. |  [optional]
