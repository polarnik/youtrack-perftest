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
 * Represents string reference to the value.
 */
@Schema(description = "Represents string reference to the value.")


public class DatabaseAttributeValue {
    @SerializedName("id")
    private final String id = null;

    @SerializedName("$type")
    private String $type = null;

    public DatabaseAttributeValue() {
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
        DatabaseAttributeValue databaseAttributeValue = (DatabaseAttributeValue) o;
        return Objects.equals(this.id, databaseAttributeValue.id) &&
                Objects.equals(this.$type, databaseAttributeValue.$type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, $type);
    }


    @Override
    public String toString() {

        String sb = "class DatabaseAttributeValue {\n" +
                "    id: " + toIndentedString(id) + "\n" +
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
