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
 * Shapassword
 */


public class Shapassword extends Password {
    @SerializedName("hashedValue")
    private String hashedValue = null;

    @SerializedName("salt")
    private String salt = null;

    public Shapassword hashedValue(String hashedValue) {
        this.hashedValue = hashedValue;
        return this;
    }

    /**
     * Get hashedValue
     *
     * @return hashedValue
     **/
    @Schema(description = "")
    public String getHashedValue() {
        return hashedValue;
    }

    public void setHashedValue(String hashedValue) {
        this.hashedValue = hashedValue;
    }

    public Shapassword salt(String salt) {
        this.salt = salt;
        return this;
    }

    /**
     * Get salt
     *
     * @return salt
     **/
    @Schema(description = "")
    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Shapassword shapassword = (Shapassword) o;
        return Objects.equals(this.hashedValue, shapassword.hashedValue) &&
                Objects.equals(this.salt, shapassword.salt) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hashedValue, salt, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class Shapassword {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    hashedValue: " + toIndentedString(hashedValue) + "\n" +
                "    salt: " + toIndentedString(salt) + "\n" +
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
