# ConnectorValueReferenceDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assetReferences** | [**List&lt;AssetReferenceDTO&gt;**](AssetReferenceDTO.md) | The asset references. Applicable when valueType is ASSET_REFERENCE. |  [optional]
**fullyQualifiedSecretName** | **String** | The fully qualified secret name. Applicable when valueType is SECRET_REFERENCE. |  [optional]
**secretName** | **String** | The secret name. Applicable when valueType is SECRET_REFERENCE. |  [optional]
**secretProviderId** | **String** | The secret provider identifier. Applicable when valueType is SECRET_REFERENCE. |  [optional]
**secretProviderName** | **String** | The secret provider name. Applicable when valueType is SECRET_REFERENCE. |  [optional]
**value** | **String** | The string literal value. Applicable when valueType is STRING_LITERAL. |  [optional]
**valueType** | **String** | The type of value (STRING_LITERAL, ASSET_REFERENCE, or SECRET_REFERENCE). |  [optional]
