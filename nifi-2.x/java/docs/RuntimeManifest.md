# RuntimeManifest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agentType** | **String** | The type of the runtime binary, e.g., &#x27;minifi-java&#x27; or &#x27;minifi-cpp&#x27; |  [optional]
**buildInfo** | [**BuildInfo**](BuildInfo.md) |  |  [optional]
**bundles** | [**List&lt;Bundle&gt;**](Bundle.md) | All extension bundles included with this runtime |  [optional]
**identifier** | **String** | A unique identifier for the manifest |  [optional]
**schedulingDefaults** | [**SchedulingDefaults**](SchedulingDefaults.md) |  |  [optional]
**version** | **String** | The version of the runtime binary, e.g., &#x27;1.0.1&#x27; |  [optional]
