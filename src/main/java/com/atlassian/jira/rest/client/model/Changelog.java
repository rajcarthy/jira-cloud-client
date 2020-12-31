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
import com.atlassian.jira.rest.client.model.ChangeDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * A changelog.
 */
@Schema(description = "A changelog.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")
public class Changelog {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("author")
  private AllOfChangelogAuthor author = null;

  @JsonProperty("created")
  private OffsetDateTime created = null;

  @JsonProperty("items")
  private List<ChangeDetails> items = null;

  @JsonProperty("historyMetadata")
  private AllOfChangelogHistoryMetadata historyMetadata = null;

   /**
   * The ID of the changelog.
   * @return id
  **/
  @Schema(description = "The ID of the changelog.")
  public String getId() {
    return id;
  }

   /**
   * The user who made the change.
   * @return author
  **/
  @Schema(description = "The user who made the change.")
  public AllOfChangelogAuthor getAuthor() {
    return author;
  }

   /**
   * The date on which the change took place.
   * @return created
  **/
  @Schema(description = "The date on which the change took place.")
  public OffsetDateTime getCreated() {
    return created;
  }

   /**
   * The list of items changed.
   * @return items
  **/
  @Schema(description = "The list of items changed.")
  public List<ChangeDetails> getItems() {
    return items;
  }

   /**
   * The history metadata associated with the changed.
   * @return historyMetadata
  **/
  @Schema(description = "The history metadata associated with the changed.")
  public AllOfChangelogHistoryMetadata getHistoryMetadata() {
    return historyMetadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Changelog changelog = (Changelog) o;
    return Objects.equals(this.id, changelog.id) &&
        Objects.equals(this.author, changelog.author) &&
        Objects.equals(this.created, changelog.created) &&
        Objects.equals(this.items, changelog.items) &&
        Objects.equals(this.historyMetadata, changelog.historyMetadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, author, created, items, historyMetadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Changelog {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    historyMetadata: ").append(toIndentedString(historyMetadata)).append("\n");
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
