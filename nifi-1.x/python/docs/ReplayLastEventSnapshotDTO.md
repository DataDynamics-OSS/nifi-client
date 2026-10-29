# ReplayLastEventSnapshotDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**events_replayed** | **list[int]** | The IDs of the events that were successfully replayed | [optional] 
**failure_explanation** | **str** | If unable to replay an event, specifies why the event could not be replayed | [optional] 
**event_available** | **bool** | Whether or not an event was available. This may not be populated if there was a failure. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


