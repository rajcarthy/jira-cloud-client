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
import com.atlassian.jira.rest.client.model.HierarchyLevel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * Project Issue Type Hierarchy
 */
@Schema(description = "Project Issue Type Hierarchy")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")
public class Hierarchy {
  @JsonProperty("level")
  private List<HierarchyLevel> level = null;

  public Hierarchy level(List<HierarchyLevel> level) {
    this.level = level;
    return this;
  }

  public Hierarchy addLevelItem(HierarchyLevel levelItem) {
    if (this.level == null) {
      this.level = new ArrayList<HierarchyLevel>();
    }
    this.level.add(levelItem);
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @Schema(description = "")
  public List<HierarchyLevel> getLevel() {
    return level;
  }

  public void setLevel(List<HierarchyLevel> level) {
    this.level = level;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hierarchy hierarchy = (Hierarchy) o;
    return Objects.equals(this.level, hierarchy.level);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hierarchy {\n");
    
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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
