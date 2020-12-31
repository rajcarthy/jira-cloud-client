package com.atlassian.jira.rest.client.api;

import com.atlassian.jira.rest.client.ApiClient;

import com.atlassian.jira.rest.client.model.EntityProperty;
import com.atlassian.jira.rest.client.model.OperationMessage;
import com.atlassian.jira.rest.client.model.PropertyKeys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")@Component("com.atlassian.jira.rest.client.api.AppPropertiesApi")
public class AppPropertiesApi {
    private ApiClient apiClient;

    public AppPropertiesApi() {
        this(new ApiClient());
    }

    @Autowired
    public AppPropertiesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete app property
     * Deletes an app&#x27;s property.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.
     * <p><b>204</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the property key is longer than 127 characters.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>404</b> - Returned if the property is not found or doesn&#x27;t belong to the app.
     * @param addonKey The key of the app, as defined in its descriptor.
     * @param propertyKey The key of the property.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void addonPropertiesResourceDeleteAddonPropertyDelete(String addonKey, String propertyKey) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'addonKey' is set
        if (addonKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'addonKey' when calling addonPropertiesResourceDeleteAddonPropertyDelete");
        }
        // verify the required parameter 'propertyKey' is set
        if (propertyKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'propertyKey' when calling addonPropertiesResourceDeleteAddonPropertyDelete");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("addonKey", addonKey);
        uriVariables.put("propertyKey", propertyKey);
        String path = UriComponentsBuilder.fromPath("/rest/atlassian-connect/1/addons/{addonKey}/properties/{propertyKey}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get app properties
     * Gets all the properties of an app.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * @param addonKey The key of the app, as defined in its descriptor.
     * @return PropertyKeys
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PropertyKeys addonPropertiesResourceGetAddonPropertiesGet(String addonKey) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'addonKey' is set
        if (addonKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'addonKey' when calling addonPropertiesResourceGetAddonPropertiesGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("addonKey", addonKey);
        String path = UriComponentsBuilder.fromPath("/rest/atlassian-connect/1/addons/{addonKey}/properties").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<PropertyKeys> returnType = new ParameterizedTypeReference<PropertyKeys>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get app property
     * Returns the key and value of an app&#x27;s property.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the property key is longer than 127 characters.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>404</b> - Returned if the property is not found or doesn&#x27;t belong to the app.
     * @param addonKey The key of the app, as defined in its descriptor.
     * @param propertyKey The key of the property.
     * @return EntityProperty
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EntityProperty addonPropertiesResourceGetAddonPropertyGet(String addonKey, String propertyKey) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'addonKey' is set
        if (addonKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'addonKey' when calling addonPropertiesResourceGetAddonPropertyGet");
        }
        // verify the required parameter 'propertyKey' is set
        if (propertyKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'propertyKey' when calling addonPropertiesResourceGetAddonPropertyGet");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("addonKey", addonKey);
        uriVariables.put("propertyKey", propertyKey);
        String path = UriComponentsBuilder.fromPath("/rest/atlassian-connect/1/addons/{addonKey}/properties/{propertyKey}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<EntityProperty> returnType = new ParameterizedTypeReference<EntityProperty>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Set app property
     * Sets the value of an app&#x27;s property. Use this resource to store custom data for your app.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  **[Permissions](#permissions) required:** Only a Connect app whose key matches &#x60;addonKey&#x60; can make this request.
     * <p><b>200</b> - Returned if the property is updated.
     * <p><b>201</b> - Returned is the property is created.
     * <p><b>400</b> - Returned if:   * the property key is longer than 127 characters.   * the value is not valid JSON.   * the value is longer than 32768 characters.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * @param body The body parameter
     * @param addonKey The key of the app, as defined in its descriptor.
     * @param propertyKey The key of the property.
     * @return OperationMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OperationMessage addonPropertiesResourcePutAddonPropertyPut(Object body, String addonKey, String propertyKey) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling addonPropertiesResourcePutAddonPropertyPut");
        }
        // verify the required parameter 'addonKey' is set
        if (addonKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'addonKey' when calling addonPropertiesResourcePutAddonPropertyPut");
        }
        // verify the required parameter 'propertyKey' is set
        if (propertyKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'propertyKey' when calling addonPropertiesResourcePutAddonPropertyPut");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("addonKey", addonKey);
        uriVariables.put("propertyKey", propertyKey);
        String path = UriComponentsBuilder.fromPath("/rest/atlassian-connect/1/addons/{addonKey}/properties/{propertyKey}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<OperationMessage> returnType = new ParameterizedTypeReference<OperationMessage>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
