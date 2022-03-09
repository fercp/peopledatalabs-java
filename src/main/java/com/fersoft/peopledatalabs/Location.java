package com.fersoft.peopledatalabs;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "locality",
        "region",
        "metro",
        "country",
        "continent",
        "street_address",
        "address_line_2",
        "postal_code",
        "geo"
})
public class Location {
    @JsonProperty("name")
    private String name;
    @JsonProperty("locality")
    private String locality;
    @JsonProperty("region")
    private String region;
    @JsonProperty("metro")
    private String metro;
    @JsonProperty("country")
    private String country;
    @JsonProperty("continent")
    private String continent;
    @JsonProperty("street_address")
    private String streetAddress;
    @JsonProperty("address_line_2")
    private String addressLine2;
    @JsonProperty("postal_code")
    private String postalCode;
    @JsonProperty("geo")
    private String geo;
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

    @JsonProperty("locality")
    public String getLocality() {
        return locality;
    }

    @JsonProperty("locality")
    public void setLocality(String locality) {
        this.locality = locality;
    }

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    @JsonProperty("metro")
    public String getMetro() {
        return metro;
    }

    @JsonProperty("metro")
    public void setMetro(String metro) {
        this.metro = metro;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("continent")
    public String getContinent() {
        return continent;
    }

    @JsonProperty("continent")
    public void setContinent(String continent) {
        this.continent = continent;
    }

    @JsonProperty("street_address")
    public String getStreetAddress() {
        return streetAddress;
    }

    @JsonProperty("street_address")
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    @JsonProperty("address_line_2")
    public String getAddressLine2() {
        return addressLine2;
    }

    @JsonProperty("address_line_2")
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    @JsonProperty("postal_code")
    public String getPostalCode() {
        return postalCode;
    }

    @JsonProperty("postal_code")
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("geo")
    public String getGeo() {
        return geo;
    }

    @JsonProperty("geo")
    public void setGeo(String geo) {
        this.geo = geo;
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
