package com.fersoft.peopledatalabs.enrichment;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class EnrichmentParams {
    @JsonProperty("name")
    private List<String> name;
    @JsonProperty("first_name")
    private List<String> firstName;
    @JsonProperty("last_name")
    private List<String> lastName;
    @JsonProperty("middle_name")
    private List<String> middleName;
    @JsonProperty("location")
    private List<String> location;
    @JsonProperty("street_address")
    private List<String> streetAddress;
    @JsonProperty("locality")
    private List<String> locality;
    @JsonProperty("region")
    private List<String> region;
    @JsonProperty("country")
    private List<String> country;
    @JsonProperty("postal_code")
    private List<String> postalCode;
    @JsonProperty("company")
    private List<String> company;
    @JsonProperty("school")
    private List<String> school;
    @JsonProperty("phone")
    private List<String> phone;
    @JsonProperty("email")
    private List<String> email;
    @JsonProperty("email_hash")
    private List<String> emailHash;
    @JsonProperty("profile")
    private List<String> profile;
    @JsonProperty("lid")
    private List<String> lid;
    @JsonProperty("birth_date")
    private LocalDate birthDate;
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


    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public List<String> getFirstName() {
        return firstName;
    }

    public void setFirstName(List<String> firstName) {
        this.firstName = firstName;
    }

    public List<String> getLastName() {
        return lastName;
    }

    public void setLastName(List<String> lastName) {
        this.lastName = lastName;
    }

    public List<String> getMiddleName() {
        return middleName;
    }

    public void setMiddleName(List<String> middleName) {
        this.middleName = middleName;
    }

    public List<String> getLocation() {
        return location;
    }

    public void setLocation(List<String> location) {
        this.location = location;
    }

    public List<String> getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(List<String> streetAddress) {
        this.streetAddress = streetAddress;
    }

    public List<String> getLocality() {
        return locality;
    }

    public void setLocality(List<String> locality) {
        this.locality = locality;
    }

    public List<String> getRegion() {
        return region;
    }

    public void setRegion(List<String> region) {
        this.region = region;
    }

    public List<String> getCountry() {
        return country;
    }

    public void setCountry(List<String> country) {
        this.country = country;
    }

    public List<String> getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(List<String> postalCode) {
        this.postalCode = postalCode;
    }

    public List<String> getCompany() {
        return company;
    }

    public void setCompany(List<String> company) {
        this.company = company;
    }

    public List<String> getSchool() {
        return school;
    }

    public void setSchool(List<String> school) {
        this.school = school;
    }

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    public List<String> getEmail() {
        return email;
    }

    public void setEmail(List<String> email) {
        this.email = email;
    }

    public List<String> getEmailHash() {
        return emailHash;
    }

    public void setEmailHash(List<String> emailHash) {
        this.emailHash = emailHash;
    }

    public List<String> getProfile() {
        return profile;
    }

    public void setProfile(List<String> profile) {
        this.profile = profile;
    }

    public List<String> getLid() {
        return lid;
    }

    public void setLid(List<String> lid) {
        this.lid = lid;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
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

    public void setTitleCase(Boolean titleCase) {
        this.titleCase = titleCase;
    }
}
