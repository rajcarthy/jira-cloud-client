package com.atlassian.jira.rest.client.api;

import com.atlassian.jira.rest.client.ApiClient;

import com.atlassian.jira.rest.client.model.ChangedWorklogs;
import com.atlassian.jira.rest.client.model.PageOfWorklogs;
import com.atlassian.jira.rest.client.model.Worklog;
import com.atlassian.jira.rest.client.model.WorklogIdsRequestBean;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")@Component("com.atlassian.jira.rest.client.api.IssueWorklogsApi")
public class IssueWorklogsApi {
    private ApiClient apiClient;

    public IssueWorklogsApi() {
        this(new ApiClient());
    }

    @Autowired
    public IssueWorklogsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add worklog
     * Adds a worklog to an issue.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Work on issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     * <p><b>201</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if:   *  &#x60;adjustEstimate&#x60; is set to &#x60;new&#x60; but &#x60;newEstimate&#x60; is not provided or is invalid.  *  &#x60;adjustEstimate&#x60; is set to &#x60;manual&#x60; but &#x60;reduceBy&#x60; is not provided or is invalid.  *  the user does not have permission to add the worklog.  *  the request JSON is malformed.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect.
     * <p><b>404</b> - Returned if the issue is not found or the user does not have permission to view it.
     * @param body The body parameter
     * @param issueIdOrKey The ID or key the issue.
     * @param notifyUsers Whether users watching the issue are notified by email.
     * @param adjustEstimate Defines how to update the issue&#x27;s time estimate, the options are:   *  &#x60;new&#x60; Sets the estimate to a specific value, defined in &#x60;newEstimate&#x60;.  *  &#x60;leave&#x60; Leaves the estimate unchanged.  *  &#x60;manual&#x60; Reduces the estimate by amount specified in &#x60;reduceBy&#x60;.  *  &#x60;auto&#x60; Reduces the estimate by the value of &#x60;timeSpent&#x60; in the worklog.
     * @param newEstimate The value to set as the issue&#x27;s remaining time estimate, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when &#x60;adjustEstimate&#x60; is &#x60;new&#x60;.
     * @param reduceBy The amount to reduce the issue&#x27;s remaining estimate by, as days (\\#d), hours (\\#h), or minutes (\\#m). For example, *2d*. Required when &#x60;adjustEstimate&#x60; is &#x60;manual&#x60;.
     * @param expand Use [expand](#expansion) to include additional information about work logs in the response. This parameter accepts &#x60;properties&#x60;, which returns worklog properties.
     * @param overrideEditableFlag Whether the worklog entry should be added to the issue even if the issue is not editable, because jira.issue.editable set to false or missing. For example, the issue is closed. Only connect app users with admin scope permission can use this flag.
     * @return Worklog
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Worklog addWorklog(Map<String, Object> body, String issueIdOrKey, Boolean notifyUsers, String adjustEstimate, String newEstimate, String reduceBy, String expand, Boolean overrideEditableFlag) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling addWorklog");
        }
        // verify the required parameter 'issueIdOrKey' is set
        if (issueIdOrKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueIdOrKey' when calling addWorklog");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issueIdOrKey", issueIdOrKey);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/issue/{issueIdOrKey}/worklog").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "notifyUsers", notifyUsers));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "adjustEstimate", adjustEstimate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "newEstimate", newEstimate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "reduceBy", reduceBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "expand", expand));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "overrideEditableFlag", overrideEditableFlag));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<Worklog> returnType = new ParameterizedTypeReference<Worklog>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Delete worklog
     * Deletes a worklog from an issue.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Delete all worklogs*[ project permission](https://confluence.atlassian.com/x/yodKLg) to delete any worklog or *Delete own worklogs* to delete worklogs created by the user,  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
     * <p><b>204</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if:   *  &#x60;adjustEstimate&#x60; is set to &#x60;new&#x60; but &#x60;newEstimate&#x60; is not provided or is invalid.  *  &#x60;adjustEstimate&#x60; is set to &#x60;manual&#x60; but &#x60;reduceBy&#x60; is not provided or is invalid.  *  the user does not have permission to delete the worklog.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect.
     * <p><b>404</b> - Returned if:   *  the issue is not found or user does not have permission to view the issue.  *  the worklog is not found or the user does not have permission to view it.  *  time tracking is disabled.
     * @param issueIdOrKey The ID or key of the issue.
     * @param id The ID of the worklog.
     * @param notifyUsers Whether users watching the issue are notified by email.
     * @param adjustEstimate Defines how to update the issue&#x27;s time estimate, the options are:   *  &#x60;new&#x60; Sets the estimate to a specific value, defined in &#x60;newEstimate&#x60;.  *  &#x60;leave&#x60; Leaves the estimate unchanged.  *  &#x60;manual&#x60; Increases the estimate by amount specified in &#x60;increaseBy&#x60;.  *  &#x60;auto&#x60; Reduces the estimate by the value of &#x60;timeSpent&#x60; in the worklog.
     * @param newEstimate The value to set as the issue&#x27;s remaining time estimate, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when &#x60;adjustEstimate&#x60; is &#x60;new&#x60;.
     * @param increaseBy The amount to increase the issue&#x27;s remaining estimate by, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when &#x60;adjustEstimate&#x60; is &#x60;manual&#x60;.
     * @param overrideEditableFlag Whether the work log entry should be added to the issue even if the issue is not editable, because jira.issue.editable set to false or missing. For example, the issue is closed. Only connect app users with admin permissions can use this flag.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteWorklog(String issueIdOrKey, String id, Boolean notifyUsers, String adjustEstimate, String newEstimate, String increaseBy, Boolean overrideEditableFlag) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'issueIdOrKey' is set
        if (issueIdOrKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueIdOrKey' when calling deleteWorklog");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteWorklog");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issueIdOrKey", issueIdOrKey);
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/issue/{issueIdOrKey}/worklog/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "notifyUsers", notifyUsers));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "adjustEstimate", adjustEstimate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "newEstimate", newEstimate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "increaseBy", increaseBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "overrideEditableFlag", overrideEditableFlag));

        final String[] accepts = {  };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get IDs of deleted worklogs
     * Returns a list of IDs and delete timestamps for worklogs deleted after a date and time.  This resource is paginated, with a limit of 1000 worklogs per page. Each page lists worklogs from oldest to youngest. If the number of items in the date range exceeds 1000, &#x60;until&#x60; indicates the timestamp of the youngest item on the page. Also, &#x60;nextPage&#x60; provides the URL for the next page of worklogs. The &#x60;lastPage&#x60; parameter is set to true on the last page of worklogs.  This resource does not return worklogs deleted during the minute preceding the request.  **[Permissions](#permissions) required:** Permission to access Jira.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * @param since The date and time, as a UNIX timestamp in milliseconds, after which deleted worklogs are returned.
     * @return ChangedWorklogs
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ChangedWorklogs getIdsOfWorklogsDeletedSince(Long since) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/rest/api/3/worklog/deleted").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "since", since));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<ChangedWorklogs> returnType = new ParameterizedTypeReference<ChangedWorklogs>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get IDs of updated worklogs
     * Returns a list of IDs and update timestamps for worklogs updated after a date and time.  This resource is paginated, with a limit of 1000 worklogs per page. Each page lists worklogs from oldest to youngest. If the number of items in the date range exceeds 1000, &#x60;until&#x60; indicates the timestamp of the youngest item on the page. Also, &#x60;nextPage&#x60; provides the URL for the next page of worklogs. The &#x60;lastPage&#x60; parameter is set to true on the last page of worklogs.  This resource does not return worklogs updated during the minute preceding the request.  **[Permissions](#permissions) required:** Permission to access Jira, however, worklogs are only returned where either of the following is true:   *  the worklog is set as *Viewable by All Users*.  *  the user is a member of a project role or group with permission to view the worklog.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * @param since The date and time, as a UNIX timestamp in milliseconds, after which updated worklogs are returned.
     * @param expand Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts &#x60;properties&#x60; that returns the properties of each worklog.
     * @return ChangedWorklogs
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ChangedWorklogs getIdsOfWorklogsModifiedSince(Long since, String expand) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/rest/api/3/worklog/updated").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "since", since));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "expand", expand));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<ChangedWorklogs> returnType = new ParameterizedTypeReference<ChangedWorklogs>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get issue worklogs
     * Returns worklogs for an issue, starting from the oldest worklog or from the worklog started on or after a date and time.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** Workloads are only returned where the user has:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
     * <p><b>200</b> - Returned if the request is successful
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>404</b> - Returned if:   *  the issue is not found or the user does not have permission to view the issue.  *  &#x60;startAt&#x60; or &#x60;maxResults&#x60; has non-numeric values.  *  time tracking is disabled.
     * @param issueIdOrKey The ID or key of the issue.
     * @param startAt The index of the first item to return in a page of results (page offset).
     * @param maxResults The maximum number of items to return per page.
     * @param startedAfter The worklog start date and time, as a UNIX timestamp in milliseconds, after which worklogs are returned.
     * @param expand Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts&#x60;properties&#x60;, which returns worklog properties.
     * @return PageOfWorklogs
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageOfWorklogs getIssueWorklog(String issueIdOrKey, Long startAt, Integer maxResults, Long startedAfter, String expand) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'issueIdOrKey' is set
        if (issueIdOrKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueIdOrKey' when calling getIssueWorklog");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issueIdOrKey", issueIdOrKey);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/issue/{issueIdOrKey}/worklog").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startAt", startAt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startedAfter", startedAfter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "expand", expand));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<PageOfWorklogs> returnType = new ParameterizedTypeReference<PageOfWorklogs>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get worklog
     * Returns a worklog.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect.
     * <p><b>404</b> - Returned if:   *  the issue is not found or the user does not have permission to view it.  *  the worklog is not found or the user does not have permission to view it.  *  time tracking is disabled.  .
     * @param issueIdOrKey The ID or key of the issue.
     * @param id The ID of the worklog.
     * @param expand Use [expand](#expansion) to include additional information about work logs in the response. This parameter accepts  &#x60;properties&#x60;, which returns worklog properties.
     * @return Worklog
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Worklog getWorklog(String issueIdOrKey, String id, String expand) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'issueIdOrKey' is set
        if (issueIdOrKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueIdOrKey' when calling getWorklog");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getWorklog");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issueIdOrKey", issueIdOrKey);
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/issue/{issueIdOrKey}/worklog/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "expand", expand));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<Worklog> returnType = new ParameterizedTypeReference<Worklog>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get worklogs
     * Returns worklog details for a list of worklog IDs.  The returned list of worklogs is limited to 1000 items.  **[Permissions](#permissions) required:** Permission to access Jira, however, worklogs are only returned where either of the following is true:   *  the worklog is set as *Viewable by All Users*.  *  the user is a member of a project role or group with permission to view the worklog.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request contains more than 1000 worklog IDs or is empty.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * @param body A JSON object containing a list of worklog IDs.
     * @param expand Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts &#x60;properties&#x60; that returns the properties of each worklog.
     * @return List&lt;Worklog&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Worklog> getWorklogsForIds(WorklogIdsRequestBean body, String expand) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling getWorklogsForIds");
        }
        String path = UriComponentsBuilder.fromPath("/rest/api/3/worklog/list").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "expand", expand));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<List<Worklog>> returnType = new ParameterizedTypeReference<List<Worklog>>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update worklog
     * Updates a worklog.  Time tracking must be enabled in Jira, otherwise this operation returns an error. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Edit all worklogs*[ project permission](https://confluence.atlassian.com/x/yodKLg) to update any worklog or *Edit own worklogs* to update worklogs created by the user.  *  If the worklog has visibility restrictions, belongs to the group or has the role visibility is restricted to.
     * <p><b>200</b> - Returned if the request is successful
     * <p><b>400</b> - Returned if:   *  &#x60;adjustEstimate&#x60; is set to &#x60;new&#x60; but &#x60;newEstimate&#x60; is not provided or is invalid.  *  the user does not have permission to update the worklog.  *  the request JSON is malformed.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect.
     * <p><b>404</b> - Returned if:   *  the issue is not found or user does not have permission to view the issue.  *  the worklog is not found or the user does not have permission to view it.  *  time tracking is disabled.
     * @param body The body parameter
     * @param issueIdOrKey The ID or key the issue.
     * @param id The ID of the worklog.
     * @param notifyUsers Whether users watching the issue are notified by email.
     * @param adjustEstimate Defines how to update the issue&#x27;s time estimate, the options are:   *  &#x60;new&#x60; Sets the estimate to a specific value, defined in &#x60;newEstimate&#x60;.  *  &#x60;leave&#x60; Leaves the estimate unchanged.  *  &#x60;auto&#x60; Updates the estimate by the difference between the original and updated value of &#x60;timeSpent&#x60; or &#x60;timeSpentSeconds&#x60;.
     * @param newEstimate The value to set as the issue&#x27;s remaining time estimate, as days (\\#d), hours (\\#h), or minutes (\\#m or \\#). For example, *2d*. Required when &#x60;adjustEstimate&#x60; is &#x60;new&#x60;.
     * @param expand Use [expand](#expansion) to include additional information about worklogs in the response. This parameter accepts &#x60;properties&#x60;, which returns worklog properties.
     * @param overrideEditableFlag Whether the worklog should be added to the issue even if the issue is not editable. For example, because the issue is closed. Only connect app users with admin permissions can use this flag.
     * @return Worklog
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Worklog updateWorklog(Map<String, Object> body, String issueIdOrKey, String id, Boolean notifyUsers, String adjustEstimate, String newEstimate, String expand, Boolean overrideEditableFlag) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateWorklog");
        }
        // verify the required parameter 'issueIdOrKey' is set
        if (issueIdOrKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'issueIdOrKey' when calling updateWorklog");
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateWorklog");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("issueIdOrKey", issueIdOrKey);
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/issue/{issueIdOrKey}/worklog/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "notifyUsers", notifyUsers));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "adjustEstimate", adjustEstimate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "newEstimate", newEstimate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "expand", expand));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "overrideEditableFlag", overrideEditableFlag));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<Worklog> returnType = new ParameterizedTypeReference<Worklog>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
