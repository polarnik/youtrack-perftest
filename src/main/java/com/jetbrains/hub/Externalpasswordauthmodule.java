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
 * Externalpasswordauthmodule
 */


public class Externalpasswordauthmodule extends Externalauthmodule {
    @SerializedName("allowedToSavePassword")
    private Boolean allowedToSavePassword = null;

    @SerializedName("changePasswordUri")
    private String changePasswordUri = null;

    @SerializedName("keyStore")
    private KeyStore keyStore = null;

    public Externalpasswordauthmodule() {
        this.type = this.getClass().getSimpleName();
    }

    public Externalpasswordauthmodule allowedToSavePassword(Boolean allowedToSavePassword) {
        this.allowedToSavePassword = allowedToSavePassword;
        return this;
    }

    /**
     * Get allowedToSavePassword
     *
     * @return allowedToSavePassword
     **/
    @Schema(description = "")
    public Boolean isAllowedToSavePassword() {
        return allowedToSavePassword;
    }

    public void setAllowedToSavePassword(Boolean allowedToSavePassword) {
        this.allowedToSavePassword = allowedToSavePassword;
    }

    public Externalpasswordauthmodule changePasswordUri(String changePasswordUri) {
        this.changePasswordUri = changePasswordUri;
        return this;
    }

    /**
     * Get changePasswordUri
     *
     * @return changePasswordUri
     **/
    @Schema(description = "")
    public String getChangePasswordUri() {
        return changePasswordUri;
    }

    public void setChangePasswordUri(String changePasswordUri) {
        this.changePasswordUri = changePasswordUri;
    }

    public Externalpasswordauthmodule keyStore(KeyStore keyStore) {
        this.keyStore = keyStore;
        return this;
    }

    /**
     * Get keyStore
     *
     * @return keyStore
     **/
    @Schema(description = "")
    public KeyStore getKeyStore() {
        return keyStore;
    }

    public void setKeyStore(KeyStore keyStore) {
        this.keyStore = keyStore;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Externalpasswordauthmodule externalpasswordauthmodule = (Externalpasswordauthmodule) o;
        return Objects.equals(this.allowedToSavePassword, externalpasswordauthmodule.allowedToSavePassword) &&
                Objects.equals(this.changePasswordUri, externalpasswordauthmodule.changePasswordUri) &&
                Objects.equals(this.keyStore, externalpasswordauthmodule.keyStore) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowedToSavePassword, changePasswordUri, keyStore, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class Externalpasswordauthmodule {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    allowedToSavePassword: " + toIndentedString(allowedToSavePassword) + "\n" +
                "    changePasswordUri: " + toIndentedString(changePasswordUri) + "\n" +
                "    keyStore: " + toIndentedString(keyStore) + "\n" +
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
