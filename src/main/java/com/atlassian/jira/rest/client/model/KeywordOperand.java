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
 * An operand that is a JQL keyword. See [Advanced searching - keywords reference](https://confluence.atlassian.com/jiracorecloud/advanced-searching-keywords-reference-765593717.html#Advancedsearching-keywordsreference-EMPTYEMPTY) for more information about operand keywords.
 */
@Schema(description = "An operand that is a JQL keyword. See [Advanced searching - keywords reference](https://confluence.atlassian.com/jiracorecloud/advanced-searching-keywords-reference-765593717.html#Advancedsearching-keywordsreference-EMPTYEMPTY) for more information about operand keywords.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")
public class KeywordOperand implements AnyOfJqlQueryClauseOperand, AnyOfJqlQueryUnitaryOperand {
  /**
   * The keyword that is the operand value.
   */
  public enum KeywordEnum {
    EMPTY("empty");

    private String value;

    KeywordEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static KeywordEnum fromValue(String text) {
      for (KeywordEnum b : KeywordEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("keyword")
  private KeywordEnum keyword = null;

  public KeywordOperand keyword(KeywordEnum keyword) {
    this.keyword = keyword;
    return this;
  }

   /**
   * The keyword that is the operand value.
   * @return keyword
  **/
  @Schema(required = true, description = "The keyword that is the operand value.")
  public KeywordEnum getKeyword() {
    return keyword;
  }

  public void setKeyword(KeywordEnum keyword) {
    this.keyword = keyword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeywordOperand keywordOperand = (KeywordOperand) o;
    return Objects.equals(this.keyword, keywordOperand.keyword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyword);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordOperand {\n");
    
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
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
