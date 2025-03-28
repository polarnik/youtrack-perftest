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

import java.util.Objects;

/**
 * Represents the change of the boolean flag that indicates whether YouTrack Wiki or Markdown is used in the target entity as a markup language. If &#x60;true&#x60;, then the markdown is used. Otherwise, YouTrack Wiki markup.
 */
@Schema(description = "Represents the change of the boolean flag that indicates whether YouTrack Wiki or Markdown is used in the target entity as a markup language. If `true`, then the markdown is used. Otherwise, YouTrack Wiki markup.")


public class UsesMarkupActivityItem extends SimpleValueActivityItem {
    @SerializedName("id")
    private final String usesMarkupActivityItemId = null;

    @SerializedName("added")
    private final Boolean usesMarkupActivityItemAdded = null;

    @SerializedName("markup")
    private final String markup = null;

    @SerializedName("removed")
    private final Boolean usesMarkupActivityItemRemoved = null;

    /**
     * Get usesMarkupActivityItemId
     *
     * @return usesMarkupActivityItemId
     **/
    @Schema(description = "")
    public String getUsesMarkupActivityItemId() {
        return usesMarkupActivityItemId;
    }

    /**
     * Get usesMarkupActivityItemAdded
     *
     * @return usesMarkupActivityItemAdded
     **/
    @Schema(description = "")
    public Boolean getUsesMarkupActivityItemAdded() {
        return usesMarkupActivityItemAdded;
    }

    /**
     * Get markup
     *
     * @return markup
     **/
    @Schema(description = "")
    public String getMarkup() {
        return markup;
    }

    /**
     * Get usesMarkupActivityItemRemoved
     *
     * @return usesMarkupActivityItemRemoved
     **/
    @Schema(description = "")
    public Boolean getUsesMarkupActivityItemRemoved() {
        return usesMarkupActivityItemRemoved;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UsesMarkupActivityItem usesMarkupActivityItem = (UsesMarkupActivityItem) o;
        return Objects.equals(this.usesMarkupActivityItemId, usesMarkupActivityItem.usesMarkupActivityItemId) &&
                Objects.equals(this.usesMarkupActivityItemAdded, usesMarkupActivityItem.usesMarkupActivityItemAdded) &&
                Objects.equals(this.markup, usesMarkupActivityItem.markup) &&
                Objects.equals(this.usesMarkupActivityItemRemoved, usesMarkupActivityItem.usesMarkupActivityItemRemoved) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usesMarkupActivityItemId, usesMarkupActivityItemAdded, markup, usesMarkupActivityItemRemoved, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class UsesMarkupActivityItem {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    usesMarkupActivityItemId: " + toIndentedString(usesMarkupActivityItemId) + "\n" +
                "    usesMarkupActivityItemAdded: " + toIndentedString(usesMarkupActivityItemAdded) + "\n" +
                "    markup: " + toIndentedString(markup) + "\n" +
                "    usesMarkupActivityItemRemoved: " + toIndentedString(usesMarkupActivityItemRemoved) + "\n" +
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
