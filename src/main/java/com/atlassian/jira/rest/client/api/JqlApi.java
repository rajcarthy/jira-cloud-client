package com.atlassian.jira.rest.client.api;

import com.atlassian.jira.rest.client.ApiClient;

import com.atlassian.jira.rest.client.model.AutoCompleteSuggestions;
import com.atlassian.jira.rest.client.model.ConvertedJQLQueries;
import com.atlassian.jira.rest.client.model.ErrorCollection;
import com.atlassian.jira.rest.client.model.JQLPersonalDataMigrationRequest;
import com.atlassian.jira.rest.client.model.JQLReferenceData;
import com.atlassian.jira.rest.client.model.JqlQueriesToParse;
import com.atlassian.jira.rest.client.model.ParsedJqlQueries;

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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")@Component("com.atlassian.jira.rest.client.api.JqlApi")
public class JqlApi {
    private ApiClient apiClient;

    public JqlApi() {
        this(new ApiClient());
    }

    @Autowired
    public JqlApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get field reference data
     * Returns reference data for JQL searches. This is a downloadable version of the documentation provided in [Advanced searching - fields reference](https://confluence.atlassian.com/x/gwORLQ) and [Advanced searching - functions reference](https://confluence.atlassian.com/x/hgORLQ), along with a list of JQL-reserved words. Use this information to assist with the programmatic creation of JQL queries or the validation of queries built in a custom query builder.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect.
     * @return JQLReferenceData
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public JQLReferenceData getAutoComplete() throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/rest/api/3/jql/autocompletedata").build().toUriString();
        
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

        ParameterizedTypeReference<JQLReferenceData> returnType = new ParameterizedTypeReference<JQLReferenceData>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get field auto complete suggestions
     * Returns the JQL search auto complete suggestions for a field.  Suggestions can be obtained by providing:   *  &#x60;fieldName&#x60; to get a list of all values for the field.  *  &#x60;fieldName&#x60; and &#x60;fieldValue&#x60; to get a list of values containing the text in &#x60;fieldValue&#x60;.  *  &#x60;fieldName&#x60; and &#x60;predicateName&#x60; to get a list of all predicate values for the field.  *  &#x60;fieldName&#x60;, &#x60;predicateName&#x60;, and &#x60;predicateValue&#x60; to get a list of predicate values containing the text in &#x60;predicateValue&#x60;.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if an invalid combination of parameters is passed.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect.
     * @param fieldName The name of the field.
     * @param fieldValue The partial field item name entered by the user.
     * @param predicateName The name of the [ CHANGED operator predicate](https://confluence.atlassian.com/x/hQORLQ#Advancedsearching-operatorsreference-CHANGEDCHANGED) for which the suggestions are generated. The valid predicate operators are *by*, *from*, and *to*.
     * @param predicateValue The partial predicate item name entered by the user.
     * @return AutoCompleteSuggestions
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AutoCompleteSuggestions getFieldAutoCompleteForQueryString(String fieldName, String fieldValue, String predicateName, String predicateValue) throws RestClientException {
        Object postBody = null;
        String path = UriComponentsBuilder.fromPath("/rest/api/3/jql/autocompletedata/suggestions").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fieldName", fieldName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fieldValue", fieldValue));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "predicateName", predicateName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "predicateValue", predicateValue));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<AutoCompleteSuggestions> returnType = new ParameterizedTypeReference<AutoCompleteSuggestions>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Convert user identifiers to account IDs in JQL queries
     * Converts one or more JQL queries with user identifiers (username or user key) to equivalent JQL queries with account IDs.  You may wish to use this operation if your system stores JQL queries and you want to make them GDPR-compliant. For more information about GDPR-related changes, see the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/).  **[Permissions](#permissions) required:** Permission to access Jira.
     * <p><b>200</b> - Returned if the request is successful. Note that the JQL queries are returned in the same order that they were passed.
     * <p><b>400</b> - Returned if at least one of the queries cannot be converted. For example, the JQL has invalid operators or invalid keywords, or the users in the query cannot be found.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect or missing.
     * @param body The body parameter
     * @return ConvertedJQLQueries
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ConvertedJQLQueries migrateQueries(JQLPersonalDataMigrationRequest body) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling migrateQueries");
        }
        String path = UriComponentsBuilder.fromPath("/rest/api/3/jql/pdcleaner").build().toUriString();
        
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

        ParameterizedTypeReference<ConvertedJQLQueries> returnType = new ParameterizedTypeReference<ConvertedJQLQueries>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Parse JQL query
     * Parses and validates JQL queries.  Validation is performed in context of the current user.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.
     * <p><b>200</b> - Returned if the request is successful.
     * <p><b>400</b> - Returned if the request is invalid.
     * <p><b>401</b> - Returned if the authentication credentials are incorrect.
     * @param body The body parameter
     * @param validation How to validate the JQL query and treat the validation results. Validation options include:   *  &#x60;strict&#x60; Returns all errors. If validation fails, the query structure is not returned.  *  &#x60;warn&#x60; Returns all errors. If validation fails but the JQL query is correctly formed, the query structure is returned.  *  &#x60;none&#x60; No validation is performed. If JQL query is correctly formed, the query structure is returned.
     * @return ParsedJqlQueries
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ParsedJqlQueries parseJqlQueries(JqlQueriesToParse body, String validation) throws RestClientException {
        Object postBody = body;
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling parseJqlQueries");
        }
        String path = UriComponentsBuilder.fromPath("/rest/api/3/jql/parse").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "validation", validation));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "OAuth2", "basicAuth" };

        ParameterizedTypeReference<ParsedJqlQueries> returnType = new ParameterizedTypeReference<ParsedJqlQueries>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
