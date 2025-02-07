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
 * QueryAssist
 */


public class QueryAssist {
    @SerializedName("query")
    private String query = null;

    @SerializedName("caret")
    private Integer caret = null;

    @SerializedName("styleRanges")
    private List<QueryStyleRange> styleRanges = null;

    @SerializedName("suggestions")
    private List<QuerySuggestItem> suggestions = null;

    public QueryAssist query(String query) {
        this.query = query;
        return this;
    }

    /**
     * Get query
     *
     * @return query
     **/
    @Schema(description = "")
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public QueryAssist caret(Integer caret) {
        this.caret = caret;
        return this;
    }

    /**
     * Get caret
     *
     * @return caret
     **/
    @Schema(description = "")
    public Integer getCaret() {
        return caret;
    }

    public void setCaret(Integer caret) {
        this.caret = caret;
    }

    public QueryAssist styleRanges(List<QueryStyleRange> styleRanges) {
        this.styleRanges = styleRanges;
        return this;
    }

    public QueryAssist addStyleRangesItem(QueryStyleRange styleRangesItem) {
        if (this.styleRanges == null) {
            this.styleRanges = new ArrayList<QueryStyleRange>();
        }
        this.styleRanges.add(styleRangesItem);
        return this;
    }

    /**
     * Get styleRanges
     *
     * @return styleRanges
     **/
    @Schema(description = "")
    public List<QueryStyleRange> getStyleRanges() {
        return styleRanges;
    }

    public void setStyleRanges(List<QueryStyleRange> styleRanges) {
        this.styleRanges = styleRanges;
    }

    public QueryAssist suggestions(List<QuerySuggestItem> suggestions) {
        this.suggestions = suggestions;
        return this;
    }

    public QueryAssist addSuggestionsItem(QuerySuggestItem suggestionsItem) {
        if (this.suggestions == null) {
            this.suggestions = new ArrayList<QuerySuggestItem>();
        }
        this.suggestions.add(suggestionsItem);
        return this;
    }

    /**
     * Get suggestions
     *
     * @return suggestions
     **/
    @Schema(description = "")
    public List<QuerySuggestItem> getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(List<QuerySuggestItem> suggestions) {
        this.suggestions = suggestions;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryAssist queryAssist = (QueryAssist) o;
        return Objects.equals(this.query, queryAssist.query) &&
                Objects.equals(this.caret, queryAssist.caret) &&
                Objects.equals(this.styleRanges, queryAssist.styleRanges) &&
                Objects.equals(this.suggestions, queryAssist.suggestions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(query, caret, styleRanges, suggestions);
    }


    @Override
    public String toString() {

        String sb = "class QueryAssist {\n" +
                "    query: " + toIndentedString(query) + "\n" +
                "    caret: " + toIndentedString(caret) + "\n" +
                "    styleRanges: " + toIndentedString(styleRanges) + "\n" +
                "    suggestions: " + toIndentedString(suggestions) + "\n" +
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
