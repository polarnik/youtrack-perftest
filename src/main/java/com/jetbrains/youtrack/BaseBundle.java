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
 * Represents a set of field values in YouTrack.
 */
@Schema(description = "Represents a set of field values in YouTrack.")


public class BaseBundle extends Bundle {
    @SerializedName("id")
    private final String baseBundleId = null;

    @SerializedName("values")
    private List<BundleElement> values = null;

    /**
     * Get baseBundleId
     *
     * @return baseBundleId
     **/
    @Schema(description = "")
    public String getBaseBundleId() {
        return baseBundleId;
    }

    public BaseBundle values(List<BundleElement> values) {
        this.values = values;
        return this;
    }

    public BaseBundle addValuesItem(BundleElement valuesItem) {
        if (this.values == null) {
            this.values = new ArrayList<BundleElement>();
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
    public List<BundleElement> getValues() {
        return values;
    }

    public void setValues(List<BundleElement> values) {
        this.values = values;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BaseBundle baseBundle = (BaseBundle) o;
        return Objects.equals(this.baseBundleId, baseBundle.baseBundleId) &&
                Objects.equals(this.values, baseBundle.values) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseBundleId, values, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class BaseBundle {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    baseBundleId: " + toIndentedString(baseBundleId) + "\n" +
                "    values: " + toIndentedString(values) + "\n" +
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
