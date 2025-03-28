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
 * IdentityProviderMetadata
 */


public class IdentityProviderMetadata extends ProviderMetadata {
    @SerializedName("defaultNameIdType")
    private String defaultNameIdType = null;

    @SerializedName("service")
    private Service service = null;

    @SerializedName("keyStore")
    private KeyStore keyStore = null;

    public IdentityProviderMetadata defaultNameIdType(String defaultNameIdType) {
        this.defaultNameIdType = defaultNameIdType;
        return this;
    }

    /**
     * Get defaultNameIdType
     *
     * @return defaultNameIdType
     **/
    @Schema(description = "")
    public String getDefaultNameIdType() {
        return defaultNameIdType;
    }

    public void setDefaultNameIdType(String defaultNameIdType) {
        this.defaultNameIdType = defaultNameIdType;
    }

    public IdentityProviderMetadata service(Service service) {
        this.service = service;
        return this;
    }

    /**
     * Get service
     *
     * @return service
     **/
    @Schema(description = "")
    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public IdentityProviderMetadata keyStore(KeyStore keyStore) {
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
        IdentityProviderMetadata identityProviderMetadata = (IdentityProviderMetadata) o;
        return Objects.equals(this.defaultNameIdType, identityProviderMetadata.defaultNameIdType) &&
                Objects.equals(this.service, identityProviderMetadata.service) &&
                Objects.equals(this.keyStore, identityProviderMetadata.keyStore) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defaultNameIdType, service, keyStore, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class IdentityProviderMetadata {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    defaultNameIdType: " + toIndentedString(defaultNameIdType) + "\n" +
                "    service: " + toIndentedString(service) + "\n" +
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
