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

import com.atlassian.jira.rest.client.model.ColumnItem;
import com.atlassian.jira.rest.client.model.ErrorCollection;
import com.atlassian.jira.rest.client.model.Filter;
import com.atlassian.jira.rest.client.model.PageBeanFilterDetails;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FiltersApi
 */
@Ignore
public class FiltersApiTest {

    private final FiltersApi api = new FiltersApi();

    /**
     * Create filter
     *
     * Creates a filter. The filter is shared according to the [default share scope](#api-rest-api-3-filter-post). The filter is not selected as a favorite.  **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFilterTest() {
        Filter body = null;
        String expand = null;
        Filter response = api.createFilter(body, expand);

        // TODO: test validations
    }
    /**
     * Remove filter as favorite
     *
     * Removes a filter as a favorite for the user. Note that this operation only removes filters visible to the user from the user&#x27;s favorites list. For example, if the user favorites a public filter that is subsequently made private (and is therefore no longer visible on their favorites list) they cannot remove it from their favorites list.  **[Permissions](#permissions) required:** Permission to access Jira.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFavouriteForFilterTest() {
        Long id = null;
        String expand = null;
        Filter response = api.deleteFavouriteForFilter(id, expand);

        // TODO: test validations
    }
    /**
     * Delete filter
     *
     * Delete a filter.  **[Permissions](#permissions) required:** Permission to access Jira, however filters can only be deleted by the creator of the filter or a user with *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFilterTest() {
        Long id = null;
        api.deleteFilter(id);

        // TODO: test validations
    }
    /**
     * Get columns
     *
     * Returns the columns configured for a filter. The column configuration is used when the filter&#x27;s results are viewed in *List View* with the *Columns* set to *Filter*.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None, however, column details are only returned for:   *  filters owned by the user.  *  filters shared with a group that the user is a member of.  *  filters shared with a private project that the user has *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for.  *  filters shared with a public project.  *  filters shared with the public.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getColumnsTest() {
        Long id = null;
        List<ColumnItem> response = api.getColumns(id);

        // TODO: test validations
    }
    /**
     * Get favorite filters
     *
     * Returns the visible favorite filters of the user.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** A favorite filter is only visible to the user where the filter is:   *  owned by the user.  *  shared with a group that the user is a member of.  *  shared with a private project that the user has *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for.  *  shared with a public project.  *  shared with the public.  For example, if the user favorites a public filter that is subsequently made private that filter is not returned by this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFavouriteFiltersTest() {
        String expand = null;
        List<Filter> response = api.getFavouriteFilters(expand);

        // TODO: test validations
    }
    /**
     * Get filter
     *
     * Returns a filter.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None, however, the filter is only returned where it is:   *  owned by the user.  *  shared with a group that the user is a member of.  *  shared with a private project that the user has *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for.  *  shared with a public project.  *  shared with the public.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFilterTest() {
        Long id = null;
        String expand = null;
        Filter response = api.getFilter(id, expand);

        // TODO: test validations
    }
    /**
     * Get filters
     *
     * Returns all filters. Deprecated, use [ Search for filters](#api-rest-api-3-filter-search-get) that supports search and pagination.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None, however, only the following filters are returned:   *  filters owned by the user.  *  filters shared with a group that the user is a member of.  *  filters shared with a private project that the user has *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for.  *  filters shared with a public project.  *  filters shared with the public.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFiltersTest() {
        String expand = null;
        List<Filter> response = api.getFilters(expand);

        // TODO: test validations
    }
    /**
     * Search for filters
     *
     * Returns a [paginated](#pagination) list of filters. Use this operation to get:   *  specific filters, by defining &#x60;id&#x60; only.  *  filters that match all of the specified attributes. For example, all filters for a user with a particular word in their name. When multiple attributes are specified only filters matching all attributes are returned.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None, however, only the following filters that match the query parameters are returned:   *  filters owned by the user.  *  filters shared with a group that the user is a member of.  *  filters shared with a private project that the user has *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for.  *  filters shared with a public project.  *  filters shared with the public.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFiltersPaginatedTest() {
        String filterName = null;
        String accountId = null;
        String owner = null;
        String groupname = null;
        Long projectId = null;
        List<Long> id = null;
        String orderBy = null;
        Long startAt = null;
        Integer maxResults = null;
        String expand = null;
        PageBeanFilterDetails response = api.getFiltersPaginated(filterName, accountId, owner, groupname, projectId, id, orderBy, startAt, maxResults, expand);

        // TODO: test validations
    }
    /**
     * Get my filters
     *
     * Returns the filters owned by the user. If &#x60;includeFavourites&#x60; is &#x60;true&#x60;, the user&#x27;s visible favorite filters are also returned.  **[Permissions](#permissions) required:** Permission to access Jira, however, a favorite filters is only visible to the user where the filter is:   *  owned by the user.  *  shared with a group that the user is a member of.  *  shared with a private project that the user has *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for.  *  shared with a public project.  *  shared with the public.  For example, if the user favorites a public filter that is subsequently made private that filter is not returned by this operation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMyFiltersTest() {
        String expand = null;
        Boolean includeFavourites = null;
        List<Filter> response = api.getMyFilters(expand, includeFavourites);

        // TODO: test validations
    }
    /**
     * Reset columns
     *
     * Reset the user&#x27;s column configuration for the filter to the default.  **[Permissions](#permissions) required:** Permission to access Jira, however, columns are only reset for:   *  filters owned by the user.  *  filters shared with a group that the user is a member of.  *  filters shared with a private project that the user has *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for.  *  filters shared with a public project.  *  filters shared with the public.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resetColumnsTest() {
        Long id = null;
        api.resetColumns(id);

        // TODO: test validations
    }
    /**
     * Set columns
     *
     * Sets the columns for a filter. Only navigable fields can be set as columns. Use [Get fields](#api-rest-api-3-field-get) to get the list fields in Jira. A navigable field has &#x60;navigable&#x60; set to &#x60;true&#x60;.  The parameters for this resource are expressed as HTML form data. For example, in curl:  &#x60;curl -X PUT -d columns&#x3D;summary -d columns&#x3D;description https://your-domain.atlassian.net/rest/api/3/filter/10000/columns&#x60;  **[Permissions](#permissions) required:** Permission to access Jira, however, columns are only set for:   *  filters owned by the user.  *  filters shared with a group that the user is a member of.  *  filters shared with a private project that the user has *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for.  *  filters shared with a public project.  *  filters shared with the public.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setColumnsTest() {
        Long id = null;
        List<String> body = null;
        Object response = api.setColumns(id, body);

        // TODO: test validations
    }
    /**
     * Add filter as favorite
     *
     * Add a filter as a favorite for the user.  **[Permissions](#permissions) required:** Permission to access Jira, however, the user can only favorite:   *  filters owned by the user.  *  filters shared with a group that the user is a member of.  *  filters shared with a private project that the user has *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for.  *  filters shared with a public project.  *  filters shared with the public.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setFavouriteForFilterTest() {
        Long id = null;
        String expand = null;
        Filter response = api.setFavouriteForFilter(id, expand);

        // TODO: test validations
    }
    /**
     * Update filter
     *
     * Updates a filter. Use this operation to update a filter&#x27;s name, description, JQL, or sharing.  **[Permissions](#permissions) required:** Permission to access Jira, however the user must own the filter.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateFilterTest() {
        Filter body = null;
        Long id = null;
        String expand = null;
        Filter response = api.updateFilter(body, id, expand);

        // TODO: test validations
    }
}
