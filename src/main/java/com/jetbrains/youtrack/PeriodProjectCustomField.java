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
 * Represents project settings for the period field.
 */
@Schema(description = "Represents project settings for the period field.")


public class PeriodProjectCustomField extends ProjectCustomField {
    @SerializedName("id")
    private final String periodProjectCustomFieldId = null;

    /**
     * Get periodProjectCustomFieldId
     *
     * @return periodProjectCustomFieldId
     **/
    @Schema(description = "")
    public String getPeriodProjectCustomFieldId() {
        return periodProjectCustomFieldId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PeriodProjectCustomField periodProjectCustomField = (PeriodProjectCustomField) o;
        return Objects.equals(this.periodProjectCustomFieldId, periodProjectCustomField.periodProjectCustomFieldId) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(periodProjectCustomFieldId, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class PeriodProjectCustomField {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    periodProjectCustomFieldId: " + toIndentedString(periodProjectCustomFieldId) + "\n" +
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
