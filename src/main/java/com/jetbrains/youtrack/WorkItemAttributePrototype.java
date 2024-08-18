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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Represents a work item attribute prototype that is common for all projects. The project-related settings for work item attributes are stored in the &#x60;WorkItemProjectAttribute&#x60; entities.
 */
@Schema(description = "Represents a work item attribute prototype that is common for all projects. The project-related settings for work item attributes are stored in the `WorkItemProjectAttribute` entities.")


public class WorkItemAttributePrototype {
    @SerializedName("id")
    private final String id = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("instances")
    private List<WorkItemProjectAttribute> instances = null;

    @SerializedName("values")
    private List<WorkItemAttributeValue> values = null;

    @SerializedName("$type")
    private String $type = null;

    public WorkItemAttributePrototype() {
        this.$type = this.getClass().getSimpleName();
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

    public WorkItemAttributePrototype name(String name) {
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

    public WorkItemAttributePrototype instances(List<WorkItemProjectAttribute> instances) {
        this.instances = instances;
        return this;
    }

    public WorkItemAttributePrototype addInstancesItem(WorkItemProjectAttribute instancesItem) {
        if (this.instances == null) {
            this.instances = new ArrayList<WorkItemProjectAttribute>();
        }
        this.instances.add(instancesItem);
        return this;
    }

    /**
     * Get instances
     *
     * @return instances
     **/
    @Schema(description = "")
    public List<WorkItemProjectAttribute> getInstances() {
        return instances;
    }

    public void setInstances(List<WorkItemProjectAttribute> instances) {
        this.instances = instances;
    }

    public WorkItemAttributePrototype values(List<WorkItemAttributeValue> values) {
        this.values = values;
        return this;
    }

    public WorkItemAttributePrototype addValuesItem(WorkItemAttributeValue valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<WorkItemAttributeValue>();
        }
        this.values.add(valuesItem);
        return this;
    }

    /**
     * Get values
     *
     * @return values
     **/
    @Schema(description = "")
    public List<WorkItemAttributeValue> getValues() {
        return values;
    }

    public void setValues(List<WorkItemAttributeValue> values) {
        this.values = values;
    }

    /**
     * Get $type
     *
     * @return $type
     **/
    @Schema(description = "")
    public String get$Type() {
        return $type;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkItemAttributePrototype workItemAttributePrototype = (WorkItemAttributePrototype) o;
        return Objects.equals(this.id, workItemAttributePrototype.id) &&
                Objects.equals(this.name, workItemAttributePrototype.name) &&
                Objects.equals(this.instances, workItemAttributePrototype.instances) &&
                Objects.equals(this.values, workItemAttributePrototype.values) &&
                Objects.equals(this.$type, workItemAttributePrototype.$type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, instances, values, $type);
    }


    @Override
    public String toString() {

        String sb = "class WorkItemAttributePrototype {\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    name: " + toIndentedString(name) + "\n" +
                "    instances: " + toIndentedString(instances) + "\n" +
                "    values: " + toIndentedString(values) + "\n" +
                "    $type: " + toIndentedString($type) + "\n" +
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
