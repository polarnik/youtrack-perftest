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
 * ProjectrolesPage
 */


public class ProjectrolesPage extends BasePage {
    @SerializedName("projectroles")
    private List<ProjectRole> projectroles = null;

    public ProjectrolesPage projectroles(List<ProjectRole> projectroles) {
        this.projectroles = projectroles;
        return this;
    }

    public ProjectrolesPage addProjectrolesItem(ProjectRole projectrolesItem) {
        if (this.projectroles == null) {
            this.projectroles = new ArrayList<ProjectRole>();
        }
        this.projectroles.add(projectrolesItem);
        return this;
    }

    /**
     * Get projectroles
     *
     * @return projectroles
     **/
    @Schema(description = "")
    public List<ProjectRole> getProjectroles() {
        return projectroles;
    }

    public void setProjectroles(List<ProjectRole> projectroles) {
        this.projectroles = projectroles;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProjectrolesPage projectrolesPage = (ProjectrolesPage) o;
        return Objects.equals(this.projectroles, projectrolesPage.projectroles) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectroles, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class ProjectrolesPage {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    projectroles: " + toIndentedString(projectroles) + "\n" +
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
