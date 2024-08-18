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
 * Ldapauthmodule
 */


public class Ldapauthmodule extends Externalpasswordauthmodule {
    @SerializedName("filter")
    private String filter = null;

    @SerializedName("formatDN")
    private String formatDN = null;

    @SerializedName("emailAttributeName")
    private String emailAttributeName = null;

    @SerializedName("fullNameAttributeName")
    private String fullNameAttributeName = null;

    @SerializedName("userIdAttributeName")
    private String userIdAttributeName = null;

    @SerializedName("VCSNameAttributeName")
    private String vcSNameAttributeName = null;

    @SerializedName("groupsAttributeName")
    private String groupsAttributeName = null;

    @SerializedName("accountExpiresAttributeName")
    private String accountExpiresAttributeName = null;

    @SerializedName("userAccountControlAttributeName")
    private String userAccountControlAttributeName = null;

    @SerializedName("lockoutThresholdAttributeName")
    private String lockoutThresholdAttributeName = null;

    @SerializedName("lockoutTimeAttributeName")
    private String lockoutTimeAttributeName = null;

    @SerializedName("lockoutDurationAttributeName")
    private String lockoutDurationAttributeName = null;

    @SerializedName("bindUserLogin")
    private String bindUserLogin = null;

    @SerializedName("bindUserPassword")
    private String bindUserPassword = null;

    @SerializedName("useBindUser")
    private Boolean useBindUser = null;

    @SerializedName("referralIgnored")
    private Boolean referralIgnored = null;

    @SerializedName("userStatusIgnored")
    private Boolean userStatusIgnored = null;

    @SerializedName("syncInterval")
    private String syncInterval = null;

    public Ldapauthmodule filter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Get filter
     *
     * @return filter
     **/
    @Schema(description = "")
    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public Ldapauthmodule formatDN(String formatDN) {
        this.formatDN = formatDN;
        return this;
    }

    /**
     * Get formatDN
     *
     * @return formatDN
     **/
    @Schema(description = "")
    public String getFormatDN() {
        return formatDN;
    }

    public void setFormatDN(String formatDN) {
        this.formatDN = formatDN;
    }

    public Ldapauthmodule emailAttributeName(String emailAttributeName) {
        this.emailAttributeName = emailAttributeName;
        return this;
    }

    /**
     * Get emailAttributeName
     *
     * @return emailAttributeName
     **/
    @Schema(description = "")
    public String getEmailAttributeName() {
        return emailAttributeName;
    }

    public void setEmailAttributeName(String emailAttributeName) {
        this.emailAttributeName = emailAttributeName;
    }

    public Ldapauthmodule fullNameAttributeName(String fullNameAttributeName) {
        this.fullNameAttributeName = fullNameAttributeName;
        return this;
    }

    /**
     * Get fullNameAttributeName
     *
     * @return fullNameAttributeName
     **/
    @Schema(description = "")
    public String getFullNameAttributeName() {
        return fullNameAttributeName;
    }

    public void setFullNameAttributeName(String fullNameAttributeName) {
        this.fullNameAttributeName = fullNameAttributeName;
    }

    public Ldapauthmodule userIdAttributeName(String userIdAttributeName) {
        this.userIdAttributeName = userIdAttributeName;
        return this;
    }

    /**
     * Get userIdAttributeName
     *
     * @return userIdAttributeName
     **/
    @Schema(description = "")
    public String getUserIdAttributeName() {
        return userIdAttributeName;
    }

    public void setUserIdAttributeName(String userIdAttributeName) {
        this.userIdAttributeName = userIdAttributeName;
    }

    public Ldapauthmodule vcSNameAttributeName(String vcSNameAttributeName) {
        this.vcSNameAttributeName = vcSNameAttributeName;
        return this;
    }

    /**
     * Get vcSNameAttributeName
     *
     * @return vcSNameAttributeName
     **/
    @Schema(description = "")
    public String getVcSNameAttributeName() {
        return vcSNameAttributeName;
    }

    public void setVcSNameAttributeName(String vcSNameAttributeName) {
        this.vcSNameAttributeName = vcSNameAttributeName;
    }

    public Ldapauthmodule groupsAttributeName(String groupsAttributeName) {
        this.groupsAttributeName = groupsAttributeName;
        return this;
    }

    /**
     * Get groupsAttributeName
     *
     * @return groupsAttributeName
     **/
    @Schema(description = "")
    public String getGroupsAttributeName() {
        return groupsAttributeName;
    }

    public void setGroupsAttributeName(String groupsAttributeName) {
        this.groupsAttributeName = groupsAttributeName;
    }

    public Ldapauthmodule accountExpiresAttributeName(String accountExpiresAttributeName) {
        this.accountExpiresAttributeName = accountExpiresAttributeName;
        return this;
    }

