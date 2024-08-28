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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents a multi-value user-type custom field in the issue.
 */
@Schema(description = "Represents a multi-value user-type custom field in the issue.")


public class MultiUserIssueCustomField extends DatabaseMultiValueIssueCustomField {
    @SerializedName("id")
    private final String multiUserIssueCustomFieldId = null;

    @SerializedName("value")
    private List<User> multiUserIssueCustomFieldValue = null;

    /**
     * Get multiUserIssueCustomFieldId
     *
     * @return multiUserIssueCustomFieldId
     **/
    @Schema(description = "")
    public String getMultiUserIssueCustomFieldId() {
        return multiUserIssueCustomFieldId;
    }

    public MultiUserIssueCustomField multiUserIssueCustomFieldValue(List<User> multiUserIssueCustomFieldValue) {
        this.multiUserIssueCustomFieldValue = multiUserIssueCustomFieldValue;
        return this;
    }

    public MultiUserIssueCustomField addMultiUserIssueCustomFieldValueItem(User multiUserIssueCustomFieldValueItem) {
        if (this.multiUserIssueCustomFieldValue == null) {
            this.multiUserIssueCustomFieldValue = new ArrayList<User>();
        }
        this.multiUserIssueCustomFieldValue.add(multiUserIssueCustomFieldValueItem);
        return this;
    }

    /**
     * Get multiUserIssueCustomFieldValue
     *
     * @return multiUserIssueCustomFieldValue
     **/
    @Schema(description = "")
    public List<User> getMultiUserIssueCustomFieldValue() {
        return multiUserIssueCustomFieldValue;
    }

    public void setMultiUserIssueCustomFieldValue(List<User> multiUserIssueCustomFieldValue) {
        this.multiUserIssueCustomFieldValue = multiUserIssueCustomFieldValue;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MultiUserIssueCustomField multiUserIssueCustomField = (MultiUserIssueCustomField) o;
        return Objects.equals(this.multiUserIssueCustomFieldId, multiUserIssueCustomField.multiUserIssueCustomFieldId) &&
                Objects.equals(this.multiUserIssueCustomFieldValue, multiUserIssueCustomField.multiUserIssueCustomFieldValue) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(multiUserIssueCustomFieldId, multiUserIssueCustomFieldValue, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class MultiUserIssueCustomField {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    multiUserIssueCustomFieldId: " + toIndentedString(multiUserIssueCustomFieldId) + "\n" +
                "    multiUserIssueCustomFieldValue: " + toIndentedString(multiUserIssueCustomFieldValue) + "\n" +
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
