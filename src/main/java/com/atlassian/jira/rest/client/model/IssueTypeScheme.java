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
 * Details of an issue type scheme.
 */
@Schema(description = "Details of an issue type scheme.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")
public class IssueTypeScheme {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("defaultIssueTypeId")
  private String defaultIssueTypeId = null;

  @JsonProperty("isDefault")
  private Boolean isDefault = null;

  public IssueTypeScheme id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the issue type scheme.
   * @return id
  **/
  @Schema(required = true, description = "The ID of the issue type scheme.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IssueTypeScheme name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the issue type scheme.
   * @return name
  **/
  @Schema(required = true, description = "The name of the issue type scheme.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public IssueTypeScheme description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the issue type scheme.
   * @return description
  **/
  @Schema(description = "The description of the issue type scheme.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public IssueTypeScheme defaultIssueTypeId(String defaultIssueTypeId) {
    this.defaultIssueTypeId = defaultIssueTypeId;
    return this;
  }

   /**
   * The ID of the default issue type of the issue type scheme.
   * @return defaultIssueTypeId
  **/
  @Schema(description = "The ID of the default issue type of the issue type scheme.")
  public String getDefaultIssueTypeId() {
    return defaultIssueTypeId;
  }

  public void setDefaultIssueTypeId(String defaultIssueTypeId) {
    this.defaultIssueTypeId = defaultIssueTypeId;
  }

  public IssueTypeScheme isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Whether the issue type scheme is the default.
   * @return isDefault
  **/
  @Schema(description = "Whether the issue type scheme is the default.")
  public Boolean isIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeScheme issueTypeScheme = (IssueTypeScheme) o;
    return Objects.equals(this.id, issueTypeScheme.id) &&
        Objects.equals(this.name, issueTypeScheme.name) &&
        Objects.equals(this.description, issueTypeScheme.description) &&
        Objects.equals(this.defaultIssueTypeId, issueTypeScheme.defaultIssueTypeId) &&
        Objects.equals(this.isDefault, issueTypeScheme.isDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, defaultIssueTypeId, isDefault);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeScheme {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    defaultIssueTypeId: ").append(toIndentedString(defaultIssueTypeId)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
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
