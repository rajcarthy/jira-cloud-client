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

import com.atlassian.jira.rest.client.model.AddFieldBean;
import com.atlassian.jira.rest.client.model.MoveFieldBean;
import com.atlassian.jira.rest.client.model.ScreenableField;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ScreenTabFieldsApi
 */
@Ignore
public class ScreenTabFieldsApiTest {

    private final ScreenTabFieldsApi api = new ScreenTabFieldsApi();

    /**
     * Add screen tab field
     *
     * Adds a field to a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addScreenTabFieldTest() {
        AddFieldBean body = null;
        Long screenId = null;
        Long tabId = null;
        ScreenableField response = api.addScreenTabField(body, screenId, tabId);

        // TODO: test validations
    }
    /**
     * Get all screen tab fields
     *
     * Returns all fields for a screen tab.  **[Permissions](#permissions) required:**   *  *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).  *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) when the project key is specified, providing that the screen is associated with the project through a Screen Scheme and Issue Type Screen Scheme.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllScreenTabFieldsTest() {
        Long screenId = null;
        Long tabId = null;
        String projectKey = null;
        List<ScreenableField> response = api.getAllScreenTabFields(screenId, tabId, projectKey);

        // TODO: test validations
    }
    /**
     * Move screen tab field
     *
     * Moves a screen tab field.  If &#x60;after&#x60; and &#x60;position&#x60; are provided in the request, &#x60;position&#x60; is ignored.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void moveScreenTabFieldTest() {
        MoveFieldBean body = null;
        Long screenId = null;
        Long tabId = null;
        String id = null;
        Object response = api.moveScreenTabField(body, screenId, tabId, id);

        // TODO: test validations
    }
    /**
     * Remove screen tab field
     *
     * Removes a field from a screen tab.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeScreenTabFieldTest() {
        Long screenId = null;
        Long tabId = null;
        String id = null;
        api.removeScreenTabField(screenId, tabId, id);

        // TODO: test validations
    }
}
