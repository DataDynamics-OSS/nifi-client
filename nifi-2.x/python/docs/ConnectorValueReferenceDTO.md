# ConnectorValueReferenceDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_references** | [**list[AssetReferenceDTO]**](AssetReferenceDTO.md) | The asset references. Applicable when valueType is ASSET_REFERENCE. | [optional] 
**fully_qualified_secret_name** | **str** | The fully qualified secret name. Applicable when valueType is SECRET_REFERENCE. | [optional] 
**secret_name** | **str** | The secret name. Applicable when valueType is SECRET_REFERENCE. | [optional] 
**secret_provider_id** | **str** | The secret provider identifier. Applicable when valueType is SECRET_REFERENCE. | [optional] 
**secret_provider_name** | **str** | The secret provider name. Applicable when valueType is SECRET_REFERENCE. | [optional] 
**value** | **str** | The string literal value. Applicable when valueType is STRING_LITERAL. | [optional] 
**value_type** | **str** | The type of value (STRING_LITERAL, ASSET_REFERENCE, or SECRET_REFERENCE). | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

