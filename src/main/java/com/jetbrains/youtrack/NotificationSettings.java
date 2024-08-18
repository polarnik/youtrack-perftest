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
 * NotificationSettings
 */


public class NotificationSettings {
    @SerializedName("id")
    private final String id = null;

    @SerializedName("emailSettings")
    private EmailSettings emailSettings = null;

    @SerializedName("$type")
    private String $type = null;

    public NotificationSettings() {
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

    public NotificationSettings emailSettings(EmailSettings emailSettings) {
        this.emailSettings = emailSettings;
        return this;
    }

    /**
     * Get emailSettings
     *
     * @return emailSettings
     **/
    @Schema(description = "")
    public EmailSettings getEmailSettings() {
        return emailSettings;
    }

    public void setEmailSettings(EmailSettings emailSettings) {
        this.emailSettings = emailSettings;
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
        NotificationSettings notificationSettings = (NotificationSettings) o;
        return Objects.equals(this.id, notificationSettings.id) &&
                Objects.equals(this.emailSettings, notificationSettings.emailSettings) &&
                Objects.equals(this.$type, notificationSettings.$type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, emailSettings, $type);
    }


    @Override
    public String toString() {

        String sb = "class NotificationSettings {\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    emailSettings: " + toIndentedString(emailSettings) + "\n" +
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
