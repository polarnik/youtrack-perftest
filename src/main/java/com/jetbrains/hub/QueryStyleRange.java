/*
 * Hub REST API
 * JetBrains Teamware Connector
 *
 * OpenAPI spec version: 2024.2.38971
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.jetbrains.hub;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * QueryStyleRange
 */


public class QueryStyleRange {
    @SerializedName("start")
    private Integer start = null;

    @SerializedName("length")
    private Integer length = null;

    @SerializedName("style")
    private String style = null;

    @SerializedName("title")
    private String title = null;

    public QueryStyleRange start(Integer start) {
        this.start = start;
        return this;
    }

    /**
     * Get start
     *
     * @return start
     **/
    @Schema(description = "")
    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public QueryStyleRange length(Integer length) {
        this.length = length;
        return this;
    }

    /**
     * Get length
     *
     * @return length
     **/
    @Schema(description = "")
    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public QueryStyleRange style(String style) {
        this.style = style;
        return this;
    }

    /**
     * Get style
     *
     * @return style
     **/
    @Schema(description = "")
    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public QueryStyleRange title(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get title
     *
     * @return title
     **/
    @Schema(description = "")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryStyleRange queryStyleRange = (QueryStyleRange) o;
        return Objects.equals(this.start, queryStyleRange.start) &&
                Objects.equals(this.length, queryStyleRange.length) &&
                Objects.equals(this.style, queryStyleRange.style) &&
                Objects.equals(this.title, queryStyleRange.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, length, style, title);
    }


    @Override
    public String toString() {

        String sb = "class QueryStyleRange {\n" +
                "    start: " + toIndentedString(start) + "\n" +
                "    length: " + toIndentedString(length) + "\n" +
                "    style: " + toIndentedString(style) + "\n" +
                "    title: " + toIndentedString(title) + "\n" +
                "}";
        return sb;
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
