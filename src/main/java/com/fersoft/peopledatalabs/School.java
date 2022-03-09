package com.fersoft.peopledatalabs;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "type",
        "id",
        "location",
        "linkedin_url",
        "facebook_url",
        "twitter_url",
        "linkedin_id",
        "website",
        "domain"
})
public class School {
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
    @JsonProperty("id")
    private String id;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("linkedin_url")
    private String linkedinUrl;
    @JsonProperty("facebook_url")
    private String facebookUrl;
    @JsonProperty("twitter_url")
    private String twitterUrl;
    @JsonProperty("linkedin_id")
    private String linkedinId;
    @JsonProperty("website")
    private String website;
    @JsonProperty("domain")
    private String domain;
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

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
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

    @JsonProperty("facebook_url")
    public String getFacebookUrl() {
        return facebookUrl;
    }

    @JsonProperty("facebook_url")
    public void setFacebookUrl(String facebookUrl) {
        this.facebookUrl = facebookUrl;
    }

    @JsonProperty("twitter_url")
    public String getTwitterUrl() {
        return twitterUrl;
    }

    @JsonProperty("twitter_url")
    public void setTwitterUrl(String twitterUrl) {
        this.twitterUrl = twitterUrl;
    }

    @JsonProperty("linkedin_id")
    public String getLinkedinId() {
        return linkedinId;
    }

    @JsonProperty("linkedin_id")
    public void setLinkedinId(String linkedinId) {
        this.linkedinId = linkedinId;
    }

    @JsonProperty("website")
    public String getWebsite() {
        return website;
    }

    @JsonProperty("website")
    public void setWebsite(String website) {
        this.website = website;
    }

    @JsonProperty("domain")
    public String getDomain() {
        return domain;
    }

    @JsonProperty("domain")
    public void setDomain(String domain) {
        this.domain = domain;
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
