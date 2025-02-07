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
 * The basic entity that represents a VCS server.
 */
@Schema(description = "The basic entity that represents a VCS server.")


public class VcsHostingServer extends VcsServer {
    @SerializedName("id")
    private final String vcsHostingServerId = null;

    @SerializedName("url")
    private String vcsHostingServerUrl = null;

    /**
     * Get vcsHostingServerId
     *
     * @return vcsHostingServerId
     **/
    @Schema(description = "")
    public String getVcsHostingServerId() {
        return vcsHostingServerId;
    }

    public VcsHostingServer vcsHostingServerUrl(String vcsHostingServerUrl) {
        this.vcsHostingServerUrl = vcsHostingServerUrl;
        return this;
    }

    /**
     * Get vcsHostingServerUrl
     *
     * @return vcsHostingServerUrl
     **/
    @Schema(description = "")
    public String getVcsHostingServerUrl() {
        return vcsHostingServerUrl;
    }

    public void setVcsHostingServerUrl(String vcsHostingServerUrl) {
        this.vcsHostingServerUrl = vcsHostingServerUrl;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VcsHostingServer vcsHostingServer = (VcsHostingServer) o;
        return Objects.equals(this.vcsHostingServerId, vcsHostingServer.vcsHostingServerId) &&
                Objects.equals(this.vcsHostingServerUrl, vcsHostingServer.vcsHostingServerUrl) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vcsHostingServerId, vcsHostingServerUrl, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class VcsHostingServer {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    vcsHostingServerId: " + toIndentedString(vcsHostingServerId) + "\n" +
                "    vcsHostingServerUrl: " + toIndentedString(vcsHostingServerUrl) + "\n" +
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
