package com.atlassian.jira.rest.client.api;

import com.atlassian.jira.rest.client.ApiClient;

import com.atlassian.jira.rest.client.model.ErrorCollection;
import com.atlassian.jira.rest.client.model.PageBeanWorkflowTransitionRules;
import com.atlassian.jira.rest.client.model.WorkflowTransitionRulesUpdate;
import com.atlassian.jira.rest.client.model.WorkflowTransitionRulesUpdateErrors;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")@Component("com.atlassian.jira.rest.client.api.WorkflowTransitionRulesApi")
public class WorkflowTransitionRulesApi {
    private ApiClient apiClient;

    public WorkflowTransitionRulesApi() {
        this(new ApiClient());
    }

    @Autowired
    public WorkflowTransitionRulesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get workflow transition rule configurations
     * Returns a [paginated](#pagination) list of workflows with transition rules. The workflows can be filtered to return only those containing workflow transition rules:   *  of one or more transition rule types, such as [workflow post functions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-post-function/).  *  matching one or more transition rule keys.  Only workflows containing transition rules created by the calling Connect app are returned. However, if a workflow is returned all transition rules that match the filters are returned for that workflow.  Due to server-side optimizations, workflows with an empty list of rules may be returned; these workflows can be ignored.  **[Permissions](#permissions) required:** Only Connect apps can use this operation.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is invalid.
     * <p><b>403</b> - Returned if the caller is not a Connect app.
     * <p><b>404</b> - Returned if the any transition rule type is not supported.
     * @param types The types of the transition rules to return.
     * @param startAt The index of the first item to return in a page of results (page offset).
     * @param maxResults The maximum number of items to return per page.
     * @param keys The transition rule class keys, as defined in the Connect app descriptor, of the transition rules to return.
     * @param expand Use [expand](#expansion) to include additional information in the response. This parameter accepts &#x60;transition&#x60;, which, for each rule, returns information about the transition the rule is assigned to.
     * @return PageBeanWorkflowTransitionRules
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageBeanWorkflowTransitionRules getWorkflowTransitionRuleConfigurations(List<String> types, Long startAt, Integer maxResults, List<String> keys, String expand) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'types' is set
        if (types == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'types' when calling getWorkflowTransitionRuleConfigurations");
        }
        String path = UriComponentsBuilder.fromPath("/rest/api/3/workflow/rule/config").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startAt", startAt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxResults", maxResults));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "types", types));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase()), "keys", keys));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "expand", expand));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<PageBeanWorkflowTransitionRules> returnType = new ParameterizedTypeReference<PageBeanWorkflowTransitionRules>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update workflow transition rule configurations
     * Updates configuration of workflow transition rules. The following rule types are supported:   *  [post functions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-post-function/)  *  [conditions](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-condition/)  *  [validators](https://developer.atlassian.com/cloud/jira/platform/modules/workflow-validator/)  Only rules created by the calling Connect app can be updated.  **[Permissions](#permissions) required:** Only Connect apps can use this operation.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is invalid.
     * <p><b>403</b> - Returned if the caller is not a Connect app.
     * @param body The body parameter
     * @return WorkflowTransitionRulesUpdateErrors
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public WorkflowTransitionRulesUpdateErrors updateWorkflowTransitionRuleConfigurations(WorkflowTransitionRulesUpdate body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling updateWorkflowTransitionRuleConfigurations");
        }
        String path = UriComponentsBuilder.fromPath("/rest/api/3/workflow/rule/config").build().toUriString();
        
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

        String[] authNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<WorkflowTransitionRulesUpdateErrors> returnType = new ParameterizedTypeReference<WorkflowTransitionRulesUpdateErrors>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
