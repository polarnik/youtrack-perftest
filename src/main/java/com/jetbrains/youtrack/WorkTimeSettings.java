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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * WorkTimeSettings
 */


public class WorkTimeSettings {
    @SerializedName("id")
    private final String id = null;

    @SerializedName("minutesADay")
    private Integer minutesADay = null;

    @SerializedName("workDays")
    private List<Integer> workDays = null;

    @SerializedName("firstDayOfWeek")
    private final Integer firstDayOfWeek = null;

    @SerializedName("daysAWeek")
    private final Integer daysAWeek = null;

    @SerializedName("$type")
    private String $type = null;

    public WorkTimeSettings() {
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

    public WorkTimeSettings minutesADay(Integer minutesADay) {
        this.minutesADay = minutesADay;
        return this;
    }

    /**
     * Get minutesADay
     *
     * @return minutesADay
     **/
    @Schema(description = "")
    public Integer getMinutesADay() {
        return minutesADay;
    }

    public void setMinutesADay(Integer minutesADay) {
        this.minutesADay = minutesADay;
    }

    public WorkTimeSettings workDays(List<Integer> workDays) {
        this.workDays = workDays;
        return this;
    }

    public WorkTimeSettings addWorkDaysItem(Integer workDaysItem) {
        if (this.workDays == null) {
            this.workDays = new ArrayList<Integer>();
        }
        this.workDays.add(workDaysItem);
        return this;
    }

    /**
     * Get workDays
     *
     * @return workDays
     **/
    @Schema(description = "")
    public List<Integer> getWorkDays() {
        return workDays;
    }

    public void setWorkDays(List<Integer> workDays) {
        this.workDays = workDays;
    }

    /**
     * Get firstDayOfWeek
     *
     * @return firstDayOfWeek
     **/
    @Schema(description = "")
    public Integer getFirstDayOfWeek() {
        return firstDayOfWeek;
    }

    /**
     * Get daysAWeek
     *
     * @return daysAWeek
     **/
    @Schema(description = "")
    public Integer getDaysAWeek() {
        return daysAWeek;
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
        WorkTimeSettings workTimeSettings = (WorkTimeSettings) o;
        return Objects.equals(this.id, workTimeSettings.id) &&
                Objects.equals(this.minutesADay, workTimeSettings.minutesADay) &&
                Objects.equals(this.workDays, workTimeSettings.workDays) &&
                Objects.equals(this.firstDayOfWeek, workTimeSettings.firstDayOfWeek) &&
                Objects.equals(this.daysAWeek, workTimeSettings.daysAWeek) &&
                Objects.equals(this.$type, workTimeSettings.$type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, minutesADay, workDays, firstDayOfWeek, daysAWeek, $type);
    }


    @Override
    public String toString() {

        String sb = "class WorkTimeSettings {\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    minutesADay: " + toIndentedString(minutesADay) + "\n" +
                "    workDays: " + toIndentedString(workDays) + "\n" +
                "    firstDayOfWeek: " + toIndentedString(firstDayOfWeek) + "\n" +
                "    daysAWeek: " + toIndentedString(daysAWeek) + "\n" +
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
