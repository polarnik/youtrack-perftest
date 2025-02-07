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
 * TransitiveorganizationrolesPage
 */


public class TransitiveorganizationrolesPage extends BasePage {
    @SerializedName("transitiveorganizationroles")
    private List<OrganizationRole> transitiveorganizationroles = null;

    public TransitiveorganizationrolesPage transitiveorganizationroles(List<OrganizationRole> transitiveorganizationroles) {
        this.transitiveorganizationroles = transitiveorganizationroles;
        return this;
    }

    public TransitiveorganizationrolesPage addTransitiveorganizationrolesItem(OrganizationRole transitiveorganizationrolesItem) {
        if (this.transitiveorganizationroles == null) {
            this.transitiveorganizationroles = new ArrayList<OrganizationRole>();
        }
        this.transitiveorganizationroles.add(transitiveorganizationrolesItem);
        return this;
    }

    /**
     * Get transitiveorganizationroles
     *
     * @return transitiveorganizationroles
     **/
    @Schema(description = "")
    public List<OrganizationRole> getTransitiveorganizationroles() {
        return transitiveorganizationroles;
    }

    public void setTransitiveorganizationroles(List<OrganizationRole> transitiveorganizationroles) {
        this.transitiveorganizationroles = transitiveorganizationroles;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TransitiveorganizationrolesPage transitiveorganizationrolesPage = (TransitiveorganizationrolesPage) o;
        return Objects.equals(this.transitiveorganizationroles, transitiveorganizationrolesPage.transitiveorganizationroles) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transitiveorganizationroles, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class TransitiveorganizationrolesPage {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    transitiveorganizationroles: " + toIndentedString(transitiveorganizationroles) + "\n" +
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
