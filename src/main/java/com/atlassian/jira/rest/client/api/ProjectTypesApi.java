package com.atlassian.jira.rest.client.api;

import com.atlassian.jira.rest.client.ApiClient;

import com.atlassian.jira.rest.client.model.ProjectType;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")@Component("com.atlassian.jira.rest.client.api.ProjectTypesApi")
public class ProjectTypesApi {
    private ApiClient apiClient;

    public ProjectTypesApi() {
        this(new ApiClient());
    }

    @Autowired
    public ProjectTypesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get accessible project type by key
     * Returns a [project type](https://confluence.atlassian.com/x/Var1Nw) if it is accessible to the user.  **[Permissions](#permissions) required:** Permission to access Jira.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>404</b> - Returned if the project type is not accessible to the user.
     * @param projectTypeKey The key of the project type.
     * @return ProjectType
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProjectType getAccessibleProjectTypeByKey(String projectTypeKey) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'projectTypeKey' is set
        if (projectTypeKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectTypeKey' when calling getAccessibleProjectTypeByKey");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("projectTypeKey", projectTypeKey);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/project/type/{projectTypeKey}/accessible").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ProjectType> returnType = new ParameterizedTypeReference<ProjectType>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get licensed project types
     * Returns all [project types](https://confluence.atlassian.com/x/Var1Nw) with a valid license.
     * <p><b>200</b> - Returned if the request is successful.
     * @return List&lt;ProjectType&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ProjectType> getAllAccessibleProjectTypes() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/rest/api/3/project/type/accessible").build().toUriString();
        
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

        ParameterizedTypeReference<List<ProjectType>> returnType = new ParameterizedTypeReference<List<ProjectType>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get all project types
     * Returns all [project types](https://confluence.atlassian.com/x/Var1Nw), whether or not the instance has a valid license for each type.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect.
     * @return List&lt;ProjectType&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ProjectType> getAllProjectTypes() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/rest/api/3/project/type").build().toUriString();
        
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

        ParameterizedTypeReference<List<ProjectType>> returnType = new ParameterizedTypeReference<List<ProjectType>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get project type by key
     * Returns a [project type](https://confluence.atlassian.com/x/Var1Nw).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect.
     * <p><b>404</b> - Returned if the project type is not found.
     * @param projectTypeKey The key of the project type.
     * @return ProjectType
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ProjectType getProjectTypeByKey(String projectTypeKey) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'projectTypeKey' is set
        if (projectTypeKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'projectTypeKey' when calling getProjectTypeByKey");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("projectTypeKey", projectTypeKey);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/project/type/{projectTypeKey}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ProjectType> returnType = new ParameterizedTypeReference<ProjectType>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