    /**
     * Get accountExpiresAttributeName
     *
     * @return accountExpiresAttributeName
     **/
    @Schema(description = "")
    public String getAccountExpiresAttributeName() {
        return accountExpiresAttributeName;
    }

    public void setAccountExpiresAttributeName(String accountExpiresAttributeName) {
        this.accountExpiresAttributeName = accountExpiresAttributeName;
    }

    public Ldapauthmodule userAccountControlAttributeName(String userAccountControlAttributeName) {
        this.userAccountControlAttributeName = userAccountControlAttributeName;
        return this;
    }

    /**
     * Get userAccountControlAttributeName
     *
     * @return userAccountControlAttributeName
     **/
    @Schema(description = "")
    public String getUserAccountControlAttributeName() {
        return userAccountControlAttributeName;
    }

    public void setUserAccountControlAttributeName(String userAccountControlAttributeName) {
        this.userAccountControlAttributeName = userAccountControlAttributeName;
    }

    public Ldapauthmodule lockoutThresholdAttributeName(String lockoutThresholdAttributeName) {
        this.lockoutThresholdAttributeName = lockoutThresholdAttributeName;
        return this;
    }

    /**
     * Get lockoutThresholdAttributeName
     *
     * @return lockoutThresholdAttributeName
     **/
    @Schema(description = "")
    public String getLockoutThresholdAttributeName() {
        return lockoutThresholdAttributeName;
    }

    public void setLockoutThresholdAttributeName(String lockoutThresholdAttributeName) {
        this.lockoutThresholdAttributeName = lockoutThresholdAttributeName;
    }

    public Ldapauthmodule lockoutTimeAttributeName(String lockoutTimeAttributeName) {
        this.lockoutTimeAttributeName = lockoutTimeAttributeName;
        return this;
    }

    /**
     * Get lockoutTimeAttributeName
     *
     * @return lockoutTimeAttributeName
     **/
    @Schema(description = "")
    public String getLockoutTimeAttributeName() {
        return lockoutTimeAttributeName;
    }

    public void setLockoutTimeAttributeName(String lockoutTimeAttributeName) {
        this.lockoutTimeAttributeName = lockoutTimeAttributeName;
    }

    public Ldapauthmodule lockoutDurationAttributeName(String lockoutDurationAttributeName) {
        this.lockoutDurationAttributeName = lockoutDurationAttributeName;
        return this;
    }

    /**
     * Get lockoutDurationAttributeName
     *
     * @return lockoutDurationAttributeName
     **/
    @Schema(description = "")
    public String getLockoutDurationAttributeName() {
        return lockoutDurationAttributeName;
    }

    public void setLockoutDurationAttributeName(String lockoutDurationAttributeName) {
        this.lockoutDurationAttributeName = lockoutDurationAttributeName;
    }

    public Ldapauthmodule bindUserLogin(String bindUserLogin) {
        this.bindUserLogin = bindUserLogin;
        return this;
    }

    /**
     * Get bindUserLogin
     *
     * @return bindUserLogin
     **/
    @Schema(description = "")
    public String getBindUserLogin() {
        return bindUserLogin;
    }

    public void setBindUserLogin(String bindUserLogin) {
        this.bindUserLogin = bindUserLogin;
    }

    public Ldapauthmodule bindUserPassword(String bindUserPassword) {
        this.bindUserPassword = bindUserPassword;
        return this;
    }

    /**
     * Get bindUserPassword
     *
     * @return bindUserPassword
     **/
    @Schema(description = "")
    public String getBindUserPassword() {
        return bindUserPassword;
    }

    public void setBindUserPassword(String bindUserPassword) {
        this.bindUserPassword = bindUserPassword;
    }

    public Ldapauthmodule useBindUser(Boolean useBindUser) {
        this.useBindUser = useBindUser;
        return this;
    }

    /**
     * Get useBindUser
     *
     * @return useBindUser
     **/
    @Schema(description = "")
    public Boolean isUseBindUser() {
        return useBindUser;
    }

    public void setUseBindUser(Boolean useBindUser) {
        this.useBindUser = useBindUser;
    }

    public Ldapauthmodule referralIgnored(Boolean referralIgnored) {
        this.referralIgnored = referralIgnored;
        return this;
    }

    /**
     * Get referralIgnored
     *
     * @return referralIgnored
     **/
    @Schema(description = "")
    public Boolean isReferralIgnored() {
        return referralIgnored;
    }

    public void setReferralIgnored(Boolean referralIgnored) {
        this.referralIgnored = referralIgnored;
    }

    public Ldapauthmodule userStatusIgnored(Boolean userStatusIgnored) {
        this.userStatusIgnored = userStatusIgnored;
        return this;
    }

