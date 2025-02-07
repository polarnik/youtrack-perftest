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
 * VersionBundleElement
 */


public class VersionBundleElement extends BundleElement {
    @SerializedName("id")
    private final String versionBundleElementId = null;

    @SerializedName("archived")
    private Boolean versionBundleElementArchived = null;

    @SerializedName("released")
    private Boolean released = null;

    @SerializedName("releaseDate")
    private Long releaseDate = null;

    @SerializedName("startDate")
    private Long startDate = null;

    /**
     * Get versionBundleElementId
     *
     * @return versionBundleElementId
     **/
    @Schema(description = "")
    public String getVersionBundleElementId() {
        return versionBundleElementId;
    }

    public VersionBundleElement versionBundleElementArchived(Boolean versionBundleElementArchived) {
        this.versionBundleElementArchived = versionBundleElementArchived;
        return this;
    }

    /**
     * Get versionBundleElementArchived
     *
     * @return versionBundleElementArchived
     **/
    @Schema(description = "")
    public Boolean getVersionBundleElementArchived() {
        return versionBundleElementArchived;
    }

    public void setVersionBundleElementArchived(Boolean versionBundleElementArchived) {
        this.versionBundleElementArchived = versionBundleElementArchived;
    }

    public VersionBundleElement released(Boolean released) {
        this.released = released;
        return this;
    }

    /**
     * Get released
     *
     * @return released
     **/
    @Schema(description = "")
    public Boolean isReleased() {
        return released;
    }

    public void setReleased(Boolean released) {
        this.released = released;
    }

    public VersionBundleElement releaseDate(Long releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    /**
     * Get releaseDate
     *
     * @return releaseDate
     **/
    @Schema(description = "")
    public Long getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Long releaseDate) {
        this.releaseDate = releaseDate;
    }

    public VersionBundleElement startDate(Long startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Get startDate
     *
     * @return startDate
     **/
    @Schema(description = "")
    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VersionBundleElement versionBundleElement = (VersionBundleElement) o;
        return Objects.equals(this.versionBundleElementId, versionBundleElement.versionBundleElementId) &&
                Objects.equals(this.versionBundleElementArchived, versionBundleElement.versionBundleElementArchived) &&
                Objects.equals(this.released, versionBundleElement.released) &&
                Objects.equals(this.releaseDate, versionBundleElement.releaseDate) &&
                Objects.equals(this.startDate, versionBundleElement.startDate) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versionBundleElementId, versionBundleElementArchived, released, releaseDate, startDate, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class VersionBundleElement {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    versionBundleElementId: " + toIndentedString(versionBundleElementId) + "\n" +
                "    versionBundleElementArchived: " + toIndentedString(versionBundleElementArchived) + "\n" +
                "    released: " + toIndentedString(released) + "\n" +
                "    releaseDate: " + toIndentedString(releaseDate) + "\n" +
                "    startDate: " + toIndentedString(startDate) + "\n" +
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
