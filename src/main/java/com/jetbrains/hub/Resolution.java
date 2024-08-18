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

import java.util.Objects;

/**
 * Resolution
 */


public class Resolution {
    @SerializedName("type")
    private String type = null;

    @SerializedName("propertyOverrides")
    private Info propertyOverrides = null;

    public Resolution type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     **/
    @Schema(description = "")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Resolution propertyOverrides(Info propertyOverrides) {
        this.propertyOverrides = propertyOverrides;
        return this;
    }

    /**
     * Get propertyOverrides
     *
     * @return propertyOverrides
     **/
    @Schema(description = "")
    public Info getPropertyOverrides() {
        return propertyOverrides;
    }

    public void setPropertyOverrides(Info propertyOverrides) {
        this.propertyOverrides = propertyOverrides;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Resolution resolution = (Resolution) o;
        return Objects.equals(this.type, resolution.type) &&
                Objects.equals(this.propertyOverrides, resolution.propertyOverrides);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, propertyOverrides);
    }


    @Override
    public String toString() {

        String sb = "class Resolution {\n" +
                "    type: " + toIndentedString(type) + "\n" +
                "    propertyOverrides: " + toIndentedString(propertyOverrides) + "\n" +
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
