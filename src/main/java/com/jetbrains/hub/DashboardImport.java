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
 * DashboardImport
 */


public class DashboardImport {
    @SerializedName("id")
    private String id = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("owner")
    private String owner = null;

    @SerializedName("json")
    private String json = null;

    @SerializedName("permissions")
    private List<DashboardPermissionImport> permissions = null;

    @SerializedName("userDashboards")
    private List<UserDashboardImport> userDashboards = null;

    public DashboardImport id(String id) {
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

    public DashboardImport name(String name) {
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

    public DashboardImport owner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Get owner
     *
     * @return owner
     **/
    @Schema(description = "")
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public DashboardImport json(String json) {
        this.json = json;
        return this;
    }

    /**
     * Get json
     *
     * @return json
     **/
    @Schema(description = "")
    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }

    public DashboardImport permissions(List<DashboardPermissionImport> permissions) {
        this.permissions = permissions;
        return this;
    }

    public DashboardImport addPermissionsItem(DashboardPermissionImport permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<DashboardPermissionImport>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    /**
     * Get permissions
     *
     * @return permissions
     **/
    @Schema(description = "")
    public List<DashboardPermissionImport> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<DashboardPermissionImport> permissions) {
        this.permissions = permissions;
    }

    public DashboardImport userDashboards(List<UserDashboardImport> userDashboards) {
        this.userDashboards = userDashboards;
        return this;
    }

    public DashboardImport addUserDashboardsItem(UserDashboardImport userDashboardsItem) {
        if (this.userDashboards == null) {
            this.userDashboards = new ArrayList<UserDashboardImport>();
        }
        this.userDashboards.add(userDashboardsItem);
        return this;
    }

    /**
     * Get userDashboards
     *
     * @return userDashboards
     **/
    @Schema(description = "")
    public List<UserDashboardImport> getUserDashboards() {
        return userDashboards;
    }

    public void setUserDashboards(List<UserDashboardImport> userDashboards) {
        this.userDashboards = userDashboards;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DashboardImport dashboardImport = (DashboardImport) o;
        return Objects.equals(this.id, dashboardImport.id) &&
                Objects.equals(this.name, dashboardImport.name) &&
                Objects.equals(this.owner, dashboardImport.owner) &&
                Objects.equals(this.json, dashboardImport.json) &&
                Objects.equals(this.permissions, dashboardImport.permissions) &&
                Objects.equals(this.userDashboards, dashboardImport.userDashboards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, owner, json, permissions, userDashboards);
    }


    @Override
    public String toString() {

        String sb = "class DashboardImport {\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    name: " + toIndentedString(name) + "\n" +
                "    owner: " + toIndentedString(owner) + "\n" +
                "    json: " + toIndentedString(json) + "\n" +
                "    permissions: " + toIndentedString(permissions) + "\n" +
                "    userDashboards: " + toIndentedString(userDashboards) + "\n" +
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
