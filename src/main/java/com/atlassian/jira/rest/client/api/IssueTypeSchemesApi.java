package com.atlassian.jira.rest.client.api;

import com.atlassian.jira.rest.client.ApiClient;

import com.atlassian.jira.rest.client.model.IssueTypeIDs;
import com.atlassian.jira.rest.client.model.IssueTypeSchemeDetails;
import com.atlassian.jira.rest.client.model.IssueTypeSchemeID;
import com.atlassian.jira.rest.client.model.IssueTypeSchemeProjectAssociation;
import com.atlassian.jira.rest.client.model.IssueTypeSchemeUpdateDetails;
import com.atlassian.jira.rest.client.model.OrderOfIssueTypes;
import com.atlassian.jira.rest.client.model.PageBeanIssueTypeScheme;
import com.atlassian.jira.rest.client.model.PageBeanIssueTypeSchemeMapping;
import com.atlassian.jira.rest.client.model.PageBeanIssueTypeSchemeProjects;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")@Component("com.atlassian.jira.rest.client.api.IssueTypeSchemesApi")
public class IssueTypeSchemesApi {
    private ApiClient apiClient;

    public IssueTypeSchemesApi() {
        this(new ApiClient());
    }

    @Autowired
    public IssueTypeSchemesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add issue types to issue type scheme
     * Adds issue types to an issue type scheme.  The added issue types are appended to the issue types list.  If any of the issue types exist in the issue type scheme, the operation fails and no issue types are added.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>204</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * <p><b>404</b> - Returned if the issue type or the issue type scheme is not found.
     * @param body The body parameter
     * @param issueTypeSchemeId The ID of the issue type scheme.
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object addIssueTypesToIssueTypeScheme(IssueTypeIDs body, Long issueTypeSchemeId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling addIssueTypesToIssueTypeScheme");
        }
        // verify the required parameter 'issueTypeSchemeId' is set
        if (issueTypeSchemeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueTypeSchemeId' when calling addIssueTypesToIssueTypeScheme");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issueTypeSchemeId", issueTypeSchemeId);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/issuetypescheme/{issueTypeSchemeId}/issuetype").buildAndExpand(uriVariables).toUriString();
        
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
    /**
     * Assign issue type scheme to project
     * Assigns an issue type scheme to a project.  If any issues in the project are assigned issue types not present in the new scheme, the operation will fail. To complete the assignment those issues must be updated to use issue types in the new scheme.  Issue type schemes can only be assigned to classic projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>204</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * <p><b>404</b> - Returned if the issue type scheme or the project is not found.
     * @param body The body parameter
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object assignIssueTypeSchemeToProject(IssueTypeSchemeProjectAssociation body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling assignIssueTypeSchemeToProject");
        }
        String path = UriComponentsBuilder.fromPath("/rest/api/3/issuetypescheme/project").build().toUriString();
        
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
    /**
     * Create issue type scheme
     * Creates an issue type scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>201</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * <p><b>409</b> - Returned if the scheme name is used by another scheme.
     * @param body The body parameter
     * @return IssueTypeSchemeID
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IssueTypeSchemeID createIssueTypeScheme(IssueTypeSchemeDetails body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createIssueTypeScheme");
        }
        String path = UriComponentsBuilder.fromPath("/rest/api/3/issuetypescheme").build().toUriString();
        
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

        ParameterizedTypeReference<IssueTypeSchemeID> returnType = new ParameterizedTypeReference<IssueTypeSchemeID>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Delete issue type scheme
     * Deletes an issue type scheme.  Only issue type schemes used in classic projects can be deleted.  Any projects assigned to the scheme are reassigned to the default issue type scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>204</b> - Returned if the issue type scheme is deleted.
     * <p><b>400</b> - Returned if the request is to delete the default issue type scheme.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * <p><b>404</b> - Returned if the issue type scheme is not found.
     * @param issueTypeSchemeId The ID of the issue type scheme.
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object deleteIssueTypeScheme(Long issueTypeSchemeId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'issueTypeSchemeId' is set
        if (issueTypeSchemeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueTypeSchemeId' when calling deleteIssueTypeScheme");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issueTypeSchemeId", issueTypeSchemeId);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/issuetypescheme/{issueTypeSchemeId}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Object> returnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get all issue type schemes
     * Returns a [paginated](#pagination) list of issue type schemes.  Only issue type schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * @param startAt The index of the first item to return in a page of results (page offset).
     * @param maxResults The maximum number of items to return per page.
     * @param id The list of issue type schemes IDs. To include multiple IDs, provide an ampersand-separated list. For example, &#x60;id&#x3D;10000&amp;id&#x3D;10001&#x60;.
     * @return PageBeanIssueTypeScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageBeanIssueTypeScheme getAllIssueTypeSchemes(Long startAt, Integer maxResults, List<Long> id) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/rest/api/3/issuetypescheme").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startAt", startAt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "id", id));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<PageBeanIssueTypeScheme> returnType = new ParameterizedTypeReference<PageBeanIssueTypeScheme>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get issue type schemes for projects
     * Returns a [paginated](#pagination) list of issue type schemes and, for each issue type scheme, a list of the projects that use it.  Only issue type schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * @param projectId The list of project IDs. To include multiple project IDs, provide an ampersand-separated list. For example, &#x60;projectId&#x3D;10000&amp;projectId&#x3D;10001&#x60;.
     * @param startAt The index of the first item to return in a page of results (page offset).
     * @param maxResults The maximum number of items to return per page.
     * @return PageBeanIssueTypeSchemeProjects
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageBeanIssueTypeSchemeProjects getIssueTypeSchemeForProjects(List<Long> projectId, Long startAt, Integer maxResults) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling getIssueTypeSchemeForProjects");
        }
        String path = UriComponentsBuilder.fromPath("/rest/api/3/issuetypescheme/project").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startAt", startAt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "projectId", projectId));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<PageBeanIssueTypeSchemeProjects> returnType = new ParameterizedTypeReference<PageBeanIssueTypeSchemeProjects>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get issue type scheme items
     * Returns a [paginated](#pagination) list of issue type scheme items.  Only issue type scheme items used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * @param startAt The index of the first item to return in a page of results (page offset).
     * @param maxResults The maximum number of items to return per page.
     * @param issueTypeSchemeId The list of issue type scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, &#x60;issueTypeSchemeId&#x3D;10000&amp;issueTypeSchemeId&#x3D;10001&#x60;.
     * @return PageBeanIssueTypeSchemeMapping
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageBeanIssueTypeSchemeMapping getIssueTypeSchemesMapping(Long startAt, Integer maxResults, List<Long> issueTypeSchemeId) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/rest/api/3/issuetypescheme/mapping").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startAt", startAt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "issueTypeSchemeId", issueTypeSchemeId));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<PageBeanIssueTypeSchemeMapping> returnType = new ParameterizedTypeReference<PageBeanIssueTypeSchemeMapping>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Remove issue type from issue type scheme
     * Removes an issue type from an issue type scheme.  This operation cannot remove:   *  any issue type used by issues.  *  any issue types from the default issue type scheme.  *  the last standard issue type from an issue type scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>204</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * <p><b>404</b> - Returned if the issue type scheme is missing or the issue type is not found in the issue type scheme.
     * @param issueTypeSchemeId The ID of the issue type scheme.
     * @param issueTypeId The ID of the issue type.
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object removeIssueTypeFromIssueTypeScheme(Long issueTypeSchemeId, Long issueTypeId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'issueTypeSchemeId' is set
        if (issueTypeSchemeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueTypeSchemeId' when calling removeIssueTypeFromIssueTypeScheme");
        }
        // verify the required parameter 'issueTypeId' is set
        if (issueTypeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueTypeId' when calling removeIssueTypeFromIssueTypeScheme");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issueTypeSchemeId", issueTypeSchemeId);
        uriVariables.put("issueTypeId", issueTypeId);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/issuetypescheme/{issueTypeSchemeId}/issuetype/{issueTypeId}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Object> returnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Change order of issue types
     * Changes the order of issue types in an issue type scheme.  The request body parameters must meet the following requirements:   *  all of the issue types must belong to the issue type scheme.  *  either &#x60;after&#x60; or &#x60;position&#x60; must be provided.  *  the issue type in &#x60;after&#x60; must not be in the issue type list.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>204</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * <p><b>404</b> - Returned if the issue type scheme is not found.
     * @param body The body parameter
     * @param issueTypeSchemeId The ID of the issue type scheme.
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object reorderIssueTypesInIssueTypeScheme(OrderOfIssueTypes body, Long issueTypeSchemeId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling reorderIssueTypesInIssueTypeScheme");
        }
        // verify the required parameter 'issueTypeSchemeId' is set
        if (issueTypeSchemeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueTypeSchemeId' when calling reorderIssueTypesInIssueTypeScheme");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issueTypeSchemeId", issueTypeSchemeId);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/issuetypescheme/{issueTypeSchemeId}/issuetype/move").buildAndExpand(uriVariables).toUriString();
        
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
    /**
     * Update issue type scheme
     * Updates an issue type scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>204</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * <p><b>404</b> - Returned if the issue type scheme is not found.
     * @param body The body parameter
     * @param issueTypeSchemeId The ID of the issue type scheme.
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object updateIssueTypeScheme(IssueTypeSchemeUpdateDetails body, Long issueTypeSchemeId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateIssueTypeScheme");
        }
        // verify the required parameter 'issueTypeSchemeId' is set
        if (issueTypeSchemeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueTypeSchemeId' when calling updateIssueTypeScheme");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issueTypeSchemeId", issueTypeSchemeId);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/issuetypescheme/{issueTypeSchemeId}").buildAndExpand(uriVariables).toUriString();
        
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
