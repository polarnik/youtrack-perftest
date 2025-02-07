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
 * Represents the event when a user adds or removes a user to/from the Visibility settings of the target entity.
 */
@Schema(description = "Represents the event when a user adds or removes a user to/from the Visibility settings of the target entity.")


public class VisibilityUserActivityItem extends VisibilityActivityItem {
    @SerializedName("id")
    private final String visibilityUserActivityItemId = null;

    @SerializedName("added")
    private final List<User> visibilityUserActivityItemAdded = null;

    @SerializedName("removed")
    private final List<User> visibilityUserActivityItemRemoved = null;

    @SerializedName("targetMember")
    private final String visibilityUserActivityItemTargetMember = null;

    @SerializedName("targetSubMember")
    private final String visibilityUserActivityItemTargetSubMember = null;

    /**
     * Get visibilityUserActivityItemId
     *
     * @return visibilityUserActivityItemId
     **/
    @Schema(description = "")
    public String getVisibilityUserActivityItemId() {
        return visibilityUserActivityItemId;
    }

    /**
     * Get visibilityUserActivityItemAdded
     *
     * @return visibilityUserActivityItemAdded
     **/
    @Schema(description = "")
    public List<User> getVisibilityUserActivityItemAdded() {
        return visibilityUserActivityItemAdded;
    }

    /**
     * Get visibilityUserActivityItemRemoved
     *
     * @return visibilityUserActivityItemRemoved
     **/
    @Schema(description = "")
    public List<User> getVisibilityUserActivityItemRemoved() {
        return visibilityUserActivityItemRemoved;
    }

    /**
     * Get visibilityUserActivityItemTargetMember
     *
     * @return visibilityUserActivityItemTargetMember
     **/
    @Schema(description = "")
    public String getVisibilityUserActivityItemTargetMember() {
        return visibilityUserActivityItemTargetMember;
    }

    /**
     * Get visibilityUserActivityItemTargetSubMember
     *
     * @return visibilityUserActivityItemTargetSubMember
     **/
    @Schema(description = "")
    public String getVisibilityUserActivityItemTargetSubMember() {
        return visibilityUserActivityItemTargetSubMember;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VisibilityUserActivityItem visibilityUserActivityItem = (VisibilityUserActivityItem) o;
        return Objects.equals(this.visibilityUserActivityItemId, visibilityUserActivityItem.visibilityUserActivityItemId) &&
                Objects.equals(this.visibilityUserActivityItemAdded, visibilityUserActivityItem.visibilityUserActivityItemAdded) &&
                Objects.equals(this.visibilityUserActivityItemRemoved, visibilityUserActivityItem.visibilityUserActivityItemRemoved) &&
                Objects.equals(this.visibilityUserActivityItemTargetMember, visibilityUserActivityItem.visibilityUserActivityItemTargetMember) &&
                Objects.equals(this.visibilityUserActivityItemTargetSubMember, visibilityUserActivityItem.visibilityUserActivityItemTargetSubMember) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(visibilityUserActivityItemId, visibilityUserActivityItemAdded, visibilityUserActivityItemRemoved, visibilityUserActivityItemTargetMember, visibilityUserActivityItemTargetSubMember, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class VisibilityUserActivityItem {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    visibilityUserActivityItemId: " + toIndentedString(visibilityUserActivityItemId) + "\n" +
                "    visibilityUserActivityItemAdded: " + toIndentedString(visibilityUserActivityItemAdded) + "\n" +
                "    visibilityUserActivityItemRemoved: " + toIndentedString(visibilityUserActivityItemRemoved) + "\n" +
                "    visibilityUserActivityItemTargetMember: " + toIndentedString(visibilityUserActivityItemTargetMember) + "\n" +
                "    visibilityUserActivityItemTargetSubMember: " + toIndentedString(visibilityUserActivityItemTargetSubMember) + "\n" +
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
