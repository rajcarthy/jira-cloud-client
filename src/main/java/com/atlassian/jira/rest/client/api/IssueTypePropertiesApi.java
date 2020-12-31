package com.atlassian.jira.rest.client.api;

import com.atlassian.jira.rest.client.ApiClient;

import com.atlassian.jira.rest.client.model.EntityProperty;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")@Component("com.atlassian.jira.rest.client.api.IssueTypePropertiesApi")
public class IssueTypePropertiesApi {
    private ApiClient apiClient;

    public IssueTypePropertiesApi() {
        this(new ApiClient());
    }

    @Autowired
    public IssueTypePropertiesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete issue type property
     * Deletes the [issue type property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>204</b> - Returned if the issue type property is deleted.
     * <p><b>400</b> - Returned if the issue type ID is invalid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the necessary permission.
     * <p><b>404</b> - Returned if the issue type or property is not found.
     * @param issueTypeId The ID of the issue type.
     * @param propertyKey The key of the property. Use [Get issue type property keys](#api-rest-api-3-issuetype-issueTypeId-properties-get) to get a list of all issue type property keys.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteIssueTypeProperty(String issueTypeId, String propertyKey) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'issueTypeId' is set
        if (issueTypeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueTypeId' when calling deleteIssueTypeProperty");
        }
        // verify the required parameter 'propertyKey' is set
        if (propertyKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'propertyKey' when calling deleteIssueTypeProperty");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issueTypeId", issueTypeId);
        uriVariables.put("propertyKey", propertyKey);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/issuetype/{issueTypeId}/properties/{propertyKey}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get issue type property
     * Returns the key and value of the [issue type property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) to get the details of any issue type.  *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) to get the details of any issue types associated with the projects the user has permission to browse.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the issue type ID is invalid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>404</b> - Returned if the issue type or property is not found or the user does not have the required permissions.
     * @param issueTypeId The ID of the issue type.
     * @param propertyKey The key of the property. Use [Get issue type property keys](#api-rest-api-3-issuetype-issueTypeId-properties-get) to get a list of all issue type property keys.
     * @return EntityProperty
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EntityProperty getIssueTypeProperty(String issueTypeId, String propertyKey) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'issueTypeId' is set
        if (issueTypeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueTypeId' when calling getIssueTypeProperty");
        }
        // verify the required parameter 'propertyKey' is set
        if (propertyKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'propertyKey' when calling getIssueTypeProperty");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issueTypeId", issueTypeId);
        uriVariables.put("propertyKey", propertyKey);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/issuetype/{issueTypeId}/properties/{propertyKey}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<EntityProperty> returnType = new ParameterizedTypeReference<EntityProperty>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get issue type property keys
     * Returns all the [issue type property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties) keys of the issue type.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) to get the property keys of any issue type.  *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) to get the property keys of any issue types associated with the projects the user has permission to browse.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the issue type ID is invalid.
     * <p><b>404</b> - Returned if:   *  the issue type is not found.  *  the user does not have the required permissions.
     * @param issueTypeId The ID of the issue type.
     * @return PropertyKeys
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PropertyKeys getIssueTypePropertyKeys(String issueTypeId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'issueTypeId' is set
        if (issueTypeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueTypeId' when calling getIssueTypePropertyKeys");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issueTypeId", issueTypeId);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/issuetype/{issueTypeId}/properties").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<PropertyKeys> returnType = new ParameterizedTypeReference<PropertyKeys>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Set issue type property
     * Creates or updates the value of the [issue type property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties). Use this resource to store and update data against an issue type.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>200</b> - Returned if the issue type property is updated.
     * <p><b>201</b> - Returned if the issue type property is created.
     * <p><b>400</b> - Returned if:   *  the issue type ID is invalid.  *  a property value is not provided.  *  the property value JSON content is invalid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have permission to modify the issue type.
     * <p><b>404</b> - Returned if:   *  the issue type is not found.  *  the user does not have the permission view the issue type.
     * @param body The body parameter
     * @param issueTypeId The ID of the issue type.
     * @param propertyKey The key of the issue type property. The maximum length is 255 characters.
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object setIssueTypeProperty(Object body, String issueTypeId, String propertyKey) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling setIssueTypeProperty");
        }
        // verify the required parameter 'issueTypeId' is set
        if (issueTypeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueTypeId' when calling setIssueTypeProperty");
        }
        // verify the required parameter 'propertyKey' is set
        if (propertyKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'propertyKey' when calling setIssueTypeProperty");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issueTypeId", issueTypeId);
        uriVariables.put("propertyKey", propertyKey);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/issuetype/{issueTypeId}/properties/{propertyKey}").buildAndExpand(uriVariables).toUriString();
        
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

        String[] authNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<Object> returnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
