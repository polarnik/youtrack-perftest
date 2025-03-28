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
 * Represents a change in a &#x60;String&#x60;-type attribute with the support of markup: &#x60;description&#x60; in an Issue or IssueWorkItem, and the &#x60;text&#x60; of the IssueComment. This entity lets you get the rendered text after the change.
 */
@Schema(description = "Represents a change in a `String`-type attribute with the support of markup: `description` in an Issue or IssueWorkItem, and the `text` of the IssueComment. This entity lets you get the rendered text after the change.")


public class TextMarkupActivityItem extends SimpleValueActivityItem {
    @SerializedName("id")
    private final String textMarkupActivityItemId = null;

    @SerializedName("added")
    private final String textMarkupActivityItemAdded = null;

    @SerializedName("markup")
    private final String markup = null;

    @SerializedName("removed")
    private final String textMarkupActivityItemRemoved = null;

    /**
     * Get textMarkupActivityItemId
     *
     * @return textMarkupActivityItemId
     **/
    @Schema(description = "")
    public String getTextMarkupActivityItemId() {
        return textMarkupActivityItemId;
    }

    /**
     * Get textMarkupActivityItemAdded
     *
     * @return textMarkupActivityItemAdded
     **/
    @Schema(description = "")
    public String getTextMarkupActivityItemAdded() {
        return textMarkupActivityItemAdded;
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
     * Get textMarkupActivityItemRemoved
     *
     * @return textMarkupActivityItemRemoved
     **/
    @Schema(description = "")
    public String getTextMarkupActivityItemRemoved() {
        return textMarkupActivityItemRemoved;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TextMarkupActivityItem textMarkupActivityItem = (TextMarkupActivityItem) o;
        return Objects.equals(this.textMarkupActivityItemId, textMarkupActivityItem.textMarkupActivityItemId) &&
                Objects.equals(this.textMarkupActivityItemAdded, textMarkupActivityItem.textMarkupActivityItemAdded) &&
                Objects.equals(this.markup, textMarkupActivityItem.markup) &&
                Objects.equals(this.textMarkupActivityItemRemoved, textMarkupActivityItem.textMarkupActivityItemRemoved) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(textMarkupActivityItemId, textMarkupActivityItemAdded, markup, textMarkupActivityItemRemoved, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class TextMarkupActivityItem {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    textMarkupActivityItemId: " + toIndentedString(textMarkupActivityItemId) + "\n" +
                "    textMarkupActivityItemAdded: " + toIndentedString(textMarkupActivityItemAdded) + "\n" +
                "    markup: " + toIndentedString(markup) + "\n" +
                "    textMarkupActivityItemRemoved: " + toIndentedString(textMarkupActivityItemRemoved) + "\n" +
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
