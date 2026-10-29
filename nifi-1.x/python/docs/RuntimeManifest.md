# RuntimeManifest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identifier** | **str** | A unique identifier for the manifest | [optional] 
**agent_type** | **str** | The type of the runtime binary, e.g., &#39;minifi-java&#39; or &#39;minifi-cpp&#39; | [optional] 
**version** | **str** | The version of the runtime binary, e.g., &#39;1.0.1&#39; | [optional] 
**build_info** | [**BuildInfo**](BuildInfo.md) | Build summary for this runtime binary | [optional] 
**bundles** | [**list[Bundle]**](Bundle.md) | All extension bundles included with this runtime | [optional] 
**scheduling_defaults** | [**SchedulingDefaults**](SchedulingDefaults.md) | Scheduling defaults for components defined in this manifest | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


