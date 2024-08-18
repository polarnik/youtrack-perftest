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
 * Widget
 */


public class Widget extends Uuid {
    @SerializedName("key")
    private String key = null;

    @SerializedName("version")
    private String version = null;

    @SerializedName("installedVersion")
    private String installedVersion = null;

    @SerializedName("latestVersion")
    private String latestVersion = null;

    @SerializedName("installedFromRepository")
    private Boolean installedFromRepository = null;

    @SerializedName("archiveId")
    private String archiveId = null;

    @SerializedName("manifest")
    private String manifest = null;

    @SerializedName("disabled")
    private Boolean disabled = null;

    @SerializedName("applicationNames")
    private List<String> applicationNames = null;

    @SerializedName("accessibleServices")
    private List<Service> accessibleServices = null;

    @SerializedName("capabilities")
    private List<String> capabilities = null;

    @SerializedName("repositoryUrl")
    private String repositoryUrl = null;

    @SerializedName("repositoryIconUrl")
    private String repositoryIconUrl = null;

    public Widget key(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get key
     *
     * @return key
     **/
    @Schema(description = "")
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Widget version(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get version
     *
     * @return version
     **/
    @Schema(description = "")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Widget installedVersion(String installedVersion) {
        this.installedVersion = installedVersion;
        return this;
    }

    /**
     * Get installedVersion
     *
     * @return installedVersion
     **/
    @Schema(description = "")
    public String getInstalledVersion() {
        return installedVersion;
    }

    public void setInstalledVersion(String installedVersion) {
        this.installedVersion = installedVersion;
    }

    public Widget latestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }

    /**
     * Get latestVersion
     *
     * @return latestVersion
     **/
    @Schema(description = "")
    public String getLatestVersion() {
        return latestVersion;
    }

    public void setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
    }

    public Widget installedFromRepository(Boolean installedFromRepository) {
        this.installedFromRepository = installedFromRepository;
        return this;
    }

    /**
     * Get installedFromRepository
     *
     * @return installedFromRepository
     **/
    @Schema(description = "")
    public Boolean isInstalledFromRepository() {
        return installedFromRepository;
    }

    public void setInstalledFromRepository(Boolean installedFromRepository) {
        this.installedFromRepository = installedFromRepository;
    }

    public Widget archiveId(String archiveId) {
        this.archiveId = archiveId;
        return this;
    }

    /**
     * Get archiveId
     *
     * @return archiveId
     **/
    @Schema(description = "")
    public String getArchiveId() {
        return archiveId;
    }

    public void setArchiveId(String archiveId) {
        this.archiveId = archiveId;
    }

    public Widget manifest(String manifest) {
        this.manifest = manifest;
        return this;
    }

    /**
     * Get manifest
     *
     * @return manifest
     **/
    @Schema(description = "")
    public String getManifest() {
        return manifest;
    }

    public void setManifest(String manifest) {
        this.manifest = manifest;
    }

    public Widget disabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * Get disabled
     *
     * @return disabled
     **/
    @Schema(description = "")
    public Boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public Widget applicationNames(List<String> applicationNames) {
        this.applicationNames = applicationNames;
        return this;
    }

    public Widget addApplicationNamesItem(String applicationNamesItem) {
        if (this.applicationNames == null) {
            this.applicationNames = new ArrayList<String>();
        }
        this.applicationNames.add(applicationNamesItem);
        return this;
    }

    /**
     * Get applicationNames
     *
     * @return applicationNames
     **/
    @Schema(description = "")
    public List<String> getApplicationNames() {
        return applicationNames;
    }

    public void setApplicationNames(List<String> applicationNames) {
        this.applicationNames = applicationNames;
    }

    public Widget accessibleServices(List<Service> accessibleServices) {
        this.accessibleServices = accessibleServices;
        return this;
    }

    public Widget addAccessibleServicesItem(Service accessibleServicesItem) {
        if (this.accessibleServices == null) {
            this.accessibleServices = new ArrayList<Service>();
        }
        this.accessibleServices.add(accessibleServicesItem);
        return this;
    }

    /**
     * Get accessibleServices
     *
     * @return accessibleServices
     **/
    @Schema(description = "")
    public List<Service> getAccessibleServices() {
        return accessibleServices;
    }

    public void setAccessibleServices(List<Service> accessibleServices) {
        this.accessibleServices = accessibleServices;
    }

    public Widget capabilities(List<String> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    public Widget addCapabilitiesItem(String capabilitiesItem) {
        if (this.capabilities == null) {
            this.capabilities = new ArrayList<String>();
        }
        this.capabilities.add(capabilitiesItem);
        return this;
    }

    /**
     * Get capabilities
     *
     * @return capabilities
     **/
    @Schema(description = "")
    public List<String> getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(List<String> capabilities) {
        this.capabilities = capabilities;
    }

    public Widget repositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
        return this;
    }

    /**
     * Get repositoryUrl
     *
     * @return repositoryUrl
     **/
    @Schema(description = "")
    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    public Widget repositoryIconUrl(String repositoryIconUrl) {
        this.repositoryIconUrl = repositoryIconUrl;
        return this;
    }

    /**
     * Get repositoryIconUrl
     *
     * @return repositoryIconUrl
     **/
    @Schema(description = "")
    public String getRepositoryIconUrl() {
        return repositoryIconUrl;
    }

    public void setRepositoryIconUrl(String repositoryIconUrl) {
        this.repositoryIconUrl = repositoryIconUrl;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Widget widget = (Widget) o;
        return Objects.equals(this.key, widget.key) &&
                Objects.equals(this.version, widget.version) &&
                Objects.equals(this.installedVersion, widget.installedVersion) &&
                Objects.equals(this.latestVersion, widget.latestVersion) &&
                Objects.equals(this.installedFromRepository, widget.installedFromRepository) &&
                Objects.equals(this.archiveId, widget.archiveId) &&
                Objects.equals(this.manifest, widget.manifest) &&
                Objects.equals(this.disabled, widget.disabled) &&
                Objects.equals(this.applicationNames, widget.applicationNames) &&
                Objects.equals(this.accessibleServices, widget.accessibleServices) &&
                Objects.equals(this.capabilities, widget.capabilities) &&
                Objects.equals(this.repositoryUrl, widget.repositoryUrl) &&
                Objects.equals(this.repositoryIconUrl, widget.repositoryIconUrl) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, version, installedVersion, latestVersion, installedFromRepository, archiveId, manifest, disabled, applicationNames, accessibleServices, capabilities, repositoryUrl, repositoryIconUrl, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class Widget {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    key: " + toIndentedString(key) + "\n" +
                "    version: " + toIndentedString(version) + "\n" +
                "    installedVersion: " + toIndentedString(installedVersion) + "\n" +
                "    latestVersion: " + toIndentedString(latestVersion) + "\n" +
                "    installedFromRepository: " + toIndentedString(installedFromRepository) + "\n" +
                "    archiveId: " + toIndentedString(archiveId) + "\n" +
                "    manifest: " + toIndentedString(manifest) + "\n" +
                "    disabled: " + toIndentedString(disabled) + "\n" +
                "    applicationNames: " + toIndentedString(applicationNames) + "\n" +
                "    accessibleServices: " + toIndentedString(accessibleServices) + "\n" +
                "    capabilities: " + toIndentedString(capabilities) + "\n" +
                "    repositoryUrl: " + toIndentedString(repositoryUrl) + "\n" +
                "    repositoryIconUrl: " + toIndentedString(repositoryIconUrl) + "\n" +
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
