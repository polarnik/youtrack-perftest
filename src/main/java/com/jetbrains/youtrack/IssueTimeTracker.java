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
 * IssueTimeTracker
 */


public class IssueTimeTracker {
    @SerializedName("id")
    private final String id = null;

    @SerializedName("workItems")
    private List<IssueWorkItem> workItems = null;

    @SerializedName("enabled")
    private final Boolean enabled = null;

    @SerializedName("$type")
    private String $type = null;

    public IssueTimeTracker() {
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

    public IssueTimeTracker workItems(List<IssueWorkItem> workItems) {
        this.workItems = workItems;
        return this;
    }

    public IssueTimeTracker addWorkItemsItem(IssueWorkItem workItemsItem) {
        if (this.workItems == null) {
            this.workItems = new ArrayList<IssueWorkItem>();
        }
        this.workItems.add(workItemsItem);
        return this;
    }

    /**
     * Get workItems
     *
     * @return workItems
     **/
    @Schema(description = "")
    public List<IssueWorkItem> getWorkItems() {
        return workItems;
    }

    public void setWorkItems(List<IssueWorkItem> workItems) {
        this.workItems = workItems;
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
        IssueTimeTracker issueTimeTracker = (IssueTimeTracker) o;
        return Objects.equals(this.id, issueTimeTracker.id) &&
                Objects.equals(this.workItems, issueTimeTracker.workItems) &&
                Objects.equals(this.enabled, issueTimeTracker.enabled) &&
                Objects.equals(this.$type, issueTimeTracker.$type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, workItems, enabled, $type);
    }


    @Override
    public String toString() {

        String sb = "class IssueTimeTracker {\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    workItems: " + toIndentedString(workItems) + "\n" +
                "    enabled: " + toIndentedString(enabled) + "\n" +
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
