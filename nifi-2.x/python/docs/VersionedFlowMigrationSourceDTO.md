# VersionedFlowMigrationSourceDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bucket_id** | **str** | The Flow Registry bucket identifier for the source Process Group. | [optional] 
**flow_id** | **str** | The Flow Registry flow identifier for the source Process Group. | [optional] 
**flow_name** | **str** | The name of the versioned flow backing the source Process Group, as recorded in the Flow Registry. May be null when the registry has not yet supplied a name (for example, while the source&#x27;s version control state is SYNC_FAILURE). | [optional] 
**ineligibility_reasons** | **list[str]** | User-facing descriptions of all conditions that currently prevent the source Process Group from being migrated. Empty when readyForMigration is true. Each entry describes a single remediable condition (running processors, queued FlowFiles, etc.); every applicable condition is included so the user can address them together. | [optional] 
**parent_process_group_id** | **str** | The identifier of the parent Process Group of the source Process Group. | [optional] 
**process_group_id** | **str** | The identifier of the source Process Group. | [optional] 
**process_group_name** | **str** | The name of the source Process Group. | [optional] 
**ready_for_migration** | **bool** | Whether the source Process Group is currently in a state that allows it to be migrated into the target Connector. When false, ineligibilityReasons describes what must change before the migration can proceed. | [optional] 
**registry_client_id** | **str** | The identifier of the Flow Registry client backing the source Process Group. | [optional] 
**version** | **str** | The published version of the source Process Group. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

