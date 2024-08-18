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
 * KeystoresPage
 */


public class KeystoresPage extends BasePage {
    @SerializedName("keystores")
    private List<KeyStore> keystores = null;

    public KeystoresPage keystores(List<KeyStore> keystores) {
        this.keystores = keystores;
        return this;
    }

    public KeystoresPage addKeystoresItem(KeyStore keystoresItem) {
        if (this.keystores == null) {
            this.keystores = new ArrayList<KeyStore>();
        }
        this.keystores.add(keystoresItem);
        return this;
    }

    /**
     * Get keystores
     *
     * @return keystores
     **/
    @Schema(description = "")
    public List<KeyStore> getKeystores() {
        return keystores;
    }

    public void setKeystores(List<KeyStore> keystores) {
        this.keystores = keystores;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoresPage keystoresPage = (KeystoresPage) o;
        return Objects.equals(this.keystores, keystoresPage.keystores) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keystores, super.hashCode());
    }


    @Override
    public String toString() {
        String sb = "class KeystoresPage {\n" +
                "    " + toIndentedString(super.toString()) + "\n" +
                "    keystores: " + toIndentedString(keystores) + "\n" +
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
