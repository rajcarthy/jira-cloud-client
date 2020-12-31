package com.atlassian.jira.rest.client.api;

import com.atlassian.jira.rest.client.ApiClient;

import com.atlassian.jira.rest.client.model.IssueTypeIds;
import com.atlassian.jira.rest.client.model.IssueTypeScreenSchemeDetails;
import com.atlassian.jira.rest.client.model.IssueTypeScreenSchemeId;
import com.atlassian.jira.rest.client.model.IssueTypeScreenSchemeMappingDetails;
import com.atlassian.jira.rest.client.model.IssueTypeScreenSchemeProjectAssociation;
import com.atlassian.jira.rest.client.model.IssueTypeScreenSchemeUpdateDetails;
import com.atlassian.jira.rest.client.model.PageBeanIssueTypeScreenScheme;
import com.atlassian.jira.rest.client.model.PageBeanIssueTypeScreenSchemeItem;
import com.atlassian.jira.rest.client.model.PageBeanIssueTypeScreenSchemesProjects;
import com.atlassian.jira.rest.client.model.UpdateDefaultScreenScheme;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")@Component("com.atlassian.jira.rest.client.api.IssueTypeScreenSchemesApi")
public class IssueTypeScreenSchemesApi {
    private ApiClient apiClient;

    public IssueTypeScreenSchemesApi() {
        this(new ApiClient());
    }

