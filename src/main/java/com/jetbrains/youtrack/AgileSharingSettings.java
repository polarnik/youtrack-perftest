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
 * Stores users and groups that have access to an agile board.
 */
@Schema(description = "Stores users and groups that have access to an agile board.")


public class AgileSharingSettings {
    @SerializedName("id")
    private final String id = null;

    @SerializedName("permittedGroups")
    private List<UserGroup> permittedGroups = null;

    @SerializedName("permittedUsers")
    private List<User> permittedUsers = null;

    @SerializedName("$type")
    private String $type = null;

    public AgileSharingSettings() {
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

    public AgileSharingSettings permittedGroups(List<UserGroup> permittedGroups) {
        this.permittedGroups = permittedGroups;
        return this;
    }

    public AgileSharingSettings addPermittedGroupsItem(UserGroup permittedGroupsItem) {
        if (this.permittedGroups == null) {
            this.permittedGroups = new ArrayList<UserGroup>();
        }
        this.permittedGroups.add(permittedGroupsItem);
        return this;
    }

    /**
     * Get permittedGroups
     *
     * @return permittedGroups
     **/
    @Schema(description = "")
    public List<UserGroup> getPermittedGroups() {
        return permittedGroups;
    }

    public void setPermittedGroups(List<UserGroup> permittedGroups) {
        this.permittedGroups = permittedGroups;
    }

    public AgileSharingSettings permittedUsers(List<User> permittedUsers) {
        this.permittedUsers = permittedUsers;
        return this;
    }

    public AgileSharingSettings addPermittedUsersItem(User permittedUsersItem) {
        if (this.permittedUsers == null) {
            this.permittedUsers = new ArrayList<User>();
        }
        this.permittedUsers.add(permittedUsersItem);
        return this;
    }

    /**
     * Get permittedUsers
     *
     * @return permittedUsers
     **/
    @Schema(description = "")
    public List<User> getPermittedUsers() {
        return permittedUsers;
    }

    public void setPermittedUsers(List<User> permittedUsers) {
        this.permittedUsers = permittedUsers;
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
        AgileSharingSettings agileSharingSettings = (AgileSharingSettings) o;
        return Objects.equals(this.id, agileSharingSettings.id) &&
                Objects.equals(this.permittedGroups, agileSharingSettings.permittedGroups) &&
                Objects.equals(this.permittedUsers, agileSharingSettings.permittedUsers) &&
                Objects.equals(this.$type, agileSharingSettings.$type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, permittedGroups, permittedUsers, $type);
    }


    @Override
    public String toString() {

        String sb = "class AgileSharingSettings {\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    permittedGroups: " + toIndentedString(permittedGroups) + "\n" +
                "    permittedUsers: " + toIndentedString(permittedUsers) + "\n" +
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
