# nifi_client_v2.SiteToSiteApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_peers**](SiteToSiteApi.md#get_peers) | **GET** /site-to-site/peers | Returns the available Peers and its status of this NiFi
[**get_site_to_site_details**](SiteToSiteApi.md#get_site_to_site_details) | **GET** /site-to-site | Returns the details about this NiFi necessary to communicate via site to site

# **get_peers**
> PeersEntity get_peers()

Returns the available Peers and its status of this NiFi

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
api_instance = nifi_client_v2.SiteToSiteApi(nifi_client_v2.ApiClient(configuration))

try:
    # Returns the available Peers and its status of this NiFi
    api_response = api_instance.get_peers()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SiteToSiteApi->get_peers: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PeersEntity**](PeersEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_site_to_site_details**
> ControllerEntity get_site_to_site_details()

Returns the details about this NiFi necessary to communicate via site to site

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
api_instance = nifi_client_v2.SiteToSiteApi(nifi_client_v2.ApiClient(configuration))

try:
    # Returns the details about this NiFi necessary to communicate via site to site
    api_response = api_instance.get_site_to_site_details()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SiteToSiteApi->get_site_to_site_details: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ControllerEntity**](ControllerEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer), [HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

