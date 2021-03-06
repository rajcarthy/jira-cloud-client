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
 * RichText
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")
public class RichText {
  @JsonProperty("emptyAdf")
  private Boolean emptyAdf = null;

  @JsonProperty("valueSet")
  private Boolean valueSet = null;

  public RichText emptyAdf(Boolean emptyAdf) {
    this.emptyAdf = emptyAdf;
    return this;
  }

   /**
   * Get emptyAdf
   * @return emptyAdf
  **/
  @Schema(description = "")
  public Boolean isEmptyAdf() {
    return emptyAdf;
  }

  public void setEmptyAdf(Boolean emptyAdf) {
    this.emptyAdf = emptyAdf;
  }

  public RichText valueSet(Boolean valueSet) {
    this.valueSet = valueSet;
    return this;
  }

   /**
   * Get valueSet
   * @return valueSet
  **/
  @Schema(description = "")
  public Boolean isValueSet() {
    return valueSet;
  }

  public void setValueSet(Boolean valueSet) {
    this.valueSet = valueSet;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RichText richText = (RichText) o;
    return Objects.equals(this.emptyAdf, richText.emptyAdf) &&
        Objects.equals(this.valueSet, richText.valueSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emptyAdf, valueSet);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RichText {\n");
    
    sb.append("    emptyAdf: ").append(toIndentedString(emptyAdf)).append("\n");
    sb.append("    valueSet: ").append(toIndentedString(valueSet)).append("\n");
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
