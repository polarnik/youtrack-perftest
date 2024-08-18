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
 * OwnUsersPage
 */


public class OwnUsersPage extends BasePage {
    @SerializedName("ownUsers")
    private List<User> ownUsers = null;

    public OwnUsersPage ownUsers(List<User> ownUsers) {
        this.ownUsers = ownUsers;
        return this;
    }

    public OwnUsersPage addOwnUsersItem(User ownUsersItem) {
        if (this.ownUsers == null) {
            this.ownUsers = new ArrayList<User>();
        }
        this.ownUsers.add(ownUsersItem);
        return this;
    }

    /**
     * Get ownUsers
     *
     * @return ownUsers
     **/
    @Schema(description = "")
    public List<User> getOwnUsers() {
        return ownUsers;
    }

    public void setOwnUsers(List<User> ownUsers) {
        this.ownUsers = ownUsers;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OwnUsersPage ownUsersPage = (OwnUsersPage) o;
        return Objects.equals(this.ownUsers, ownUsersPage.ownUsers) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ownUsers, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class OwnUsersPage {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    ownUsers: " + toIndentedString(ownUsers) + "\n" +
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
