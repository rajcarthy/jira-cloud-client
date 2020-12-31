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
import com.atlassian.jira.rest.client.model.ApplicationRole;
import com.atlassian.jira.rest.client.model.ListWrapperCallbackApplicationRole;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * SimpleListWrapperApplicationRole
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")
public class SimpleListWrapperApplicationRole {
  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("items")
  private List<ApplicationRole> items = null;

  @JsonProperty("pagingCallback")
  private ListWrapperCallbackApplicationRole pagingCallback = null;

  @JsonProperty("callback")
  private ListWrapperCallbackApplicationRole callback = null;

  @JsonProperty("max-results")
  private Integer maxResults = null;

  public SimpleListWrapperApplicationRole size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @Schema(description = "")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public SimpleListWrapperApplicationRole items(List<ApplicationRole> items) {
    this.items = items;
    return this;
  }

  public SimpleListWrapperApplicationRole addItemsItem(ApplicationRole itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<ApplicationRole>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @Schema(description = "")
  public List<ApplicationRole> getItems() {
    return items;
  }

  public void setItems(List<ApplicationRole> items) {
    this.items = items;
  }

  public SimpleListWrapperApplicationRole pagingCallback(ListWrapperCallbackApplicationRole pagingCallback) {
    this.pagingCallback = pagingCallback;
    return this;
  }

   /**
   * Get pagingCallback
   * @return pagingCallback
  **/
  @Schema(description = "")
  public ListWrapperCallbackApplicationRole getPagingCallback() {
    return pagingCallback;
  }

  public void setPagingCallback(ListWrapperCallbackApplicationRole pagingCallback) {
    this.pagingCallback = pagingCallback;
  }

  public SimpleListWrapperApplicationRole callback(ListWrapperCallbackApplicationRole callback) {
    this.callback = callback;
    return this;
  }

   /**
   * Get callback
   * @return callback
  **/
  @Schema(description = "")
  public ListWrapperCallbackApplicationRole getCallback() {
    return callback;
  }

  public void setCallback(ListWrapperCallbackApplicationRole callback) {
    this.callback = callback;
  }

  public SimpleListWrapperApplicationRole maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

   /**
   * Get maxResults
   * @return maxResults
  **/
  @Schema(description = "")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimpleListWrapperApplicationRole simpleListWrapperApplicationRole = (SimpleListWrapperApplicationRole) o;
    return Objects.equals(this.size, simpleListWrapperApplicationRole.size) &&
        Objects.equals(this.items, simpleListWrapperApplicationRole.items) &&
        Objects.equals(this.pagingCallback, simpleListWrapperApplicationRole.pagingCallback) &&
        Objects.equals(this.callback, simpleListWrapperApplicationRole.callback) &&
        Objects.equals(this.maxResults, simpleListWrapperApplicationRole.maxResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, items, pagingCallback, callback, maxResults);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimpleListWrapperApplicationRole {\n");
    
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    pagingCallback: ").append(toIndentedString(pagingCallback)).append("\n");
    sb.append("    callback: ").append(toIndentedString(callback)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
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
