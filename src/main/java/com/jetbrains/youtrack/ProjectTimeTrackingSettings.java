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
 * ProjectTimeTrackingSettings
 */


public class ProjectTimeTrackingSettings {
    @SerializedName("id")
    private final String id = null;

    @SerializedName("enabled")
    private Boolean enabled = null;

    @SerializedName("estimate")
    private ProjectCustomField estimate = null;

    @SerializedName("timeSpent")
    private ProjectCustomField timeSpent = null;

    @SerializedName("workItemTypes")
    private List<WorkItemType> workItemTypes = null;

    @SerializedName("project")
    private Project project = null;

    @SerializedName("attributes")
    private List<WorkItemProjectAttribute> attributes = null;

    @SerializedName("$type")
    private String $type = null;

    public ProjectTimeTrackingSettings() {
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

    public ProjectTimeTrackingSettings enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get enabled
     *
     * @return enabled
     **/
    @Schema(description = "")
    public Boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ProjectTimeTrackingSettings estimate(ProjectCustomField estimate) {
        this.estimate = estimate;
        return this;
    }

    /**
     * Get estimate
     *
     * @return estimate
     **/
    @Schema(description = "")
    public ProjectCustomField getEstimate() {
        return estimate;
    }

    public void setEstimate(ProjectCustomField estimate) {
        this.estimate = estimate;
    }

    public ProjectTimeTrackingSettings timeSpent(ProjectCustomField timeSpent) {
        this.timeSpent = timeSpent;
        return this;
    }

    /**
     * Get timeSpent
     *
     * @return timeSpent
     **/
    @Schema(description = "")
    public ProjectCustomField getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(ProjectCustomField timeSpent) {
        this.timeSpent = timeSpent;
    }

    public ProjectTimeTrackingSettings workItemTypes(List<WorkItemType> workItemTypes) {
        this.workItemTypes = workItemTypes;
        return this;
    }

    public ProjectTimeTrackingSettings addWorkItemTypesItem(WorkItemType workItemTypesItem) {
        if (this.workItemTypes == null) {
            this.workItemTypes = new ArrayList<WorkItemType>();
        }
        this.workItemTypes.add(workItemTypesItem);
        return this;
    }

    /**
     * Get workItemTypes
     *
     * @return workItemTypes
     **/
    @Schema(description = "")
    public List<WorkItemType> getWorkItemTypes() {
        return workItemTypes;
    }

    public void setWorkItemTypes(List<WorkItemType> workItemTypes) {
        this.workItemTypes = workItemTypes;
    }

    public ProjectTimeTrackingSettings project(Project project) {
        this.project = project;
        return this;
    }

    /**
     * Get project
     *
     * @return project
     **/
    @Schema(description = "")
    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public ProjectTimeTrackingSettings attributes(List<WorkItemProjectAttribute> attributes) {
        this.attributes = attributes;
        return this;
    }

    public ProjectTimeTrackingSettings addAttributesItem(WorkItemProjectAttribute attributesItem) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<WorkItemProjectAttribute>();
        }
        this.attributes.add(attributesItem);
        return this;
    }

    /**
     * Get attributes
     *
     * @return attributes
     **/
    @Schema(description = "")
    public List<WorkItemProjectAttribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<WorkItemProjectAttribute> attributes) {
        this.attributes = attributes;
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
        ProjectTimeTrackingSettings projectTimeTrackingSettings = (ProjectTimeTrackingSettings) o;
        return Objects.equals(this.id, projectTimeTrackingSettings.id) &&
                Objects.equals(this.enabled, projectTimeTrackingSettings.enabled) &&
                Objects.equals(this.estimate, projectTimeTrackingSettings.estimate) &&
                Objects.equals(this.timeSpent, projectTimeTrackingSettings.timeSpent) &&
                Objects.equals(this.workItemTypes, projectTimeTrackingSettings.workItemTypes) &&
                Objects.equals(this.project, projectTimeTrackingSettings.project) &&
                Objects.equals(this.attributes, projectTimeTrackingSettings.attributes) &&
                Objects.equals(this.$type, projectTimeTrackingSettings.$type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, enabled, estimate, timeSpent, workItemTypes, project, attributes, $type);
    }


    @Override
    public String toString() {

        String sb = "class ProjectTimeTrackingSettings {\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    enabled: " + toIndentedString(enabled) + "\n" +
                "    estimate: " + toIndentedString(estimate) + "\n" +
                "    timeSpent: " + toIndentedString(timeSpent) + "\n" +
                "    workItemTypes: " + toIndentedString(workItemTypes) + "\n" +
                "    project: " + toIndentedString(project) + "\n" +
                "    attributes: " + toIndentedString(attributes) + "\n" +
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
