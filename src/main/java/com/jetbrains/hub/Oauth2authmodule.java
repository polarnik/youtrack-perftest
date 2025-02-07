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
 * Oauth2authmodule
 */


public class Oauth2authmodule extends Externaloauth2module {
    @SerializedName("scope")
    private String scope = null;

    @SerializedName("tokenUrl")
    private String tokenUrl = null;

    @SerializedName("formClientAuth")
    private Boolean formClientAuth = null;

    @SerializedName("userInfoUrl")
    private String userInfoUrl = null;

    @SerializedName("userIdPath")
    private String userIdPath = null;

    @SerializedName("userEmailUrl")
    private String userEmailUrl = null;

    @SerializedName("userAvatarUrl")
    private String userAvatarUrl = null;

    @SerializedName("userEmailPath")
    private String userEmailPath = null;

    @SerializedName("userEmailVerifiedPath")
    private String userEmailVerifiedPath = null;

    @SerializedName("userNamePath")
    private String userNamePath = null;

    @SerializedName("fullNamePath")
    private String fullNamePath = null;

    @SerializedName("userPictureIdPath")
    private String userPictureIdPath = null;

    @SerializedName("userPictureUrlPattern")
    private String userPictureUrlPattern = null;

    @SerializedName("emailVerifiedByDefault")
    private Boolean emailVerifiedByDefault = null;

    @SerializedName("userGroupsPath")
    private String userGroupsPath = null;

