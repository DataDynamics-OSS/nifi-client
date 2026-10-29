# ConnectionStatusPredictionsSnapshotDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**predictedBytesAtNextInterval** | **Long** | The predicted total number of bytes in the queue at the next configured interval. |  [optional]
**predictedCountAtNextInterval** | **Integer** | The predicted number of queued objects at the next configured interval. |  [optional]
**predictedMillisUntilBytesBackpressure** | **Long** | The predicted number of milliseconds before the connection will have backpressure applied, based on the total number of bytes in the queue. |  [optional]
**predictedMillisUntilCountBackpressure** | **Long** | The predicted number of milliseconds before the connection will have backpressure applied, based on the queued count. |  [optional]
**predictedPercentBytes** | **Integer** | Predicted connection percent use regarding queued FlowFiles size and backpressure threshold if configured. |  [optional]
**predictedPercentCount** | **Integer** | Predicted connection percent use regarding queued FlowFiles count and backpressure threshold if configured. |  [optional]
**predictionIntervalSeconds** | **Integer** | The configured interval (in seconds) for predicting connection queue count and size (and percent usage). |  [optional]
