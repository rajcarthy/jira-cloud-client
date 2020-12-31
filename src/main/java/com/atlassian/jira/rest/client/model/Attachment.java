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
import java.util.HashMap;
import java.util.Map;
import org.threeten.bp.OffsetDateTime;
/**
 * Details about an attachment.
 */
@Schema(description = "Details about an attachment.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-12-30T18:52:18.038445-08:00[America/Los_Angeles]")
public class Attachment extends HashMap<String, Object> {
  @JsonProperty("self")
  private String self = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("filename")
  private String filename = null;

  @JsonProperty("author")
  private AllOfAttachmentAuthor author = null;

  @JsonProperty("created")
  private OffsetDateTime created = null;

  @JsonProperty("size")
  private Long size = null;

  @JsonProperty("mimeType")
  private String mimeType = null;

  @JsonProperty("content")
  private String content = null;

  @JsonProperty("thumbnail")
  private String thumbnail = null;

   /**
   * The URL of the attachment details response.
   * @return self
  **/
  @Schema(description = "The URL of the attachment details response.")
  public String getSelf() {
    return self;
  }

   /**
   * The ID of the attachment.
   * @return id
  **/
  @Schema(description = "The ID of the attachment.")
  public String getId() {
    return id;
  }

   /**
   * The file name of the attachment.
   * @return filename
  **/
  @Schema(description = "The file name of the attachment.")
  public String getFilename() {
    return filename;
  }

   /**
   * Details of the user who added the attachment.
   * @return author
  **/
  @Schema(description = "Details of the user who added the attachment.")
  public AllOfAttachmentAuthor getAuthor() {
    return author;
  }

   /**
   * The datetime the attachment was created.
   * @return created
  **/
  @Schema(description = "The datetime the attachment was created.")
  public OffsetDateTime getCreated() {
    return created;
  }

   /**
   * The size of the attachment.
   * @return size
  **/
  @Schema(description = "The size of the attachment.")
  public Long getSize() {
    return size;
  }

   /**
   * The MIME type of the attachment.
   * @return mimeType
  **/
  @Schema(description = "The MIME type of the attachment.")
  public String getMimeType() {
    return mimeType;
  }

   /**
   * The content of the attachment.
   * @return content
  **/
  @Schema(description = "The content of the attachment.")
  public String getContent() {
    return content;
  }

   /**
   * The URL of a thumbnail representing the attachment.
   * @return thumbnail
  **/
  @Schema(description = "The URL of a thumbnail representing the attachment.")
  public String getThumbnail() {
    return thumbnail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attachment attachment = (Attachment) o;
    return Objects.equals(this.self, attachment.self) &&
        Objects.equals(this.id, attachment.id) &&
        Objects.equals(this.filename, attachment.filename) &&
        Objects.equals(this.author, attachment.author) &&
        Objects.equals(this.created, attachment.created) &&
        Objects.equals(this.size, attachment.size) &&
        Objects.equals(this.mimeType, attachment.mimeType) &&
        Objects.equals(this.content, attachment.content) &&
        Objects.equals(this.thumbnail, attachment.thumbnail) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, id, filename, author, created, size, mimeType, content, thumbnail, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
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
