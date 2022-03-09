package com.fersoft.peopledatalabs;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "school",
        "end_date",
        "start_date",
        "gpa",
        "degrees",
        "majors",
        "minors"
})
public class Education {
    @JsonProperty("school")
    private School school;
    @JsonProperty("end_date")
    private String endDate;
    @JsonProperty("start_date")
    private String startDate;
    @JsonProperty("gpa")
    private Object gpa;
    @JsonProperty("degrees")
    private List<Object> degrees = null;
    @JsonProperty("majors")
    private List<String> majors = null;
    @JsonProperty("minors")
    private List<Object> minors = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("school")
    public School getSchool() {
        return school;
    }

    @JsonProperty("school")
    public void setSchool(School school) {
        this.school = school;
    }

    @JsonProperty("end_date")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("end_date")
    public void setEndDate(String endDate) {
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

    @JsonProperty("gpa")
    public Object getGpa() {
        return gpa;
    }

    @JsonProperty("gpa")
    public void setGpa(Object gpa) {
        this.gpa = gpa;
    }

    @JsonProperty("degrees")
    public List<Object> getDegrees() {
        return degrees;
    }

    @JsonProperty("degrees")
    public void setDegrees(List<Object> degrees) {
        this.degrees = degrees;
    }

    @JsonProperty("majors")
    public List<String> getMajors() {
        return majors;
    }

    @JsonProperty("majors")
    public void setMajors(List<String> majors) {
        this.majors = majors;
    }

    @JsonProperty("minors")
    public List<Object> getMinors() {
        return minors;
    }

    @JsonProperty("minors")
    public void setMinors(List<Object> minors) {
        this.minors = minors;
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
