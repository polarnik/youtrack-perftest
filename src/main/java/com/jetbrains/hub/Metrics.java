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
 * Metrics
 */


public class Metrics {
    @SerializedName("id")
    private String id = null;

    @SerializedName("aliases")
    private List<Alias> aliases = null;

    @SerializedName("availableProcessors")
    private Integer availableProcessors = null;

    @SerializedName("memory")
    private Memory memory = null;

    @SerializedName("database")
    private Database database = null;

    @SerializedName("serverStartTime")
    private Long serverStartTime = null;

    @SerializedName("logsFolder")
    private String logsFolder = null;

    public Metrics id(String id) {
        this.id = id;
        return this;
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

    public void setId(String id) {
        this.id = id;
    }

    public Metrics aliases(List<Alias> aliases) {
        this.aliases = aliases;
        return this;
    }

    public Metrics addAliasesItem(Alias aliasesItem) {
        if (this.aliases == null) {
            this.aliases = new ArrayList<Alias>();
        }
        this.aliases.add(aliasesItem);
        return this;
    }

    /**
     * Get aliases
     *
     * @return aliases
     **/
    @Schema(description = "")
    public List<Alias> getAliases() {
        return aliases;
    }

    public void setAliases(List<Alias> aliases) {
        this.aliases = aliases;
    }

    public Metrics availableProcessors(Integer availableProcessors) {
        this.availableProcessors = availableProcessors;
        return this;
    }

    /**
     * Get availableProcessors
     *
     * @return availableProcessors
     **/
    @Schema(description = "")
    public Integer getAvailableProcessors() {
        return availableProcessors;
    }

    public void setAvailableProcessors(Integer availableProcessors) {
        this.availableProcessors = availableProcessors;
    }

    public Metrics memory(Memory memory) {
        this.memory = memory;
        return this;
    }

    /**
     * Get memory
     *
     * @return memory
     **/
    @Schema(description = "")
    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Metrics database(Database database) {
        this.database = database;
        return this;
    }

    /**
     * Get database
     *
     * @return database
     **/
    @Schema(description = "")
    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }

    public Metrics serverStartTime(Long serverStartTime) {
        this.serverStartTime = serverStartTime;
        return this;
    }

    /**
     * Get serverStartTime
     *
     * @return serverStartTime
     **/
    @Schema(description = "")
    public Long getServerStartTime() {
        return serverStartTime;
    }

    public void setServerStartTime(Long serverStartTime) {
        this.serverStartTime = serverStartTime;
    }

    public Metrics logsFolder(String logsFolder) {
        this.logsFolder = logsFolder;
        return this;
    }

    /**
     * Get logsFolder
     *
     * @return logsFolder
     **/
    @Schema(description = "")
    public String getLogsFolder() {
        return logsFolder;
    }

    public void setLogsFolder(String logsFolder) {
        this.logsFolder = logsFolder;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Metrics metrics = (Metrics) o;
        return Objects.equals(this.id, metrics.id) &&
                Objects.equals(this.aliases, metrics.aliases) &&
                Objects.equals(this.availableProcessors, metrics.availableProcessors) &&
                Objects.equals(this.memory, metrics.memory) &&
                Objects.equals(this.database, metrics.database) &&
                Objects.equals(this.serverStartTime, metrics.serverStartTime) &&
                Objects.equals(this.logsFolder, metrics.logsFolder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, aliases, availableProcessors, memory, database, serverStartTime, logsFolder);
    }


    @Override
    public String toString() {

        String sb = "class Metrics {\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    aliases: " + toIndentedString(aliases) + "\n" +
                "    availableProcessors: " + toIndentedString(availableProcessors) + "\n" +
                "    memory: " + toIndentedString(memory) + "\n" +
                "    database: " + toIndentedString(database) + "\n" +
                "    serverStartTime: " + toIndentedString(serverStartTime) + "\n" +
                "    logsFolder: " + toIndentedString(logsFolder) + "\n" +
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
