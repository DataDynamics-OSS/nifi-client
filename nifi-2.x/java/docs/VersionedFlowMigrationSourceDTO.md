# VersionedFlowMigrationSourceDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bucketId** | **String** | The Flow Registry bucket identifier for the source Process Group. |  [optional]
**flowId** | **String** | The Flow Registry flow identifier for the source Process Group. |  [optional]
**flowName** | **String** | The name of the versioned flow backing the source Process Group, as recorded in the Flow Registry. May be null when the registry has not yet supplied a name (for example, while the source&#x27;s version control state is SYNC_FAILURE). |  [optional]
**ineligibilityReasons** | **List&lt;String&gt;** | User-facing descriptions of all conditions that currently prevent the source Process Group from being migrated. Empty when readyForMigration is true. Each entry describes a single remediable condition (running processors, queued FlowFiles, etc.); every applicable condition is included so the user can address them together. |  [optional]
**parentProcessGroupId** | **String** | The identifier of the parent Process Group of the source Process Group. |  [optional]
**processGroupId** | **String** | The identifier of the source Process Group. |  [optional]
**processGroupName** | **String** | The name of the source Process Group. |  [optional]
**readyForMigration** | **Boolean** | Whether the source Process Group is currently in a state that allows it to be migrated into the target Connector. When false, ineligibilityReasons describes what must change before the migration can proceed. |  [optional]
**registryClientId** | **String** | The identifier of the Flow Registry client backing the source Process Group. |  [optional]
**version** | **String** | The published version of the source Process Group. |  [optional]
