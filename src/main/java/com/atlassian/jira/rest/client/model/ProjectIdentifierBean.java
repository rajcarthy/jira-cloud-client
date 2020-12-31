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
/**
 * The identifiers for a project.
 */
@Schema(description = "The identifiers for a project.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")
public class ProjectIdentifierBean {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("key")
  private String key = null;

   /**
   * The ID of the project.
   * @return id
  **/
  @Schema(description = "The ID of the project.")
  public Long getId() {
    return id;
  }

   /**
   * The key of the project.
   * @return key
  **/
  @Schema(description = "The key of the project.")
  public String getKey() {
    return key;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectIdentifierBean projectIdentifierBean = (ProjectIdentifierBean) o;
    return Objects.equals(this.id, projectIdentifierBean.id) &&
        Objects.equals(this.key, projectIdentifierBean.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectIdentifierBean {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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