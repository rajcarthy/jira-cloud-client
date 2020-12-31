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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * IncludedFields
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")
public class IncludedFields {
  @JsonProperty("included")
  private List<String> included = null;

  @JsonProperty("excluded")
  private List<String> excluded = null;

  @JsonProperty("actuallyIncluded")
  private List<String> actuallyIncluded = null;

  public IncludedFields included(List<String> included) {
    this.included = included;
    return this;
  }

  public IncludedFields addIncludedItem(String includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<String>();
    }
    this.included.add(includedItem);
    return this;
  }

   /**
   * Get included
   * @return included
  **/
  @Schema(description = "")
  public List<String> getIncluded() {
    return included;
  }

  public void setIncluded(List<String> included) {
    this.included = included;
  }

  public IncludedFields excluded(List<String> excluded) {
    this.excluded = excluded;
    return this;
  }

  public IncludedFields addExcludedItem(String excludedItem) {
    if (this.excluded == null) {
      this.excluded = new ArrayList<String>();
    }
    this.excluded.add(excludedItem);
    return this;
  }

   /**
   * Get excluded
   * @return excluded
  **/
  @Schema(description = "")
  public List<String> getExcluded() {
    return excluded;
  }

  public void setExcluded(List<String> excluded) {
    this.excluded = excluded;
  }

  public IncludedFields actuallyIncluded(List<String> actuallyIncluded) {
    this.actuallyIncluded = actuallyIncluded;
    return this;
  }

  public IncludedFields addActuallyIncludedItem(String actuallyIncludedItem) {
    if (this.actuallyIncluded == null) {
      this.actuallyIncluded = new ArrayList<String>();
    }
    this.actuallyIncluded.add(actuallyIncludedItem);
    return this;
  }

   /**
   * Get actuallyIncluded
   * @return actuallyIncluded
  **/
  @Schema(description = "")
  public List<String> getActuallyIncluded() {
    return actuallyIncluded;
  }

  public void setActuallyIncluded(List<String> actuallyIncluded) {
    this.actuallyIncluded = actuallyIncluded;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncludedFields includedFields = (IncludedFields) o;
    return Objects.equals(this.included, includedFields.included) &&
        Objects.equals(this.excluded, includedFields.excluded) &&
        Objects.equals(this.actuallyIncluded, includedFields.actuallyIncluded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(included, excluded, actuallyIncluded);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncludedFields {\n");
    
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    excluded: ").append(toIndentedString(excluded)).append("\n");
    sb.append("    actuallyIncluded: ").append(toIndentedString(actuallyIncluded)).append("\n");
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
