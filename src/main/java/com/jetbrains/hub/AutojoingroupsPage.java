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
 * AutojoingroupsPage
 */


public class AutojoingroupsPage extends BasePage {
    @SerializedName("autojoingroups")
    private List<UserGroup> autojoingroups = null;

    public AutojoingroupsPage autojoingroups(List<UserGroup> autojoingroups) {
        this.autojoingroups = autojoingroups;
        return this;
    }

    public AutojoingroupsPage addAutojoingroupsItem(UserGroup autojoingroupsItem) {
        if (this.autojoingroups == null) {
            this.autojoingroups = new ArrayList<UserGroup>();
        }
        this.autojoingroups.add(autojoingroupsItem);
        return this;
    }

    /**
     * Get autojoingroups
     *
     * @return autojoingroups
     **/
    @Schema(description = "")
    public List<UserGroup> getAutojoingroups() {
        return autojoingroups;
    }

    public void setAutojoingroups(List<UserGroup> autojoingroups) {
        this.autojoingroups = autojoingroups;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AutojoingroupsPage autojoingroupsPage = (AutojoingroupsPage) o;
        return Objects.equals(this.autojoingroups, autojoingroupsPage.autojoingroups) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autojoingroups, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class AutojoingroupsPage {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    autojoingroups: " + toIndentedString(autojoingroups) + "\n" +
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
