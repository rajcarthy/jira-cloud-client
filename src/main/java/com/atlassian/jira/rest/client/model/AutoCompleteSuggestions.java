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
import com.atlassian.jira.rest.client.model.AutoCompleteSuggestion;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * The results from a JQL query.
 */
@Schema(description = "The results from a JQL query.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")
public class AutoCompleteSuggestions {
  @JsonProperty("results")
  private List<AutoCompleteSuggestion> results = null;

  public AutoCompleteSuggestions results(List<AutoCompleteSuggestion> results) {
    this.results = results;
    return this;
  }

  public AutoCompleteSuggestions addResultsItem(AutoCompleteSuggestion resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<AutoCompleteSuggestion>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * The list of suggested item.
   * @return results
  **/
  @Schema(description = "The list of suggested item.")
  public List<AutoCompleteSuggestion> getResults() {
    return results;
  }

  public void setResults(List<AutoCompleteSuggestion> results) {
    this.results = results;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutoCompleteSuggestions autoCompleteSuggestions = (AutoCompleteSuggestions) o;
    return Objects.equals(this.results, autoCompleteSuggestions.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoCompleteSuggestions {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
