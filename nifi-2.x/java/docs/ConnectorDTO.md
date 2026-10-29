# ConnectorDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeConfiguration** | [**ConnectorConfigurationDTO**](ConnectorConfigurationDTO.md) |  |  [optional]
**availableActions** | [**List&lt;ConnectorActionDTO&gt;**](ConnectorActionDTO.md) | The available actions that can be performed on this Connector. |  [optional]
**bundle** | [**BundleDTO**](BundleDTO.md) |  |  [optional]
**configurationUrl** | **String** | The URL for this connector&#x27;s configuration/wizard custom UI, if applicable. |  [optional]
**detailsUrl** | **String** | The URL for this connector&#x27;s details custom UI, if applicable. |  [optional]
**extensionMissing** | **Boolean** | Whether the extension for this connector is missing. |  [optional]
**id** | **String** | The id of the component. |  [optional]
**managedProcessGroupId** | **String** | The identifier of the root Process Group managed by this Connector. |  [optional]
**multipleVersionsAvailable** | **Boolean** | Whether multiple versions of this connector are available. |  [optional]
**name** | **String** | The name of the Connector. |  [optional]
**parentGroupId** | **String** | The id of parent process group of this component if applicable. |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) | The state of the Connector. |  [optional]
**type** | **String** | The fully qualified type of the Connector. |  [optional]
**validationErrors** | **List&lt;String&gt;** | The validation errors for the connector. |  [optional]
**validationStatus** | **String** | Indicates whether the Connector is valid, invalid, or still in the process of validating |  [optional]
**versionedComponentId** | **String** | The ID of the corresponding component that is under version control |  [optional]
**workingConfiguration** | [**ConnectorConfigurationDTO**](ConnectorConfigurationDTO.md) |  |  [optional]

<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
RUNNING | &quot;RUNNING&quot;
STOPPED | &quot;STOPPED&quot;
