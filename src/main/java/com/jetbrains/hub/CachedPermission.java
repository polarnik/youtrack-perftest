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
 * CachedPermission
 */


public class CachedPermission {
    @SerializedName("permission")
    private Permission permission = null;

    @SerializedName("global")
    private Boolean global = null;

    @SerializedName("projects")
    private List<Project> projects = null;

    @SerializedName("resources")
    private List<Resource> resources = null;

    public CachedPermission permission(Permission permission) {
        this.permission = permission;
        return this;
    }

    /**
     * Get permission
     *
     * @return permission
     **/
    @Schema(description = "")
    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }

    public CachedPermission global(Boolean global) {
        this.global = global;
        return this;
    }

    /**
     * Get global
     *
     * @return global
     **/
    @Schema(description = "")
    public Boolean isGlobal() {
        return global;
    }

    public void setGlobal(Boolean global) {
        this.global = global;
    }

    public CachedPermission projects(List<Project> projects) {
        this.projects = projects;
        return this;
    }

    public CachedPermission addProjectsItem(Project projectsItem) {
        if (this.projects == null) {
            this.projects = new ArrayList<Project>();
        }
        this.projects.add(projectsItem);
        return this;
    }

    /**
     * Get projects
     *
     * @return projects
     **/
    @Schema(description = "")
    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public CachedPermission resources(List<Resource> resources) {
        this.resources = resources;
        return this;
    }

    public CachedPermission addResourcesItem(Resource resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<Resource>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    /**
     * Get resources
     *
     * @return resources
     **/
    @Schema(description = "")
    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CachedPermission cachedPermission = (CachedPermission) o;
        return Objects.equals(this.permission, cachedPermission.permission) &&
                Objects.equals(this.global, cachedPermission.global) &&
                Objects.equals(this.projects, cachedPermission.projects) &&
                Objects.equals(this.resources, cachedPermission.resources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permission, global, projects, resources);
    }


    @Override
    public String toString() {

        String sb = "class CachedPermission {\n" +
                "    permission: " + toIndentedString(permission) + "\n" +
                "    global: " + toIndentedString(global) + "\n" +
                "    projects: " + toIndentedString(projects) + "\n" +
                "    resources: " + toIndentedString(resources) + "\n" +
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
