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
 * Details
 */


public class Details {
    @SerializedName("type")
    protected String type = null;
    @SerializedName("id")
    private String id = null;
    @SerializedName("aliases")
    private List<Alias> aliases = null;
    @SerializedName("email")
    private Email email = null;
    @SerializedName("authModule")
    private Authmodule authModule = null;
    @SerializedName("authModuleName")
    private String authModuleName = null;
    @SerializedName("user")
    private User user = null;
    @SerializedName("lastAccessTime")
    private Long lastAccessTime = null;
    @SerializedName("lastAccessAddress")
    private String lastAccessAddress = null;
    @SerializedName("lastAccessUserAgent")
    private String lastAccessUserAgent = null;

    public Details() {
        this.type = this.getClass().getSimpleName();
    }

    public Details id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @Schema(description = "")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Details aliases(List<Alias> aliases) {
        this.aliases = aliases;
        return this;
    }

    public Details addAliasesItem(Alias aliasesItem) {
        if (this.aliases == null) {
            this.aliases = new ArrayList<Alias>();
        }
        this.aliases.add(aliasesItem);
        return this;
    }

    /**
     * Get aliases
     *
     * @return aliases
     **/
    @Schema(description = "")
    public List<Alias> getAliases() {
        return aliases;
    }

    public void setAliases(List<Alias> aliases) {
        this.aliases = aliases;
    }

    public Details email(Email email) {
        this.email = email;
        return this;
    }

    /**
     * Get email
     *
     * @return email
     **/
    @Schema(description = "")
    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public Details authModule(Authmodule authModule) {
        this.authModule = authModule;
        return this;
    }

    /**
     * Get authModule
     *
     * @return authModule
     **/
    @Schema(description = "")
    public Authmodule getAuthModule() {
        return authModule;
    }

    public void setAuthModule(Authmodule authModule) {
        this.authModule = authModule;
    }

    public Details authModuleName(String authModuleName) {
        this.authModuleName = authModuleName;
        return this;
    }

    /**
     * Get authModuleName
     *
     * @return authModuleName
     **/
    @Schema(description = "")
    public String getAuthModuleName() {
        return authModuleName;
    }

    public void setAuthModuleName(String authModuleName) {
        this.authModuleName = authModuleName;
    }

    public Details user(User user) {
        this.user = user;
        return this;
    }

    /**
     * Get user
     *
     * @return user
     **/
    @Schema(description = "")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Details lastAccessTime(Long lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
        return this;
    }

    /**
     * Get lastAccessTime
     *
     * @return lastAccessTime
     **/
    @Schema(description = "")
    public Long getLastAccessTime() {
        return lastAccessTime;
    }

    public void setLastAccessTime(Long lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    public Details lastAccessAddress(String lastAccessAddress) {
        this.lastAccessAddress = lastAccessAddress;
        return this;
    }

    /**
     * Get lastAccessAddress
     *
     * @return lastAccessAddress
     **/
    @Schema(description = "")
    public String getLastAccessAddress() {
        return lastAccessAddress;
    }

    public void setLastAccessAddress(String lastAccessAddress) {
        this.lastAccessAddress = lastAccessAddress;
    }

    public Details lastAccessUserAgent(String lastAccessUserAgent) {
        this.lastAccessUserAgent = lastAccessUserAgent;
        return this;
    }

    /**
     * Get lastAccessUserAgent
     *
     * @return lastAccessUserAgent
     **/
    @Schema(description = "")
    public String getLastAccessUserAgent() {
        return lastAccessUserAgent;
    }

    public void setLastAccessUserAgent(String lastAccessUserAgent) {
        this.lastAccessUserAgent = lastAccessUserAgent;
    }

    public Details type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     **/
    @Schema(required = true, description = "")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Details details = (Details) o;
        return Objects.equals(this.id, details.id) &&
                Objects.equals(this.aliases, details.aliases) &&
                Objects.equals(this.email, details.email) &&
                Objects.equals(this.authModule, details.authModule) &&
                Objects.equals(this.authModuleName, details.authModuleName) &&
                Objects.equals(this.user, details.user) &&
                Objects.equals(this.lastAccessTime, details.lastAccessTime) &&
                Objects.equals(this.lastAccessAddress, details.lastAccessAddress) &&
                Objects.equals(this.lastAccessUserAgent, details.lastAccessUserAgent) &&
                Objects.equals(this.type, details.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, aliases, email, authModule, authModuleName, user, lastAccessTime, lastAccessAddress, lastAccessUserAgent, type);
    }


    @Override
    public String toString() {

        String sb = "class Details {\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    aliases: " + toIndentedString(aliases) + "\n" +
                "    email: " + toIndentedString(email) + "\n" +
                "    authModule: " + toIndentedString(authModule) + "\n" +
                "    authModuleName: " + toIndentedString(authModuleName) + "\n" +
                "    user: " + toIndentedString(user) + "\n" +
                "    lastAccessTime: " + toIndentedString(lastAccessTime) + "\n" +
                "    lastAccessAddress: " + toIndentedString(lastAccessAddress) + "\n" +
                "    lastAccessUserAgent: " + toIndentedString(lastAccessUserAgent) + "\n" +
                "    type: " + toIndentedString(type) + "\n" +
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
