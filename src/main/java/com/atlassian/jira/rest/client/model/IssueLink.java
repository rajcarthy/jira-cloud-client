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
 * Details of a link between issues.
 */
@Schema(description = "Details of a link between issues.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")
public class IssueLink {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("self")
  private String self = null;

  @JsonProperty("type")
  private AllOfIssueLinkType type = null;

  @JsonProperty("inwardIssue")
  private AllOfIssueLinkInwardIssue inwardIssue = null;

  @JsonProperty("outwardIssue")
  private AllOfIssueLinkOutwardIssue outwardIssue = null;

   /**
   * The ID of the issue link.
   * @return id
  **/
  @Schema(description = "The ID of the issue link.")
  public String getId() {
    return id;
  }

   /**
   * The URL of the issue link.
   * @return self
  **/
  @Schema(description = "The URL of the issue link.")
  public String getSelf() {
    return self;
  }

  public IssueLink type(AllOfIssueLinkType type) {
    this.type = type;
    return this;
  }

   /**
   * The type of link between the issues.
   * @return type
  **/
  @Schema(required = true, description = "The type of link between the issues.")
  public AllOfIssueLinkType getType() {
    return type;
  }

  public void setType(AllOfIssueLinkType type) {
    this.type = type;
  }

  public IssueLink inwardIssue(AllOfIssueLinkInwardIssue inwardIssue) {
    this.inwardIssue = inwardIssue;
    return this;
  }

   /**
   * The issue the link joins to.
   * @return inwardIssue
  **/
  @Schema(required = true, description = "The issue the link joins to.")
  public AllOfIssueLinkInwardIssue getInwardIssue() {
    return inwardIssue;
  }

  public void setInwardIssue(AllOfIssueLinkInwardIssue inwardIssue) {
    this.inwardIssue = inwardIssue;
  }

  public IssueLink outwardIssue(AllOfIssueLinkOutwardIssue outwardIssue) {
    this.outwardIssue = outwardIssue;
    return this;
  }

   /**
   * The issue the link originates from.
   * @return outwardIssue
  **/
  @Schema(required = true, description = "The issue the link originates from.")
  public AllOfIssueLinkOutwardIssue getOutwardIssue() {
    return outwardIssue;
  }

  public void setOutwardIssue(AllOfIssueLinkOutwardIssue outwardIssue) {
    this.outwardIssue = outwardIssue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueLink issueLink = (IssueLink) o;
    return Objects.equals(this.id, issueLink.id) &&
        Objects.equals(this.self, issueLink.self) &&
        Objects.equals(this.type, issueLink.type) &&
        Objects.equals(this.inwardIssue, issueLink.inwardIssue) &&
        Objects.equals(this.outwardIssue, issueLink.outwardIssue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, self, type, inwardIssue, outwardIssue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueLink {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    inwardIssue: ").append(toIndentedString(inwardIssue)).append("\n");
    sb.append("    outwardIssue: ").append(toIndentedString(outwardIssue)).append("\n");
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