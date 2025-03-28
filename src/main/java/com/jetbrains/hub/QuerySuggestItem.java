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
 * QuerySuggestItem
 */


public class QuerySuggestItem {
    @SerializedName("prefix")
    private String prefix = null;

    @SerializedName("option")
    private String option = null;

    @SerializedName("suffix")
    private String suffix = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("matchingStart")
    private Integer matchingStart = null;

    @SerializedName("matchingEnd")
    private Integer matchingEnd = null;

    @SerializedName("caret")
    private Integer caret = null;

    @SerializedName("completionStart")
    private Integer completionStart = null;

    @SerializedName("completionEnd")
    private Integer completionEnd = null;

    @SerializedName("group")
    private String group = null;

    @SerializedName("icon")
    private String icon = null;

    public QuerySuggestItem prefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * Get prefix
     *
     * @return prefix
     **/
    @Schema(description = "")
    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public QuerySuggestItem option(String option) {
        this.option = option;
        return this;
    }

    /**
     * Get option
     *
     * @return option
     **/
    @Schema(description = "")
    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public QuerySuggestItem suffix(String suffix) {
        this.suffix = suffix;
        return this;
    }

    /**
     * Get suffix
     *
     * @return suffix
     **/
    @Schema(description = "")
    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public QuerySuggestItem description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     **/
    @Schema(description = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public QuerySuggestItem matchingStart(Integer matchingStart) {
        this.matchingStart = matchingStart;
        return this;
    }

    /**
     * Get matchingStart
     *
     * @return matchingStart
     **/
    @Schema(description = "")
    public Integer getMatchingStart() {
        return matchingStart;
    }

    public void setMatchingStart(Integer matchingStart) {
        this.matchingStart = matchingStart;
    }

    public QuerySuggestItem matchingEnd(Integer matchingEnd) {
        this.matchingEnd = matchingEnd;
        return this;
    }

    /**
     * Get matchingEnd
     *
     * @return matchingEnd
     **/
    @Schema(description = "")
    public Integer getMatchingEnd() {
        return matchingEnd;
    }

    public void setMatchingEnd(Integer matchingEnd) {
        this.matchingEnd = matchingEnd;
    }

    public QuerySuggestItem caret(Integer caret) {
        this.caret = caret;
        return this;
    }

    /**
     * Get caret
     *
     * @return caret
     **/
    @Schema(description = "")
    public Integer getCaret() {
        return caret;
    }

    public void setCaret(Integer caret) {
        this.caret = caret;
    }

    public QuerySuggestItem completionStart(Integer completionStart) {
        this.completionStart = completionStart;
        return this;
    }

    /**
     * Get completionStart
     *
     * @return completionStart
     **/
    @Schema(description = "")
    public Integer getCompletionStart() {
        return completionStart;
    }

    public void setCompletionStart(Integer completionStart) {
        this.completionStart = completionStart;
    }

    public QuerySuggestItem completionEnd(Integer completionEnd) {
        this.completionEnd = completionEnd;
        return this;
    }

    /**
     * Get completionEnd
     *
     * @return completionEnd
     **/
    @Schema(description = "")
    public Integer getCompletionEnd() {
        return completionEnd;
    }

    public void setCompletionEnd(Integer completionEnd) {
        this.completionEnd = completionEnd;
    }

    public QuerySuggestItem group(String group) {
        this.group = group;
        return this;
    }

    /**
     * Get group
     *
     * @return group
     **/
    @Schema(description = "")
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public QuerySuggestItem icon(String icon) {
        this.icon = icon;
        return this;
    }

    /**
     * Get icon
     *
     * @return icon
     **/
    @Schema(description = "")
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuerySuggestItem querySuggestItem = (QuerySuggestItem) o;
        return Objects.equals(this.prefix, querySuggestItem.prefix) &&
                Objects.equals(this.option, querySuggestItem.option) &&
                Objects.equals(this.suffix, querySuggestItem.suffix) &&
                Objects.equals(this.description, querySuggestItem.description) &&
                Objects.equals(this.matchingStart, querySuggestItem.matchingStart) &&
                Objects.equals(this.matchingEnd, querySuggestItem.matchingEnd) &&
                Objects.equals(this.caret, querySuggestItem.caret) &&
                Objects.equals(this.completionStart, querySuggestItem.completionStart) &&
                Objects.equals(this.completionEnd, querySuggestItem.completionEnd) &&
                Objects.equals(this.group, querySuggestItem.group) &&
                Objects.equals(this.icon, querySuggestItem.icon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prefix, option, suffix, description, matchingStart, matchingEnd, caret, completionStart, completionEnd, group, icon);
    }


    @Override
    public String toString() {

        String sb = "class QuerySuggestItem {\n" +
                "    prefix: " + toIndentedString(prefix) + "\n" +
                "    option: " + toIndentedString(option) + "\n" +
                "    suffix: " + toIndentedString(suffix) + "\n" +
                "    description: " + toIndentedString(description) + "\n" +
                "    matchingStart: " + toIndentedString(matchingStart) + "\n" +
                "    matchingEnd: " + toIndentedString(matchingEnd) + "\n" +
                "    caret: " + toIndentedString(caret) + "\n" +
                "    completionStart: " + toIndentedString(completionStart) + "\n" +
                "    completionEnd: " + toIndentedString(completionEnd) + "\n" +
                "    group: " + toIndentedString(group) + "\n" +
                "    icon: " + toIndentedString(icon) + "\n" +
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
