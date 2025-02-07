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

import java.util.List;
import java.util.Objects;

/**
 * Represents a change in the &#x60;type&#x60; attribute of the work item.
 */
@Schema(description = "Represents a change in the `type` attribute of the work item.")


public class WorkItemTypeActivityItem extends MultiValueActivityItem {
    @SerializedName("id")
    private final String workItemTypeActivityItemId = null;

    @SerializedName("target")
    private IssueWorkItem target = null;

    @SerializedName("removed")
    private final List<WorkItemType> workItemTypeActivityItemRemoved = null;

    @SerializedName("added")
    private final List<WorkItemType> workItemTypeActivityItemAdded = null;

    /**
     * Get workItemTypeActivityItemId
     *
     * @return workItemTypeActivityItemId
     **/
    @Schema(description = "")
    public String getWorkItemTypeActivityItemId() {
        return workItemTypeActivityItemId;
    }

    public WorkItemTypeActivityItem target(IssueWorkItem target) {
        this.target = target;
        return this;
    }

    /**
     * Get target
     *
     * @return target
     **/
    @Schema(description = "")
    public IssueWorkItem getTarget() {
        return target;
    }

    public void setTarget(IssueWorkItem target) {
        this.target = target;
    }

    /**
     * Get workItemTypeActivityItemRemoved
     *
     * @return workItemTypeActivityItemRemoved
     **/
    @Schema(description = "")
    public List<WorkItemType> getWorkItemTypeActivityItemRemoved() {
        return workItemTypeActivityItemRemoved;
    }

    /**
     * Get workItemTypeActivityItemAdded
     *
     * @return workItemTypeActivityItemAdded
     **/
    @Schema(description = "")
    public List<WorkItemType> getWorkItemTypeActivityItemAdded() {
        return workItemTypeActivityItemAdded;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkItemTypeActivityItem workItemTypeActivityItem = (WorkItemTypeActivityItem) o;
        return Objects.equals(this.workItemTypeActivityItemId, workItemTypeActivityItem.workItemTypeActivityItemId) &&
                Objects.equals(this.target, workItemTypeActivityItem.target) &&
                Objects.equals(this.workItemTypeActivityItemRemoved, workItemTypeActivityItem.workItemTypeActivityItemRemoved) &&
                Objects.equals(this.workItemTypeActivityItemAdded, workItemTypeActivityItem.workItemTypeActivityItemAdded) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workItemTypeActivityItemId, target, workItemTypeActivityItemRemoved, workItemTypeActivityItemAdded, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class WorkItemTypeActivityItem {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    workItemTypeActivityItemId: " + toIndentedString(workItemTypeActivityItemId) + "\n" +
                "    target: " + toIndentedString(target) + "\n" +
                "    workItemTypeActivityItemRemoved: " + toIndentedString(workItemTypeActivityItemRemoved) + "\n" +
                "    workItemTypeActivityItemAdded: " + toIndentedString(workItemTypeActivityItemAdded) + "\n" +
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
