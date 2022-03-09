package com.fersoft.peopledatalabs.enrichment;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Params {
    @JsonProperty("metadata")
    private Map<String, Object> metadata;
    @JsonProperty("params")
    private EnrichmentParams params;

    public Map<String, Object> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
    }

    public EnrichmentParams getParams() {
        return params;
    }

    public void setParams(EnrichmentParams params) {
        this.params = params;
    }
}
