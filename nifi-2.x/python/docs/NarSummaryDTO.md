# NarSummaryDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**build_time** | **str** | The time the NAR was built according to it&#x27;s MANIFEST | [optional] 
**coordinate** | [**NarCoordinateDTO**](NarCoordinateDTO.md) |  | [optional] 
**created_by** | **str** | The plugin that created the NAR according to it&#x27;s MANIFEST | [optional] 
**dependency_coordinate** | [**NarCoordinateDTO**](NarCoordinateDTO.md) |  | [optional] 
**digest** | **str** | The hex digest of the NAR contents | [optional] 
**extension_count** | **int** | The number of extensions contained in this NAR | [optional] 
**failure_message** | **str** | Information about why the installation failed, only populated when the state is failed | [optional] 
**identifier** | **str** | The identifier of the NAR. | [optional] 
**install_complete** | **bool** | Indicates if the install task has completed | [optional] 
**source_identifier** | **str** | The identifier of the source of this NAR | [optional] 
**source_type** | **str** | The source of this NAR | [optional] 
**state** | **str** | The state of the NAR (i.e. Installed, or not) | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

