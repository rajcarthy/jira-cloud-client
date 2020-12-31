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
import com.atlassian.jira.rest.client.model.ParsedJqlQuery;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * A list of parsed JQL queries.
 */
@Schema(description = "A list of parsed JQL queries.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")
public class ParsedJqlQueries {
  @JsonProperty("queries")
  private List<ParsedJqlQuery> queries = new ArrayList<ParsedJqlQuery>();

  public ParsedJqlQueries queries(List<ParsedJqlQuery> queries) {
    this.queries = queries;
    return this;
  }

  public ParsedJqlQueries addQueriesItem(ParsedJqlQuery queriesItem) {
    this.queries.add(queriesItem);
    return this;
  }

   /**
   * A list of parsed JQL queries.
   * @return queries
  **/
  @Schema(required = true, description = "A list of parsed JQL queries.")
  public List<ParsedJqlQuery> getQueries() {
    return queries;
  }

  public void setQueries(List<ParsedJqlQuery> queries) {
    this.queries = queries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParsedJqlQueries parsedJqlQueries = (ParsedJqlQueries) o;
    return Objects.equals(this.queries, parsedJqlQueries.queries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParsedJqlQueries {\n");
    
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
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
