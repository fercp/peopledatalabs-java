package com.fersoft.peopledatalabs;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "status",
        "contains",
        "previous_version",
        "current_version"
})
public class VersionStatus {
    @JsonProperty("status")
    private String status;
    @JsonProperty("contains")
    private List<Object> contains = null;
    @JsonProperty("previous_version")
    private String previousVersion;
    @JsonProperty("current_version")
    private String currentVersion;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("contains")
    public List<Object> getContains() {
        return contains;
    }

    @JsonProperty("contains")
    public void setContains(List<Object> contains) {
        this.contains = contains;
    }

    @JsonProperty("previous_version")
    public String getPreviousVersion() {
        return previousVersion;
    }

    @JsonProperty("previous_version")
    public void setPreviousVersion(String previousVersion) {
        this.previousVersion = previousVersion;
    }

    @JsonProperty("current_version")
    public String getCurrentVersion() {
        return currentVersion;
    }

    @JsonProperty("current_version")
    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
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
