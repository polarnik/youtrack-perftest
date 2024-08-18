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
 * Represents a GitLab integration configured for a project.
 */
@Schema(description = "Represents a GitLab integration configured for a project.")


public class GitLabChangesProcessor extends VcsHostingChangesProcessor {
    @SerializedName("id")
    private final String gitLabChangesProcessorId = null;

    @SerializedName("server")
    private GitLabServer gitLabChangesProcessorServer = null;

    /**
     * Get gitLabChangesProcessorId
     *
     * @return gitLabChangesProcessorId
     **/
    @Schema(description = "")
    public String getGitLabChangesProcessorId() {
        return gitLabChangesProcessorId;
    }

    public GitLabChangesProcessor gitLabChangesProcessorServer(GitLabServer gitLabChangesProcessorServer) {
        this.gitLabChangesProcessorServer = gitLabChangesProcessorServer;
        return this;
    }

    /**
     * Get gitLabChangesProcessorServer
     *
     * @return gitLabChangesProcessorServer
     **/
    @Schema(description = "")
    public GitLabServer getGitLabChangesProcessorServer() {
        return gitLabChangesProcessorServer;
    }

    public void setGitLabChangesProcessorServer(GitLabServer gitLabChangesProcessorServer) {
        this.gitLabChangesProcessorServer = gitLabChangesProcessorServer;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GitLabChangesProcessor gitLabChangesProcessor = (GitLabChangesProcessor) o;
        return Objects.equals(this.gitLabChangesProcessorId, gitLabChangesProcessor.gitLabChangesProcessorId) &&
                Objects.equals(this.gitLabChangesProcessorServer, gitLabChangesProcessor.gitLabChangesProcessorServer) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gitLabChangesProcessorId, gitLabChangesProcessorServer, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class GitLabChangesProcessor {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    gitLabChangesProcessorId: " + toIndentedString(gitLabChangesProcessorId) + "\n" +
                "    gitLabChangesProcessorServer: " + toIndentedString(gitLabChangesProcessorServer) + "\n" +
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
