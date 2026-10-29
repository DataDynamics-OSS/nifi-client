# ListenPortDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**applicationProtocols** | **List&lt;String&gt;** | Supported application protocols, if applicable |  [optional]
**componentClass** | **String** | The class type of the component providing the listen port |  [optional]
**componentId** | **String** | The id of the component providing the listen port |  [optional]
**componentName** | **String** | The name of the component providing the listen port |  [optional]
**componentType** | **String** | The type of component providing the listen port (e.g., Processor, ControllerService) |  [optional]
**parentGroupId** | **String** | The id of the process group containing the component providing the listen port, if applicable |  [optional]
**parentGroupName** | **String** | The name of the process group containing the component providing the listen port, if applicable |  [optional]
**portName** | **String** | The name of the the listen port. Useful context for components that provide multiple ports. |  [optional]
**portNumber** | **Integer** | The ingress port number |  [optional]
**transportProtocol** | **String** | The ingress transport protocol (TCP or UDP) |  [optional]
