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

package com.atlassian.jira.rest.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.atlassian.jira.rest.client.model.FilterSubscription;
import com.atlassian.jira.rest.client.model.SharePermission;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * Details of a filter.
 */
@Schema(description = "Details of a filter.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")
public class FilterDetails {
  @JsonProperty("self")
  private String self = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("owner")
  private AllOfFilterDetailsOwner owner = null;

  @JsonProperty("jql")
  private String jql = null;

  @JsonProperty("viewUrl")
  private String viewUrl = null;

  @JsonProperty("searchUrl")
  private String searchUrl = null;

  @JsonProperty("favourite")
  private Boolean favourite = null;

  @JsonProperty("favouritedCount")
  private Long favouritedCount = null;

  @JsonProperty("sharePermissions")
  private List<SharePermission> sharePermissions = null;

  @JsonProperty("subscriptions")
  private List<FilterSubscription> subscriptions = null;

   /**
   * The URL of the filter.
   * @return self
  **/
  @Schema(description = "The URL of the filter.")
  public String getSelf() {
    return self;
  }

   /**
   * The unique identifier for the filter.
   * @return id
  **/
  @Schema(description = "The unique identifier for the filter.")
  public String getId() {
    return id;
  }

  public FilterDetails name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the filter. Must be unique.
   * @return name
  **/
  @Schema(required = true, description = "The name of the filter. Must be unique.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FilterDetails description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A description of the filter.
   * @return description
  **/
  @Schema(description = "A description of the filter.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

   /**
   * The user who owns the filter. This is defaulted to the creator of the filter, however Jira administrators can change the owner of a shared filter in the admin settings.
   * @return owner
  **/
  @Schema(description = "The user who owns the filter. This is defaulted to the creator of the filter, however Jira administrators can change the owner of a shared filter in the admin settings.")
  public AllOfFilterDetailsOwner getOwner() {
    return owner;
  }

   /**
   * The JQL query for the filter. For example, *project &#x3D; SSP AND issuetype &#x3D; Bug*.
   * @return jql
  **/
  @Schema(description = "The JQL query for the filter. For example, *project = SSP AND issuetype = Bug*.")
  public String getJql() {
    return jql;
  }

   /**
   * A URL to view the filter results in Jira, using the ID of the filter. For example, *https://your-domain.atlassian.net/issues/?filter&#x3D;10100*.
   * @return viewUrl
  **/
  @Schema(description = "A URL to view the filter results in Jira, using the ID of the filter. For example, *https://your-domain.atlassian.net/issues/?filter=10100*.")
  public String getViewUrl() {
    return viewUrl;
  }

   /**
   * A URL to view the filter results in Jira, using the [Search for issues using JQL](#api-rest-api-3-filter-search-get) operation with the filter&#x27;s JQL string to return the filter results. For example, *https://your-domain.atlassian.net/rest/api/3/search?jql&#x3D;project+%3D+SSP+AND+issuetype+%3D+Bug*.
   * @return searchUrl
  **/
  @Schema(description = "A URL to view the filter results in Jira, using the [Search for issues using JQL](#api-rest-api-3-filter-search-get) operation with the filter's JQL string to return the filter results. For example, *https://your-domain.atlassian.net/rest/api/3/search?jql=project+%3D+SSP+AND+issuetype+%3D+Bug*.")
  public String getSearchUrl() {
    return searchUrl;
  }

   /**
   * Whether the filter is selected as a favorite by any users, not including the filter owner.
   * @return favourite
  **/
  @Schema(description = "Whether the filter is selected as a favorite by any users, not including the filter owner.")
  public Boolean isFavourite() {
    return favourite;
  }

   /**
   * The count of how many users have selected this filter as a favorite, including the filter owner.
   * @return favouritedCount
  **/
  @Schema(description = "The count of how many users have selected this filter as a favorite, including the filter owner.")
  public Long getFavouritedCount() {
    return favouritedCount;
  }

  public FilterDetails sharePermissions(List<SharePermission> sharePermissions) {
    this.sharePermissions = sharePermissions;
    return this;
  }

  public FilterDetails addSharePermissionsItem(SharePermission sharePermissionsItem) {
    if (this.sharePermissions == null) {
      this.sharePermissions = new ArrayList<SharePermission>();
    }
    this.sharePermissions.add(sharePermissionsItem);
    return this;
  }

   /**
   * The groups and projects that the filter is shared with. This can be specified when updating a filter, but not when creating a filter.
   * @return sharePermissions
  **/
  @Schema(description = "The groups and projects that the filter is shared with. This can be specified when updating a filter, but not when creating a filter.")
  public List<SharePermission> getSharePermissions() {
    return sharePermissions;
  }

  public void setSharePermissions(List<SharePermission> sharePermissions) {
    this.sharePermissions = sharePermissions;
  }

   /**
   * The users that are subscribed to the filter.
   * @return subscriptions
  **/
  @Schema(description = "The users that are subscribed to the filter.")
  public List<FilterSubscription> getSubscriptions() {
    return subscriptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilterDetails filterDetails = (FilterDetails) o;
    return Objects.equals(this.self, filterDetails.self) &&
        Objects.equals(this.id, filterDetails.id) &&
        Objects.equals(this.name, filterDetails.name) &&
        Objects.equals(this.description, filterDetails.description) &&
        Objects.equals(this.owner, filterDetails.owner) &&
        Objects.equals(this.jql, filterDetails.jql) &&
        Objects.equals(this.viewUrl, filterDetails.viewUrl) &&
        Objects.equals(this.searchUrl, filterDetails.searchUrl) &&
        Objects.equals(this.favourite, filterDetails.favourite) &&
        Objects.equals(this.favouritedCount, filterDetails.favouritedCount) &&
        Objects.equals(this.sharePermissions, filterDetails.sharePermissions) &&
        Objects.equals(this.subscriptions, filterDetails.subscriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, id, name, description, owner, jql, viewUrl, searchUrl, favourite, favouritedCount, sharePermissions, subscriptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterDetails {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    jql: ").append(toIndentedString(jql)).append("\n");
    sb.append("    viewUrl: ").append(toIndentedString(viewUrl)).append("\n");
    sb.append("    searchUrl: ").append(toIndentedString(searchUrl)).append("\n");
    sb.append("    favourite: ").append(toIndentedString(favourite)).append("\n");
    sb.append("    favouritedCount: ").append(toIndentedString(favouritedCount)).append("\n");
    sb.append("    sharePermissions: ").append(toIndentedString(sharePermissions)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
