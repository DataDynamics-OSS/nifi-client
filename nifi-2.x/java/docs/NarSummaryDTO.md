# NarSummaryDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**buildTime** | **String** | The time the NAR was built according to it&#x27;s MANIFEST |  [optional]
**coordinate** | [**NarCoordinateDTO**](NarCoordinateDTO.md) |  |  [optional]
**createdBy** | **String** | The plugin that created the NAR according to it&#x27;s MANIFEST |  [optional]
**dependencyCoordinate** | [**NarCoordinateDTO**](NarCoordinateDTO.md) |  |  [optional]
**digest** | **String** | The hex digest of the NAR contents |  [optional]
**extensionCount** | **Integer** | The number of extensions contained in this NAR |  [optional]
**failureMessage** | **String** | Information about why the installation failed, only populated when the state is failed |  [optional]
**identifier** | **String** | The identifier of the NAR. |  [optional]
**installComplete** | **Boolean** | Indicates if the install task has completed |  [optional]
**sourceIdentifier** | **String** | The identifier of the source of this NAR |  [optional]
**sourceType** | **String** | The source of this NAR |  [optional]
**state** | **String** | The state of the NAR (i.e. Installed, or not) |  [optional]
