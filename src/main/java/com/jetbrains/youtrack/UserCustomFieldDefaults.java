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
 * Represents default settings for the user-type field.
 */
@Schema(description = "Represents default settings for the user-type field.")


public class UserCustomFieldDefaults extends CustomFieldDefaults {
    @SerializedName("id")
    private final String userCustomFieldDefaultsId = null;

    @SerializedName("bundle")
    private UserBundle bundle = null;

    @SerializedName("defaultValues")
    private List<User> defaultValues = null;

    /**
     * Get userCustomFieldDefaultsId
     *
     * @return userCustomFieldDefaultsId
     **/
    @Schema(description = "")
    public String getUserCustomFieldDefaultsId() {
        return userCustomFieldDefaultsId;
    }

    public UserCustomFieldDefaults bundle(UserBundle bundle) {
        this.bundle = bundle;
        return this;
    }

    /**
     * Get bundle
     *
     * @return bundle
     **/
    @Schema(description = "")
    public UserBundle getBundle() {
        return bundle;
    }

    public void setBundle(UserBundle bundle) {
        this.bundle = bundle;
    }

    public UserCustomFieldDefaults defaultValues(List<User> defaultValues) {
        this.defaultValues = defaultValues;
        return this;
    }

    public UserCustomFieldDefaults addDefaultValuesItem(User defaultValuesItem) {
        if (this.defaultValues == null) {
            this.defaultValues = new ArrayList<User>();
        }
        this.defaultValues.add(defaultValuesItem);
        return this;
    }

    /**
     * Get defaultValues
     *
     * @return defaultValues
     **/
    @Schema(description = "")
    public List<User> getDefaultValues() {
        return defaultValues;
    }

    public void setDefaultValues(List<User> defaultValues) {
        this.defaultValues = defaultValues;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserCustomFieldDefaults userCustomFieldDefaults = (UserCustomFieldDefaults) o;
        return Objects.equals(this.userCustomFieldDefaultsId, userCustomFieldDefaults.userCustomFieldDefaultsId) &&
                Objects.equals(this.bundle, userCustomFieldDefaults.bundle) &&
                Objects.equals(this.defaultValues, userCustomFieldDefaults.defaultValues) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userCustomFieldDefaultsId, bundle, defaultValues, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class UserCustomFieldDefaults {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    userCustomFieldDefaultsId: " + toIndentedString(userCustomFieldDefaultsId) + "\n" +
                "    bundle: " + toIndentedString(bundle) + "\n" +
                "    defaultValues: " + toIndentedString(defaultValues) + "\n" +
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
