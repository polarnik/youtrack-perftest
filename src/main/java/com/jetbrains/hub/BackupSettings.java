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
 * BackupSettings
 */


public class BackupSettings extends Settings {
    @SerializedName("namePrefix")
    private String namePrefix = null;

    @SerializedName("backupFolder")
    private String backupFolder = null;

    @SerializedName("resolvedBackupFolder")
    private String resolvedBackupFolder = null;

    @SerializedName("archiveType")
    private String archiveType = null;

    @SerializedName("status")
    private BackupStatus status = null;

    @SerializedName("databaseReadonly")
    private Boolean databaseReadonly = null;

    @SerializedName("cronExpression")
    private String cronExpression = null;

    @SerializedName("countToKeep")
    private Integer countToKeep = null;

    public BackupSettings namePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
        return this;
    }

    /**
     * Get namePrefix
     *
     * @return namePrefix
     **/
    @Schema(description = "")
    public String getNamePrefix() {
        return namePrefix;
    }

    public void setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
    }

    public BackupSettings backupFolder(String backupFolder) {
        this.backupFolder = backupFolder;
        return this;
    }

    /**
     * Get backupFolder
     *
     * @return backupFolder
     **/
    @Schema(description = "")
    public String getBackupFolder() {
        return backupFolder;
    }

    public void setBackupFolder(String backupFolder) {
        this.backupFolder = backupFolder;
    }

    public BackupSettings resolvedBackupFolder(String resolvedBackupFolder) {
        this.resolvedBackupFolder = resolvedBackupFolder;
        return this;
    }

    /**
     * Get resolvedBackupFolder
     *
     * @return resolvedBackupFolder
     **/
    @Schema(description = "")
    public String getResolvedBackupFolder() {
        return resolvedBackupFolder;
    }

    public void setResolvedBackupFolder(String resolvedBackupFolder) {
        this.resolvedBackupFolder = resolvedBackupFolder;
    }

    public BackupSettings archiveType(String archiveType) {
        this.archiveType = archiveType;
        return this;
    }

    /**
     * Get archiveType
     *
     * @return archiveType
     **/
    @Schema(description = "")
    public String getArchiveType() {
        return archiveType;
    }

    public void setArchiveType(String archiveType) {
        this.archiveType = archiveType;
    }

    public BackupSettings status(BackupStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @Schema(description = "")
    public BackupStatus getStatus() {
        return status;
    }

    public void setStatus(BackupStatus status) {
        this.status = status;
    }

    public BackupSettings databaseReadonly(Boolean databaseReadonly) {
        this.databaseReadonly = databaseReadonly;
        return this;
    }

    /**
     * Get databaseReadonly
     *
     * @return databaseReadonly
     **/
    @Schema(description = "")
    public Boolean isDatabaseReadonly() {
        return databaseReadonly;
    }

    public void setDatabaseReadonly(Boolean databaseReadonly) {
        this.databaseReadonly = databaseReadonly;
    }

    public BackupSettings cronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }

    /**
     * Get cronExpression
     *
     * @return cronExpression
     **/
    @Schema(description = "")
    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public BackupSettings countToKeep(Integer countToKeep) {
        this.countToKeep = countToKeep;
        return this;
    }

    /**
     * Get countToKeep
     *
     * @return countToKeep
     **/
    @Schema(description = "")
    public Integer getCountToKeep() {
        return countToKeep;
    }

    public void setCountToKeep(Integer countToKeep) {
        this.countToKeep = countToKeep;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupSettings backupSettings = (BackupSettings) o;
        return Objects.equals(this.namePrefix, backupSettings.namePrefix) &&
                Objects.equals(this.backupFolder, backupSettings.backupFolder) &&
                Objects.equals(this.resolvedBackupFolder, backupSettings.resolvedBackupFolder) &&
                Objects.equals(this.archiveType, backupSettings.archiveType) &&
                Objects.equals(this.status, backupSettings.status) &&
                Objects.equals(this.databaseReadonly, backupSettings.databaseReadonly) &&
                Objects.equals(this.cronExpression, backupSettings.cronExpression) &&
                Objects.equals(this.countToKeep, backupSettings.countToKeep) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namePrefix, backupFolder, resolvedBackupFolder, archiveType, status, databaseReadonly, cronExpression, countToKeep, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class BackupSettings {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    namePrefix: " + toIndentedString(namePrefix) + "\n" +
                "    backupFolder: " + toIndentedString(backupFolder) + "\n" +
                "    resolvedBackupFolder: " + toIndentedString(resolvedBackupFolder) + "\n" +
                "    archiveType: " + toIndentedString(archiveType) + "\n" +
                "    status: " + toIndentedString(status) + "\n" +
                "    databaseReadonly: " + toIndentedString(databaseReadonly) + "\n" +
                "    cronExpression: " + toIndentedString(cronExpression) + "\n" +
                "    countToKeep: " + toIndentedString(countToKeep) + "\n" +
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
