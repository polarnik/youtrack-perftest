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
 * Role
 */


public class Role {
    @SerializedName("id")
    private String id = null;

    @SerializedName("aliases")
    private List<Alias> aliases = null;

    @SerializedName("key")
    private String key = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("permissions")
    private List<Permission> permissions = null;

    @SerializedName("immutable")
    private Boolean immutable = null;

    public Role id(String id) {
        this.id = id;
        return this;
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

    public void setId(String id) {
        this.id = id;
    }

    public Role aliases(List<Alias> aliases) {
        this.aliases = aliases;
        return this;
    }

    public Role addAliasesItem(Alias aliasesItem) {
        if (this.aliases == null) {
            this.aliases = new ArrayList<Alias>();
        }
        this.aliases.add(aliasesItem);
        return this;
    }

    /**
     * Get aliases
     *
     * @return aliases
     **/
    @Schema(description = "")
    public List<Alias> getAliases() {
        return aliases;
    }

    public void setAliases(List<Alias> aliases) {
        this.aliases = aliases;
    }

    public Role key(String key) {
        this.key = key;
        return this;
    }

    /**
     * Get key
     *
     * @return key
     **/
    @Schema(description = "")
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Role name(String name) {
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

    public Role description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     **/
    @Schema(description = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Role permissions(List<Permission> permissions) {
        this.permissions = permissions;
        return this;
    }

    public Role addPermissionsItem(Permission permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<Permission>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    /**
     * Get permissions
     *
     * @return permissions
     **/
    @Schema(description = "")
    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public Role immutable(Boolean immutable) {
        this.immutable = immutable;
        return this;
    }

    /**
     * Get immutable
     *
     * @return immutable
     **/
    @Schema(description = "")
    public Boolean isImmutable() {
        return immutable;
    }

    public void setImmutable(Boolean immutable) {
        this.immutable = immutable;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Role role = (Role) o;
        return Objects.equals(this.id, role.id) &&
                Objects.equals(this.aliases, role.aliases) &&
                Objects.equals(this.key, role.key) &&
                Objects.equals(this.name, role.name) &&
                Objects.equals(this.description, role.description) &&
                Objects.equals(this.permissions, role.permissions) &&
                Objects.equals(this.immutable, role.immutable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, aliases, key, name, description, permissions, immutable);
    }


    @Override
    public String toString() {

        String sb = "class Role {\n" +
                "    id: " + toIndentedString(id) + "\n" +
                "    aliases: " + toIndentedString(aliases) + "\n" +
                "    key: " + toIndentedString(key) + "\n" +
                "    name: " + toIndentedString(name) + "\n" +
                "    description: " + toIndentedString(description) + "\n" +
                "    permissions: " + toIndentedString(permissions) + "\n" +
                "    immutable: " + toIndentedString(immutable) + "\n" +
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
