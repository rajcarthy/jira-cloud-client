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
import com.atlassian.jira.rest.client.model.FieldMetadata;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
/**
 * Details of the issue creation metadata for an issue type.
 */
@Schema(description = "Details of the issue creation metadata for an issue type.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")
public class IssueTypeIssueCreateMetadata {
  @JsonProperty("self")
  private String self = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("iconUrl")
  private String iconUrl = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("subtask")
  private Boolean subtask = null;

  @JsonProperty("avatarId")
  private Long avatarId = null;

  @JsonProperty("entityId")
  private UUID entityId = null;

  @JsonProperty("scope")
  private AllOfIssueTypeIssueCreateMetadataScope scope = null;

  @JsonProperty("expand")
  private String expand = null;

  @JsonProperty("fields")
  private Map<String, FieldMetadata> fields = null;

   /**
   * The URL of these issue type details.
   * @return self
  **/
  @Schema(description = "The URL of these issue type details.")
  public String getSelf() {
    return self;
  }

   /**
   * The ID of the issue type.
   * @return id
  **/
  @Schema(description = "The ID of the issue type.")
  public String getId() {
    return id;
  }

   /**
   * The description of the issue type.
   * @return description
  **/
  @Schema(description = "The description of the issue type.")
  public String getDescription() {
    return description;
  }

   /**
   * The URL of the issue type&#x27;s avatar.
   * @return iconUrl
  **/
  @Schema(description = "The URL of the issue type's avatar.")
  public String getIconUrl() {
    return iconUrl;
  }

   /**
   * The name of the issue type.
   * @return name
  **/
  @Schema(description = "The name of the issue type.")
  public String getName() {
    return name;
  }

   /**
   * Whether this issue type is used to create subtasks.
   * @return subtask
  **/
  @Schema(description = "Whether this issue type is used to create subtasks.")
  public Boolean isSubtask() {
    return subtask;
  }

   /**
   * The ID of the issue type&#x27;s avatar.
   * @return avatarId
  **/
  @Schema(description = "The ID of the issue type's avatar.")
  public Long getAvatarId() {
    return avatarId;
  }

   /**
   * Unique ID for next-gen projects.
   * @return entityId
  **/
  @Schema(description = "Unique ID for next-gen projects.")
  public UUID getEntityId() {
    return entityId;
  }

   /**
   * Details of the next-gen projects the issue type is available in.
   * @return scope
  **/
  @Schema(description = "Details of the next-gen projects the issue type is available in.")
  public AllOfIssueTypeIssueCreateMetadataScope getScope() {
    return scope;
  }

   /**
   * Expand options that include additional issue type metadata details in the response.
   * @return expand
  **/
  @Schema(description = "Expand options that include additional issue type metadata details in the response.")
  public String getExpand() {
    return expand;
  }

   /**
   * List of the fields available when creating an issue for the issue type.
   * @return fields
  **/
  @Schema(description = "List of the fields available when creating an issue for the issue type.")
  public Map<String, FieldMetadata> getFields() {
    return fields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeIssueCreateMetadata issueTypeIssueCreateMetadata = (IssueTypeIssueCreateMetadata) o;
    return Objects.equals(this.self, issueTypeIssueCreateMetadata.self) &&
        Objects.equals(this.id, issueTypeIssueCreateMetadata.id) &&
        Objects.equals(this.description, issueTypeIssueCreateMetadata.description) &&
        Objects.equals(this.iconUrl, issueTypeIssueCreateMetadata.iconUrl) &&
        Objects.equals(this.name, issueTypeIssueCreateMetadata.name) &&
        Objects.equals(this.subtask, issueTypeIssueCreateMetadata.subtask) &&
        Objects.equals(this.avatarId, issueTypeIssueCreateMetadata.avatarId) &&
        Objects.equals(this.entityId, issueTypeIssueCreateMetadata.entityId) &&
        Objects.equals(this.scope, issueTypeIssueCreateMetadata.scope) &&
        Objects.equals(this.expand, issueTypeIssueCreateMetadata.expand) &&
        Objects.equals(this.fields, issueTypeIssueCreateMetadata.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, id, description, iconUrl, name, subtask, avatarId, entityId, scope, expand, fields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeIssueCreateMetadata {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subtask: ").append(toIndentedString(subtask)).append("\n");
    sb.append("    avatarId: ").append(toIndentedString(avatarId)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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