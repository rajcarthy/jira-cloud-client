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
import com.atlassian.jira.rest.client.model.ProjectIssueTypesHierarchyLevel;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * The hierarchy of issue types within a project.
 */
@Schema(description = "The hierarchy of issue types within a project.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")
public class ProjectIssueTypeHierarchy {
  @JsonProperty("projectId")
  private Long projectId = null;

  @JsonProperty("hierarchy")
  private List<ProjectIssueTypesHierarchyLevel> hierarchy = null;

   /**
   * The ID of the project.
   * @return projectId
  **/
  @Schema(description = "The ID of the project.")
  public Long getProjectId() {
    return projectId;
  }

   /**
   * Details of an issue type hierarchy level.
   * @return hierarchy
  **/
  @Schema(description = "Details of an issue type hierarchy level.")
  public List<ProjectIssueTypesHierarchyLevel> getHierarchy() {
    return hierarchy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectIssueTypeHierarchy projectIssueTypeHierarchy = (ProjectIssueTypeHierarchy) o;
    return Objects.equals(this.projectId, projectIssueTypeHierarchy.projectId) &&
        Objects.equals(this.hierarchy, projectIssueTypeHierarchy.hierarchy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectId, hierarchy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectIssueTypeHierarchy {\n");
    
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    hierarchy: ").append(toIndentedString(hierarchy)).append("\n");
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
