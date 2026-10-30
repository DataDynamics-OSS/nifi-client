# nifi_client_v2.ControllerApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analyze_flow_analysis_rule_configuration**](ControllerApi.md#analyze_flow_analysis_rule_configuration) | **POST** /controller/flow-analysis-rules/{id}/config/analysis | Performs analysis of the component&#x27;s configuration, providing information about which attributes are referenced.
[**analyze_flow_registry_client_configuration**](ControllerApi.md#analyze_flow_registry_client_configuration) | **POST** /controller/registry-clients/{id}/config/analysis | Performs analysis of the component&#x27;s configuration, providing information about which attributes are referenced.
[**clear_flow_analysis_rule_bulletins**](ControllerApi.md#clear_flow_analysis_rule_bulletins) | **POST** /controller/flow-analysis-rules/{id}/bulletins/clear-requests | Clears bulletins for a flow analysis rule
[**clear_parameter_provider_bulletins**](ControllerApi.md#clear_parameter_provider_bulletins) | **POST** /controller/parameter-providers/{id}/bulletins/clear-requests | Clears bulletins for a parameter provider
[**clear_registry_client_bulletins**](ControllerApi.md#clear_registry_client_bulletins) | **POST** /controller/registry-clients/{id}/bulletins/clear-requests | Clears bulletins for a registry client
[**clear_state**](ControllerApi.md#clear_state) | **POST** /controller/flow-analysis-rules/{id}/state/clear-requests | Clears the state for a flow analysis rule
[**create_bulletin**](ControllerApi.md#create_bulletin) | **POST** /controller/bulletin | Creates a new bulletin
[**create_controller_service**](ControllerApi.md#create_controller_service) | **POST** /controller/controller-services | Creates a new controller service
[**create_flow_analysis_rule**](ControllerApi.md#create_flow_analysis_rule) | **POST** /controller/flow-analysis-rules | Creates a new flow analysis rule
[**create_flow_registry_client**](ControllerApi.md#create_flow_registry_client) | **POST** /controller/registry-clients | Creates a new flow registry client
[**create_parameter_provider**](ControllerApi.md#create_parameter_provider) | **POST** /controller/parameter-providers | Creates a new parameter provider
[**create_reporting_task**](ControllerApi.md#create_reporting_task) | **POST** /controller/reporting-tasks | Creates a new reporting task
[**delete_flow_analysis_rule_verification_request**](ControllerApi.md#delete_flow_analysis_rule_verification_request) | **DELETE** /controller/flow-analysis-rules/{id}/config/verification-requests/{requestId} | Deletes the Verification Request with the given ID
[**delete_flow_registry_client**](ControllerApi.md#delete_flow_registry_client) | **DELETE** /controller/registry-clients/{id} | Deletes a flow registry client
[**delete_history**](ControllerApi.md#delete_history) | **DELETE** /controller/history | Purges history
[**delete_nar**](ControllerApi.md#delete_nar) | **DELETE** /controller/nar-manager/nars/{id} | Deletes an installed NAR
[**delete_node**](ControllerApi.md#delete_node) | **DELETE** /controller/cluster/nodes/{id} | Removes a node from the cluster
[**delete_registry_client_verification_request**](ControllerApi.md#delete_registry_client_verification_request) | **DELETE** /controller/registry-clients/{id}/config/verification-requests/{requestId} | Deletes the Verification Request with the given ID
[**download_nar**](ControllerApi.md#download_nar) | **GET** /controller/nar-manager/nars/{id}/content | Retrieves the content of the NAR with the given id
[**get_cluster**](ControllerApi.md#get_cluster) | **GET** /controller/cluster | Gets the contents of the cluster
[**get_controller_config**](ControllerApi.md#get_controller_config) | **GET** /controller/config | Retrieves the configuration for this NiFi Controller
[**get_flow_analysis_rule**](ControllerApi.md#get_flow_analysis_rule) | **GET** /controller/flow-analysis-rules/{id} | Gets a flow analysis rule
[**get_flow_analysis_rule_property_descriptor**](ControllerApi.md#get_flow_analysis_rule_property_descriptor) | **GET** /controller/flow-analysis-rules/{id}/descriptors | Gets a flow analysis rule property descriptor
[**get_flow_analysis_rule_state**](ControllerApi.md#get_flow_analysis_rule_state) | **GET** /controller/flow-analysis-rules/{id}/state | Gets the state for a flow analysis rule
[**get_flow_analysis_rule_verification_request**](ControllerApi.md#get_flow_analysis_rule_verification_request) | **GET** /controller/flow-analysis-rules/{id}/config/verification-requests/{requestId} | Returns the Verification Request with the given ID
[**get_flow_analysis_rules**](ControllerApi.md#get_flow_analysis_rules) | **GET** /controller/flow-analysis-rules | Gets all flow analysis rules
[**get_flow_registry_client**](ControllerApi.md#get_flow_registry_client) | **GET** /controller/registry-clients/{id} | Gets a flow registry client
[**get_flow_registry_clients**](ControllerApi.md#get_flow_registry_clients) | **GET** /controller/registry-clients | Gets the listing of available flow registry clients
[**get_nar_details**](ControllerApi.md#get_nar_details) | **GET** /controller/nar-manager/nars/{id}/details | Retrieves the component types available from the installed NARs
[**get_nar_summaries**](ControllerApi.md#get_nar_summaries) | **GET** /controller/nar-manager/nars | Retrieves summary information for installed NARs
[**get_nar_summary**](ControllerApi.md#get_nar_summary) | **GET** /controller/nar-manager/nars/{id} | Retrieves the summary information for the NAR with the given identifier
[**get_node**](ControllerApi.md#get_node) | **GET** /controller/cluster/nodes/{id} | Gets a node in the cluster
[**get_node_status_history**](ControllerApi.md#get_node_status_history) | **GET** /controller/status/history | Gets status history for the node
[**get_property_descriptor**](ControllerApi.md#get_property_descriptor) | **GET** /controller/registry-clients/{id}/descriptors | Gets a flow registry client property descriptor
[**get_registry_client_types**](ControllerApi.md#get_registry_client_types) | **GET** /controller/registry-types | Retrieves the types of flow registry clients that this NiFi supports
[**get_registry_client_verification_request**](ControllerApi.md#get_registry_client_verification_request) | **GET** /controller/registry-clients/{id}/config/verification-requests/{requestId} | Returns the Verification Request with the given ID
[**import_reporting_task_snapshot**](ControllerApi.md#import_reporting_task_snapshot) | **POST** /controller/reporting-tasks/import | Imports a reporting task snapshot
[**remove_flow_analysis_rule**](ControllerApi.md#remove_flow_analysis_rule) | **DELETE** /controller/flow-analysis-rules/{id} | Deletes a flow analysis rule
[**submit_flow_analysis_rule_config_verification_request**](ControllerApi.md#submit_flow_analysis_rule_config_verification_request) | **POST** /controller/flow-analysis-rules/{id}/config/verification-requests | Performs verification of the Flow Analysis Rule&#x27;s configuration
[**submit_registry_client_config_verification_request**](ControllerApi.md#submit_registry_client_config_verification_request) | **POST** /controller/registry-clients/{id}/config/verification-requests | Performs verification of the Registry Client&#x27;s configuration
[**update_controller_config**](ControllerApi.md#update_controller_config) | **PUT** /controller/config | Updates the configuration for this NiFi
[**update_flow_analysis_rule**](ControllerApi.md#update_flow_analysis_rule) | **PUT** /controller/flow-analysis-rules/{id} | Updates a flow analysis rule
[**update_flow_registry_client**](ControllerApi.md#update_flow_registry_client) | **PUT** /controller/registry-clients/{id} | Updates a flow registry client
[**update_node**](ControllerApi.md#update_node) | **PUT** /controller/cluster/nodes/{id} | Updates a node in the cluster
[**update_run_status**](ControllerApi.md#update_run_status) | **PUT** /controller/flow-analysis-rules/{id}/run-status | Updates run status of a flow analysis rule
[**upload_nar**](ControllerApi.md#upload_nar) | **POST** /controller/nar-manager/nars/content | Uploads a NAR and requests for it to be installed

# **analyze_flow_analysis_rule_configuration**
> ConfigurationAnalysisEntity analyze_flow_analysis_rule_configuration(body, id)

Performs analysis of the component's configuration, providing information about which attributes are referenced.

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
body = nifi_client_v2.ConfigurationAnalysisEntity() # ConfigurationAnalysisEntity | The configuration analysis request.
id = 'id_example' # str | The flow analysis rules id.

try:
    # Performs analysis of the component's configuration, providing information about which attributes are referenced.
    api_response = api_instance.analyze_flow_analysis_rule_configuration(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->analyze_flow_analysis_rule_configuration: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConfigurationAnalysisEntity**](ConfigurationAnalysisEntity.md)| The configuration analysis request. | 
 **id** | **str**| The flow analysis rules id. | 

### Return type

[**ConfigurationAnalysisEntity**](ConfigurationAnalysisEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analyze_flow_registry_client_configuration**
> ConfigurationAnalysisEntity analyze_flow_registry_client_configuration(body, id)

Performs analysis of the component's configuration, providing information about which attributes are referenced.

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
body = nifi_client_v2.ConfigurationAnalysisEntity() # ConfigurationAnalysisEntity | The configuration analysis request.
id = 'id_example' # str | The registry client id.

try:
    # Performs analysis of the component's configuration, providing information about which attributes are referenced.
    api_response = api_instance.analyze_flow_registry_client_configuration(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->analyze_flow_registry_client_configuration: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConfigurationAnalysisEntity**](ConfigurationAnalysisEntity.md)| The configuration analysis request. | 
 **id** | **str**| The registry client id. | 

### Return type

[**ConfigurationAnalysisEntity**](ConfigurationAnalysisEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **clear_flow_analysis_rule_bulletins**
> ClearBulletinsResultEntity clear_flow_analysis_rule_bulletins(body, id)

Clears bulletins for a flow analysis rule

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
body = nifi_client_v2.ClearBulletinsRequestEntity() # ClearBulletinsRequestEntity | The request to clear bulletins.
id = 'id_example' # str | The flow analysis rule id.

try:
    # Clears bulletins for a flow analysis rule
    api_response = api_instance.clear_flow_analysis_rule_bulletins(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->clear_flow_analysis_rule_bulletins: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClearBulletinsRequestEntity**](ClearBulletinsRequestEntity.md)| The request to clear bulletins. | 
 **id** | **str**| The flow analysis rule id. | 

### Return type

[**ClearBulletinsResultEntity**](ClearBulletinsResultEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **clear_parameter_provider_bulletins**
> ClearBulletinsResultEntity clear_parameter_provider_bulletins(body, id)

Clears bulletins for a parameter provider

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
body = nifi_client_v2.ClearBulletinsRequestEntity() # ClearBulletinsRequestEntity | The request to clear bulletins.
id = 'id_example' # str | The parameter provider id.

try:
    # Clears bulletins for a parameter provider
    api_response = api_instance.clear_parameter_provider_bulletins(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->clear_parameter_provider_bulletins: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClearBulletinsRequestEntity**](ClearBulletinsRequestEntity.md)| The request to clear bulletins. | 
 **id** | **str**| The parameter provider id. | 

### Return type

[**ClearBulletinsResultEntity**](ClearBulletinsResultEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **clear_registry_client_bulletins**
> ClearBulletinsResultEntity clear_registry_client_bulletins(body, id)

Clears bulletins for a registry client

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
body = nifi_client_v2.ClearBulletinsRequestEntity() # ClearBulletinsRequestEntity | The request to clear bulletins.
id = 'id_example' # str | The registry client id.

try:
    # Clears bulletins for a registry client
    api_response = api_instance.clear_registry_client_bulletins(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->clear_registry_client_bulletins: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClearBulletinsRequestEntity**](ClearBulletinsRequestEntity.md)| The request to clear bulletins. | 
 **id** | **str**| The registry client id. | 

### Return type

[**ClearBulletinsResultEntity**](ClearBulletinsResultEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **clear_state**
> ComponentStateEntity clear_state(id, body=body)

Clears the state for a flow analysis rule

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
id = 'id_example' # str | The flow analysis rule id.
body = nifi_client_v2.ComponentStateEntity() # ComponentStateEntity | Optional component state to perform a selective key removal. If omitted, clears all state. (optional)

try:
    # Clears the state for a flow analysis rule
    api_response = api_instance.clear_state(id, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->clear_state: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The flow analysis rule id. | 
 **body** | [**ComponentStateEntity**](ComponentStateEntity.md)| Optional component state to perform a selective key removal. If omitted, clears all state. | [optional] 

### Return type

[**ComponentStateEntity**](ComponentStateEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: */*, application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_bulletin**
> BulletinEntity create_bulletin(body)

Creates a new bulletin

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
body = nifi_client_v2.BulletinEntity() # BulletinEntity | The reporting task configuration details.

try:
    # Creates a new bulletin
    api_response = api_instance.create_bulletin(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->create_bulletin: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**BulletinEntity**](BulletinEntity.md)| The reporting task configuration details. | 

### Return type

[**BulletinEntity**](BulletinEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_controller_service**
> ControllerServiceEntity create_controller_service(body)

Creates a new controller service

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
body = nifi_client_v2.ControllerServiceEntity() # ControllerServiceEntity | The controller service configuration details.

try:
    # Creates a new controller service
    api_response = api_instance.create_controller_service(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->create_controller_service: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ControllerServiceEntity**](ControllerServiceEntity.md)| The controller service configuration details. | 

### Return type

[**ControllerServiceEntity**](ControllerServiceEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_flow_analysis_rule**
> FlowAnalysisRuleEntity create_flow_analysis_rule(body)

Creates a new flow analysis rule

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
body = nifi_client_v2.FlowAnalysisRuleEntity() # FlowAnalysisRuleEntity | The flow analysis rule configuration details.

try:
    # Creates a new flow analysis rule
    api_response = api_instance.create_flow_analysis_rule(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->create_flow_analysis_rule: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FlowAnalysisRuleEntity**](FlowAnalysisRuleEntity.md)| The flow analysis rule configuration details. | 

### Return type

[**FlowAnalysisRuleEntity**](FlowAnalysisRuleEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_flow_registry_client**
> FlowRegistryClientEntity create_flow_registry_client(body)

Creates a new flow registry client

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
body = nifi_client_v2.FlowRegistryClientEntity() # FlowRegistryClientEntity | The flow registry client configuration details.

try:
    # Creates a new flow registry client
    api_response = api_instance.create_flow_registry_client(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->create_flow_registry_client: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FlowRegistryClientEntity**](FlowRegistryClientEntity.md)| The flow registry client configuration details. | 

### Return type

[**FlowRegistryClientEntity**](FlowRegistryClientEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_parameter_provider**
> ParameterProviderEntity create_parameter_provider(body)

Creates a new parameter provider

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
body = nifi_client_v2.ParameterProviderEntity() # ParameterProviderEntity | The parameter provider configuration details.

try:
    # Creates a new parameter provider
    api_response = api_instance.create_parameter_provider(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->create_parameter_provider: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ParameterProviderEntity**](ParameterProviderEntity.md)| The parameter provider configuration details. | 

### Return type

[**ParameterProviderEntity**](ParameterProviderEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_reporting_task**
> ReportingTaskEntity create_reporting_task(body)

Creates a new reporting task

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
body = nifi_client_v2.ReportingTaskEntity() # ReportingTaskEntity | The reporting task configuration details.

try:
    # Creates a new reporting task
    api_response = api_instance.create_reporting_task(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->create_reporting_task: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReportingTaskEntity**](ReportingTaskEntity.md)| The reporting task configuration details. | 

### Return type

[**ReportingTaskEntity**](ReportingTaskEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_flow_analysis_rule_verification_request**
> VerifyConfigRequestEntity delete_flow_analysis_rule_verification_request(id, request_id)

Deletes the Verification Request with the given ID

Deletes the Verification Request with the given ID. After a request is created, it is expected that the client will properly clean up the request by DELETE'ing it, once the Verification process has completed. If the request is deleted before the request completes, then the Verification request will finish the step that it is currently performing and then will cancel any subsequent steps.

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
id = 'id_example' # str | The ID of the Flow Analysis Rule
request_id = 'request_id_example' # str | The ID of the Verification Request

try:
    # Deletes the Verification Request with the given ID
    api_response = api_instance.delete_flow_analysis_rule_verification_request(id, request_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->delete_flow_analysis_rule_verification_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the Flow Analysis Rule | 
 **request_id** | **str**| The ID of the Verification Request | 

### Return type

[**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_flow_registry_client**
> FlowRegistryClientEntity delete_flow_registry_client(id, version=version, client_id=client_id, disconnected_node_acknowledged=disconnected_node_acknowledged)

Deletes a flow registry client

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
id = 'id_example' # str | The flow registry client id.
version = 789 # int | The revision is used to verify the client is working with the latest version of the flow. (optional)
client_id = 'client_id_example' # str | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. (optional)
disconnected_node_acknowledged = false # bool | Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional) (default to false)

try:
    # Deletes a flow registry client
    api_response = api_instance.delete_flow_registry_client(id, version=version, client_id=client_id, disconnected_node_acknowledged=disconnected_node_acknowledged)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->delete_flow_registry_client: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The flow registry client id. | 
 **version** | **int**| The revision is used to verify the client is working with the latest version of the flow. | [optional] 
 **client_id** | **str**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional] 
 **disconnected_node_acknowledged** | **bool**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**FlowRegistryClientEntity**](FlowRegistryClientEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_history**
> HistoryEntity delete_history(end_date)

Purges history

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
end_date = 'end_date_example' # str | Purge actions before this date/time.

try:
    # Purges history
    api_response = api_instance.delete_history(end_date)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->delete_history: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **end_date** | **str**| Purge actions before this date/time. | 

### Return type

[**HistoryEntity**](HistoryEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_nar**
> NarSummaryEntity delete_nar(id, disconnected_node_acknowledged=disconnected_node_acknowledged, force=force)

Deletes an installed NAR

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
id = 'id_example' # str | The id of the NAR.
disconnected_node_acknowledged = false # bool | Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional) (default to false)
force = false # bool | Indicates if the NAR should be deleted even when components are instantiated. (optional) (default to false)

try:
    # Deletes an installed NAR
    api_response = api_instance.delete_nar(id, disconnected_node_acknowledged=disconnected_node_acknowledged, force=force)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->delete_nar: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The id of the NAR. | 
 **disconnected_node_acknowledged** | **bool**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]
 **force** | **bool**| Indicates if the NAR should be deleted even when components are instantiated. | [optional] [default to false]

### Return type

[**NarSummaryEntity**](NarSummaryEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_node**
> NodeEntity delete_node(id)

Removes a node from the cluster

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
id = 'id_example' # str | The node id.

try:
    # Removes a node from the cluster
    api_response = api_instance.delete_node(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->delete_node: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The node id. | 

### Return type

[**NodeEntity**](NodeEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_registry_client_verification_request**
> VerifyConfigRequestEntity delete_registry_client_verification_request(id, request_id)

Deletes the Verification Request with the given ID

Deletes the Verification Request with the given ID. After a request is created, it is expected that the client will properly clean up the request by DELETE'ing it, once the Verification process has completed. If the request is deleted before the request completes, then the Verification request will finish the step that it is currently performing and then will cancel any subsequent steps.

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
id = 'id_example' # str | The ID of the Registry Client
request_id = 'request_id_example' # str | The ID of the Verification Request

try:
    # Deletes the Verification Request with the given ID
    api_response = api_instance.delete_registry_client_verification_request(id, request_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->delete_registry_client_verification_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the Registry Client | 
 **request_id** | **str**| The ID of the Verification Request | 

### Return type

[**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **download_nar**
> str download_nar(id)

Retrieves the content of the NAR with the given id

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
id = 'id_example' # str | The id of the NAR.

try:
    # Retrieves the content of the NAR with the given id
    api_response = api_instance.download_nar(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->download_nar: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The id of the NAR. | 

### Return type

**str**

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_cluster**
> ClusterEntity get_cluster()

Gets the contents of the cluster

Returns the contents of the cluster including all nodes and their status.

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))

try:
    # Gets the contents of the cluster
    api_response = api_instance.get_cluster()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->get_cluster: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClusterEntity**](ClusterEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_controller_config**
> ControllerConfigurationEntity get_controller_config()

Retrieves the configuration for this NiFi Controller

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))

try:
    # Retrieves the configuration for this NiFi Controller
    api_response = api_instance.get_controller_config()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->get_controller_config: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ControllerConfigurationEntity**](ControllerConfigurationEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_flow_analysis_rule**
> FlowAnalysisRuleEntity get_flow_analysis_rule(id)

Gets a flow analysis rule

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
id = 'id_example' # str | The flow analysis rule id.

try:
    # Gets a flow analysis rule
    api_response = api_instance.get_flow_analysis_rule(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->get_flow_analysis_rule: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The flow analysis rule id. | 

### Return type

[**FlowAnalysisRuleEntity**](FlowAnalysisRuleEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_flow_analysis_rule_property_descriptor**
> PropertyDescriptorEntity get_flow_analysis_rule_property_descriptor(id, property_name, sensitive=sensitive)

Gets a flow analysis rule property descriptor

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
id = 'id_example' # str | The flow analysis rule id.
property_name = 'property_name_example' # str | The property name.
sensitive = true # bool | Property Descriptor requested sensitive status (optional)

try:
    # Gets a flow analysis rule property descriptor
    api_response = api_instance.get_flow_analysis_rule_property_descriptor(id, property_name, sensitive=sensitive)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->get_flow_analysis_rule_property_descriptor: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The flow analysis rule id. | 
 **property_name** | **str**| The property name. | 
 **sensitive** | **bool**| Property Descriptor requested sensitive status | [optional] 

### Return type

[**PropertyDescriptorEntity**](PropertyDescriptorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_flow_analysis_rule_state**
> ComponentStateEntity get_flow_analysis_rule_state(id)

Gets the state for a flow analysis rule

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
id = 'id_example' # str | The flow analysis rule id.

try:
    # Gets the state for a flow analysis rule
    api_response = api_instance.get_flow_analysis_rule_state(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->get_flow_analysis_rule_state: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The flow analysis rule id. | 

### Return type

[**ComponentStateEntity**](ComponentStateEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_flow_analysis_rule_verification_request**
> VerifyConfigRequestEntity get_flow_analysis_rule_verification_request(id, request_id)

Returns the Verification Request with the given ID

Returns the Verification Request with the given ID. Once an Verification Request has been created, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and any failures. 

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
id = 'id_example' # str | The ID of the Flow Analysis Rule
request_id = 'request_id_example' # str | The ID of the Verification Request

try:
    # Returns the Verification Request with the given ID
    api_response = api_instance.get_flow_analysis_rule_verification_request(id, request_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->get_flow_analysis_rule_verification_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the Flow Analysis Rule | 
 **request_id** | **str**| The ID of the Verification Request | 

### Return type

[**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_flow_analysis_rules**
> FlowAnalysisRulesEntity get_flow_analysis_rules()

Gets all flow analysis rules

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))

try:
    # Gets all flow analysis rules
    api_response = api_instance.get_flow_analysis_rules()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->get_flow_analysis_rules: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FlowAnalysisRulesEntity**](FlowAnalysisRulesEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_flow_registry_client**
> FlowRegistryClientEntity get_flow_registry_client(id)

Gets a flow registry client

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
id = 'id_example' # str | The flow registry client id.

try:
    # Gets a flow registry client
    api_response = api_instance.get_flow_registry_client(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->get_flow_registry_client: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The flow registry client id. | 

### Return type

[**FlowRegistryClientEntity**](FlowRegistryClientEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_flow_registry_clients**
> FlowRegistryClientsEntity get_flow_registry_clients()

Gets the listing of available flow registry clients

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))

try:
    # Gets the listing of available flow registry clients
    api_response = api_instance.get_flow_registry_clients()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->get_flow_registry_clients: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FlowRegistryClientsEntity**](FlowRegistryClientsEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_nar_details**
> NarDetailsEntity get_nar_details(id)

Retrieves the component types available from the installed NARs

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
id = 'id_example' # str | The id of the NAR.

try:
    # Retrieves the component types available from the installed NARs
    api_response = api_instance.get_nar_details(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->get_nar_details: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The id of the NAR. | 

### Return type

[**NarDetailsEntity**](NarDetailsEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_nar_summaries**
> NarSummariesEntity get_nar_summaries()

Retrieves summary information for installed NARs

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))

try:
    # Retrieves summary information for installed NARs
    api_response = api_instance.get_nar_summaries()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->get_nar_summaries: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NarSummariesEntity**](NarSummariesEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_nar_summary**
> NarDetailsEntity get_nar_summary(id)

Retrieves the summary information for the NAR with the given identifier

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
id = 'id_example' # str | The id of the NAR.

try:
    # Retrieves the summary information for the NAR with the given identifier
    api_response = api_instance.get_nar_summary(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->get_nar_summary: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The id of the NAR. | 

### Return type

[**NarDetailsEntity**](NarDetailsEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_node**
> NodeEntity get_node(id)

Gets a node in the cluster

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
id = 'id_example' # str | The node id.

try:
    # Gets a node in the cluster
    api_response = api_instance.get_node(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->get_node: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The node id. | 

### Return type

[**NodeEntity**](NodeEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_node_status_history**
> ComponentHistoryEntity get_node_status_history()

Gets status history for the node

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))

try:
    # Gets status history for the node
    api_response = api_instance.get_node_status_history()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->get_node_status_history: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ComponentHistoryEntity**](ComponentHistoryEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_property_descriptor**
> PropertyDescriptorEntity get_property_descriptor(id, property_name, sensitive=sensitive)

Gets a flow registry client property descriptor

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
id = 'id_example' # str | The flow registry client id.
property_name = 'property_name_example' # str | The property name.
sensitive = true # bool | Property Descriptor requested sensitive status (optional)

try:
    # Gets a flow registry client property descriptor
    api_response = api_instance.get_property_descriptor(id, property_name, sensitive=sensitive)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->get_property_descriptor: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The flow registry client id. | 
 **property_name** | **str**| The property name. | 
 **sensitive** | **bool**| Property Descriptor requested sensitive status | [optional] 

### Return type

[**PropertyDescriptorEntity**](PropertyDescriptorEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_registry_client_types**
> FlowRegistryClientTypesEntity get_registry_client_types()

Retrieves the types of flow registry clients that this NiFi supports

Note: This endpoint is subject to change as NiFi and it's REST API evolve.

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))

try:
    # Retrieves the types of flow registry clients that this NiFi supports
    api_response = api_instance.get_registry_client_types()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->get_registry_client_types: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FlowRegistryClientTypesEntity**](FlowRegistryClientTypesEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_registry_client_verification_request**
> VerifyConfigRequestEntity get_registry_client_verification_request(id, request_id)

Returns the Verification Request with the given ID

Returns the Verification Request with the given ID. Once a Verification Request has been created, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and any failures. 

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
id = 'id_example' # str | The ID of the Registry Client
request_id = 'request_id_example' # str | The ID of the Verification Request

try:
    # Returns the Verification Request with the given ID
    api_response = api_instance.get_registry_client_verification_request(id, request_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->get_registry_client_verification_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the Registry Client | 
 **request_id** | **str**| The ID of the Verification Request | 

### Return type

[**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **import_reporting_task_snapshot**
> VersionedReportingTaskImportResponseEntity import_reporting_task_snapshot(body)

Imports a reporting task snapshot

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
body = nifi_client_v2.VersionedReportingTaskImportRequestEntity() # VersionedReportingTaskImportRequestEntity | The import request containing the reporting task snapshot to import.

try:
    # Imports a reporting task snapshot
    api_response = api_instance.import_reporting_task_snapshot(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->import_reporting_task_snapshot: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VersionedReportingTaskImportRequestEntity**](VersionedReportingTaskImportRequestEntity.md)| The import request containing the reporting task snapshot to import. | 

### Return type

[**VersionedReportingTaskImportResponseEntity**](VersionedReportingTaskImportResponseEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_flow_analysis_rule**
> FlowAnalysisRuleEntity remove_flow_analysis_rule(id, version=version, client_id=client_id, disconnected_node_acknowledged=disconnected_node_acknowledged)

Deletes a flow analysis rule

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
id = 'id_example' # str | The flow analysis rule id.
version = 789 # int | The revision is used to verify the client is working with the latest version of the flow. (optional)
client_id = 'client_id_example' # str | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. (optional)
disconnected_node_acknowledged = false # bool | Acknowledges that this node is disconnected to allow for mutable requests to proceed. (optional) (default to false)

try:
    # Deletes a flow analysis rule
    api_response = api_instance.remove_flow_analysis_rule(id, version=version, client_id=client_id, disconnected_node_acknowledged=disconnected_node_acknowledged)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->remove_flow_analysis_rule: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The flow analysis rule id. | 
 **version** | **int**| The revision is used to verify the client is working with the latest version of the flow. | [optional] 
 **client_id** | **str**| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional] 
 **disconnected_node_acknowledged** | **bool**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**FlowAnalysisRuleEntity**](FlowAnalysisRuleEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_flow_analysis_rule_config_verification_request**
> VerifyConfigRequestEntity submit_flow_analysis_rule_config_verification_request(body, id)

Performs verification of the Flow Analysis Rule's configuration

This will initiate the process of verifying a given Flow Analysis Rule configuration. This may be a long-running task. As a result, this endpoint will immediately return a FlowAnalysisRuleConfigVerificationRequestEntity, and the process of performing the verification will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /flow-analysis-rules/{taskId}/verification-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /flow-analysis-rules/{serviceId}/verification-requests/{requestId}.

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
body = nifi_client_v2.VerifyConfigRequestEntity() # VerifyConfigRequestEntity | The flow analysis rules configuration verification request.
id = 'id_example' # str | The flow analysis rules id.

try:
    # Performs verification of the Flow Analysis Rule's configuration
    api_response = api_instance.submit_flow_analysis_rule_config_verification_request(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->submit_flow_analysis_rule_config_verification_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)| The flow analysis rules configuration verification request. | 
 **id** | **str**| The flow analysis rules id. | 

### Return type

[**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_registry_client_config_verification_request**
> VerifyConfigRequestEntity submit_registry_client_config_verification_request(body, id)

Performs verification of the Registry Client's configuration

Initiates verification of a Registry Client configuration. The request returns immediately with a request entity while verification runs asynchronously. The client should poll /controller/registry-clients/{clientId}/config/verification-requests/{requestId} for status and DELETE the request once verification completes.

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
body = nifi_client_v2.VerifyConfigRequestEntity() # VerifyConfigRequestEntity | The registry client configuration verification request.
id = 'id_example' # str | The registry client id.

try:
    # Performs verification of the Registry Client's configuration
    api_response = api_instance.submit_registry_client_config_verification_request(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->submit_registry_client_config_verification_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)| The registry client configuration verification request. | 
 **id** | **str**| The registry client id. | 

### Return type

[**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_controller_config**
> ControllerConfigurationEntity update_controller_config(body)

Updates the configuration for this NiFi

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
body = nifi_client_v2.ControllerConfigurationEntity() # ControllerConfigurationEntity | The controller configuration.

try:
    # Updates the configuration for this NiFi
    api_response = api_instance.update_controller_config(body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->update_controller_config: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ControllerConfigurationEntity**](ControllerConfigurationEntity.md)| The controller configuration. | 

### Return type

[**ControllerConfigurationEntity**](ControllerConfigurationEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_flow_analysis_rule**
> FlowAnalysisRuleEntity update_flow_analysis_rule(body, id)

Updates a flow analysis rule

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
body = nifi_client_v2.FlowAnalysisRuleEntity() # FlowAnalysisRuleEntity | The flow analysis rule configuration details.
id = 'id_example' # str | The flow analysis rule id.

try:
    # Updates a flow analysis rule
    api_response = api_instance.update_flow_analysis_rule(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->update_flow_analysis_rule: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FlowAnalysisRuleEntity**](FlowAnalysisRuleEntity.md)| The flow analysis rule configuration details. | 
 **id** | **str**| The flow analysis rule id. | 

### Return type

[**FlowAnalysisRuleEntity**](FlowAnalysisRuleEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_flow_registry_client**
> FlowRegistryClientEntity update_flow_registry_client(body, id)

Updates a flow registry client

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
body = nifi_client_v2.FlowRegistryClientEntity() # FlowRegistryClientEntity | The flow registry client configuration details.
id = 'id_example' # str | The flow registry client id.

try:
    # Updates a flow registry client
    api_response = api_instance.update_flow_registry_client(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->update_flow_registry_client: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FlowRegistryClientEntity**](FlowRegistryClientEntity.md)| The flow registry client configuration details. | 
 **id** | **str**| The flow registry client id. | 

### Return type

[**FlowRegistryClientEntity**](FlowRegistryClientEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_node**
> NodeEntity update_node(body, id)

Updates a node in the cluster

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
body = nifi_client_v2.NodeEntity() # NodeEntity | The node configuration. The only configuration that will be honored at this endpoint is the status.
id = 'id_example' # str | The node id.

try:
    # Updates a node in the cluster
    api_response = api_instance.update_node(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->update_node: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NodeEntity**](NodeEntity.md)| The node configuration. The only configuration that will be honored at this endpoint is the status. | 
 **id** | **str**| The node id. | 

### Return type

[**NodeEntity**](NodeEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_run_status**
> FlowAnalysisRuleEntity update_run_status(body, id)

Updates run status of a flow analysis rule

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
body = nifi_client_v2.FlowAnalysisRuleRunStatusEntity() # FlowAnalysisRuleRunStatusEntity | The flow analysis rule run status.
id = 'id_example' # str | The flow analysis rule id.

try:
    # Updates run status of a flow analysis rule
    api_response = api_instance.update_run_status(body, id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->update_run_status: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FlowAnalysisRuleRunStatusEntity**](FlowAnalysisRuleRunStatusEntity.md)| The flow analysis rule run status. | 
 **id** | **str**| The flow analysis rule id. | 

### Return type

[**FlowAnalysisRuleEntity**](FlowAnalysisRuleEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **upload_nar**
> NarSummaryEntity upload_nar(body, filename=filename)

Uploads a NAR and requests for it to be installed

### Example
```python
from __future__ import print_function
import time
import nifi_client_v2
from nifi_client_v2.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = nifi_client_v2.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = nifi_client_v2.ControllerApi(nifi_client_v2.ApiClient(configuration))
body = NULL # object | The contents of the NAR file.
filename = 'filename_example' # str |  (optional)

try:
    # Uploads a NAR and requests for it to be installed
    api_response = api_instance.upload_nar(body, filename=filename)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ControllerApi->upload_nar: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**object**](object.md)| The contents of the NAR file. | 
 **filename** | **str**|  | [optional] 

### Return type

[**NarSummaryEntity**](NarSummaryEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

