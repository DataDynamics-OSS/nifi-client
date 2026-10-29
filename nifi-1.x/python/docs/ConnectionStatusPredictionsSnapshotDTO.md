# ConnectionStatusPredictionsSnapshotDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**predicted_millis_until_count_backpressure** | **int** | The predicted number of milliseconds before the connection will have backpressure applied, based on the queued count. | [optional] 
**predicted_millis_until_bytes_backpressure** | **int** | The predicted number of milliseconds before the connection will have backpressure applied, based on the total number of bytes in the queue. | [optional] 
**prediction_interval_seconds** | **int** | The configured interval (in seconds) for predicting connection queue count and size (and percent usage). | [optional] 
**predicted_count_at_next_interval** | **int** | The predicted number of queued objects at the next configured interval. | [optional] 
**predicted_bytes_at_next_interval** | **int** | The predicted total number of bytes in the queue at the next configured interval. | [optional] 
**predicted_percent_count** | **int** | Predicted connection percent use regarding queued flow files count and backpressure threshold if configured. | [optional] 
**predicted_percent_bytes** | **int** | Predicted connection percent use regarding queued flow files size and backpressure threshold if configured. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


