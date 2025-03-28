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
 * Represents a group of settings of a user profile in YouTrack.
 */
@Schema(description = "Represents a group of settings of a user profile in YouTrack.")


public class UserProfiles {
    @SerializedName("id")
    private final String id = null;

    @SerializedName("general")
    private GeneralUserProfile general = null;

    @SerializedName("notifications")
    private NotificationsUserProfile notifications = null;

    @SerializedName("timetracking")
    private TimeTrackingUserProfile timetracking = null;

    @SerializedName("$type")
    private String $type = null;

    public UserProfiles() {
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

    public UserProfiles general(GeneralUserProfile general) {
        this.general = general;
        return this;
    }

    /**
     * Get general
     *
     * @return general
     **/
    @Schema(description = "")
    public GeneralUserProfile getGeneral() {
        return general;
    }

    public void setGeneral(GeneralUserProfile general) {
        this.general = general;
    }

    public UserProfiles notifications(NotificationsUserProfile notifications) {
        this.notifications = notifications;
        return this;
    }

    /**
     * Get notifications
     *
     * @return notifications
     **/
    @Schema(description = "")
    public NotificationsUserProfile getNotifications() {
        return notifications;
    }

    public void setNotifications(NotificationsUserProfile notifications) {
        this.notifications = notifications;
    }

    public UserProfiles timetracking(TimeTrackingUserProfile timetracking) {
        this.timetracking = timetracking;
        return this;
    }

    /**
     * Get timetracking
     *
     * @return timetracking
     **/
    @Schema(description = "")
    public TimeTrackingUserProfile getTimetracking() {
        return timetracking;
    }

    public void setTimetracking(TimeTrackingUserProfile timetracking) {
        this.timetracking = timetracking;
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
        UserProfiles userProfiles = (UserProfiles) o;
        return Objects.equals(this.id, userProfiles.id) &&
                Objects.equals(this.general, userProfiles.general) &&
                Objects.equals(this.notifications, userProfiles.notifications) &&
                Objects.equals(this.timetracking, userProfiles.timetracking) &&
                Objects.equals(this.$type, userProfiles.$type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, general, notifications, timetracking, $type);
    }


    @Override
    public String toString() {

        String sb = "class UserProfiles {\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    general: " + toIndentedString(general) + "\n" +
                "    notifications: " + toIndentedString(notifications) + "\n" +
                "    timetracking: " + toIndentedString(timetracking) + "\n" +
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
