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

import com.atlassian.jira.rest.client.model.EntityProperty;
import com.atlassian.jira.rest.client.model.PropertyKeys;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IssueTypePropertiesApi
 */
@Ignore
public class IssueTypePropertiesApiTest {

    private final IssueTypePropertiesApi api = new IssueTypePropertiesApi();

    /**
     * Delete issue type property
     *
     * Deletes the [issue type property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties).  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteIssueTypePropertyTest() {
        String issueTypeId = null;
        String propertyKey = null;
        api.deleteIssueTypeProperty(issueTypeId, propertyKey);

        // TODO: test validations
    }
    /**
     * Get issue type property
     *
     * Returns the key and value of the [issue type property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties).  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) to get the details of any issue type.  *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) to get the details of any issue types associated with the projects the user has permission to browse.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIssueTypePropertyTest() {
        String issueTypeId = null;
        String propertyKey = null;
        EntityProperty response = api.getIssueTypeProperty(issueTypeId, propertyKey);

        // TODO: test validations
    }
    /**
     * Get issue type property keys
     *
     * Returns all the [issue type property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties) keys of the issue type.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) to get the property keys of any issue type.  *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) to get the property keys of any issue types associated with the projects the user has permission to browse.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIssueTypePropertyKeysTest() {
        String issueTypeId = null;
        PropertyKeys response = api.getIssueTypePropertyKeys(issueTypeId);

        // TODO: test validations
    }
    /**
     * Set issue type property
     *
     * Creates or updates the value of the [issue type property](https://developer.atlassian.com/cloud/jira/platform/storing-data-without-a-database/#a-id-jira-entity-properties-a-jira-entity-properties). Use this resource to store and update data against an issue type.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setIssueTypePropertyTest() {
        Object body = null;
        String issueTypeId = null;
        String propertyKey = null;
        Object response = api.setIssueTypeProperty(body, issueTypeId, propertyKey);

        // TODO: test validations
    }
}