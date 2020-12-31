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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")@Component("com.atlassian.jira.rest.client.api.IssueWorklogPropertiesApi")
public class IssueWorklogPropertiesApi {
    private ApiClient apiClient;

    public IssueWorklogPropertiesApi() {
        this(new ApiClient());
    }

    @Autowired
    public IssueWorklogPropertiesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete worklog property
     * Deletes a worklog property.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
     * <p><b>204</b> - Returned if the worklog property is removed.
     * <p><b>400</b> - Returned if the worklog key or id is invalid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have permission to edit the worklog.
     * <p><b>404</b> - Returned if:   *  the issue, worklog, or property is not found.  *  the user does not have permission to view the issue or worklog.
     * @param issueIdOrKey The ID or key of the issue.
     * @param worklogId The ID of the worklog.
     * @param propertyKey The key of the property.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteWorklogProperty(String issueIdOrKey, String worklogId, String propertyKey) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'issueIdOrKey' is set
        if (issueIdOrKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueIdOrKey' when calling deleteWorklogProperty");
        }
        // verify the required parameter 'worklogId' is set
        if (worklogId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'worklogId' when calling deleteWorklogProperty");
        }
        // verify the required parameter 'propertyKey' is set
        if (propertyKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'propertyKey' when calling deleteWorklogProperty");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issueIdOrKey", issueIdOrKey);
        uriVariables.put("worklogId", worklogId);
        uriVariables.put("propertyKey", propertyKey);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/issue/{issueIdOrKey}/worklog/{worklogId}/properties/{propertyKey}").buildAndExpand(uriVariables).toUriString();
        
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
     * Get worklog property
     * Returns the value of a worklog property.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the worklog ID is invalid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>404</b> - Returned if:   *  the issue, worklog, or property is not found.  *  the user does not have permission to view the issue or worklog.
     * @param issueIdOrKey The ID or key of the issue.
     * @param worklogId The ID of the worklog.
     * @param propertyKey The key of the property.
     * @return EntityProperty
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EntityProperty getWorklogProperty(String issueIdOrKey, String worklogId, String propertyKey) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'issueIdOrKey' is set
        if (issueIdOrKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueIdOrKey' when calling getWorklogProperty");
        }
        // verify the required parameter 'worklogId' is set
        if (worklogId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'worklogId' when calling getWorklogProperty");
        }
        // verify the required parameter 'propertyKey' is set
        if (propertyKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'propertyKey' when calling getWorklogProperty");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issueIdOrKey", issueIdOrKey);
        uriVariables.put("worklogId", worklogId);
        uriVariables.put("propertyKey", propertyKey);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/issue/{issueIdOrKey}/worklog/{worklogId}/properties/{propertyKey}").buildAndExpand(uriVariables).toUriString();
        
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
     * Get worklog property keys
     * Returns the keys of all properties for a worklog.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the worklog ID is invalid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>404</b> - Returned if:   *  the issue or worklog is not found.  *  the user does not have permission to view the issue or worklog.
     * @param issueIdOrKey The ID or key of the issue.
     * @param worklogId The ID of the worklog.
     * @return PropertyKeys
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PropertyKeys getWorklogPropertyKeys(String issueIdOrKey, String worklogId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'issueIdOrKey' is set
        if (issueIdOrKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueIdOrKey' when calling getWorklogPropertyKeys");
        }
        // verify the required parameter 'worklogId' is set
        if (worklogId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'worklogId' when calling getWorklogPropertyKeys");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issueIdOrKey", issueIdOrKey);
        uriVariables.put("worklogId", worklogId);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/issue/{issueIdOrKey}/worklog/{worklogId}/properties").buildAndExpand(uriVariables).toUriString();
        
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
     * Set worklog property
     * Sets the value of a worklog property. Use this operation to store custom data against the worklog.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Edit all worklogs*[ project permission](https://confluence.atlassian.com/x/yodKLg) to update any worklog or *Edit own worklogs* to update worklogs created by the user.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
     * <p><b>200</b> - Returned if the worklog property is updated.
     * <p><b>201</b> - Returned if the worklog property is created.
     * <p><b>400</b> - Returned if the worklog ID is invalid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have permission to edit the worklog.
     * <p><b>404</b> - Returned if:   *  the issue or worklog is not found.  *  the user does not have permission to view the issue or worklog.
     * @param body The body parameter
     * @param issueIdOrKey The ID or key of the issue.
     * @param worklogId The ID of the worklog.
     * @param propertyKey The key of the issue property. The maximum length is 255 characters.
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object setWorklogProperty(Object body, String issueIdOrKey, String worklogId, String propertyKey) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling setWorklogProperty");
        }
        // verify the required parameter 'issueIdOrKey' is set
        if (issueIdOrKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueIdOrKey' when calling setWorklogProperty");
        }
        // verify the required parameter 'worklogId' is set
        if (worklogId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'worklogId' when calling setWorklogProperty");
        }
        // verify the required parameter 'propertyKey' is set
        if (propertyKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'propertyKey' when calling setWorklogProperty");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issueIdOrKey", issueIdOrKey);
        uriVariables.put("worklogId", worklogId);
        uriVariables.put("propertyKey", propertyKey);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/issue/{issueIdOrKey}/worklog/{worklogId}/properties/{propertyKey}").buildAndExpand(uriVariables).toUriString();
        
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
