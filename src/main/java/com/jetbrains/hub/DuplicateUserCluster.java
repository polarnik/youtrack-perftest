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
 * DuplicateUserCluster
 */


public class DuplicateUserCluster {
    @SerializedName("login")
    private String login = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("email")
    private String email = null;

    @SerializedName("banned")
    private Boolean banned = null;

    @SerializedName("users")
    private List<DuplicateUser> users = null;

    public DuplicateUserCluster login(String login) {
        this.login = login;
        return this;
    }

    /**
     * Get login
     *
     * @return login
     **/
    @Schema(description = "")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public DuplicateUserCluster name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/
    @Schema(description = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DuplicateUserCluster email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get email
     *
     * @return email
     **/
    @Schema(description = "")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public DuplicateUserCluster banned(Boolean banned) {
        this.banned = banned;
        return this;
    }

    /**
     * Get banned
     *
     * @return banned
     **/
    @Schema(description = "")
    public Boolean isBanned() {
        return banned;
    }

    public void setBanned(Boolean banned) {
        this.banned = banned;
    }

    public DuplicateUserCluster users(List<DuplicateUser> users) {
        this.users = users;
        return this;
    }

    public DuplicateUserCluster addUsersItem(DuplicateUser usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<DuplicateUser>();
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
    public List<DuplicateUser> getUsers() {
        return users;
    }

    public void setUsers(List<DuplicateUser> users) {
        this.users = users;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DuplicateUserCluster duplicateUserCluster = (DuplicateUserCluster) o;
        return Objects.equals(this.login, duplicateUserCluster.login) &&
                Objects.equals(this.name, duplicateUserCluster.name) &&
                Objects.equals(this.email, duplicateUserCluster.email) &&
                Objects.equals(this.banned, duplicateUserCluster.banned) &&
                Objects.equals(this.users, duplicateUserCluster.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, name, email, banned, users);
    }


    @Override
    public String toString() {

        String sb = "class DuplicateUserCluster {\n" +
                "    login: " + toIndentedString(login) + "\n" +
                "    name: " + toIndentedString(name) + "\n" +
                "    email: " + toIndentedString(email) + "\n" +
                "    banned: " + toIndentedString(banned) + "\n" +
                "    users: " + toIndentedString(users) + "\n" +
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
