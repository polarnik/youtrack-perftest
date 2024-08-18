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
 * Represents a Gitea server.
 */
@Schema(description = "Represents a Gitea server.")


public class GiteaServer extends VcsHostingServer {
    @SerializedName("id")
    private final String giteaServerId = null;

    @SerializedName("url")
    private String giteaServerUrl = null;

    /**
     * Get giteaServerId
     *
     * @return giteaServerId
     **/
    @Schema(description = "")
    public String getGiteaServerId() {
        return giteaServerId;
    }

    public GiteaServer giteaServerUrl(String giteaServerUrl) {
        this.giteaServerUrl = giteaServerUrl;
        return this;
    }

    /**
     * Get giteaServerUrl
     *
     * @return giteaServerUrl
     **/
    @Schema(description = "")
    public String getGiteaServerUrl() {
        return giteaServerUrl;
    }

    public void setGiteaServerUrl(String giteaServerUrl) {
        this.giteaServerUrl = giteaServerUrl;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GiteaServer giteaServer = (GiteaServer) o;
        return Objects.equals(this.giteaServerId, giteaServer.giteaServerId) &&
                Objects.equals(this.giteaServerUrl, giteaServer.giteaServerUrl) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(giteaServerId, giteaServerUrl, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class GiteaServer {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    giteaServerId: " + toIndentedString(giteaServerId) + "\n" +
                "    giteaServerUrl: " + toIndentedString(giteaServerUrl) + "\n" +
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
