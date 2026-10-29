# ConnectorDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active_configuration** | [**ConnectorConfigurationDTO**](ConnectorConfigurationDTO.md) |  | [optional] 
**available_actions** | [**list[ConnectorActionDTO]**](ConnectorActionDTO.md) | The available actions that can be performed on this Connector. | [optional] 
**bundle** | [**BundleDTO**](BundleDTO.md) |  | [optional] 
**configuration_url** | **str** | The URL for this connector&#x27;s configuration/wizard custom UI, if applicable. | [optional] 
**details_url** | **str** | The URL for this connector&#x27;s details custom UI, if applicable. | [optional] 
**extension_missing** | **bool** | Whether the extension for this connector is missing. | [optional] 
**id** | **str** | The id of the component. | [optional] 
**managed_process_group_id** | **str** | The identifier of the root Process Group managed by this Connector. | [optional] 
**multiple_versions_available** | **bool** | Whether multiple versions of this connector are available. | [optional] 
**name** | **str** | The name of the Connector. | [optional] 
**parent_group_id** | **str** | The id of parent process group of this component if applicable. | [optional] 
**position** | [**PositionDTO**](PositionDTO.md) |  | [optional] 
**state** | **str** | The state of the Connector. | [optional] 
**type** | **str** | The fully qualified type of the Connector. | [optional] 
**validation_errors** | **list[str]** | The validation errors for the connector. | [optional] 
**validation_status** | **str** | Indicates whether the Connector is valid, invalid, or still in the process of validating | [optional] 
**versioned_component_id** | **str** | The ID of the corresponding component that is under version control | [optional] 
**working_configuration** | [**ConnectorConfigurationDTO**](ConnectorConfigurationDTO.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

