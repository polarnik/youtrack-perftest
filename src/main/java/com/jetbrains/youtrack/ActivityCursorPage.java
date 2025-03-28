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
 * ActivityCursorPage
 */


public class ActivityCursorPage {
    @SerializedName("id")
    private final String id = null;

    @SerializedName("activities")
    private final List<ActivityItem> activities = null;

    @SerializedName("afterCursor")
    private final String afterCursor = null;

    @SerializedName("beforeCursor")
    private final String beforeCursor = null;

    @SerializedName("hasAfter")
    private final Boolean hasAfter = null;

    @SerializedName("hasBefore")
    private final Boolean hasBefore = null;

    @SerializedName("reverse")
    private final Boolean reverse = null;

    @SerializedName("$type")
    private String $type = null;

    public ActivityCursorPage() {
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
     * Get activities
     *
     * @return activities
     **/
    @Schema(description = "")
    public List<ActivityItem> getActivities() {
        return activities;
    }

    /**
     * Get afterCursor
     *
     * @return afterCursor
     **/
    @Schema(description = "")
    public String getAfterCursor() {
        return afterCursor;
    }

    /**
     * Get beforeCursor
     *
     * @return beforeCursor
     **/
    @Schema(description = "")
    public String getBeforeCursor() {
        return beforeCursor;
    }

    /**
     * Get hasAfter
     *
     * @return hasAfter
     **/
    @Schema(description = "")
    public Boolean isHasAfter() {
        return hasAfter;
    }

    /**
     * Get hasBefore
     *
     * @return hasBefore
     **/
    @Schema(description = "")
    public Boolean isHasBefore() {
        return hasBefore;
    }

    /**
     * Get reverse
     *
     * @return reverse
     **/
    @Schema(description = "")
    public Boolean isReverse() {
        return reverse;
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
        ActivityCursorPage activityCursorPage = (ActivityCursorPage) o;
        return Objects.equals(this.id, activityCursorPage.id) &&
                Objects.equals(this.activities, activityCursorPage.activities) &&
                Objects.equals(this.afterCursor, activityCursorPage.afterCursor) &&
                Objects.equals(this.beforeCursor, activityCursorPage.beforeCursor) &&
                Objects.equals(this.hasAfter, activityCursorPage.hasAfter) &&
                Objects.equals(this.hasBefore, activityCursorPage.hasBefore) &&
                Objects.equals(this.reverse, activityCursorPage.reverse) &&
                Objects.equals(this.$type, activityCursorPage.$type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, activities, afterCursor, beforeCursor, hasAfter, hasBefore, reverse, $type);
    }


    @Override
    public String toString() {

        String sb = "class ActivityCursorPage {\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    activities: " + toIndentedString(activities) + "\n" +
                "    afterCursor: " + toIndentedString(afterCursor) + "\n" +
                "    beforeCursor: " + toIndentedString(beforeCursor) + "\n" +
                "    hasAfter: " + toIndentedString(hasAfter) + "\n" +
                "    hasBefore: " + toIndentedString(hasBefore) + "\n" +
                "    reverse: " + toIndentedString(reverse) + "\n" +
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
