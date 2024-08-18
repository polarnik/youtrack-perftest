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
 * Swimlane settings for the case, when each swimlane is represented by an issue and contains this issue&#x27;s subtasks.
 */
@Schema(description = "Swimlane settings for the case, when each swimlane is represented by an issue and contains this issue's subtasks.")


public class IssueBasedSwimlaneSettings extends SwimlaneSettings {
    @SerializedName("id")
    private final String issueBasedSwimlaneSettingsId = null;

    @SerializedName("field")
    private FilterField field = null;

    @SerializedName("defaultCardType")
    private SwimlaneValue defaultCardType = null;

    @SerializedName("values")
    private List<SwimlaneValue> values = null;

    /**
     * Get issueBasedSwimlaneSettingsId
     *
     * @return issueBasedSwimlaneSettingsId
     **/
    @Schema(description = "")
    public String getIssueBasedSwimlaneSettingsId() {
        return issueBasedSwimlaneSettingsId;
    }

    public IssueBasedSwimlaneSettings field(FilterField field) {
        this.field = field;
        return this;
    }

    /**
     * Get field
     *
     * @return field
     **/
    @Schema(description = "")
    public FilterField getField() {
        return field;
    }

    public void setField(FilterField field) {
        this.field = field;
    }

    public IssueBasedSwimlaneSettings defaultCardType(SwimlaneValue defaultCardType) {
        this.defaultCardType = defaultCardType;
        return this;
    }

    /**
     * Get defaultCardType
     *
     * @return defaultCardType
     **/
    @Schema(description = "")
    public SwimlaneValue getDefaultCardType() {
        return defaultCardType;
    }

    public void setDefaultCardType(SwimlaneValue defaultCardType) {
        this.defaultCardType = defaultCardType;
    }

    public IssueBasedSwimlaneSettings values(List<SwimlaneValue> values) {
        this.values = values;
        return this;
    }

    public IssueBasedSwimlaneSettings addValuesItem(SwimlaneValue valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<SwimlaneValue>();
        }
        this.values.add(valuesItem);
        return this;
    }

    /**
     * Get values
     *
     * @return values
     **/
    @Schema(description = "")
    public List<SwimlaneValue> getValues() {
        return values;
    }

    public void setValues(List<SwimlaneValue> values) {
        this.values = values;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssueBasedSwimlaneSettings issueBasedSwimlaneSettings = (IssueBasedSwimlaneSettings) o;
        return Objects.equals(this.issueBasedSwimlaneSettingsId, issueBasedSwimlaneSettings.issueBasedSwimlaneSettingsId) &&
                Objects.equals(this.field, issueBasedSwimlaneSettings.field) &&
                Objects.equals(this.defaultCardType, issueBasedSwimlaneSettings.defaultCardType) &&
                Objects.equals(this.values, issueBasedSwimlaneSettings.values) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issueBasedSwimlaneSettingsId, field, defaultCardType, values, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class IssueBasedSwimlaneSettings {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    issueBasedSwimlaneSettingsId: " + toIndentedString(issueBasedSwimlaneSettingsId) + "\n" +
                "    field: " + toIndentedString(field) + "\n" +
                "    defaultCardType: " + toIndentedString(defaultCardType) + "\n" +
                "    values: " + toIndentedString(values) + "\n" +
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
