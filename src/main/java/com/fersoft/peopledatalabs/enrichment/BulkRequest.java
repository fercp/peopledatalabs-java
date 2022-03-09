package com.fersoft.peopledatalabs.enrichment;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BulkRequest {
    @JsonProperty("min_likelihood")
    private Integer minLikelihood;
    @JsonProperty("required")
    private String required;
    @JsonProperty("data_include")
    private String dataInclude;
    @JsonProperty("include_if_matched")
    private Boolean includeIfMatched;
    @JsonProperty("titlecase")
    private Boolean titleCase;
    @JsonProperty("requests")
    private List<Params> requests;

    public List<Params> getRequests() {
        return requests;
    }

    public void setRequests(List<Params> requests) {
        this.requests = requests;
    }

    public Integer getMinLikelihood() {
        return minLikelihood;
    }

    public void setMinLikelihood(Integer minLikelihood) {
        this.minLikelihood = minLikelihood;
    }

    public String getRequired() {
        return required;
    }

    public void setRequired(String required) {
        this.required = required;
    }

    public String getDataInclude() {
        return dataInclude;
    }

    public void setDataInclude(String dataInclude) {
        this.dataInclude = dataInclude;
    }

    public Boolean getIncludeIfMatched() {
        return includeIfMatched;
    }

    public void setIncludeIfMatched(Boolean includeIfMatched) {
        this.includeIfMatched = includeIfMatched;
    }

    public Boolean getTitleCase() {
        return titleCase;
    }

    public void setTitleCase(boolean titleCase) {
        this.titleCase = titleCase;
    }
}
