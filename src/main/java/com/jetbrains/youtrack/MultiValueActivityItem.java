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
 * Represents a change in an entity attribute that has type of &#x60;Array of &amp;lt;Entities&amp;gt;&#x60;.
 */
@Schema(description = "Represents a change in an entity attribute that has type of `Array of &lt;Entities&gt;`.")


public class MultiValueActivityItem extends ActivityItem {
    @SerializedName("id")
    private final String multiValueActivityItemId = null;

    @SerializedName("added")
    private final Object multiValueActivityItemAdded = null;

    @SerializedName("removed")
    private final Object multiValueActivityItemRemoved = null;

    /**
     * Get multiValueActivityItemId
     *
     * @return multiValueActivityItemId
     **/
    @Schema(description = "")
    public String getMultiValueActivityItemId() {
        return multiValueActivityItemId;
    }

    /**
     * Get multiValueActivityItemAdded
     *
     * @return multiValueActivityItemAdded
     **/
    @Schema(description = "")
    public Object getMultiValueActivityItemAdded() {
        return multiValueActivityItemAdded;
    }

    /**
     * Get multiValueActivityItemRemoved
     *
     * @return multiValueActivityItemRemoved
     **/
    @Schema(description = "")
    public Object getMultiValueActivityItemRemoved() {
        return multiValueActivityItemRemoved;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MultiValueActivityItem multiValueActivityItem = (MultiValueActivityItem) o;
        return Objects.equals(this.multiValueActivityItemId, multiValueActivityItem.multiValueActivityItemId) &&
                Objects.equals(this.multiValueActivityItemAdded, multiValueActivityItem.multiValueActivityItemAdded) &&
                Objects.equals(this.multiValueActivityItemRemoved, multiValueActivityItem.multiValueActivityItemRemoved) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(multiValueActivityItemId, multiValueActivityItemAdded, multiValueActivityItemRemoved, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class MultiValueActivityItem {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    multiValueActivityItemId: " + toIndentedString(multiValueActivityItemId) + "\n" +
                "    multiValueActivityItemAdded: " + toIndentedString(multiValueActivityItemAdded) + "\n" +
                "    multiValueActivityItemRemoved: " + toIndentedString(multiValueActivityItemRemoved) + "\n" +
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
