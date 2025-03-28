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
 * Represents a Jenkins server.
 */
@Schema(description = "Represents a Jenkins server.")


public class JenkinsServer extends VcsServer {
    @SerializedName("id")
    private final String jenkinsServerId = null;

    @SerializedName("url")
    private String jenkinsServerUrl = null;

    /**
     * Get jenkinsServerId
     *
     * @return jenkinsServerId
     **/
    @Schema(description = "")
    public String getJenkinsServerId() {
        return jenkinsServerId;
    }

    public JenkinsServer jenkinsServerUrl(String jenkinsServerUrl) {
        this.jenkinsServerUrl = jenkinsServerUrl;
        return this;
    }

    /**
     * Get jenkinsServerUrl
     *
     * @return jenkinsServerUrl
     **/
    @Schema(description = "")
    public String getJenkinsServerUrl() {
        return jenkinsServerUrl;
    }

    public void setJenkinsServerUrl(String jenkinsServerUrl) {
        this.jenkinsServerUrl = jenkinsServerUrl;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JenkinsServer jenkinsServer = (JenkinsServer) o;
        return Objects.equals(this.jenkinsServerId, jenkinsServer.jenkinsServerId) &&
                Objects.equals(this.jenkinsServerUrl, jenkinsServer.jenkinsServerUrl) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jenkinsServerId, jenkinsServerUrl, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class JenkinsServer {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    jenkinsServerId: " + toIndentedString(jenkinsServerId) + "\n" +
                "    jenkinsServerUrl: " + toIndentedString(jenkinsServerUrl) + "\n" +
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
