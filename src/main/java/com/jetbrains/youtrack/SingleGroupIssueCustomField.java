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
 * Represents a single-value group-type custom field in the issue.
 */
@Schema(description = "Represents a single-value group-type custom field in the issue.")


public class SingleGroupIssueCustomField extends DatabaseSingleValueIssueCustomField {
    @SerializedName("id")
    private final String singleGroupIssueCustomFieldId = null;

    @SerializedName("value")
    private UserGroup singleGroupIssueCustomFieldValue = null;

    /**
     * Get singleGroupIssueCustomFieldId
     *
     * @return singleGroupIssueCustomFieldId
     **/
    @Schema(description = "")
    public String getSingleGroupIssueCustomFieldId() {
        return singleGroupIssueCustomFieldId;
    }

    public SingleGroupIssueCustomField singleGroupIssueCustomFieldValue(UserGroup singleGroupIssueCustomFieldValue) {
        this.singleGroupIssueCustomFieldValue = singleGroupIssueCustomFieldValue;
        return this;
    }

    /**
     * Get singleGroupIssueCustomFieldValue
     *
     * @return singleGroupIssueCustomFieldValue
     **/
    @Schema(description = "")
    public UserGroup getSingleGroupIssueCustomFieldValue() {
        return singleGroupIssueCustomFieldValue;
    }

    public void setSingleGroupIssueCustomFieldValue(UserGroup singleGroupIssueCustomFieldValue) {
        this.singleGroupIssueCustomFieldValue = singleGroupIssueCustomFieldValue;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SingleGroupIssueCustomField singleGroupIssueCustomField = (SingleGroupIssueCustomField) o;
        return Objects.equals(this.singleGroupIssueCustomFieldId, singleGroupIssueCustomField.singleGroupIssueCustomFieldId) &&
                Objects.equals(this.singleGroupIssueCustomFieldValue, singleGroupIssueCustomField.singleGroupIssueCustomFieldValue) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(singleGroupIssueCustomFieldId, singleGroupIssueCustomFieldValue, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class SingleGroupIssueCustomField {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    singleGroupIssueCustomFieldId: " + toIndentedString(singleGroupIssueCustomFieldId) + "\n" +
                "    singleGroupIssueCustomFieldValue: " + toIndentedString(singleGroupIssueCustomFieldValue) + "\n" +
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
