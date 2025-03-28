/*
 * YouTrack REST API
 * YouTrack issue tracking and project management system
 *
 * OpenAPI spec version: 2024.2
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.jetbrains.youtrack;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * Represents query suggestion.
 */
@Schema(description = "Represents query suggestion.")


public class Suggestion {
    @SerializedName("id")
    private final String id = null;

    @SerializedName("completionStart")
    private final Integer completionStart = null;

    @SerializedName("completionEnd")
    private final Integer completionEnd = null;

    @SerializedName("matchingStart")
    private final Integer matchingStart = null;

    @SerializedName("matchingEnd")
    private final Integer matchingEnd = null;

    @SerializedName("caret")
    private final Integer caret = null;

    @SerializedName("description")
    private final String description = null;

    @SerializedName("option")
    private final String option = null;

    @SerializedName("prefix")
    private final String prefix = null;

    @SerializedName("suffix")
    private final String suffix = null;

    @SerializedName("group")
    private final String group = null;

    @SerializedName("icon")
    private final String icon = null;

    @SerializedName("auxiliaryIcon")
    private final String auxiliaryIcon = null;

    @SerializedName("className")
    private final String className = null;

    @SerializedName("$type")
    private String $type = null;

    public Suggestion() {
        this.$type = this.getClass().getSimpleName();
    }

    /**
     * Get id
     *
     * @return id
     **/
    @Schema(description = "")
    public String getId() {
        return id;
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

    /**
     * Get completionEnd
     *
     * @return completionEnd
     **/
    @Schema(description = "")
    public Integer getCompletionEnd() {
        return completionEnd;
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

    /**
     * Get matchingEnd
     *
     * @return matchingEnd
     **/
    @Schema(description = "")
    public Integer getMatchingEnd() {
        return matchingEnd;
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

    /**
     * Get description
     *
     * @return description
     **/
    @Schema(description = "")
    public String getDescription() {
        return description;
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

    /**
     * Get prefix
     *
     * @return prefix
     **/
    @Schema(description = "")
    public String getPrefix() {
        return prefix;
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

    /**
     * Get group
     *
     * @return group
     **/
    @Schema(description = "")
    public String getGroup() {
        return group;
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

    /**
     * Get auxiliaryIcon
     *
     * @return auxiliaryIcon
     **/
    @Schema(description = "")
    public String getAuxiliaryIcon() {
        return auxiliaryIcon;
    }

    /**
     * Get className
     *
     * @return className
     **/
    @Schema(description = "")
    public String getClassName() {
        return className;
    }

    /**
     * Get $type
     *
     * @return $type
     **/
    @Schema(description = "")
    public String get$Type() {
        return $type;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Suggestion suggestion = (Suggestion) o;
        return Objects.equals(this.id, suggestion.id) &&
                Objects.equals(this.completionStart, suggestion.completionStart) &&
                Objects.equals(this.completionEnd, suggestion.completionEnd) &&
                Objects.equals(this.matchingStart, suggestion.matchingStart) &&
                Objects.equals(this.matchingEnd, suggestion.matchingEnd) &&
                Objects.equals(this.caret, suggestion.caret) &&
                Objects.equals(this.description, suggestion.description) &&
                Objects.equals(this.option, suggestion.option) &&
                Objects.equals(this.prefix, suggestion.prefix) &&
                Objects.equals(this.suffix, suggestion.suffix) &&
                Objects.equals(this.group, suggestion.group) &&
                Objects.equals(this.icon, suggestion.icon) &&
                Objects.equals(this.auxiliaryIcon, suggestion.auxiliaryIcon) &&
                Objects.equals(this.className, suggestion.className) &&
                Objects.equals(this.$type, suggestion.$type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, completionStart, completionEnd, matchingStart, matchingEnd, caret, description, option, prefix, suffix, group, icon, auxiliaryIcon, className, $type);
    }


    @Override
    public String toString() {

        String sb = "class Suggestion {\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    completionStart: " + toIndentedString(completionStart) + "\n" +
                "    completionEnd: " + toIndentedString(completionEnd) + "\n" +
                "    matchingStart: " + toIndentedString(matchingStart) + "\n" +
                "    matchingEnd: " + toIndentedString(matchingEnd) + "\n" +
                "    caret: " + toIndentedString(caret) + "\n" +
                "    description: " + toIndentedString(description) + "\n" +
                "    option: " + toIndentedString(option) + "\n" +
                "    prefix: " + toIndentedString(prefix) + "\n" +
                "    suffix: " + toIndentedString(suffix) + "\n" +
                "    group: " + toIndentedString(group) + "\n" +
                "    icon: " + toIndentedString(icon) + "\n" +
                "    auxiliaryIcon: " + toIndentedString(auxiliaryIcon) + "\n" +
                "    className: " + toIndentedString(className) + "\n" +
                "    $type: " + toIndentedString($type) + "\n" +
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
