package com.atlassian.jira.rest.client.api;

import com.atlassian.jira.rest.client.ApiClient;

import com.atlassian.jira.rest.client.model.ScreenableTab;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")@Component("com.atlassian.jira.rest.client.api.ScreenTabsApi")
public class ScreenTabsApi {
    private ApiClient apiClient;

    public ScreenTabsApi() {
        this(new ApiClient());
    }

    @Autowired
    public ScreenTabsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create screen tab
     * Creates a tab for a screen.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is invalid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the necessary permission.
     * <p><b>404</b> - Returned if the screen is not found.
     * @param body The body parameter
     * @param screenId The ID of the screen.
     * @return ScreenableTab
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ScreenableTab addScreenTab(ScreenableTab body, Long screenId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling addScreenTab");
        }
        // verify the required parameter 'screenId' is set
        if (screenId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'screenId' when calling addScreenTab");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("screenId", screenId);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/screens/{screenId}/tabs").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ScreenableTab> returnType = new ParameterizedTypeReference<ScreenableTab>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Delete screen tab
     * Deletes a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>204</b> - Returned if the request is successful.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the necessary permission.
     * <p><b>404</b> - Returned if the screen or screen tab is not found.
     * @param screenId The ID of the screen.
     * @param tabId The ID of the screen tab.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteScreenTab(Long screenId, Long tabId) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'screenId' is set
        if (screenId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'screenId' when calling deleteScreenTab");
        }
        // verify the required parameter 'tabId' is set
        if (tabId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tabId' when calling deleteScreenTab");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("screenId", screenId);
        uriVariables.put("tabId", tabId);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/screens/{screenId}/tabs/{tabId}").buildAndExpand(uriVariables).toUriString();
        
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
     * Get all screen tabs
     * Returns the list of tabs for a screen.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) when the project key is specified, providing that the screen is associated with the project through a Screen Scheme and Issue Type Screen Scheme.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the screen ID is invalid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the necessary permission.
     * <p><b>404</b> - Returned if the screen is not found.
     * @param screenId The ID of the screen.
     * @param projectKey The key of the project.
     * @return List&lt;ScreenableTab&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<ScreenableTab> getAllScreenTabs(Long screenId, String projectKey) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'screenId' is set
        if (screenId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'screenId' when calling getAllScreenTabs");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("screenId", screenId);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/screens/{screenId}/tabs").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "projectKey", projectKey));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<List<ScreenableTab>> returnType = new ParameterizedTypeReference<List<ScreenableTab>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Move screen tab
     * Moves a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>204</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is invalid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the necessary permission.
     * <p><b>404</b> - Returned if the screen or screen tab is not found or the position is invalid.
     * @param screenId The ID of the screen.
     * @param tabId The ID of the screen tab.
     * @param pos The position of tab. The base index is 0.
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object moveScreenTab(Long screenId, Long tabId, Integer pos) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'screenId' is set
        if (screenId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'screenId' when calling moveScreenTab");
        }
        // verify the required parameter 'tabId' is set
        if (tabId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tabId' when calling moveScreenTab");
        }
        // verify the required parameter 'pos' is set
        if (pos == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pos' when calling moveScreenTab");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("screenId", screenId);
        uriVariables.put("tabId", tabId);
        uriVariables.put("pos", pos);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/screens/{screenId}/tabs/{tabId}/move/{pos}").buildAndExpand(uriVariables).toUriString();
        
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
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update screen tab
     * Updates the name of a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is invalid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>403</b> - Returned if the user does not have the necessary permission.
     * <p><b>404</b> - Returned if the screen or screen tab is not found.
     * @param body The body parameter
     * @param screenId The ID of the screen.
     * @param tabId The ID of the screen tab.
     * @return ScreenableTab
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ScreenableTab renameScreenTab(ScreenableTab body, Long screenId, Long tabId) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling renameScreenTab");
        }
        // verify the required parameter 'screenId' is set
        if (screenId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'screenId' when calling renameScreenTab");
        }
        // verify the required parameter 'tabId' is set
        if (tabId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tabId' when calling renameScreenTab");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("screenId", screenId);
        uriVariables.put("tabId", tabId);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/screens/{screenId}/tabs/{tabId}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<ScreenableTab> returnType = new ParameterizedTypeReference<ScreenableTab>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
