package com.fersoft.peopledatalabs.enrichment;

import com.fasterxml.jackson.annotation.*;
import com.fersoft.peopledatalabs.Data;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "status",
        "likelihood",
        "data",
        "dataset_version"
})
public class EnrichmentResponse {
    @JsonProperty("metadata")
    private Map<String, Object> metadata;
    @JsonProperty("status")
    private Integer status;
    @JsonProperty("likelihood")
    private Integer likelihood;
    @JsonProperty("data")
    private Data data;
    @JsonProperty("dataset_version")
    private String datasetVersion;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("status")
    public Integer getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @JsonProperty("likelihood")
    public Integer getLikelihood() {
        return likelihood;
    }

    @JsonProperty("likelihood")
    public void setLikelihood(Integer likelihood) {
        this.likelihood = likelihood;
    }

    @JsonProperty("data")
    public Data getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(Data data) {
        this.data = data;
    }

    @JsonProperty("dataset_version")
    public String getDatasetVersion() {
        return datasetVersion;
    }

    @JsonProperty("dataset_version")
    public void setDatasetVersion(String datasetVersion) {
        this.datasetVersion = datasetVersion;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }
}
