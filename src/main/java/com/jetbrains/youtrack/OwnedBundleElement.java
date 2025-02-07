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
 * OwnedBundleElement
 */


public class OwnedBundleElement extends BundleElement {
    @SerializedName("id")
    private final String ownedBundleElementId = null;

    @SerializedName("owner")
    private User owner = null;

    /**
     * Get ownedBundleElementId
     *
     * @return ownedBundleElementId
     **/
    @Schema(description = "")
    public String getOwnedBundleElementId() {
        return ownedBundleElementId;
    }

    public OwnedBundleElement owner(User owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Get owner
     *
     * @return owner
     **/
    @Schema(description = "")
    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OwnedBundleElement ownedBundleElement = (OwnedBundleElement) o;
        return Objects.equals(this.ownedBundleElementId, ownedBundleElement.ownedBundleElementId) &&
                Objects.equals(this.owner, ownedBundleElement.owner) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ownedBundleElementId, owner, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class OwnedBundleElement {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    ownedBundleElementId: " + toIndentedString(ownedBundleElementId) + "\n" +
                "    owner: " + toIndentedString(owner) + "\n" +
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
