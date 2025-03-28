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
 * DashboardImportResult
 */


public class DashboardImportResult {
    @SerializedName("success")
    private Boolean success = null;

    @SerializedName("events")
    private List<DashboardImportEvent> events = null;

    @SerializedName("missing")
    private List<DashboardImportMissingEntity> missing = null;

    public DashboardImportResult success(Boolean success) {
        this.success = success;
        return this;
    }

    /**
     * Get success
     *
     * @return success
     **/
    @Schema(description = "")
    public Boolean isSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public DashboardImportResult events(List<DashboardImportEvent> events) {
        this.events = events;
        return this;
    }

    public DashboardImportResult addEventsItem(DashboardImportEvent eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<DashboardImportEvent>();
        }
        this.events.add(eventsItem);
        return this;
    }

    /**
     * Get events
     *
     * @return events
     **/
    @Schema(description = "")
    public List<DashboardImportEvent> getEvents() {
        return events;
    }

    public void setEvents(List<DashboardImportEvent> events) {
        this.events = events;
    }

    public DashboardImportResult missing(List<DashboardImportMissingEntity> missing) {
        this.missing = missing;
        return this;
    }

    public DashboardImportResult addMissingItem(DashboardImportMissingEntity missingItem) {
        if (this.missing == null) {
            this.missing = new ArrayList<DashboardImportMissingEntity>();
        }
        this.missing.add(missingItem);
        return this;
    }

    /**
     * Get missing
     *
     * @return missing
     **/
    @Schema(description = "")
    public List<DashboardImportMissingEntity> getMissing() {
        return missing;
    }

    public void setMissing(List<DashboardImportMissingEntity> missing) {
        this.missing = missing;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DashboardImportResult dashboardImportResult = (DashboardImportResult) o;
        return Objects.equals(this.success, dashboardImportResult.success) &&
                Objects.equals(this.events, dashboardImportResult.events) &&
                Objects.equals(this.missing, dashboardImportResult.missing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(success, events, missing);
    }


    @Override
    public String toString() {

        String sb = "class DashboardImportResult {\n" +
                "    success: " + toIndentedString(success) + "\n" +
                "    events: " + toIndentedString(events) + "\n" +
                "    missing: " + toIndentedString(missing) + "\n" +
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
