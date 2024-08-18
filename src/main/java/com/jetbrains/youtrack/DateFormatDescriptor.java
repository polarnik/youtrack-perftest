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
 * Represents date format.
 */
@Schema(description = "Represents date format.")


public class DateFormatDescriptor {
    @SerializedName("id")
    private final String id = null;

    @SerializedName("presentation")
    private final String presentation = null;

    @SerializedName("pattern")
    private final String pattern = null;

    @SerializedName("datePattern")
    private final String datePattern = null;

    @SerializedName("$type")
    private String $type = null;

    public DateFormatDescriptor() {
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
     * Get presentation
     *
     * @return presentation
     **/
    @Schema(description = "")
    public String getPresentation() {
        return presentation;
    }

    /**
     * Get pattern
     *
     * @return pattern
     **/
    @Schema(description = "")
    public String getPattern() {
        return pattern;
    }

    /**
     * Get datePattern
     *
     * @return datePattern
     **/
    @Schema(description = "")
    public String getDatePattern() {
        return datePattern;
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
        DateFormatDescriptor dateFormatDescriptor = (DateFormatDescriptor) o;
        return Objects.equals(this.id, dateFormatDescriptor.id) &&
                Objects.equals(this.presentation, dateFormatDescriptor.presentation) &&
                Objects.equals(this.pattern, dateFormatDescriptor.pattern) &&
                Objects.equals(this.datePattern, dateFormatDescriptor.datePattern) &&
                Objects.equals(this.$type, dateFormatDescriptor.$type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, presentation, pattern, datePattern, $type);
    }


    @Override
    public String toString() {

        String sb = "class DateFormatDescriptor {\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    presentation: " + toIndentedString(presentation) + "\n" +
                "    pattern: " + toIndentedString(pattern) + "\n" +
                "    datePattern: " + toIndentedString(datePattern) + "\n" +
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
