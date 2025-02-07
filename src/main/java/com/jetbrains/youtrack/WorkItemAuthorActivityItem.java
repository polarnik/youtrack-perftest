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
 * Represents a change in the &#x60;author&#x60; attribute of a work item.
 */
@Schema(description = "Represents a change in the `author` attribute of a work item.")


public class WorkItemAuthorActivityItem extends SingleValueActivityItem {
    @SerializedName("id")
    private final String workItemAuthorActivityItemId = null;

    @SerializedName("target")
    private IssueWorkItem workItemAuthorActivityItemTarget = null;

    @SerializedName("removed")
    private User workItemAuthorActivityItemRemoved = null;

    @SerializedName("added")
    private User workItemAuthorActivityItemAdded = null;

    /**
     * Get workItemAuthorActivityItemId
     *
     * @return workItemAuthorActivityItemId
     **/
    @Schema(description = "")
    public String getWorkItemAuthorActivityItemId() {
        return workItemAuthorActivityItemId;
    }

    public WorkItemAuthorActivityItem workItemAuthorActivityItemTarget(IssueWorkItem workItemAuthorActivityItemTarget) {
        this.workItemAuthorActivityItemTarget = workItemAuthorActivityItemTarget;
        return this;
    }

    /**
     * Get workItemAuthorActivityItemTarget
     *
     * @return workItemAuthorActivityItemTarget
     **/
    @Schema(description = "")
    public IssueWorkItem getWorkItemAuthorActivityItemTarget() {
        return workItemAuthorActivityItemTarget;
    }

    public void setWorkItemAuthorActivityItemTarget(IssueWorkItem workItemAuthorActivityItemTarget) {
        this.workItemAuthorActivityItemTarget = workItemAuthorActivityItemTarget;
    }

    public WorkItemAuthorActivityItem workItemAuthorActivityItemRemoved(User workItemAuthorActivityItemRemoved) {
        this.workItemAuthorActivityItemRemoved = workItemAuthorActivityItemRemoved;
        return this;
    }

    /**
     * Get workItemAuthorActivityItemRemoved
     *
     * @return workItemAuthorActivityItemRemoved
     **/
    @Schema(description = "")
    public User getWorkItemAuthorActivityItemRemoved() {
        return workItemAuthorActivityItemRemoved;
    }

    public void setWorkItemAuthorActivityItemRemoved(User workItemAuthorActivityItemRemoved) {
        this.workItemAuthorActivityItemRemoved = workItemAuthorActivityItemRemoved;
    }

    public WorkItemAuthorActivityItem workItemAuthorActivityItemAdded(User workItemAuthorActivityItemAdded) {
        this.workItemAuthorActivityItemAdded = workItemAuthorActivityItemAdded;
        return this;
    }

    /**
     * Get workItemAuthorActivityItemAdded
     *
     * @return workItemAuthorActivityItemAdded
     **/
    @Schema(description = "")
    public User getWorkItemAuthorActivityItemAdded() {
        return workItemAuthorActivityItemAdded;
    }

    public void setWorkItemAuthorActivityItemAdded(User workItemAuthorActivityItemAdded) {
        this.workItemAuthorActivityItemAdded = workItemAuthorActivityItemAdded;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkItemAuthorActivityItem workItemAuthorActivityItem = (WorkItemAuthorActivityItem) o;
        return Objects.equals(this.workItemAuthorActivityItemId, workItemAuthorActivityItem.workItemAuthorActivityItemId) &&
                Objects.equals(this.workItemAuthorActivityItemTarget, workItemAuthorActivityItem.workItemAuthorActivityItemTarget) &&
                Objects.equals(this.workItemAuthorActivityItemRemoved, workItemAuthorActivityItem.workItemAuthorActivityItemRemoved) &&
                Objects.equals(this.workItemAuthorActivityItemAdded, workItemAuthorActivityItem.workItemAuthorActivityItemAdded) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workItemAuthorActivityItemId, workItemAuthorActivityItemTarget, workItemAuthorActivityItemRemoved, workItemAuthorActivityItemAdded, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class WorkItemAuthorActivityItem {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    workItemAuthorActivityItemId: " + toIndentedString(workItemAuthorActivityItemId) + "\n" +
                "    workItemAuthorActivityItemTarget: " + toIndentedString(workItemAuthorActivityItemTarget) + "\n" +
                "    workItemAuthorActivityItemRemoved: " + toIndentedString(workItemAuthorActivityItemRemoved) + "\n" +
                "    workItemAuthorActivityItemAdded: " + toIndentedString(workItemAuthorActivityItemAdded) + "\n" +
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
