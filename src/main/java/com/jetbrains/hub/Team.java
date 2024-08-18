/*
 * Hub REST API
 * JetBrains Teamware Connector
 *
 * OpenAPI spec version: 2024.2.38971
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.jetbrains.hub;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Team
 */


public class Team {
    @SerializedName("role")
    private Role role = null;

    @SerializedName("users")
    private List<User> users = null;

    @SerializedName("usersTotal")
    private Integer usersTotal = null;

    @SerializedName("groups")
    private List<UserGroup> groups = null;

    @SerializedName("groupsTotal")
    private Integer groupsTotal = null;

    public Team role(Role role) {
        this.role = role;
        return this;
    }

    /**
     * Get role
     *
     * @return role
     **/
    @Schema(description = "")
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Team users(List<User> users) {
        this.users = users;
        return this;
    }

    public Team addUsersItem(User usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<User>();
        }
        this.users.add(usersItem);
        return this;
    }

    /**
     * Get users
     *
     * @return users
     **/
    @Schema(description = "")
    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Team usersTotal(Integer usersTotal) {
        this.usersTotal = usersTotal;
        return this;
    }

    /**
     * Get usersTotal
     *
     * @return usersTotal
     **/
    @Schema(description = "")
    public Integer getUsersTotal() {
        return usersTotal;
    }

    public void setUsersTotal(Integer usersTotal) {
        this.usersTotal = usersTotal;
    }

    public Team groups(List<UserGroup> groups) {
        this.groups = groups;
        return this;
    }

    public Team addGroupsItem(UserGroup groupsItem) {
        if (this.groups == null) {
            this.groups = new ArrayList<UserGroup>();
        }
        this.groups.add(groupsItem);
        return this;
    }

    /**
     * Get groups
     *
     * @return groups
     **/
    @Schema(description = "")
    public List<UserGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<UserGroup> groups) {
        this.groups = groups;
    }

    public Team groupsTotal(Integer groupsTotal) {
        this.groupsTotal = groupsTotal;
        return this;
    }

    /**
     * Get groupsTotal
     *
     * @return groupsTotal
     **/
    @Schema(description = "")
    public Integer getGroupsTotal() {
        return groupsTotal;
    }

    public void setGroupsTotal(Integer groupsTotal) {
        this.groupsTotal = groupsTotal;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Team team = (Team) o;
        return Objects.equals(this.role, team.role) &&
                Objects.equals(this.users, team.users) &&
                Objects.equals(this.usersTotal, team.usersTotal) &&
                Objects.equals(this.groups, team.groups) &&
                Objects.equals(this.groupsTotal, team.groupsTotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(role, users, usersTotal, groups, groupsTotal);
    }


    @Override
    public String toString() {

        String sb = "class Team {\n" +
                "    role: " + toIndentedString(role) + "\n" +
                "    users: " + toIndentedString(users) + "\n" +
                "    usersTotal: " + toIndentedString(usersTotal) + "\n" +
                "    groups: " + toIndentedString(groups) + "\n" +
                "    groupsTotal: " + toIndentedString(groupsTotal) + "\n" +
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
