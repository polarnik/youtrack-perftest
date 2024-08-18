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
 * Represents the style settings of the field in YouTrack.
 */
@Schema(description = "Represents the style settings of the field in YouTrack.")


public class FieldStyle {
    @SerializedName("id")
    private final String id = null;

    @SerializedName("background")
    private final String background = null;

    @SerializedName("foreground")
    private final String foreground = null;

    @SerializedName("$type")
    private String $type = null;

    public FieldStyle() {
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
     * Get background
     *
     * @return background
     **/
    @Schema(description = "")
    public String getBackground() {
        return background;
    }

    /**
     * Get foreground
     *
     * @return foreground
     **/
    @Schema(description = "")
    public String getForeground() {
        return foreground;
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
        FieldStyle fieldStyle = (FieldStyle) o;
        return Objects.equals(this.id, fieldStyle.id) &&
                Objects.equals(this.background, fieldStyle.background) &&
                Objects.equals(this.foreground, fieldStyle.foreground) &&
                Objects.equals(this.$type, fieldStyle.$type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, background, foreground, $type);
    }


    @Override
    public String toString() {

        String sb = "class FieldStyle {\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    background: " + toIndentedString(background) + "\n" +
                "    foreground: " + toIndentedString(foreground) + "\n" +
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
