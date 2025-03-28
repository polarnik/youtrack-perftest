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
 * UserBundle
 */


public class UserBundle extends Bundle {
    @SerializedName("id")
    private final String userBundleId = null;

    @SerializedName("groups")
    private List<UserGroup> groups = null;

    @SerializedName("individuals")
    private List<User> individuals = null;

    @SerializedName("aggregatedUsers")
    private final List<User> aggregatedUsers = null;

    /**
     * Get userBundleId
     *
     * @return userBundleId
     **/
    @Schema(description = "")
    public String getUserBundleId() {
        return userBundleId;
    }

    public UserBundle groups(List<UserGroup> groups) {
        this.groups = groups;
        return this;
    }

    public UserBundle addGroupsItem(UserGroup groupsItem) {
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

    public UserBundle individuals(List<User> individuals) {
        this.individuals = individuals;
        return this;
    }

    public UserBundle addIndividualsItem(User individualsItem) {
        if (this.individuals == null) {
            this.individuals = new ArrayList<User>();
        }
        this.individuals.add(individualsItem);
        return this;
    }

    /**
     * Get individuals
     *
     * @return individuals
     **/
    @Schema(description = "")
    public List<User> getIndividuals() {
        return individuals;
    }

    public void setIndividuals(List<User> individuals) {
        this.individuals = individuals;
    }

    /**
     * Get aggregatedUsers
     *
     * @return aggregatedUsers
     **/
    @Schema(description = "")
    public List<User> getAggregatedUsers() {
        return aggregatedUsers;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserBundle userBundle = (UserBundle) o;
        return Objects.equals(this.userBundleId, userBundle.userBundleId) &&
                Objects.equals(this.groups, userBundle.groups) &&
                Objects.equals(this.individuals, userBundle.individuals) &&
                Objects.equals(this.aggregatedUsers, userBundle.aggregatedUsers) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userBundleId, groups, individuals, aggregatedUsers, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class UserBundle {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    userBundleId: " + toIndentedString(userBundleId) + "\n" +
                "    groups: " + toIndentedString(groups) + "\n" +
                "    individuals: " + toIndentedString(individuals) + "\n" +
                "    aggregatedUsers: " + toIndentedString(aggregatedUsers) + "\n" +
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
