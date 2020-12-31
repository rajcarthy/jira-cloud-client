/*
 * The Jira Cloud platform REST API
 * Jira Cloud platform REST API documentation
 *
 * OpenAPI spec version: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.atlassian.jira.rest.client.api;

import com.atlassian.jira.rest.client.model.Priority;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IssuePrioritiesApi
 */
@Ignore
public class IssuePrioritiesApiTest {

    private final IssuePrioritiesApi api = new IssuePrioritiesApi();

    /**
     * Get priorities
     *
     * Returns the list of all issue priorities.  **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPrioritiesTest() {
        List<Priority> response = api.getPriorities();

        // TODO: test validations
    }
    /**
     * Get priority
     *
     * Returns an issue priority.  **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPriorityTest() {
        String id = null;
        Priority response = api.getPriority(id);

        // TODO: test validations
    }
}