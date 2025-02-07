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
 * SamlUserDetails
 */


public class SamlUserDetails extends Details {
    @SerializedName("nameId")
    private String nameId = null;

    @SerializedName("login")
    private String login = null;

    @SerializedName("fullName")
    private String fullName = null;

    @SerializedName("groupNames")
    private List<String> groupNames = null;

    public SamlUserDetails nameId(String nameId) {
        this.nameId = nameId;
        return this;
    }

    /**
     * Get nameId
     *
     * @return nameId
     **/
    @Schema(description = "")
    public String getNameId() {
        return nameId;
    }

    public void setNameId(String nameId) {
        this.nameId = nameId;
    }

    public SamlUserDetails login(String login) {
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

    public SamlUserDetails fullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * Get fullName
     *
     * @return fullName
     **/
    @Schema(description = "")
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public SamlUserDetails groupNames(List<String> groupNames) {
        this.groupNames = groupNames;
        return this;
    }

    public SamlUserDetails addGroupNamesItem(String groupNamesItem) {
        if (this.groupNames == null) {
            this.groupNames = new ArrayList<String>();
        }
        this.groupNames.add(groupNamesItem);
        return this;
    }

    /**
     * Get groupNames
     *
     * @return groupNames
     **/
    @Schema(description = "")
    public List<String> getGroupNames() {
        return groupNames;
    }

    public void setGroupNames(List<String> groupNames) {
        this.groupNames = groupNames;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SamlUserDetails samlUserDetails = (SamlUserDetails) o;
        return Objects.equals(this.nameId, samlUserDetails.nameId) &&
                Objects.equals(this.login, samlUserDetails.login) &&
                Objects.equals(this.fullName, samlUserDetails.fullName) &&
                Objects.equals(this.groupNames, samlUserDetails.groupNames) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameId, login, fullName, groupNames, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class SamlUserDetails {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    nameId: " + toIndentedString(nameId) + "\n" +
                "    login: " + toIndentedString(login) + "\n" +
                "    fullName: " + toIndentedString(fullName) + "\n" +
                "    groupNames: " + toIndentedString(groupNames) + "\n" +
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
