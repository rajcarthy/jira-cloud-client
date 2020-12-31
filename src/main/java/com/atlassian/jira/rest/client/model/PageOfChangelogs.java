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
import com.atlassian.jira.rest.client.model.Changelog;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * A page of changelogs.
 */
@Schema(description = "A page of changelogs.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")
public class PageOfChangelogs {
  @JsonProperty("startAt")
  private Integer startAt = null;

  @JsonProperty("maxResults")
  private Integer maxResults = null;

  @JsonProperty("total")
  private Integer total = null;

  @JsonProperty("histories")
  private List<Changelog> histories = null;

   /**
   * The index of the first item returned on the page.
   * @return startAt
  **/
  @Schema(description = "The index of the first item returned on the page.")
  public Integer getStartAt() {
    return startAt;
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
   * The number of results on the page.
   * @return total
  **/
  @Schema(description = "The number of results on the page.")
  public Integer getTotal() {
    return total;
  }

   /**
   * The list of changelogs.
   * @return histories
  **/
  @Schema(description = "The list of changelogs.")
  public List<Changelog> getHistories() {
    return histories;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageOfChangelogs pageOfChangelogs = (PageOfChangelogs) o;
    return Objects.equals(this.startAt, pageOfChangelogs.startAt) &&
        Objects.equals(this.maxResults, pageOfChangelogs.maxResults) &&
        Objects.equals(this.total, pageOfChangelogs.total) &&
        Objects.equals(this.histories, pageOfChangelogs.histories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startAt, maxResults, total, histories);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageOfChangelogs {\n");
    
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    histories: ").append(toIndentedString(histories)).append("\n");
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
