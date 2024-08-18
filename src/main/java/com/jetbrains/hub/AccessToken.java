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
 * AccessToken
 */


public class AccessToken {
    @SerializedName("id_token")
    private String idToken = null;

    @SerializedName("access_token")
    private String accessToken = null;

    @SerializedName("token_type")
    private String tokenType = null;

    @SerializedName("expires_in")
    private Integer expiresIn = null;

    @SerializedName("refresh_token")
    private String refreshToken = null;

    @SerializedName("scope")
    private String scope = null;

    public AccessToken idToken(String idToken) {
        this.idToken = idToken;
        return this;
    }

    /**
     * Get idToken
     *
     * @return idToken
     **/
    @Schema(description = "")
    public String getIdToken() {
        return idToken;
    }

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    public AccessToken accessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Get accessToken
     *
     * @return accessToken
     **/
    @Schema(description = "")
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public AccessToken tokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }

    /**
     * Get tokenType
     *
     * @return tokenType
     **/
    @Schema(description = "")
    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public AccessToken expiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }

    /**
     * Get expiresIn
     *
     * @return expiresIn
     **/
    @Schema(description = "")
    public Integer getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Integer expiresIn) {
        this.expiresIn = expiresIn;
    }

    public AccessToken refreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    /**
     * Get refreshToken
     *
     * @return refreshToken
     **/
    @Schema(description = "")
    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public AccessToken scope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get scope
     *
     * @return scope
     **/
    @Schema(description = "")
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccessToken accessToken = (AccessToken) o;
        return Objects.equals(this.idToken, accessToken.idToken) &&
                Objects.equals(this.accessToken, accessToken.accessToken) &&
                Objects.equals(this.tokenType, accessToken.tokenType) &&
                Objects.equals(this.expiresIn, accessToken.expiresIn) &&
                Objects.equals(this.refreshToken, accessToken.refreshToken) &&
                Objects.equals(this.scope, accessToken.scope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idToken, accessToken, tokenType, expiresIn, refreshToken, scope);
    }


    @Override
    public String toString() {

        String sb = "class AccessToken {\n" +
                "    idToken: " + toIndentedString(idToken) + "\n" +
                "    accessToken: " + toIndentedString(accessToken) + "\n" +
                "    tokenType: " + toIndentedString(tokenType) + "\n" +
                "    expiresIn: " + toIndentedString(expiresIn) + "\n" +
                "    refreshToken: " + toIndentedString(refreshToken) + "\n" +
                "    scope: " + toIndentedString(scope) + "\n" +
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
