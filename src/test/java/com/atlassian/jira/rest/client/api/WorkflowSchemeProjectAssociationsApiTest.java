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

import com.atlassian.jira.rest.client.model.ContainerOfWorkflowSchemeAssociations;
import com.atlassian.jira.rest.client.model.WorkflowSchemeProjectAssociation;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WorkflowSchemeProjectAssociationsApi
 */
@Ignore
public class WorkflowSchemeProjectAssociationsApiTest {

    private final WorkflowSchemeProjectAssociationsApi api = new WorkflowSchemeProjectAssociationsApi();

    /**
     * Assign workflow scheme to project
     *
     * Assigns a workflow scheme to a project. This operation is performed only when there are no issues in the project.  Workflow schemes can only be assigned to classic projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void associateSchemeWithProjectTest() {
        WorkflowSchemeProjectAssociation body = null;
        Object response = api.associateSchemeWithProject(body);

        // TODO: test validations
    }
    /**
     * Get workflow scheme project associations
     *
     * Returns a list of the workflow schemes associated with a list of projects. Each returned workflow scheme includes a list of the requested projects associated with it. Any next-gen or non-existent projects in the request are ignored and no errors are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getWorkflowSchemeProjectAssociationsTest() {
        List<Long> projectId = null;
        ContainerOfWorkflowSchemeAssociations response = api.getWorkflowSchemeProjectAssociations(projectId);

        // TODO: test validations
    }
}