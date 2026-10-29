# SiteToSiteApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPeers**](SiteToSiteApi.md#getPeers) | **GET** /site-to-site/peers | Returns the available Peers and its status of this NiFi
[**getSiteToSiteDetails**](SiteToSiteApi.md#getSiteToSiteDetails) | **GET** /site-to-site | Returns the details about this NiFi necessary to communicate via site to site

<a name="getPeers"></a>
# **getPeers**
> PeersEntity getPeers()

Returns the available Peers and its status of this NiFi

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SiteToSiteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


SiteToSiteApi apiInstance = new SiteToSiteApi();
try {
    PeersEntity result = apiInstance.getPeers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SiteToSiteApi#getPeers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PeersEntity**](PeersEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml

<a name="getSiteToSiteDetails"></a>
# **getSiteToSiteDetails**
> ControllerEntity getSiteToSiteDetails()

Returns the details about this NiFi necessary to communicate via site to site

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SiteToSiteApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: CookieSecureAuthorizationBearer
ApiKeyAuth CookieSecureAuthorizationBearer = (ApiKeyAuth) defaultClient.getAuthentication("CookieSecureAuthorizationBearer");
CookieSecureAuthorizationBearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//CookieSecureAuthorizationBearer.setApiKeyPrefix("Token");


SiteToSiteApi apiInstance = new SiteToSiteApi();
try {
    ControllerEntity result = apiInstance.getSiteToSiteDetails();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SiteToSiteApi#getSiteToSiteDetails");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ControllerEntity**](ControllerEntity.md)

### Authorization

[CookieSecureAuthorizationBearer](../README.md#CookieSecureAuthorizationBearer)[HTTPBearerJWT](../README.md#HTTPBearerJWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