    public Oauth2authmodule scope(String scope) {
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

    public Oauth2authmodule tokenUrl(String tokenUrl) {
        this.tokenUrl = tokenUrl;
        return this;
    }

    /**
     * Get tokenUrl
     *
     * @return tokenUrl
     **/
    @Schema(description = "")
    public String getTokenUrl() {
        return tokenUrl;
    }

    public void setTokenUrl(String tokenUrl) {
        this.tokenUrl = tokenUrl;
    }

    public Oauth2authmodule formClientAuth(Boolean formClientAuth) {
        this.formClientAuth = formClientAuth;
        return this;
    }

    /**
     * Get formClientAuth
     *
     * @return formClientAuth
     **/
    @Schema(description = "")
    public Boolean isFormClientAuth() {
        return formClientAuth;
    }

    public void setFormClientAuth(Boolean formClientAuth) {
        this.formClientAuth = formClientAuth;
    }

    public Oauth2authmodule userInfoUrl(String userInfoUrl) {
        this.userInfoUrl = userInfoUrl;
        return this;
    }

    /**
     * Get userInfoUrl
     *
     * @return userInfoUrl
     **/
    @Schema(description = "")
    public String getUserInfoUrl() {
        return userInfoUrl;
    }

    public void setUserInfoUrl(String userInfoUrl) {
        this.userInfoUrl = userInfoUrl;
    }

    public Oauth2authmodule userIdPath(String userIdPath) {
        this.userIdPath = userIdPath;
        return this;
    }

    /**
     * Get userIdPath
     *
     * @return userIdPath
     **/
    @Schema(description = "")
    public String getUserIdPath() {
        return userIdPath;
    }

    public void setUserIdPath(String userIdPath) {
        this.userIdPath = userIdPath;
    }

    public Oauth2authmodule userEmailUrl(String userEmailUrl) {
        this.userEmailUrl = userEmailUrl;
        return this;
    }

    /**
     * Get userEmailUrl
     *
     * @return userEmailUrl
     **/
    @Schema(description = "")
    public String getUserEmailUrl() {
        return userEmailUrl;
    }

    public void setUserEmailUrl(String userEmailUrl) {
        this.userEmailUrl = userEmailUrl;
    }

    public Oauth2authmodule userAvatarUrl(String userAvatarUrl) {
        this.userAvatarUrl = userAvatarUrl;
        return this;
    }

    /**
     * Get userAvatarUrl
     *
     * @return userAvatarUrl
     **/
    @Schema(description = "")
    public String getUserAvatarUrl() {
        return userAvatarUrl;
    }

    public void setUserAvatarUrl(String userAvatarUrl) {
        this.userAvatarUrl = userAvatarUrl;
    }

    public Oauth2authmodule userEmailPath(String userEmailPath) {
        this.userEmailPath = userEmailPath;
        return this;
    }

    /**
     * Get userEmailPath
     *
     * @return userEmailPath
     **/
    @Schema(description = "")
    public String getUserEmailPath() {
        return userEmailPath;
    }

    public void setUserEmailPath(String userEmailPath) {
        this.userEmailPath = userEmailPath;
    }

    public Oauth2authmodule userEmailVerifiedPath(String userEmailVerifiedPath) {
        this.userEmailVerifiedPath = userEmailVerifiedPath;
        return this;
    }

    /**
     * Get userEmailVerifiedPath
     *
     * @return userEmailVerifiedPath
     **/
    @Schema(description = "")
    public String getUserEmailVerifiedPath() {
        return userEmailVerifiedPath;
    }

    public void setUserEmailVerifiedPath(String userEmailVerifiedPath) {
        this.userEmailVerifiedPath = userEmailVerifiedPath;
    }

    public Oauth2authmodule userNamePath(String userNamePath) {
        this.userNamePath = userNamePath;
        return this;
    }

    /**
     * Get userNamePath
     *
     * @return userNamePath
     **/
    @Schema(description = "")
    public String getUserNamePath() {
        return userNamePath;
    }

    public void setUserNamePath(String userNamePath) {
        this.userNamePath = userNamePath;
    }

    public Oauth2authmodule fullNamePath(String fullNamePath) {
        this.fullNamePath = fullNamePath;
        return this;
    }

    /**
     * Get fullNamePath
     *
     * @return fullNamePath
     **/
    @Schema(description = "")
    public String getFullNamePath() {
        return fullNamePath;
    }

    public void setFullNamePath(String fullNamePath) {
        this.fullNamePath = fullNamePath;
    }

    public Oauth2authmodule userPictureIdPath(String userPictureIdPath) {
        this.userPictureIdPath = userPictureIdPath;
        return this;
    }

    /**
     * Get userPictureIdPath
     *
     * @return userPictureIdPath
     **/
    @Schema(description = "")
    public String getUserPictureIdPath() {
        return userPictureIdPath;
    }

    public void setUserPictureIdPath(String userPictureIdPath) {
        this.userPictureIdPath = userPictureIdPath;
    }

    public Oauth2authmodule userPictureUrlPattern(String userPictureUrlPattern) {
        this.userPictureUrlPattern = userPictureUrlPattern;
        return this;
    }

    /**
     * Get userPictureUrlPattern
     *
     * @return userPictureUrlPattern
     **/
    @Schema(description = "")
    public String getUserPictureUrlPattern() {
        return userPictureUrlPattern;
    }

    public void setUserPictureUrlPattern(String userPictureUrlPattern) {
        this.userPictureUrlPattern = userPictureUrlPattern;
    }

    public Oauth2authmodule emailVerifiedByDefault(Boolean emailVerifiedByDefault) {
        this.emailVerifiedByDefault = emailVerifiedByDefault;
        return this;
    }

    /**
     * Get emailVerifiedByDefault
     *
     * @return emailVerifiedByDefault
     **/
    @Schema(description = "")
    public Boolean isEmailVerifiedByDefault() {
        return emailVerifiedByDefault;
    }

    public void setEmailVerifiedByDefault(Boolean emailVerifiedByDefault) {
        this.emailVerifiedByDefault = emailVerifiedByDefault;
    }

    public Oauth2authmodule userGroupsPath(String userGroupsPath) {
        this.userGroupsPath = userGroupsPath;
        return this;
    }

    /**
     * Get userGroupsPath
     *
     * @return userGroupsPath
     **/
    @Schema(description = "")
    public String getUserGroupsPath() {
        return userGroupsPath;
    }

    public void setUserGroupsPath(String userGroupsPath) {
        this.userGroupsPath = userGroupsPath;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Oauth2authmodule oauth2authmodule = (Oauth2authmodule) o;
        return Objects.equals(this.scope, oauth2authmodule.scope) &&
                Objects.equals(this.tokenUrl, oauth2authmodule.tokenUrl) &&
                Objects.equals(this.formClientAuth, oauth2authmodule.formClientAuth) &&
                Objects.equals(this.userInfoUrl, oauth2authmodule.userInfoUrl) &&
                Objects.equals(this.userIdPath, oauth2authmodule.userIdPath) &&
                Objects.equals(this.userEmailUrl, oauth2authmodule.userEmailUrl) &&
                Objects.equals(this.userAvatarUrl, oauth2authmodule.userAvatarUrl) &&
                Objects.equals(this.userEmailPath, oauth2authmodule.userEmailPath) &&
                Objects.equals(this.userEmailVerifiedPath, oauth2authmodule.userEmailVerifiedPath) &&
                Objects.equals(this.userNamePath, oauth2authmodule.userNamePath) &&
                Objects.equals(this.fullNamePath, oauth2authmodule.fullNamePath) &&
                Objects.equals(this.userPictureIdPath, oauth2authmodule.userPictureIdPath) &&
                Objects.equals(this.userPictureUrlPattern, oauth2authmodule.userPictureUrlPattern) &&
                Objects.equals(this.emailVerifiedByDefault, oauth2authmodule.emailVerifiedByDefault) &&
                Objects.equals(this.userGroupsPath, oauth2authmodule.userGroupsPath) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scope, tokenUrl, formClientAuth, userInfoUrl, userIdPath, userEmailUrl, userAvatarUrl, userEmailPath, userEmailVerifiedPath, userNamePath, fullNamePath, userPictureIdPath, userPictureUrlPattern, emailVerifiedByDefault, userGroupsPath, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class Oauth2authmodule {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    scope: " + toIndentedString(scope) + "\n" +
                "    tokenUrl: " + toIndentedString(tokenUrl) + "\n" +
                "    formClientAuth: " + toIndentedString(formClientAuth) + "\n" +
                "    userInfoUrl: " + toIndentedString(userInfoUrl) + "\n" +
                "    userIdPath: " + toIndentedString(userIdPath) + "\n" +
                "    userEmailUrl: " + toIndentedString(userEmailUrl) + "\n" +
                "    userAvatarUrl: " + toIndentedString(userAvatarUrl) + "\n" +
                "    userEmailPath: " + toIndentedString(userEmailPath) + "\n" +
                "    userEmailVerifiedPath: " + toIndentedString(userEmailVerifiedPath) + "\n" +
                "    userNamePath: " + toIndentedString(userNamePath) + "\n" +
                "    fullNamePath: " + toIndentedString(fullNamePath) + "\n" +
                "    userPictureIdPath: " + toIndentedString(userPictureIdPath) + "\n" +
                "    userPictureUrlPattern: " + toIndentedString(userPictureUrlPattern) + "\n" +
                "    emailVerifiedByDefault: " + toIndentedString(emailVerifiedByDefault) + "\n" +
                "    userGroupsPath: " + toIndentedString(userGroupsPath) + "\n" +
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
