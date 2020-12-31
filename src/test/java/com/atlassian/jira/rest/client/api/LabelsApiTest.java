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

import com.atlassian.jira.rest.client.model.PageBeanString;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LabelsApi
 */
@Ignore
public class LabelsApiTest {

    private final LabelsApi api = new LabelsApi();

    /**
     * Get all labels
     *
     * Returns a [paginated](#pagination) list of labels.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllLabelsTest() {
        Long startAt = null;
        Integer maxResults = null;
        PageBeanString response = api.getAllLabels(startAt, maxResults);

        // TODO: test validations
    }
}
