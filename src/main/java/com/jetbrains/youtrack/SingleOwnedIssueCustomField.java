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
 * Represents a single-value owned-type custom field in the issue.
 */
@Schema(description = "Represents a single-value owned-type custom field in the issue.")


public class SingleOwnedIssueCustomField extends DatabaseSingleValueIssueCustomField {
    @SerializedName("id")
    private final String singleOwnedIssueCustomFieldId = null;

    @SerializedName("value")
    private OwnedBundleElement singleOwnedIssueCustomFieldValue = null;

    /**
     * Get singleOwnedIssueCustomFieldId
     *
     * @return singleOwnedIssueCustomFieldId
     **/
    @Schema(description = "")
    public String getSingleOwnedIssueCustomFieldId() {
        return singleOwnedIssueCustomFieldId;
    }

    public SingleOwnedIssueCustomField singleOwnedIssueCustomFieldValue(OwnedBundleElement singleOwnedIssueCustomFieldValue) {
        this.singleOwnedIssueCustomFieldValue = singleOwnedIssueCustomFieldValue;
        return this;
    }

    /**
     * Get singleOwnedIssueCustomFieldValue
     *
     * @return singleOwnedIssueCustomFieldValue
     **/
    @Schema(description = "")
    public OwnedBundleElement getSingleOwnedIssueCustomFieldValue() {
        return singleOwnedIssueCustomFieldValue;
    }

    public void setSingleOwnedIssueCustomFieldValue(OwnedBundleElement singleOwnedIssueCustomFieldValue) {
        this.singleOwnedIssueCustomFieldValue = singleOwnedIssueCustomFieldValue;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SingleOwnedIssueCustomField singleOwnedIssueCustomField = (SingleOwnedIssueCustomField) o;
        return Objects.equals(this.singleOwnedIssueCustomFieldId, singleOwnedIssueCustomField.singleOwnedIssueCustomFieldId) &&
                Objects.equals(this.singleOwnedIssueCustomFieldValue, singleOwnedIssueCustomField.singleOwnedIssueCustomFieldValue) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(singleOwnedIssueCustomFieldId, singleOwnedIssueCustomFieldValue, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class SingleOwnedIssueCustomField {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    singleOwnedIssueCustomFieldId: " + toIndentedString(singleOwnedIssueCustomFieldId) + "\n" +
                "    singleOwnedIssueCustomFieldValue: " + toIndentedString(singleOwnedIssueCustomFieldValue) + "\n" +
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
