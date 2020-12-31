package com.atlassian.jira.rest.client.api;

import com.atlassian.jira.rest.client.ApiClient;

import com.atlassian.jira.rest.client.model.CreateCustomFieldContext;
import com.atlassian.jira.rest.client.model.CustomFieldContextUpdateDetails;
import com.atlassian.jira.rest.client.model.IssueTypeIds;
import com.atlassian.jira.rest.client.model.PageBeanContextForProjectAndIssueType;
import com.atlassian.jira.rest.client.model.PageBeanCustomFieldContext;
import com.atlassian.jira.rest.client.model.PageBeanIssueTypeToContextMapping;
import com.atlassian.jira.rest.client.model.ProjectIds;
import com.atlassian.jira.rest.client.model.ProjectIssueTypeMappings;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")@Component("com.atlassian.jira.rest.client.api.IssueCustomFieldContextsApi")
public class IssueCustomFieldContextsApi {
    private ApiClient apiClient;

    public IssueCustomFieldContextsApi() {
        this(new ApiClient());
    }

    @Autowired
    public IssueCustomFieldContextsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add issue types to context
     * Adds issue types to a custom field context, appending the issue types to the issue types list.  A custom field context without any issue types applies to all issue types. Adding issue types to such a custom field context would result in it applying to only the listed issue types.  If any of the issue types exists in the custom field context, the operation fails and no issue types are added.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>204</b> - Returned if operation is successful.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * <p><b>404</b> - Returned if the custom field, context, or issue type is not found.
     * <p><b>409</b> - Returned if the issue type is a sub-task, but sub-tasks are disabled in Jira settings.
     * @param body The body parameter
     * @param fieldId The ID of the custom field.
     * @param contextId The ID of the context.
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object addIssueTypesToContext(IssueTypeIds body, String fieldId, Long contextId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling addIssueTypesToContext");
        }
        // verify the required parameter 'fieldId' is set
        if (fieldId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fieldId' when calling addIssueTypesToContext");
        }
        // verify the required parameter 'contextId' is set
        if (contextId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contextId' when calling addIssueTypesToContext");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("fieldId", fieldId);
        uriVariables.put("contextId", contextId);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/field/{fieldId}/context/{contextId}/issuetype").buildAndExpand(uriVariables).toUriString();
        
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
     * Assign custom field context to projects
     * Assigns a custom field context to projects.  If any project in the request is assigned to any context of the custom field, the operation fails.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>204</b> - Returned if operation is successful.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * <p><b>404</b> - Returned if the custom field, context, or project is not found.
     * @param body The body parameter
     * @param fieldId The ID of the custom field.
     * @param contextId The ID of the context.
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object assignProjectsToCustomFieldContext(ProjectIds body, String fieldId, Long contextId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling assignProjectsToCustomFieldContext");
        }
        // verify the required parameter 'fieldId' is set
        if (fieldId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fieldId' when calling assignProjectsToCustomFieldContext");
        }
        // verify the required parameter 'contextId' is set
        if (contextId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contextId' when calling assignProjectsToCustomFieldContext");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("fieldId", fieldId);
        uriVariables.put("contextId", contextId);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/field/{fieldId}/context/{contextId}/project").buildAndExpand(uriVariables).toUriString();
        
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
     * Create custom field context
     * Creates a custom field context.  If &#x60;projectIds&#x60; is empty, a global context is created. A global context is one that applies to all project. If &#x60;issueTypeIds&#x60; is empty, the context applies to all issue types.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>201</b> - Returned if the custom field context is created.
     * <p><b>400</b> - Returned if the request is invalid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>404</b> - Returned if the field, project, or issue type is not found.
     * <p><b>409</b> - Returned if the issue type is a sub-task, but sub-tasks are disabled in Jira settings.
     * @param body The body parameter
     * @param fieldId The ID of the custom field.
     * @return CreateCustomFieldContext
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateCustomFieldContext createCustomFieldContext(CreateCustomFieldContext body, String fieldId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling createCustomFieldContext");
        }
        // verify the required parameter 'fieldId' is set
        if (fieldId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fieldId' when calling createCustomFieldContext");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("fieldId", fieldId);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/field/{fieldId}/context").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<CreateCustomFieldContext> returnType = new ParameterizedTypeReference<CreateCustomFieldContext>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Delete custom field context
     * Deletes a [ custom field context](https://confluence.atlassian.com/adminjiracloud/what-are-custom-field-contexts-991923859.html).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>204</b> - Returned if the context is deleted.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * <p><b>404</b> - Returned if the custom field or the context is not found.
     * @param fieldId The ID of the custom field.
     * @param contextId The ID of the context.
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object deleteCustomFieldContext(String fieldId, Long contextId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'fieldId' is set
        if (fieldId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fieldId' when calling deleteCustomFieldContext");
        }
        // verify the required parameter 'contextId' is set
        if (contextId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contextId' when calling deleteCustomFieldContext");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("fieldId", fieldId);
        uriVariables.put("contextId", contextId);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/field/{fieldId}/context/{contextId}").buildAndExpand(uriVariables).toUriString();
        
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
     * Get custom field contexts
     * Returns a [paginated](#pagination) list of [ contexts](https://confluence.atlassian.com/adminjiracloud/what-are-custom-field-contexts-991923859.html) for a custom field. Contexts can be returned as follows:   *  With no other parameters set, all contexts.  *  By defining &#x60;id&#x60; only, all contexts from the list of IDs.  *  By defining &#x60;isAnyIssueType&#x60;, limit the list of contexts returned to either those that apply to all issue types (true) or those that apply to only a subset of issue types (false)  *  By defining &#x60;isGlobalContext&#x60;, limit the list of contexts return to either those that apply to all projects (global contexts) (true) or those that apply to only a subset of projects (false).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * <p><b>404</b> - Returned if the custom field was not found.
     * @param fieldId The ID of the custom field.
     * @param isAnyIssueType Whether to return contexts that apply to all issue types.
     * @param isGlobalContext Whether to return contexts that apply to all projects.
     * @param contextId The list of context IDs. To include multiple contexts, separate IDs with ampersand: &#x60;contextId&#x3D;10000&amp;contextId&#x3D;10001&#x60;.
     * @param startAt The index of the first item to return in a page of results (page offset).
     * @param maxResults The maximum number of items to return per page.
     * @return PageBeanCustomFieldContext
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageBeanCustomFieldContext getContextsForField(String fieldId, Boolean isAnyIssueType, Boolean isGlobalContext, List<Long> contextId, Long startAt, Integer maxResults) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'fieldId' is set
        if (fieldId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fieldId' when calling getContextsForField");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("fieldId", fieldId);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/field/{fieldId}/context").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "isAnyIssueType", isAnyIssueType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "isGlobalContext", isGlobalContext));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "contextId", contextId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startAt", startAt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<PageBeanCustomFieldContext> returnType = new ParameterizedTypeReference<PageBeanCustomFieldContext>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get custom field contexts for projects and issue types
     * Returns a [paginated](#pagination) list of project and issue type mappings and, for each mapping, the ID of a [custom field context](https://confluence.atlassian.com/x/k44fOw) that applies to the project and issue type.  If there is no custom field context assigned to the project then, if present, the custom field context that applies to all projects is returned if it also applies to the issue type or all issue types. If a custom field context is not found, the returned custom field context ID is &#x60;null&#x60;.  Duplicate project and issue type mappings cannot be provided in the request.  The order of the returned values is the same as provided in the request.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * <p><b>404</b> - Returned if the custom field, project, or issue type is not found.
     * @param body The list of project and issue type mappings.
     * @param fieldId The ID of the custom field.
     * @param startAt The index of the first item to return in a page of results (page offset).
     * @param maxResults The maximum number of items to return per page.
     * @return PageBeanContextForProjectAndIssueType
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageBeanContextForProjectAndIssueType getCustomFieldContextsForProjectsAndIssueTypes(ProjectIssueTypeMappings body, String fieldId, Long startAt, Integer maxResults) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling getCustomFieldContextsForProjectsAndIssueTypes");
        }
        // verify the required parameter 'fieldId' is set
        if (fieldId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fieldId' when calling getCustomFieldContextsForProjectsAndIssueTypes");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("fieldId", fieldId);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/field/{fieldId}/context/mapping").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startAt", startAt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<PageBeanContextForProjectAndIssueType> returnType = new ParameterizedTypeReference<PageBeanContextForProjectAndIssueType>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get issue types for custom field context
     * Returns a [paginated](#pagination) list of context to issue type mappings for a custom field. Mappings are returned for all contexts or a list of contexts. Mappings are ordered first by context ID and then by issue type ID.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>200</b> - Returned if operation is successful.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * @param fieldId The ID of the custom field.
     * @param contextId The ID of the context. To include multiple contexts, provide an ampersand-separated list. For example, &#x60;contextId&#x3D;10001&amp;contextId&#x3D;10002&#x60;.
     * @param startAt The index of the first item to return in a page of results (page offset).
     * @param maxResults The maximum number of items to return per page.
     * @return PageBeanIssueTypeToContextMapping
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageBeanIssueTypeToContextMapping getIssueTypeMappingsForContexts(String fieldId, List<Long> contextId, Long startAt, Integer maxResults) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'fieldId' is set
        if (fieldId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fieldId' when calling getIssueTypeMappingsForContexts");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("fieldId", fieldId);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/field/{fieldId}/context/issueTypeMapping").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "contextId", contextId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startAt", startAt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<PageBeanIssueTypeToContextMapping> returnType = new ParameterizedTypeReference<PageBeanIssueTypeToContextMapping>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Remove custom field context from projects
     * Removes a custom field context from projects.  A custom field context without any projects applies to all projects. Removing all projects from a custom field context would result in it applying to all projects.  If any project in the request is not assigned to the context, or the operation would result in two global contexts for the field, the operation fails.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>204</b> - Returned if the custom field context is removed from the projects.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * <p><b>404</b> - Returned if the custom field, context, or one or more projects are not found.
     * @param body The body parameter
     * @param fieldId The ID of the custom field.
     * @param contextId The ID of the context.
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object removeCustomFieldContextFromProjects(ProjectIds body, String fieldId, Long contextId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling removeCustomFieldContextFromProjects");
        }
        // verify the required parameter 'fieldId' is set
        if (fieldId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fieldId' when calling removeCustomFieldContextFromProjects");
        }
        // verify the required parameter 'contextId' is set
        if (contextId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contextId' when calling removeCustomFieldContextFromProjects");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("fieldId", fieldId);
        uriVariables.put("contextId", contextId);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/field/{fieldId}/context/{contextId}/project/remove").buildAndExpand(uriVariables).toUriString();
        
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
     * Update custom field context
     * Updates a [ custom field context](https://confluence.atlassian.com/adminjiracloud/what-are-custom-field-contexts-991923859.html).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>204</b> - Returned if the context is updated.
     * <p><b>400</b> - Returned if the request is not valid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the required permissions.
     * <p><b>404</b> - Returned if the custom field or the context is not found.
     * @param body The body parameter
     * @param fieldId The ID of the custom field.
     * @param contextId The ID of the context.
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object updateCustomFieldContext(CustomFieldContextUpdateDetails body, String fieldId, Long contextId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateCustomFieldContext");
        }
        // verify the required parameter 'fieldId' is set
        if (fieldId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fieldId' when calling updateCustomFieldContext");
        }
        // verify the required parameter 'contextId' is set
        if (contextId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contextId' when calling updateCustomFieldContext");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("fieldId", fieldId);
        uriVariables.put("contextId", contextId);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/field/{fieldId}/context/{contextId}").buildAndExpand(uriVariables).toUriString();
        
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
