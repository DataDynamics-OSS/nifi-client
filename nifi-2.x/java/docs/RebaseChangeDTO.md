# RebaseChangeDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**classification** | **String** | The classification of this change: COMPATIBLE, CONFLICTING, or UNSUPPORTED |  [optional]
**componentId** | **String** | The ID of the component that was changed |  [optional]
**componentName** | **String** | The name of the component that was changed |  [optional]
**componentType** | **String** | The type of the component that was changed |  [optional]
**conflictCode** | **String** | A code identifying the type of conflict, or null if the change is not conflicting |  [optional]
**conflictDetail** | **String** | A detailed description of the conflict, or null if the change is not conflicting |  [optional]
**differenceType** | **String** | The type of difference detected for this change |  [optional]
**fieldName** | **String** | The name of the field that was changed, or null if not applicable |  [optional]
**localValue** | **String** | The local value of the field, or null if not applicable |  [optional]
**registryValue** | **String** | The registry value of the field, or null if not applicable |  [optional]
