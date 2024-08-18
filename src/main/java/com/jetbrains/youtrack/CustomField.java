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
 * CustomField
 */


public class CustomField {
    @SerializedName("id")
    private final String id = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("localizedName")
    private String localizedName = null;

    @SerializedName("fieldType")
    private FieldType fieldType = null;

    @SerializedName("isAutoAttached")
    private Boolean isAutoAttached = null;

    @SerializedName("isDisplayedInIssueList")
    private Boolean isDisplayedInIssueList = null;

    @SerializedName("ordinal")
    private Integer ordinal = null;

    @SerializedName("aliases")
    private String aliases = null;

    @SerializedName("fieldDefaults")
    private CustomFieldDefaults fieldDefaults = null;

    @SerializedName("hasRunningJob")
    private final Boolean hasRunningJob = null;

    @SerializedName("isUpdateable")
    private final Boolean isUpdateable = null;

    @SerializedName("instances")
    private List<ProjectCustomField> instances = null;

    @SerializedName("$type")
    private String $type = null;

    public CustomField() {
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

    public CustomField name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/
    @Schema(description = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomField localizedName(String localizedName) {
        this.localizedName = localizedName;
        return this;
    }

    /**
     * Get localizedName
     *
     * @return localizedName
     **/
    @Schema(description = "")
    public String getLocalizedName() {
        return localizedName;
    }

    public void setLocalizedName(String localizedName) {
        this.localizedName = localizedName;
    }

    public CustomField fieldType(FieldType fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /**
     * Get fieldType
     *
     * @return fieldType
     **/
    @Schema(description = "")
    public FieldType getFieldType() {
        return fieldType;
    }

    public void setFieldType(FieldType fieldType) {
        this.fieldType = fieldType;
    }

    public CustomField isAutoAttached(Boolean isAutoAttached) {
        this.isAutoAttached = isAutoAttached;
        return this;
    }

    /**
     * Get isAutoAttached
     *
     * @return isAutoAttached
     **/
    @Schema(description = "")
    public Boolean isIsAutoAttached() {
        return isAutoAttached;
    }

    public void setIsAutoAttached(Boolean isAutoAttached) {
        this.isAutoAttached = isAutoAttached;
    }

    public CustomField isDisplayedInIssueList(Boolean isDisplayedInIssueList) {
        this.isDisplayedInIssueList = isDisplayedInIssueList;
        return this;
    }

    /**
     * Get isDisplayedInIssueList
     *
     * @return isDisplayedInIssueList
     **/
    @Schema(description = "")
    public Boolean isIsDisplayedInIssueList() {
        return isDisplayedInIssueList;
    }

    public void setIsDisplayedInIssueList(Boolean isDisplayedInIssueList) {
        this.isDisplayedInIssueList = isDisplayedInIssueList;
    }

    public CustomField ordinal(Integer ordinal) {
        this.ordinal = ordinal;
        return this;
    }

    /**
     * Get ordinal
     *
     * @return ordinal
     **/
    @Schema(description = "")
    public Integer getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
    }

    public CustomField aliases(String aliases) {
        this.aliases = aliases;
        return this;
    }

    /**
     * Get aliases
     *
     * @return aliases
     **/
    @Schema(description = "")
    public String getAliases() {
        return aliases;
    }

    public void setAliases(String aliases) {
        this.aliases = aliases;
    }

    public CustomField fieldDefaults(CustomFieldDefaults fieldDefaults) {
        this.fieldDefaults = fieldDefaults;
        return this;
    }

    /**
     * Get fieldDefaults
     *
     * @return fieldDefaults
     **/
    @Schema(description = "")
    public CustomFieldDefaults getFieldDefaults() {
        return fieldDefaults;
    }

    public void setFieldDefaults(CustomFieldDefaults fieldDefaults) {
        this.fieldDefaults = fieldDefaults;
    }

    /**
     * Get hasRunningJob
     *
     * @return hasRunningJob
     **/
    @Schema(description = "")
    public Boolean isHasRunningJob() {
        return hasRunningJob;
    }

    /**
     * Get isUpdateable
     *
     * @return isUpdateable
     **/
    @Schema(description = "")
    public Boolean isIsUpdateable() {
        return isUpdateable;
    }

    public CustomField instances(List<ProjectCustomField> instances) {
        this.instances = instances;
        return this;
    }

    public CustomField addInstancesItem(ProjectCustomField instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<ProjectCustomField>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    /**
     * Get instances
     *
     * @return instances
     **/
    @Schema(description = "")
    public List<ProjectCustomField> getInstances() {
        return instances;
    }

    public void setInstances(List<ProjectCustomField> instances) {
        this.instances = instances;
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
        CustomField customField = (CustomField) o;
        return Objects.equals(this.id, customField.id) &&
                Objects.equals(this.name, customField.name) &&
                Objects.equals(this.localizedName, customField.localizedName) &&
                Objects.equals(this.fieldType, customField.fieldType) &&
                Objects.equals(this.isAutoAttached, customField.isAutoAttached) &&
                Objects.equals(this.isDisplayedInIssueList, customField.isDisplayedInIssueList) &&
                Objects.equals(this.ordinal, customField.ordinal) &&
                Objects.equals(this.aliases, customField.aliases) &&
                Objects.equals(this.fieldDefaults, customField.fieldDefaults) &&
                Objects.equals(this.hasRunningJob, customField.hasRunningJob) &&
                Objects.equals(this.isUpdateable, customField.isUpdateable) &&
                Objects.equals(this.instances, customField.instances) &&
                Objects.equals(this.$type, customField.$type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, localizedName, fieldType, isAutoAttached, isDisplayedInIssueList, ordinal, aliases, fieldDefaults, hasRunningJob, isUpdateable, instances, $type);
    }


    @Override
    public String toString() {

        String sb = "class CustomField {\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    name: " + toIndentedString(name) + "\n" +
                "    localizedName: " + toIndentedString(localizedName) + "\n" +
                "    fieldType: " + toIndentedString(fieldType) + "\n" +
                "    isAutoAttached: " + toIndentedString(isAutoAttached) + "\n" +
                "    isDisplayedInIssueList: " + toIndentedString(isDisplayedInIssueList) + "\n" +
                "    ordinal: " + toIndentedString(ordinal) + "\n" +
                "    aliases: " + toIndentedString(aliases) + "\n" +
                "    fieldDefaults: " + toIndentedString(fieldDefaults) + "\n" +
                "    hasRunningJob: " + toIndentedString(hasRunningJob) + "\n" +
                "    isUpdateable: " + toIndentedString(isUpdateable) + "\n" +
                "    instances: " + toIndentedString(instances) + "\n" +
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
