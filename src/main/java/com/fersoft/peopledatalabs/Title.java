package com.fersoft.peopledatalabs;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "role",
        "sub_role",
        "levels"
})
public class Title {
    @JsonProperty("name")
    private String name;
    @JsonProperty("role")
    private Object role;
    @JsonProperty("sub_role")
    private Object subRole;
    @JsonProperty("levels")
    private List<String> levels = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("role")
    public Object getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(Object role) {
        this.role = role;
    }

    @JsonProperty("sub_role")
    public Object getSubRole() {
        return subRole;
    }

    @JsonProperty("sub_role")
    public void setSubRole(Object subRole) {
        this.subRole = subRole;
    }

    @JsonProperty("levels")
    public List<String> getLevels() {
        return levels;
    }

    @JsonProperty("levels")
    public void setLevels(List<String> levels) {
        this.levels = levels;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