    @Autowired
    public IssueTypeScreenSchemesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Append mappings to issue type screen scheme
     * Appends issue type to screen scheme mappings to an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>204</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * <p><b>404</b> - Returned if the issue type screen scheme, issue type, or screen scheme is not found.
     * <p><b>409</b> - Returned if the issue type is a sub-task, but sub-tasks are disabled in Jira settings.
     * @param body The body parameter
     * @param issueTypeScreenSchemeId The ID of the issue type screen scheme.
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object appendMappingsForIssueTypeScreenScheme(IssueTypeScreenSchemeMappingDetails body, String issueTypeScreenSchemeId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling appendMappingsForIssueTypeScreenScheme");
        }
        // verify the required parameter 'issueTypeScreenSchemeId' is set
        if (issueTypeScreenSchemeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueTypeScreenSchemeId' when calling appendMappingsForIssueTypeScreenScheme");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issueTypeScreenSchemeId", issueTypeScreenSchemeId);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/issuetypescreenscheme/{issueTypeScreenSchemeId}/mapping").buildAndExpand(uriVariables).toUriString();
        
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
     * Assign issue type screen scheme to project
     * Assigns an issue type screen scheme to a project.  Issue type screen schemes can only be assigned to classic projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>204</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if:   *  project is not found.  *  issue type screen scheme is not found.  *  the project is not a classic project.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * <p><b>404</b> - Returned if the issue type screen scheme or the project are missing.
     * @param body The body parameter
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object assignIssueTypeScreenSchemeToProject(IssueTypeScreenSchemeProjectAssociation body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling assignIssueTypeScreenSchemeToProject");
        }
        String path = UriComponentsBuilder.fromPath("/rest/api/3/issuetypescreenscheme/project").build().toUriString();
        
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
     * Create issue type screen scheme
     * Creates an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>201</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * <p><b>404</b> - Returned if the issue type or screen scheme is not found.
     * <p><b>409</b> - Returned if the issue type is a sub-task, but sub-tasks are disabled in Jira settings.
     * @param body An issue type screen scheme bean.
     * @return IssueTypeScreenSchemeId
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IssueTypeScreenSchemeId createIssueTypeScreenScheme(IssueTypeScreenSchemeDetails body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createIssueTypeScreenScheme");
        }
        String path = UriComponentsBuilder.fromPath("/rest/api/3/issuetypescreenscheme").build().toUriString();
        
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

        ParameterizedTypeReference<IssueTypeScreenSchemeId> returnType = new ParameterizedTypeReference<IssueTypeScreenSchemeId>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Delete issue type screen scheme
     * Deletes an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>204</b> - Returned if the issue type screen scheme is deleted.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * <p><b>404</b> - Returned if the issue type screen scheme is not found.
     * @param issueTypeScreenSchemeId The ID of the issue type screen scheme.
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object deleteIssueTypeScreenScheme(String issueTypeScreenSchemeId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'issueTypeScreenSchemeId' is set
        if (issueTypeScreenSchemeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueTypeScreenSchemeId' when calling deleteIssueTypeScreenScheme");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issueTypeScreenSchemeId", issueTypeScreenSchemeId);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/issuetypescreenscheme/{issueTypeScreenSchemeId}").buildAndExpand(uriVariables).toUriString();
        
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
     * Get issue type screen scheme items
     * Returns a [paginated](#pagination) list of issue type screen scheme items.  Only issue type screen schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * @param startAt The index of the first item to return in a page of results (page offset).
     * @param maxResults The maximum number of items to return per page.
     * @param issueTypeScreenSchemeId The list of issue type screen scheme IDs. To include multiple issue type screen schemes, separate IDs with ampersand: &#x60;issueTypeScreenSchemeId&#x3D;10000&amp;issueTypeScreenSchemeId&#x3D;10001&#x60;.
     * @return PageBeanIssueTypeScreenSchemeItem
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageBeanIssueTypeScreenSchemeItem getIssueTypeScreenSchemeMappings(Long startAt, Integer maxResults, List<Long> issueTypeScreenSchemeId) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/rest/api/3/issuetypescreenscheme/mapping").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startAt", startAt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "issueTypeScreenSchemeId", issueTypeScreenSchemeId));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<PageBeanIssueTypeScreenSchemeItem> returnType = new ParameterizedTypeReference<PageBeanIssueTypeScreenSchemeItem>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get issue type screen schemes for projects
     * Returns a [paginated](#pagination) list of issue type screen schemes and, for each issue type screen scheme, a list of the projects that use it.  Only issue type screen schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * @param projectId The list of project IDs. To include multiple projects, separate IDs with ampersand: &#x60;projectId&#x3D;10000&amp;projectId&#x3D;10001&#x60;.
     * @param startAt The index of the first item to return in a page of results (page offset).
     * @param maxResults The maximum number of items to return per page.
     * @return PageBeanIssueTypeScreenSchemesProjects
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageBeanIssueTypeScreenSchemesProjects getIssueTypeScreenSchemeProjectAssociations(List<Long> projectId, Long startAt, Integer maxResults) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectId' when calling getIssueTypeScreenSchemeProjectAssociations");
        }
        String path = UriComponentsBuilder.fromPath("/rest/api/3/issuetypescreenscheme/project").build().toUriString();
        
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

        ParameterizedTypeReference<PageBeanIssueTypeScreenSchemesProjects> returnType = new ParameterizedTypeReference<PageBeanIssueTypeScreenSchemesProjects>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get issue type screen schemes
     * Returns a [paginated](#pagination) list of issue type screen schemes.  Only issue type screen schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * @param startAt The index of the first item to return in a page of results (page offset).
     * @param maxResults The maximum number of items to return per page.
     * @param id The list of issue type screen scheme IDs. To include multiple IDs, provide an ampersand-separated list. For example, &#x60;id&#x3D;10000&amp;id&#x3D;10001&#x60;.
     * @return PageBeanIssueTypeScreenScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageBeanIssueTypeScreenScheme getIssueTypeScreenSchemes(Long startAt, Integer maxResults, List<Long> id) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/rest/api/3/issuetypescreenscheme").build().toUriString();
        
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

        ParameterizedTypeReference<PageBeanIssueTypeScreenScheme> returnType = new ParameterizedTypeReference<PageBeanIssueTypeScreenScheme>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Remove mappings from issue type screen scheme
     * Removes issue type to screen scheme mappings from an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>204</b> - Returned if the screen scheme mappings are removed from the issue type screen scheme.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * <p><b>404</b> - Returned if the issue type screen scheme or one or more issue type mappings are not found.
     * @param body The body parameter
     * @param issueTypeScreenSchemeId The ID of the issue type screen scheme.
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object removeMappingsFromIssueTypeScreenScheme(IssueTypeIds body, String issueTypeScreenSchemeId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling removeMappingsFromIssueTypeScreenScheme");
        }
        // verify the required parameter 'issueTypeScreenSchemeId' is set
        if (issueTypeScreenSchemeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueTypeScreenSchemeId' when calling removeMappingsFromIssueTypeScreenScheme");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issueTypeScreenSchemeId", issueTypeScreenSchemeId);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/issuetypescreenscheme/{issueTypeScreenSchemeId}/mapping/remove").buildAndExpand(uriVariables).toUriString();
        
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
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update issue type screen scheme default screen scheme
     * Updates the default screen scheme of an issue type screen scheme. The default screen scheme is used for all unmapped issue types.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>204</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * <p><b>404</b> - Returned if the issue type screen scheme or the screen screen is not found, or the screen scheme isn&#x27;t used in classic projects.
     * @param body The body parameter
     * @param issueTypeScreenSchemeId The ID of the issue type screen scheme.
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object updateDefaultScreenScheme(UpdateDefaultScreenScheme body, String issueTypeScreenSchemeId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateDefaultScreenScheme");
        }
        // verify the required parameter 'issueTypeScreenSchemeId' is set
        if (issueTypeScreenSchemeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueTypeScreenSchemeId' when calling updateDefaultScreenScheme");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issueTypeScreenSchemeId", issueTypeScreenSchemeId);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/issuetypescreenscheme/{issueTypeScreenSchemeId}/mapping/default").buildAndExpand(uriVariables).toUriString();
        
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
     * Update issue type screen scheme
     * Updates an issue type screen scheme.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>204</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * <p><b>404</b> - Returned if the issue type screen scheme is not found.
     * @param body The issue type screen scheme update details.
     * @param issueTypeScreenSchemeId The ID of the issue type screen scheme.
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object updateIssueTypeScreenScheme(IssueTypeScreenSchemeUpdateDetails body, String issueTypeScreenSchemeId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateIssueTypeScreenScheme");
        }
        // verify the required parameter 'issueTypeScreenSchemeId' is set
        if (issueTypeScreenSchemeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueTypeScreenSchemeId' when calling updateIssueTypeScreenScheme");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issueTypeScreenSchemeId", issueTypeScreenSchemeId);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/issuetypescreenscheme/{issueTypeScreenSchemeId}").buildAndExpand(uriVariables).toUriString();
        
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
