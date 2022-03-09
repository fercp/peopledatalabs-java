package com.fersoft.peopledatalabs;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "size",
        "id",
        "founded",
        "industry",
        "location",
        "linkedin_url",
        "linkedin_id",
        "facebook_url",
        "twitter_url",
        "website"
})
public class Company {

    @JsonProperty("name")
    private String name;
    @JsonProperty("size")
    private String size;
    @JsonProperty("id")
    private String id;
    @JsonProperty("founded")
    private Integer founded;
    @JsonProperty("industry")
    private String industry;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("linkedin_url")
    private String linkedinUrl;
    @JsonProperty("linkedin_id")
    private String linkedinId;
    @JsonProperty("facebook_url")
    private String facebookUrl;
    @JsonProperty("twitter_url")
    private Object twitterUrl;
    @JsonProperty("website")
    private String website;
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

    @JsonProperty("size")
    public String getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(String size) {
        this.size = size;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("founded")
    public Integer getFounded() {
        return founded;
    }

    @JsonProperty("founded")
    public void setFounded(Integer founded) {
        this.founded = founded;
    }

    @JsonProperty("industry")
    public String getIndustry() {
        return industry;
    }

    @JsonProperty("industry")
    public void setIndustry(String industry) {
        this.industry = industry;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("linkedin_url")
    public String getLinkedinUrl() {
        return linkedinUrl;
    }

    @JsonProperty("linkedin_url")
    public void setLinkedinUrl(String linkedinUrl) {
        this.linkedinUrl = linkedinUrl;
    }

    @JsonProperty("linkedin_id")
    public String getLinkedinId() {
        return linkedinId;
    }

    @JsonProperty("linkedin_id")
    public void setLinkedinId(String linkedinId) {
        this.linkedinId = linkedinId;
    }

    @JsonProperty("facebook_url")
    public String getFacebookUrl() {
        return facebookUrl;
    }

    @JsonProperty("facebook_url")
    public void setFacebookUrl(String facebookUrl) {
        this.facebookUrl = facebookUrl;
    }

    @JsonProperty("twitter_url")
    public Object getTwitterUrl() {
        return twitterUrl;
    }

    @JsonProperty("twitter_url")
    public void setTwitterUrl(Object twitterUrl) {
        this.twitterUrl = twitterUrl;
    }

    @JsonProperty("website")
    public String getWebsite() {
        return website;
    }

    @JsonProperty("website")
    public void setWebsite(String website) {
        this.website = website;
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
