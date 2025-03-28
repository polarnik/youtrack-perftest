/*
 * YouTrack REST API
 * YouTrack issue tracking and project management system
 *
 * OpenAPI spec version: 2024.2
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.jetbrains.youtrack;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.Objects;

/**
 * BackupStatus
 */


public class BackupStatus {
    @SerializedName("id")
    private final String id = null;

    @SerializedName("backupInProgress")
    private final Boolean backupInProgress = null;

    @SerializedName("backupCancelled")
    private final Boolean backupCancelled = null;

    @SerializedName("backupError")
    private BackupError backupError = null;

    @SerializedName("$type")
    private String $type = null;

    public BackupStatus() {
        this.$type = this.getClass().getSimpleName();
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

    /**
     * Get backupInProgress
     *
     * @return backupInProgress
     **/
    @Schema(description = "")
    public Boolean isBackupInProgress() {
        return backupInProgress;
    }

    /**
     * Get backupCancelled
     *
     * @return backupCancelled
     **/
    @Schema(description = "")
    public Boolean isBackupCancelled() {
        return backupCancelled;
    }

    public BackupStatus backupError(BackupError backupError) {
        this.backupError = backupError;
        return this;
    }

    /**
     * Get backupError
     *
     * @return backupError
     **/
    @Schema(description = "")
    public BackupError getBackupError() {
        return backupError;
    }

    public void setBackupError(BackupError backupError) {
        this.backupError = backupError;
    }

    /**
     * Get $type
     *
     * @return $type
     **/
    @Schema(description = "")
    public String get$Type() {
        return $type;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BackupStatus backupStatus = (BackupStatus) o;
        return Objects.equals(this.id, backupStatus.id) &&
                Objects.equals(this.backupInProgress, backupStatus.backupInProgress) &&
                Objects.equals(this.backupCancelled, backupStatus.backupCancelled) &&
                Objects.equals(this.backupError, backupStatus.backupError) &&
                Objects.equals(this.$type, backupStatus.$type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, backupInProgress, backupCancelled, backupError, $type);
    }


    @Override
    public String toString() {

        String sb = "class BackupStatus {\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    backupInProgress: " + toIndentedString(backupInProgress) + "\n" +
                "    backupCancelled: " + toIndentedString(backupCancelled) + "\n" +
                "    backupError: " + toIndentedString(backupError) + "\n" +
                "    $type: " + toIndentedString($type) + "\n" +
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
