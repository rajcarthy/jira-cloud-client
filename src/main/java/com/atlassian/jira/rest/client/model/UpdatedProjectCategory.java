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
 * A project category.
 */
@Schema(description = "A project category.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")
public class UpdatedProjectCategory {
  @JsonProperty("self")
  private String self = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("name")
  private String name = null;

   /**
   * The URL of the project category.
   * @return self
  **/
  @Schema(description = "The URL of the project category.")
  public String getSelf() {
    return self;
  }

   /**
   * The ID of the project category.
   * @return id
  **/
  @Schema(description = "The ID of the project category.")
  public String getId() {
    return id;
  }

   /**
   * The name of the project category.
   * @return description
  **/
  @Schema(description = "The name of the project category.")
  public String getDescription() {
    return description;
  }

   /**
   * The description of the project category.
   * @return name
  **/
  @Schema(description = "The description of the project category.")
  public String getName() {
    return name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatedProjectCategory updatedProjectCategory = (UpdatedProjectCategory) o;
    return Objects.equals(this.self, updatedProjectCategory.self) &&
        Objects.equals(this.id, updatedProjectCategory.id) &&
        Objects.equals(this.description, updatedProjectCategory.description) &&
        Objects.equals(this.name, updatedProjectCategory.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, id, description, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatedProjectCategory {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
