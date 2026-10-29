# ProvenanceDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expiration** | **String** | The timestamp when the query will expire. |  [optional]
**finished** | **Boolean** | Whether the query has finished. |  [optional]
**id** | **String** | The id of the provenance query. |  [optional]
**percentCompleted** | **Integer** | The current percent complete. |  [optional]
**request** | [**ProvenanceRequestDTO**](ProvenanceRequestDTO.md) |  |  [optional]
**results** | [**ProvenanceResultsDTO**](ProvenanceResultsDTO.md) |  |  [optional]
**submissionTime** | **String** | The timestamp when the query was submitted. |  [optional]
**uri** | **String** | The URI for this query. Used for obtaining/deleting the request at a later time |  [optional]
