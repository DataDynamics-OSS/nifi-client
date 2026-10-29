# ConnectionStatisticsSnapshotDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The id of the connection. |  [optional]
**predictedBytesAtNextInterval** | **Long** | The predicted total number of bytes in the queue at the next configured interval. |  [optional]
**predictedCountAtNextInterval** | **Integer** | The predicted number of queued objects at the next configured interval. |  [optional]
**predictedMillisUntilBytesBackpressure** | **Long** | The predicted number of milliseconds before the connection will have backpressure applied, based on the total number of bytes in the queue. |  [optional]
**predictedMillisUntilCountBackpressure** | **Long** | The predicted number of milliseconds before the connection will have backpressure applied, based on the queued count. |  [optional]
**predictedPercentBytes** | **Integer** | The predicted percentage of bytes in the queue against current threshold at the next configured interval. |  [optional]
**predictedPercentCount** | **Integer** | The predicted percentage of queued objects at the next configured interval. |  [optional]
**predictionIntervalMillis** | **Long** | The prediction interval in seconds |  [optional]
