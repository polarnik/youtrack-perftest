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
 * Represents a user who subscribed for notifications about an issue.
 */
@Schema(description = "Represents a user who subscribed for notifications about an issue.")


public class IssueWatcher {
    @SerializedName("id")
    private final String id = null;

    @SerializedName("user")
    private User user = null;

    @SerializedName("issue")
    private Issue issue = null;

    @SerializedName("isStarred")
    private Boolean isStarred = null;

    @SerializedName("$type")
    private String $type = null;

    public IssueWatcher() {
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

    public IssueWatcher user(User user) {
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

    public IssueWatcher issue(Issue issue) {
        this.issue = issue;
        return this;
    }

    /**
     * Get issue
     *
     * @return issue
     **/
    @Schema(description = "")
    public Issue getIssue() {
        return issue;
    }

    public void setIssue(Issue issue) {
        this.issue = issue;
    }

    public IssueWatcher isStarred(Boolean isStarred) {
        this.isStarred = isStarred;
        return this;
    }

    /**
     * Get isStarred
     *
     * @return isStarred
     **/
    @Schema(description = "")
    public Boolean isIsStarred() {
        return isStarred;
    }

    public void setIsStarred(Boolean isStarred) {
        this.isStarred = isStarred;
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
        IssueWatcher issueWatcher = (IssueWatcher) o;
        return Objects.equals(this.id, issueWatcher.id) &&
                Objects.equals(this.user, issueWatcher.user) &&
                Objects.equals(this.issue, issueWatcher.issue) &&
                Objects.equals(this.isStarred, issueWatcher.isStarred) &&
                Objects.equals(this.$type, issueWatcher.$type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, issue, isStarred, $type);
    }


    @Override
    public String toString() {

        String sb = "class IssueWatcher {\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    user: " + toIndentedString(user) + "\n" +
                "    issue: " + toIndentedString(issue) + "\n" +
                "    isStarred: " + toIndentedString(isStarred) + "\n" +
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
