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
 * Details of a custom option for a field.
 */
@Schema(description = "Details of a custom option for a field.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")
public class CustomFieldOption {
  @JsonProperty("self")
  private String self = null;

  @JsonProperty("value")
  private String value = null;

   /**
   * The URL of these custom field option details.
   * @return self
  **/
  @Schema(description = "The URL of these custom field option details.")
  public String getSelf() {
    return self;
  }

   /**
   * The value of the custom field option.
   * @return value
  **/
  @Schema(description = "The value of the custom field option.")
  public String getValue() {
    return value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldOption customFieldOption = (CustomFieldOption) o;
    return Objects.equals(this.self, customFieldOption.self) &&
        Objects.equals(this.value, customFieldOption.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldOption {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
