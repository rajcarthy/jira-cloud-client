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
import com.atlassian.jira.rest.client.model.SharePermission;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * Details of a dashboard.
 */
@Schema(description = "Details of a dashboard.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")
public class Dashboard {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("isFavourite")
  private Boolean isFavourite = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("owner")
  private AllOfDashboardOwner owner = null;

  @JsonProperty("popularity")
  private Long popularity = null;

  @JsonProperty("rank")
  private Integer rank = null;

  @JsonProperty("self")
  private String self = null;

  @JsonProperty("sharePermissions")
  private List<SharePermission> sharePermissions = null;

  @JsonProperty("view")
  private String view = null;

  public Dashboard description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

   /**
   * The ID of the dashboard.
   * @return id
  **/
  @Schema(description = "The ID of the dashboard.")
  public String getId() {
    return id;
  }

   /**
   * Whether the dashboard is selected as a favorite by the user.
   * @return isFavourite
  **/
  @Schema(description = "Whether the dashboard is selected as a favorite by the user.")
  public Boolean isIsFavourite() {
    return isFavourite;
  }

   /**
   * The name of the dashboard.
   * @return name
  **/
  @Schema(description = "The name of the dashboard.")
  public String getName() {
    return name;
  }

   /**
   * The owner of the dashboard.
   * @return owner
  **/
  @Schema(description = "The owner of the dashboard.")
  public AllOfDashboardOwner getOwner() {
    return owner;
  }

   /**
   * The number of users who have this dashboard as a favorite.
   * @return popularity
  **/
  @Schema(description = "The number of users who have this dashboard as a favorite.")
  public Long getPopularity() {
    return popularity;
  }

   /**
   * The rank of this dashboard.
   * @return rank
  **/
  @Schema(description = "The rank of this dashboard.")
  public Integer getRank() {
    return rank;
  }

   /**
   * The URL of these dashboard details.
   * @return self
  **/
  @Schema(description = "The URL of these dashboard details.")
  public String getSelf() {
    return self;
  }

   /**
   * The details of any share permissions for the dashboard.
   * @return sharePermissions
  **/
  @Schema(description = "The details of any share permissions for the dashboard.")
  public List<SharePermission> getSharePermissions() {
    return sharePermissions;
  }

   /**
   * The URL of the dashboard.
   * @return view
  **/
  @Schema(description = "The URL of the dashboard.")
  public String getView() {
    return view;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dashboard dashboard = (Dashboard) o;
    return Objects.equals(this.description, dashboard.description) &&
        Objects.equals(this.id, dashboard.id) &&
        Objects.equals(this.isFavourite, dashboard.isFavourite) &&
        Objects.equals(this.name, dashboard.name) &&
        Objects.equals(this.owner, dashboard.owner) &&
        Objects.equals(this.popularity, dashboard.popularity) &&
        Objects.equals(this.rank, dashboard.rank) &&
        Objects.equals(this.self, dashboard.self) &&
        Objects.equals(this.sharePermissions, dashboard.sharePermissions) &&
        Objects.equals(this.view, dashboard.view);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, isFavourite, name, owner, popularity, rank, self, sharePermissions, view);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dashboard {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isFavourite: ").append(toIndentedString(isFavourite)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    sharePermissions: ").append(toIndentedString(sharePermissions)).append("\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
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