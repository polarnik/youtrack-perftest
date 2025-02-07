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
 * Dashboard
 */


public class Dashboard extends Uuid {
    @SerializedName("name")
    private String name = null;

    @SerializedName("owner")
    private User owner = null;

    @SerializedName("data")
    private String data = null;

    @SerializedName("permission")
    private String permission = null;

    @SerializedName("access")
    private String access = null;

    @SerializedName("permissions")
    private List<DashboardPermission> permissions = null;

    @SerializedName("favorite")
    private Boolean favorite = null;

    @SerializedName("ordinal")
    private Integer ordinal = null;

    public Dashboard name(String name) {
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

    public Dashboard owner(User owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Get owner
     *
     * @return owner
     **/
    @Schema(description = "")
    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Dashboard data(String data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     **/
    @Schema(description = "")
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Dashboard permission(String permission) {
        this.permission = permission;
        return this;
    }

    /**
     * Get permission
     *
     * @return permission
     **/
    @Schema(description = "")
    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public Dashboard access(String access) {
        this.access = access;
        return this;
    }

    /**
     * Get access
     *
     * @return access
     **/
    @Schema(description = "")
    public String getAccess() {
        return access;
    }

    public void setAccess(String access) {
        this.access = access;
    }

    public Dashboard permissions(List<DashboardPermission> permissions) {
        this.permissions = permissions;
        return this;
    }

    public Dashboard addPermissionsItem(DashboardPermission permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<DashboardPermission>();
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
    public List<DashboardPermission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<DashboardPermission> permissions) {
        this.permissions = permissions;
    }

    public Dashboard favorite(Boolean favorite) {
        this.favorite = favorite;
        return this;
    }

    /**
     * Get favorite
     *
     * @return favorite
     **/
    @Schema(description = "")
    public Boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    public Dashboard ordinal(Integer ordinal) {
        this.ordinal = ordinal;
        return this;
    }

    /**
     * Get ordinal
     *
     * @return ordinal
     **/
    @Schema(description = "")
    public Integer getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(Integer ordinal) {
        this.ordinal = ordinal;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Dashboard dashboard = (Dashboard) o;
        return Objects.equals(this.name, dashboard.name) &&
                Objects.equals(this.owner, dashboard.owner) &&
                Objects.equals(this.data, dashboard.data) &&
                Objects.equals(this.permission, dashboard.permission) &&
                Objects.equals(this.access, dashboard.access) &&
                Objects.equals(this.permissions, dashboard.permissions) &&
                Objects.equals(this.favorite, dashboard.favorite) &&
                Objects.equals(this.ordinal, dashboard.ordinal) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, owner, data, permission, access, permissions, favorite, ordinal, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class Dashboard {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    name: " + toIndentedString(name) + "\n" +
                "    owner: " + toIndentedString(owner) + "\n" +
                "    data: " + toIndentedString(data) + "\n" +
                "    permission: " + toIndentedString(permission) + "\n" +
                "    access: " + toIndentedString(access) + "\n" +
                "    permissions: " + toIndentedString(permissions) + "\n" +
                "    favorite: " + toIndentedString(favorite) + "\n" +
                "    ordinal: " + toIndentedString(ordinal) + "\n" +
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
