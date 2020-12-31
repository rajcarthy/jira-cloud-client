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
import java.util.ArrayList;
import java.util.List;
/**
 * Details of a field that can be used in advanced searches.
 */
@Schema(description = "Details of a field that can be used in advanced searches.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")
public class FieldReferenceData {
  @JsonProperty("value")
  private String value = null;

  @JsonProperty("displayName")
  private String displayName = null;

  /**
   * Whether the field can be used in a query&#x27;s &#x60;ORDER BY&#x60; clause.
   */
  public enum OrderableEnum {
    TRUE("true"),
    FALSE("false");

    private String value;

    OrderableEnum(String value) {
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
    public static OrderableEnum fromValue(String text) {
      for (OrderableEnum b : OrderableEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("orderable")
  private OrderableEnum orderable = null;

  /**
   * Whether the content of this field can be searched.
   */
  public enum SearchableEnum {
    TRUE("true"),
    FALSE("false");

    private String value;

    SearchableEnum(String value) {
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
    public static SearchableEnum fromValue(String text) {
      for (SearchableEnum b : SearchableEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("searchable")
  private SearchableEnum searchable = null;

  /**
   * Whether the field provide auto-complete suggestions.
   */
  public enum AutoEnum {
    TRUE("true"),
    FALSE("false");

    private String value;

    AutoEnum(String value) {
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
    public static AutoEnum fromValue(String text) {
      for (AutoEnum b : AutoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("auto")
  private AutoEnum auto = null;

  @JsonProperty("cfid")
  private String cfid = null;

  @JsonProperty("operators")
  private List<String> operators = null;

  @JsonProperty("types")
  private List<String> types = null;

  public FieldReferenceData value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The field identifier.
   * @return value
  **/
  @Schema(description = "The field identifier.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public FieldReferenceData displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The display name of the field.
   * @return displayName
  **/
  @Schema(description = "The display name of the field.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public FieldReferenceData orderable(OrderableEnum orderable) {
    this.orderable = orderable;
    return this;
  }

   /**
   * Whether the field can be used in a query&#x27;s &#x60;ORDER BY&#x60; clause.
   * @return orderable
  **/
  @Schema(description = "Whether the field can be used in a query's `ORDER BY` clause.")
  public OrderableEnum getOrderable() {
    return orderable;
  }

  public void setOrderable(OrderableEnum orderable) {
    this.orderable = orderable;
  }

  public FieldReferenceData searchable(SearchableEnum searchable) {
    this.searchable = searchable;
    return this;
  }

   /**
   * Whether the content of this field can be searched.
   * @return searchable
  **/
  @Schema(description = "Whether the content of this field can be searched.")
  public SearchableEnum getSearchable() {
    return searchable;
  }

  public void setSearchable(SearchableEnum searchable) {
    this.searchable = searchable;
  }

  public FieldReferenceData auto(AutoEnum auto) {
    this.auto = auto;
    return this;
  }

   /**
   * Whether the field provide auto-complete suggestions.
   * @return auto
  **/
  @Schema(description = "Whether the field provide auto-complete suggestions.")
  public AutoEnum getAuto() {
    return auto;
  }

  public void setAuto(AutoEnum auto) {
    this.auto = auto;
  }

  public FieldReferenceData cfid(String cfid) {
    this.cfid = cfid;
    return this;
  }

   /**
   * If the item is a custom field, the ID of the custom field.
   * @return cfid
  **/
  @Schema(description = "If the item is a custom field, the ID of the custom field.")
  public String getCfid() {
    return cfid;
  }

  public void setCfid(String cfid) {
    this.cfid = cfid;
  }

  public FieldReferenceData operators(List<String> operators) {
    this.operators = operators;
    return this;
  }

  public FieldReferenceData addOperatorsItem(String operatorsItem) {
    if (this.operators == null) {
      this.operators = new ArrayList<String>();
    }
    this.operators.add(operatorsItem);
    return this;
  }

   /**
   * The valid search operators for the field.
   * @return operators
  **/
  @Schema(description = "The valid search operators for the field.")
  public List<String> getOperators() {
    return operators;
  }

  public void setOperators(List<String> operators) {
    this.operators = operators;
  }

  public FieldReferenceData types(List<String> types) {
    this.types = types;
    return this;
  }

  public FieldReferenceData addTypesItem(String typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<String>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * The data types of items in the field.
   * @return types
  **/
  @Schema(description = "The data types of items in the field.")
  public List<String> getTypes() {
    return types;
  }

  public void setTypes(List<String> types) {
    this.types = types;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldReferenceData fieldReferenceData = (FieldReferenceData) o;
    return Objects.equals(this.value, fieldReferenceData.value) &&
        Objects.equals(this.displayName, fieldReferenceData.displayName) &&
        Objects.equals(this.orderable, fieldReferenceData.orderable) &&
        Objects.equals(this.searchable, fieldReferenceData.searchable) &&
        Objects.equals(this.auto, fieldReferenceData.auto) &&
        Objects.equals(this.cfid, fieldReferenceData.cfid) &&
        Objects.equals(this.operators, fieldReferenceData.operators) &&
        Objects.equals(this.types, fieldReferenceData.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, displayName, orderable, searchable, auto, cfid, operators, types);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldReferenceData {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    orderable: ").append(toIndentedString(orderable)).append("\n");
    sb.append("    searchable: ").append(toIndentedString(searchable)).append("\n");
    sb.append("    auto: ").append(toIndentedString(auto)).append("\n");
    sb.append("    cfid: ").append(toIndentedString(cfid)).append("\n");
    sb.append("    operators: ").append(toIndentedString(operators)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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