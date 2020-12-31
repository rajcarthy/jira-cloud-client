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
import com.atlassian.jira.rest.client.model.WorkflowStatusProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * Details of a workflow status.
 */
@Schema(description = "Details of a workflow status.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")
public class WorkflowStatus {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("properties")
  private WorkflowStatusProperties properties = null;

  public WorkflowStatus id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the issue status.
   * @return id
  **/
  @Schema(required = true, description = "The ID of the issue status.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public WorkflowStatus name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the status in the workflow.
   * @return name
  **/
  @Schema(required = true, description = "The name of the status in the workflow.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorkflowStatus properties(WorkflowStatusProperties properties) {
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @Schema(description = "")
  public WorkflowStatusProperties getProperties() {
    return properties;
  }

  public void setProperties(WorkflowStatusProperties properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowStatus workflowStatus = (WorkflowStatus) o;
    return Objects.equals(this.id, workflowStatus.id) &&
        Objects.equals(this.name, workflowStatus.name) &&
        Objects.equals(this.properties, workflowStatus.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, properties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowStatus {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
