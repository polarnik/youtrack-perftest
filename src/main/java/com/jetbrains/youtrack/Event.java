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
 * Represents a transition from one value to another for a custom field that is managed by a state-machine rule in workflow.
 */
@Schema(description = "Represents a transition from one value to another for a custom field that is managed by a state-machine rule in workflow.")


public class Event {
    @SerializedName("id")
    private final String id = null;

    @SerializedName("presentation")
    private final String presentation = null;

    @SerializedName("$type")
    private String $type = null;

    public Event() {
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
        Event event = (Event) o;
        return Objects.equals(this.id, event.id) &&
                Objects.equals(this.presentation, event.presentation) &&
                Objects.equals(this.$type, event.$type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, presentation, $type);
    }


    @Override
    public String toString() {

        String sb = "class Event {\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    presentation: " + toIndentedString(presentation) + "\n" +
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
