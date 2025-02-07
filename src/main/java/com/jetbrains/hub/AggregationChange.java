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
 * AggregationChange
 */


public class AggregationChange extends Change {
    @SerializedName("childChanges")
    private List<Change> childChanges = null;

    public AggregationChange childChanges(List<Change> childChanges) {
        this.childChanges = childChanges;
        return this;
    }

    public AggregationChange addChildChangesItem(Change childChangesItem) {
        if (this.childChanges == null) {
            this.childChanges = new ArrayList<Change>();
        }
        this.childChanges.add(childChangesItem);
        return this;
    }

    /**
     * Get childChanges
     *
     * @return childChanges
     **/
    @Schema(description = "")
    public List<Change> getChildChanges() {
        return childChanges;
    }

    public void setChildChanges(List<Change> childChanges) {
        this.childChanges = childChanges;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AggregationChange aggregationChange = (AggregationChange) o;
        return Objects.equals(this.childChanges, aggregationChange.childChanges) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(childChanges, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class AggregationChange {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    childChanges: " + toIndentedString(childChanges) + "\n" +
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
