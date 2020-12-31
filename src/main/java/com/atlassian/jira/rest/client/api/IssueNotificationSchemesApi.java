package com.atlassian.jira.rest.client.api;

import com.atlassian.jira.rest.client.ApiClient;

import com.atlassian.jira.rest.client.model.NotificationScheme;
import com.atlassian.jira.rest.client.model.PageBeanNotificationScheme;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")@Component("com.atlassian.jira.rest.client.api.IssueNotificationSchemesApi")
public class IssueNotificationSchemesApi {
    private ApiClient apiClient;

    public IssueNotificationSchemesApi() {
        this(new ApiClient());
    }

    @Autowired
    public IssueNotificationSchemesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get notification scheme
     * Returns a [notification scheme](https://confluence.atlassian.com/x/8YdKLg), including the list of events and the recipients who will receive notifications for those events.  **[Permissions](#permissions) required:** Permission to access Jira, however the user must have permission to administer at least one project associated with the notification scheme.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is invalid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * <p><b>404</b> - Returned if the notification scheme is not found or the user does not have permission to view it.
     * @param id The ID of the notification scheme. Use [Get notification schemes paginated](#api-rest-api-3-notificationscheme-get) to get a list of notification scheme IDs.
     * @param expand Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about any custom fields assigned to receive an event.  *  &#x60;group&#x60; Returns information about any groups assigned to receive an event.  *  &#x60;notificationSchemeEvents&#x60; Returns a list of event associations. This list is returned for all expandable information.  *  &#x60;projectRole&#x60; Returns information about any project roles assigned to receive an event.  *  &#x60;user&#x60; Returns information about any users assigned to receive an event.
     * @return NotificationScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public NotificationScheme getNotificationScheme(Long id, String expand) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getNotificationScheme");
        }
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/rest/api/3/notificationscheme/{id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<NotificationScheme> returnType = new ParameterizedTypeReference<NotificationScheme>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get notification schemes paginated
     * Returns a [paginated](#pagination) list of [notification schemes](https://confluence.atlassian.com/x/8YdKLg) ordered by display name.  ### About notification schemes ###  A notification scheme is a list of events and recipients who will receive notifications for those events. The list is contained within the &#x60;notificationSchemeEvents&#x60; object and contains pairs of &#x60;events&#x60; and &#x60;notifications&#x60;:   *  &#x60;event&#x60; Identifies the type of event. The events can be [Jira system events](https://confluence.atlassian.com/x/8YdKLg#Creatinganotificationscheme-eventsEvents) or [custom events](https://confluence.atlassian.com/x/AIlKLg).  *  &#x60;notifications&#x60; Identifies the [recipients](https://confluence.atlassian.com/x/8YdKLg#Creatinganotificationscheme-recipientsRecipients) of notifications for each event. Recipients can be any of the following types:           *  &#x60;CurrentAssignee&#x60;      *  &#x60;Reporter&#x60;      *  &#x60;CurrentUser&#x60;      *  &#x60;ProjectLead&#x60;      *  &#x60;ComponentLead&#x60;      *  &#x60;User&#x60; (the &#x60;parameter&#x60; is the user key)      *  &#x60;Group&#x60; (the &#x60;parameter&#x60; is the group name)      *  &#x60;ProjectRole&#x60; (the &#x60;parameter&#x60; is the project role ID)      *  &#x60;EmailAddress&#x60;      *  &#x60;AllWatchers&#x60;      *  &#x60;UserCustomField&#x60; (the &#x60;parameter&#x60; is the ID of the custom field)      *  &#x60;GroupCustomField&#x60;(the &#x60;parameter&#x60; is the ID of the custom field)  *Note that you should allow for events without recipients to appear in responses.*  **[Permissions](#permissions) required:** Permission to access Jira, however the user must have permission to administer at least one project associated with a notification scheme for it to be returned.
     * <p><b>200</b> - Returned if the request is successful. Only returns notification schemes that the user has permission to access. An empty list is returned if the user lacks permission to access all notification schemes.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * @param startAt The index of the first item to return in a page of results (page offset).
     * @param maxResults The maximum number of items to return per page.
     * @param expand Use [expand](#expansion) to include additional information in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;all&#x60; Returns all expandable information.  *  &#x60;field&#x60; Returns information about any custom fields assigned to receive an event.  *  &#x60;group&#x60; Returns information about any groups assigned to receive an event.  *  &#x60;notificationSchemeEvents&#x60; Returns a list of event associations. This list is returned for all expandable information.  *  &#x60;projectRole&#x60; Returns information about any project roles assigned to receive an event.  *  &#x60;user&#x60; Returns information about any users assigned to receive an event.
     * @return PageBeanNotificationScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageBeanNotificationScheme getNotificationSchemes(Long startAt, Integer maxResults, String expand) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/rest/api/3/notificationscheme").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startAt", startAt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "expand", expand));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<PageBeanNotificationScheme> returnType = new ParameterizedTypeReference<PageBeanNotificationScheme>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
