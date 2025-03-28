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

import java.util.Objects;

/**
 * BasePage
 */


public class BasePage {
    @SerializedName("skip")
    private Integer skip = null;

    @SerializedName("total")
    private Integer total = null;

    @SerializedName("top")
    private Integer top = null;

    @SerializedName("type")
    private String type = null;

    public BasePage() {
        this.type = this.getClass().getSimpleName();
    }

    public BasePage skip(Integer skip) {
        this.skip = skip;
        return this;
    }

    /**
     * Get skip
     *
     * @return skip
     **/
    @Schema(description = "")
    public Integer getSkip() {
        return skip;
    }

    public void setSkip(Integer skip) {
        this.skip = skip;
    }

    public BasePage total(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * Get total
     *
     * @return total
     **/
    @Schema(description = "")
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public BasePage top(Integer top) {
        this.top = top;
        return this;
    }

    /**
     * Get top
     *
     * @return top
     **/
    @Schema(description = "")
    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    public BasePage type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     **/
    @Schema(required = true, description = "")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BasePage basePage = (BasePage) o;
        return Objects.equals(this.skip, basePage.skip) &&
                Objects.equals(this.total, basePage.total) &&
                Objects.equals(this.top, basePage.top) &&
                Objects.equals(this.type, basePage.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skip, total, top, type);
    }


    @Override
    public String toString() {

        String sb = "class BasePage {\n" +
                "    skip: " + toIndentedString(skip) + "\n" +
                "    total: " + toIndentedString(total) + "\n" +
                "    top: " + toIndentedString(top) + "\n" +
                "    type: " + toIndentedString(type) + "\n" +
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
