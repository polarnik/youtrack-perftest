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
 * Sprint
 */


public class Sprint {
    @SerializedName("id")
    private final String id = null;

    @SerializedName("agile")
    private Agile agile = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("goal")
    private String goal = null;

    @SerializedName("start")
    private Long start = null;

    @SerializedName("finish")
    private Long finish = null;

    @SerializedName("archived")
    private Boolean archived = null;

    @SerializedName("isDefault")
    private Boolean isDefault = null;

    @SerializedName("issues")
    private List<Issue> issues = null;

    @SerializedName("unresolvedIssuesCount")
    private final Integer unresolvedIssuesCount = null;

    @SerializedName("previousSprint")
    private Sprint previousSprint = null;

    @SerializedName("$type")
    private String $type = null;

    public Sprint() {
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

    public Sprint agile(Agile agile) {
        this.agile = agile;
        return this;
    }

    /**
     * Get agile
     *
     * @return agile
     **/
    @Schema(description = "")
    public Agile getAgile() {
        return agile;
    }

    public void setAgile(Agile agile) {
        this.agile = agile;
    }

    public Sprint name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/
    @Schema(description = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sprint goal(String goal) {
        this.goal = goal;
        return this;
    }

    /**
     * Get goal
     *
     * @return goal
     **/
    @Schema(description = "")
    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public Sprint start(Long start) {
        this.start = start;
        return this;
    }

    /**
     * Get start
     *
     * @return start
     **/
    @Schema(description = "")
    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public Sprint finish(Long finish) {
        this.finish = finish;
        return this;
    }

    /**
     * Get finish
     *
     * @return finish
     **/
    @Schema(description = "")
    public Long getFinish() {
        return finish;
    }

    public void setFinish(Long finish) {
        this.finish = finish;
    }

    public Sprint archived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    /**
     * Get archived
     *
     * @return archived
     **/
    @Schema(description = "")
    public Boolean isArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public Sprint isDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * Get isDefault
     *
     * @return isDefault
     **/
    @Schema(description = "")
    public Boolean isIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public Sprint issues(List<Issue> issues) {
        this.issues = issues;
        return this;
    }

    public Sprint addIssuesItem(Issue issuesItem) {
        if (this.issues == null) {
            this.issues = new ArrayList<Issue>();
        }
        this.issues.add(issuesItem);
        return this;
    }

    /**
     * Get issues
     *
     * @return issues
     **/
    @Schema(description = "")
    public List<Issue> getIssues() {
        return issues;
    }

    public void setIssues(List<Issue> issues) {
        this.issues = issues;
    }

    /**
     * Get unresolvedIssuesCount
     *
     * @return unresolvedIssuesCount
     **/
    @Schema(description = "")
    public Integer getUnresolvedIssuesCount() {
        return unresolvedIssuesCount;
    }

    public Sprint previousSprint(Sprint previousSprint) {
        this.previousSprint = previousSprint;
        return this;
    }

    /**
     * Get previousSprint
     *
     * @return previousSprint
     **/
    @Schema(description = "")
    public Sprint getPreviousSprint() {
        return previousSprint;
    }

    public void setPreviousSprint(Sprint previousSprint) {
        this.previousSprint = previousSprint;
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
        Sprint sprint = (Sprint) o;
        return Objects.equals(this.id, sprint.id) &&
                Objects.equals(this.agile, sprint.agile) &&
                Objects.equals(this.name, sprint.name) &&
                Objects.equals(this.goal, sprint.goal) &&
                Objects.equals(this.start, sprint.start) &&
                Objects.equals(this.finish, sprint.finish) &&
                Objects.equals(this.archived, sprint.archived) &&
                Objects.equals(this.isDefault, sprint.isDefault) &&
                Objects.equals(this.issues, sprint.issues) &&
                Objects.equals(this.unresolvedIssuesCount, sprint.unresolvedIssuesCount) &&
                Objects.equals(this.previousSprint, sprint.previousSprint) &&
                Objects.equals(this.$type, sprint.$type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, agile, name, goal, start, finish, archived, isDefault, issues, unresolvedIssuesCount, previousSprint, $type);
    }


    @Override
    public String toString() {

        String sb = "class Sprint {\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    agile: " + toIndentedString(agile) + "\n" +
                "    name: " + toIndentedString(name) + "\n" +
                "    goal: " + toIndentedString(goal) + "\n" +
                "    start: " + toIndentedString(start) + "\n" +
                "    finish: " + toIndentedString(finish) + "\n" +
                "    archived: " + toIndentedString(archived) + "\n" +
                "    isDefault: " + toIndentedString(isDefault) + "\n" +
                "    issues: " + toIndentedString(issues) + "\n" +
                "    unresolvedIssuesCount: " + toIndentedString(unresolvedIssuesCount) + "\n" +
                "    previousSprint: " + toIndentedString(previousSprint) + "\n" +
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
