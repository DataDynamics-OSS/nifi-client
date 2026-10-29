# swagger_client.DataTransferApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**commit_input_port_transaction**](DataTransferApi.md#commit_input_port_transaction) | **DELETE** /data-transfer/input-ports/{portId}/transactions/{transactionId} | Commit or cancel the specified transaction
[**commit_output_port_transaction**](DataTransferApi.md#commit_output_port_transaction) | **DELETE** /data-transfer/output-ports/{portId}/transactions/{transactionId} | Commit or cancel the specified transaction
[**create_port_transaction**](DataTransferApi.md#create_port_transaction) | **POST** /data-transfer/{portType}/{portId}/transactions | Create a transaction to the specified output port or input port
[**extend_input_port_transaction_ttl**](DataTransferApi.md#extend_input_port_transaction_ttl) | **PUT** /data-transfer/input-ports/{portId}/transactions/{transactionId} | Extend transaction TTL
[**extend_output_port_transaction_ttl**](DataTransferApi.md#extend_output_port_transaction_ttl) | **PUT** /data-transfer/output-ports/{portId}/transactions/{transactionId} | Extend transaction TTL
[**receive_flow_files**](DataTransferApi.md#receive_flow_files) | **POST** /data-transfer/input-ports/{portId}/transactions/{transactionId}/flow-files | Transfer FlowFiles to the input port
[**transfer_flow_files**](DataTransferApi.md#transfer_flow_files) | **GET** /data-transfer/output-ports/{portId}/transactions/{transactionId}/flow-files | Transfer FlowFiles from the output port

# **commit_input_port_transaction**
> TransactionResultEntity commit_input_port_transaction(response_code, port_id, transaction_id, body=body)

Commit or cancel the specified transaction

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.DataTransferApi(swagger_client.ApiClient(configuration))
response_code = 56 # int | The response code. Available values are BAD_CHECKSUM(19), CONFIRM_TRANSACTION(12) or CANCEL_TRANSACTION(15).
port_id = 'port_id_example' # str | The input port id.
transaction_id = 'transaction_id_example' # str | The transaction id.
body = NULL # object |  (optional)

try:
    # Commit or cancel the specified transaction
    api_response = api_instance.commit_input_port_transaction(response_code, port_id, transaction_id, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DataTransferApi->commit_input_port_transaction: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **response_code** | **int**| The response code. Available values are BAD_CHECKSUM(19), CONFIRM_TRANSACTION(12) or CANCEL_TRANSACTION(15). | 
 **port_id** | **str**| The input port id. | 
 **transaction_id** | **str**| The transaction id. | 
 **body** | [**object**](object.md)|  | [optional] 

### Return type

[**TransactionResultEntity**](TransactionResultEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **commit_output_port_transaction**
> TransactionResultEntity commit_output_port_transaction(response_code, checksum, port_id, transaction_id, body=body)

Commit or cancel the specified transaction

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.DataTransferApi(swagger_client.ApiClient(configuration))
response_code = 56 # int | The response code. Available values are CONFIRM_TRANSACTION(12) or CANCEL_TRANSACTION(15).
checksum = '' # str | A checksum calculated at client side using CRC32 to check flow file content integrity. It must match with the value calculated at server side.
port_id = 'port_id_example' # str | The output port id.
transaction_id = 'transaction_id_example' # str | The transaction id.
body = NULL # object |  (optional)

try:
    # Commit or cancel the specified transaction
    api_response = api_instance.commit_output_port_transaction(response_code, checksum, port_id, transaction_id, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DataTransferApi->commit_output_port_transaction: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **response_code** | **int**| The response code. Available values are CONFIRM_TRANSACTION(12) or CANCEL_TRANSACTION(15). | 
 **checksum** | **str**| A checksum calculated at client side using CRC32 to check flow file content integrity. It must match with the value calculated at server side. | 
 **port_id** | **str**| The output port id. | 
 **transaction_id** | **str**| The transaction id. | 
 **body** | [**object**](object.md)|  | [optional] 

### Return type

[**TransactionResultEntity**](TransactionResultEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_port_transaction**
> TransactionResultEntity create_port_transaction(port_type, port_id, body=body)

Create a transaction to the specified output port or input port

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.DataTransferApi(swagger_client.ApiClient(configuration))
port_type = 'port_type_example' # str | The port type.
port_id = 'port_id_example' # str | The input or output port id.
body = NULL # object |  (optional)

try:
    # Create a transaction to the specified output port or input port
    api_response = api_instance.create_port_transaction(port_type, port_id, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DataTransferApi->create_port_transaction: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **port_type** | **str**| The port type. | 
 **port_id** | **str**| The input or output port id. | 
 **body** | [**object**](object.md)|  | [optional] 

### Return type

[**TransactionResultEntity**](TransactionResultEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **extend_input_port_transaction_ttl**
> TransactionResultEntity extend_input_port_transaction_ttl(port_id, transaction_id, body=body)

Extend transaction TTL

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.DataTransferApi(swagger_client.ApiClient(configuration))
port_id = 'port_id_example' # str | The input port id.
transaction_id = 'transaction_id_example' # str | The transaction id.
body = NULL # object |  (optional)

try:
    # Extend transaction TTL
    api_response = api_instance.extend_input_port_transaction_ttl(port_id, transaction_id, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DataTransferApi->extend_input_port_transaction_ttl: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **port_id** | **str**| The input port id. | 
 **transaction_id** | **str**| The transaction id. | 
 **body** | [**object**](object.md)|  | [optional] 

### Return type

[**TransactionResultEntity**](TransactionResultEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **extend_output_port_transaction_ttl**
> TransactionResultEntity extend_output_port_transaction_ttl(port_id, transaction_id, body=body)

Extend transaction TTL

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.DataTransferApi(swagger_client.ApiClient(configuration))
port_id = 'port_id_example' # str | The output port id.
transaction_id = 'transaction_id_example' # str | The transaction id.
body = NULL # object |  (optional)

try:
    # Extend transaction TTL
    api_response = api_instance.extend_output_port_transaction_ttl(port_id, transaction_id, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DataTransferApi->extend_output_port_transaction_ttl: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **port_id** | **str**| The output port id. | 
 **transaction_id** | **str**| The transaction id. | 
 **body** | [**object**](object.md)|  | [optional] 

### Return type

[**TransactionResultEntity**](TransactionResultEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **receive_flow_files**
> str receive_flow_files(port_id, transaction_id, body=body)

Transfer FlowFiles to the input port

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.DataTransferApi(swagger_client.ApiClient(configuration))
port_id = 'port_id_example' # str | The input port id.
transaction_id = 'transaction_id_example' # str | The transaction id.
body = NULL # object |  (optional)

try:
    # Transfer FlowFiles to the input port
    api_response = api_instance.receive_flow_files(port_id, transaction_id, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DataTransferApi->receive_flow_files: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **port_id** | **str**| The input port id. | 
 **transaction_id** | **str**| The transaction id. | 
 **body** | [**object**](object.md)|  | [optional] 

### Return type

**str**

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: application/octet-stream
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **transfer_flow_files**
> transfer_flow_files(port_id, transaction_id, body=body)

Transfer FlowFiles from the output port

### Example
```python
from __future__ import print_function
import time
import swagger_client
from swagger_client.rest import ApiException
from pprint import pprint

# Configure API key authorization: CookieSecureAuthorizationBearer
configuration = swagger_client.Configuration()
configuration.api_key['__Secure-Authorization-Bearer'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['__Secure-Authorization-Bearer'] = 'Bearer'

# create an instance of the API class
api_instance = swagger_client.DataTransferApi(swagger_client.ApiClient(configuration))
port_id = 'port_id_example' # str | The output port id.
transaction_id = 'transaction_id_example' # str | The transaction id.
body = NULL # object |  (optional)

try:
    # Transfer FlowFiles from the output port
    api_instance.transfer_flow_files(port_id, transaction_id, body=body)
except ApiException as e:
    print("Exception when calling DataTransferApi->transfer_flow_files: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **port_id** | **str**| The output port id. | 
 **transaction_id** | **str**| The transaction id. | 
 **body** | [**object**](object.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: */*
 - **Accept**: application/octet-stream

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

