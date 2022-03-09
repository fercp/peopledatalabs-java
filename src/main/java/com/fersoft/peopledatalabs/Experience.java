package com.fersoft.peopledatalabs;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "company",
        "location_names",
        "end_date",
        "start_date",
        "title",
        "is_primary"
})
public class Experience {

    @JsonProperty("company")
    private Company company;
    @JsonProperty("location_names")
    private List<Object> locationNames = null;
    @JsonProperty("end_date")
    private Object endDate;
    @JsonProperty("start_date")
    private String startDate;
    @JsonProperty("title")
    private Title title;
    @JsonProperty("is_primary")
    private Boolean isPrimary;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("company")
    public Company getCompany() {
        return company;
    }

    @JsonProperty("company")
    public void setCompany(Company company) {
        this.company = company;
    }

    @JsonProperty("location_names")
    public List<Object> getLocationNames() {
        return locationNames;
    }

    @JsonProperty("location_names")
    public void setLocationNames(List<Object> locationNames) {
        this.locationNames = locationNames;
    }

    @JsonProperty("end_date")
    public Object getEndDate() {
        return endDate;
    }

    @JsonProperty("end_date")
    public void setEndDate(Object endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("start_date")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("start_date")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("title")
    public Title getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(Title title) {
        this.title = title;
    }

    @JsonProperty("is_primary")
    public Boolean getIsPrimary() {
        return isPrimary;
    }

    @JsonProperty("is_primary")
    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
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
