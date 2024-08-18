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
 * ActivityItem
 */


public class ActivityItem {
    @SerializedName("id")
    private final String id = null;

    @SerializedName("added")
    private final Object added = null;

    @SerializedName("author")
    private User author = null;

    @SerializedName("category")
    private ActivityCategory category = null;

    @SerializedName("field")
    private FilterField field = null;

    @SerializedName("removed")
    private final Object removed = null;

    @SerializedName("target")
    private final Object target = null;

    @SerializedName("targetMember")
    private final String targetMember = null;

    @SerializedName("timestamp")
    private final Long timestamp = null;

    @SerializedName("$type")
    private String $type = null;

    public ActivityItem() {
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

    /**
     * Get added
     *
     * @return added
     **/
    @Schema(description = "")
    public Object getAdded() {
        return added;
    }

    public ActivityItem author(User author) {
        this.author = author;
        return this;
    }

    /**
     * Get author
     *
     * @return author
     **/
    @Schema(description = "")
    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public ActivityItem category(ActivityCategory category) {
        this.category = category;
        return this;
    }

    /**
     * Get category
     *
     * @return category
     **/
    @Schema(description = "")
    public ActivityCategory getCategory() {
        return category;
    }

    public void setCategory(ActivityCategory category) {
        this.category = category;
    }

    public ActivityItem field(FilterField field) {
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

    /**
     * Get removed
     *
     * @return removed
     **/
    @Schema(description = "")
    public Object getRemoved() {
        return removed;
    }

    /**
     * Get target
     *
     * @return target
     **/
    @Schema(description = "")
    public Object getTarget() {
        return target;
    }

    /**
     * Get targetMember
     *
     * @return targetMember
     **/
    @Schema(description = "")
    public String getTargetMember() {
        return targetMember;
    }

    /**
     * Get timestamp
     *
     * @return timestamp
     **/
    @Schema(description = "")
    public Long getTimestamp() {
        return timestamp;
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
        ActivityItem activityItem = (ActivityItem) o;
        return Objects.equals(this.id, activityItem.id) &&
                Objects.equals(this.added, activityItem.added) &&
                Objects.equals(this.author, activityItem.author) &&
                Objects.equals(this.category, activityItem.category) &&
                Objects.equals(this.field, activityItem.field) &&
                Objects.equals(this.removed, activityItem.removed) &&
                Objects.equals(this.target, activityItem.target) &&
                Objects.equals(this.targetMember, activityItem.targetMember) &&
                Objects.equals(this.timestamp, activityItem.timestamp) &&
                Objects.equals(this.$type, activityItem.$type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, added, author, category, field, removed, target, targetMember, timestamp, $type);
    }


    @Override
    public String toString() {

        String sb = "class ActivityItem {\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    added: " + toIndentedString(added) + "\n" +
                "    author: " + toIndentedString(author) + "\n" +
                "    category: " + toIndentedString(category) + "\n" +
                "    field: " + toIndentedString(field) + "\n" +
                "    removed: " + toIndentedString(removed) + "\n" +
                "    target: " + toIndentedString(target) + "\n" +
                "    targetMember: " + toIndentedString(targetMember) + "\n" +
                "    timestamp: " + toIndentedString(timestamp) + "\n" +
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