    /**
     * Get userStatusIgnored
     *
     * @return userStatusIgnored
     **/
    @Schema(description = "")
    public Boolean isUserStatusIgnored() {
        return userStatusIgnored;
    }

    public void setUserStatusIgnored(Boolean userStatusIgnored) {
        this.userStatusIgnored = userStatusIgnored;
    }

    public Ldapauthmodule syncInterval(String syncInterval) {
        this.syncInterval = syncInterval;
        return this;
    }

    /**
     * Get syncInterval
     *
     * @return syncInterval
     **/
    @Schema(description = "")
    public String getSyncInterval() {
        return syncInterval;
    }

    public void setSyncInterval(String syncInterval) {
        this.syncInterval = syncInterval;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Ldapauthmodule ldapauthmodule = (Ldapauthmodule) o;
        return Objects.equals(this.filter, ldapauthmodule.filter) &&
                Objects.equals(this.formatDN, ldapauthmodule.formatDN) &&
                Objects.equals(this.emailAttributeName, ldapauthmodule.emailAttributeName) &&
                Objects.equals(this.fullNameAttributeName, ldapauthmodule.fullNameAttributeName) &&
                Objects.equals(this.userIdAttributeName, ldapauthmodule.userIdAttributeName) &&
                Objects.equals(this.vcSNameAttributeName, ldapauthmodule.vcSNameAttributeName) &&
                Objects.equals(this.groupsAttributeName, ldapauthmodule.groupsAttributeName) &&
                Objects.equals(this.accountExpiresAttributeName, ldapauthmodule.accountExpiresAttributeName) &&
                Objects.equals(this.userAccountControlAttributeName, ldapauthmodule.userAccountControlAttributeName) &&
                Objects.equals(this.lockoutThresholdAttributeName, ldapauthmodule.lockoutThresholdAttributeName) &&
                Objects.equals(this.lockoutTimeAttributeName, ldapauthmodule.lockoutTimeAttributeName) &&
                Objects.equals(this.lockoutDurationAttributeName, ldapauthmodule.lockoutDurationAttributeName) &&
                Objects.equals(this.bindUserLogin, ldapauthmodule.bindUserLogin) &&
                Objects.equals(this.bindUserPassword, ldapauthmodule.bindUserPassword) &&
                Objects.equals(this.useBindUser, ldapauthmodule.useBindUser) &&
                Objects.equals(this.referralIgnored, ldapauthmodule.referralIgnored) &&
                Objects.equals(this.userStatusIgnored, ldapauthmodule.userStatusIgnored) &&
                Objects.equals(this.syncInterval, ldapauthmodule.syncInterval) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filter, formatDN, emailAttributeName, fullNameAttributeName, userIdAttributeName, vcSNameAttributeName, groupsAttributeName, accountExpiresAttributeName, userAccountControlAttributeName, lockoutThresholdAttributeName, lockoutTimeAttributeName, lockoutDurationAttributeName, bindUserLogin, bindUserPassword, useBindUser, referralIgnored, userStatusIgnored, syncInterval, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class Ldapauthmodule {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    filter: " + toIndentedString(filter) + "\n" +
                "    formatDN: " + toIndentedString(formatDN) + "\n" +
                "    emailAttributeName: " + toIndentedString(emailAttributeName) + "\n" +
                "    fullNameAttributeName: " + toIndentedString(fullNameAttributeName) + "\n" +
                "    userIdAttributeName: " + toIndentedString(userIdAttributeName) + "\n" +
                "    vcSNameAttributeName: " + toIndentedString(vcSNameAttributeName) + "\n" +
                "    groupsAttributeName: " + toIndentedString(groupsAttributeName) + "\n" +
                "    accountExpiresAttributeName: " + toIndentedString(accountExpiresAttributeName) + "\n" +
                "    userAccountControlAttributeName: " + toIndentedString(userAccountControlAttributeName) + "\n" +
                "    lockoutThresholdAttributeName: " + toIndentedString(lockoutThresholdAttributeName) + "\n" +
                "    lockoutTimeAttributeName: " + toIndentedString(lockoutTimeAttributeName) + "\n" +
                "    lockoutDurationAttributeName: " + toIndentedString(lockoutDurationAttributeName) + "\n" +
                "    bindUserLogin: " + toIndentedString(bindUserLogin) + "\n" +
                "    bindUserPassword: " + toIndentedString(bindUserPassword) + "\n" +
                "    useBindUser: " + toIndentedString(useBindUser) + "\n" +
                "    referralIgnored: " + toIndentedString(referralIgnored) + "\n" +
                "    userStatusIgnored: " + toIndentedString(userStatusIgnored) + "\n" +
                "    syncInterval: " + toIndentedString(syncInterval) + "\n" +
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
