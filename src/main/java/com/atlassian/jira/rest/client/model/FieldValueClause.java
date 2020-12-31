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
import com.atlassian.jira.rest.client.model.JqlQueryClauseOperand;
import com.atlassian.jira.rest.client.model.JqlQueryField;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * A clause that asserts the current value of a field. For example, &#x60;summary ~ test&#x60;.
 */
@Schema(description = "A clause that asserts the current value of a field. For example, `summary ~ test`.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")
public class FieldValueClause implements AnyOfJqlQueryClause {
  @JsonProperty("field")
  private JqlQueryField field = null;

  /**
   * The operator between the field and operand.
   */
  public enum OperatorEnum {
    EQUAL("="),
    NOT_EQUAL("!="),
    GREATER_THAN(">"),
    LESS_THAN("<"),
    GREATER_THAN_OR_EQUAL_TO(">="),
    LESS_THAN_OR_EQUAL_TO("<="),
    IN("in"),
    NOT_IN("not in"),
    TILDE("~"),
    _("~="),
    IS("is"),
    IS_NOT("is not");

    private String value;

    OperatorEnum(String value) {
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
    public static OperatorEnum fromValue(String text) {
      for (OperatorEnum b : OperatorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("operator")
  private OperatorEnum operator = null;

  @JsonProperty("operand")
  private JqlQueryClauseOperand operand = null;

  public FieldValueClause field(JqlQueryField field) {
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @Schema(required = true, description = "")
  public JqlQueryField getField() {
    return field;
  }

  public void setField(JqlQueryField field) {
    this.field = field;
  }

  public FieldValueClause operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }

   /**
   * The operator between the field and operand.
   * @return operator
  **/
  @Schema(required = true, description = "The operator between the field and operand.")
  public OperatorEnum getOperator() {
    return operator;
  }

  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  public FieldValueClause operand(JqlQueryClauseOperand operand) {
    this.operand = operand;
    return this;
  }

   /**
   * Get operand
   * @return operand
  **/
  @Schema(required = true, description = "")
  public JqlQueryClauseOperand getOperand() {
    return operand;
  }

  public void setOperand(JqlQueryClauseOperand operand) {
    this.operand = operand;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldValueClause fieldValueClause = (FieldValueClause) o;
    return Objects.equals(this.field, fieldValueClause.field) &&
        Objects.equals(this.operator, fieldValueClause.operator) &&
        Objects.equals(this.operand, fieldValueClause.operand);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, operator, operand);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldValueClause {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    operand: ").append(toIndentedString(operand)).append("\n");
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
