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
 * TwoFactorAuthentication
 */


public class TwoFactorAuthentication extends TwoFactorAuthenticationSecret {
    @SerializedName("enabled")
    private Boolean enabled = null;

    public TwoFactorAuthentication enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get enabled
     *
     * @return enabled
     **/
    @Schema(description = "")
    public Boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TwoFactorAuthentication twoFactorAuthentication = (TwoFactorAuthentication) o;
        return Objects.equals(this.enabled, twoFactorAuthentication.enabled) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class TwoFactorAuthentication {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    enabled: " + toIndentedString(enabled) + "\n" +
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
