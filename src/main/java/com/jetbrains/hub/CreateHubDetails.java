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
 * CreateHubDetails
 */


public class CreateHubDetails {
    @SerializedName("isAllowed")
    private Boolean isAllowed = null;

    @SerializedName("errorId")
    private String errorId = null;

    public CreateHubDetails isAllowed(Boolean isAllowed) {
        this.isAllowed = isAllowed;
        return this;
    }

    /**
     * Get isAllowed
     *
     * @return isAllowed
     **/
    @Schema(description = "")
    public Boolean isIsAllowed() {
        return isAllowed;
    }

    public void setIsAllowed(Boolean isAllowed) {
        this.isAllowed = isAllowed;
    }

    public CreateHubDetails errorId(String errorId) {
        this.errorId = errorId;
        return this;
    }

    /**
     * Get errorId
     *
     * @return errorId
     **/
    @Schema(description = "")
    public String getErrorId() {
        return errorId;
    }

    public void setErrorId(String errorId) {
        this.errorId = errorId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateHubDetails createHubDetails = (CreateHubDetails) o;
        return Objects.equals(this.isAllowed, createHubDetails.isAllowed) &&
                Objects.equals(this.errorId, createHubDetails.errorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAllowed, errorId);
    }


    @Override
    public String toString() {

        String sb = "class CreateHubDetails {\n" +
                "    isAllowed: " + toIndentedString(isAllowed) + "\n" +
                "    errorId: " + toIndentedString(errorId) + "\n" +
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
