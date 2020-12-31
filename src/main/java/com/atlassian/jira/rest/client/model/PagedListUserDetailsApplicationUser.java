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
import com.atlassian.jira.rest.client.model.UserDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * A paged list. To access additional details append &#x60;[start-index:end-index]&#x60; to the expand request. For example, &#x60;?expand&#x3D;sharedUsers[10:40]&#x60; returns a list starting at item 10 and finishing at item 40.
 */
@Schema(description = "A paged list. To access additional details append `[start-index:end-index]` to the expand request. For example, `?expand=sharedUsers[10:40]` returns a list starting at item 10 and finishing at item 40.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")
public class PagedListUserDetailsApplicationUser {
  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("items")
  private List<UserDetails> items = null;

  @JsonProperty("max-results")
  private Integer maxResults = null;

  @JsonProperty("start-index")
  private Integer startIndex = null;

  @JsonProperty("end-index")
  private Integer endIndex = null;

   /**
   * The number of items on the page.
   * @return size
  **/
  @Schema(description = "The number of items on the page.")
  public Integer getSize() {
    return size;
  }

   /**
   * The list of items.
   * @return items
  **/
  @Schema(description = "The list of items.")
  public List<UserDetails> getItems() {
    return items;
  }

   /**
   * The maximum number of results that could be on the page.
   * @return maxResults
  **/
  @Schema(description = "The maximum number of results that could be on the page.")
  public Integer getMaxResults() {
    return maxResults;
  }

   /**
   * The index of the first item returned on the page.
   * @return startIndex
  **/
  @Schema(description = "The index of the first item returned on the page.")
  public Integer getStartIndex() {
    return startIndex;
  }

   /**
   * The index of the last item returned on the page.
   * @return endIndex
  **/
  @Schema(description = "The index of the last item returned on the page.")
  public Integer getEndIndex() {
    return endIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagedListUserDetailsApplicationUser pagedListUserDetailsApplicationUser = (PagedListUserDetailsApplicationUser) o;
    return Objects.equals(this.size, pagedListUserDetailsApplicationUser.size) &&
        Objects.equals(this.items, pagedListUserDetailsApplicationUser.items) &&
        Objects.equals(this.maxResults, pagedListUserDetailsApplicationUser.maxResults) &&
        Objects.equals(this.startIndex, pagedListUserDetailsApplicationUser.startIndex) &&
        Objects.equals(this.endIndex, pagedListUserDetailsApplicationUser.endIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, items, maxResults, startIndex, endIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedListUserDetailsApplicationUser {\n");
    
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    endIndex: ").append(toIndentedString(endIndex)).append("\n");
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
