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
 * Identifiers for a project.
 */
@Schema(description = "Identifiers for a project.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")
public class ProjectIdentifiers {
  @JsonProperty("self")
  private String self = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("key")
  private String key = null;

   /**
   * The URL of the created project.
   * @return self
  **/
  @Schema(required = true, description = "The URL of the created project.")
  public String getSelf() {
    return self;
  }

   /**
   * The ID of the created project.
   * @return id
  **/
  @Schema(required = true, description = "The ID of the created project.")
  public Long getId() {
    return id;
  }

   /**
   * The key of the created project.
   * @return key
  **/
  @Schema(required = true, description = "The key of the created project.")
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
    ProjectIdentifiers projectIdentifiers = (ProjectIdentifiers) o;
    return Objects.equals(this.self, projectIdentifiers.self) &&
        Objects.equals(this.id, projectIdentifiers.id) &&
        Objects.equals(this.key, projectIdentifiers.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, id, key);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectIdentifiers {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
