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
 * SettingsPage
 */


public class SettingsPage extends BasePage {
    @SerializedName("settings")
    private List<Settings> settings = null;

    public SettingsPage settings(List<Settings> settings) {
        this.settings = settings;
        return this;
    }

    public SettingsPage addSettingsItem(Settings settingsItem) {
        if (this.settings == null) {
            this.settings = new ArrayList<Settings>();
        }
        this.settings.add(settingsItem);
        return this;
    }

    /**
     * Get settings
     *
     * @return settings
     **/
    @Schema(description = "")
    public List<Settings> getSettings() {
        return settings;
    }

    public void setSettings(List<Settings> settings) {
        this.settings = settings;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SettingsPage settingsPage = (SettingsPage) o;
        return Objects.equals(this.settings, settingsPage.settings) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(settings, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class SettingsPage {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    settings: " + toIndentedString(settings) + "\n" +
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
