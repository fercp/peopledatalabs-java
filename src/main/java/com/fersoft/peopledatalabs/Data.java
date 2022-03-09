package com.fersoft.peopledatalabs;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "full_name",
        "first_name",
        "middle_initial",
        "middle_name",
        "last_initial",
        "last_name",
        "gender",
        "birth_year",
        "birth_date",
        "linkedin_url",
        "linkedin_username",
        "linkedin_id",
        "facebook_url",
        "facebook_username",
        "facebook_id",
        "twitter_url",
        "twitter_username",
        "github_url",
        "github_username",
        "work_email",
        "personal_emails",
        "mobile_phone",
        "industry",
        "job_title",
        "job_title_role",
        "job_title_sub_role",
        "job_title_levels",
        "job_company_id",
        "job_company_name",
        "job_company_website",
        "job_company_size",
        "job_company_founded",
        "job_company_industry",
        "job_company_linkedin_url",
        "job_company_linkedin_id",
        "job_company_facebook_url",
        "job_company_twitter_url",
        "job_company_location_name",
        "job_company_location_locality",
        "job_company_location_metro",
        "job_company_location_region",
        "job_company_location_geo",
        "job_company_location_street_address",
        "job_company_location_address_line_2",
        "job_company_location_postal_code",
        "job_company_location_country",
        "job_company_location_continent",
        "job_last_updated",
        "job_start_date",
        "location_name",
        "location_locality",
        "location_metro",
        "location_region",
        "location_country",
        "location_continent",
        "location_street_address",
        "location_address_line_2",
        "location_postal_code",
        "location_geo",
        "location_last_updated",
        "phone_numbers",
        "emails",
        "interests",
        "skills",
        "location_names",
        "regions",
        "countries",
        "street_addresses",
        "experience",
        "education",
        "profiles",
        "version_status"
})
public class Data {

    @JsonProperty("id")
    private String id;
    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("middle_initial")
    private String middleInitial;
    @JsonProperty("middle_name")
    private String middleName;
    @JsonProperty("last_initial")
    private String lastInitial;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("birth_year")
    private Integer birthYear;
    @JsonProperty("birth_date")
    private Object birthDate;
    @JsonProperty("linkedin_url")
    private String linkedinUrl;
    @JsonProperty("linkedin_username")
    private String linkedinUsername;
    @JsonProperty("linkedin_id")
    private String linkedinId;
    @JsonProperty("facebook_url")
    private String facebookUrl;
    @JsonProperty("facebook_username")
    private String facebookUsername;
    @JsonProperty("facebook_id")
    private String facebookId;
    @JsonProperty("twitter_url")
    private String twitterUrl;
    @JsonProperty("twitter_username")
    private String twitterUsername;
    @JsonProperty("github_url")
    private Object githubUrl;
    @JsonProperty("github_username")
    private Object githubUsername;
    @JsonProperty("work_email")
    private String workEmail;
    @JsonProperty("personal_emails")
    private List<Object> personalEmails = null;
    @JsonProperty("mobile_phone")
    private String mobilePhone;
    @JsonProperty("industry")
    private String industry;
    @JsonProperty("job_title")
    private String jobTitle;
    @JsonProperty("job_title_role")
    private Object jobTitleRole;
    @JsonProperty("job_title_sub_role")
    private Object jobTitleSubRole;
    @JsonProperty("job_title_levels")
    private List<String> jobTitleLevels = null;
    @JsonProperty("job_company_id")
    private String jobCompanyId;
    @JsonProperty("job_company_name")
    private String jobCompanyName;
    @JsonProperty("job_company_website")
    private String jobCompanyWebsite;
    @JsonProperty("job_company_size")
    private String jobCompanySize;
    @JsonProperty("job_company_founded")
    private Integer jobCompanyFounded;
    @JsonProperty("job_company_industry")
    private String jobCompanyIndustry;
    @JsonProperty("job_company_linkedin_url")
    private String jobCompanyLinkedinUrl;
    @JsonProperty("job_company_linkedin_id")
    private String jobCompanyLinkedinId;
    @JsonProperty("job_company_facebook_url")
    private String jobCompanyFacebookUrl;
    @JsonProperty("job_company_twitter_url")
    private Object jobCompanyTwitterUrl;
    @JsonProperty("job_company_location_name")
    private String jobCompanyLocationName;
    @JsonProperty("job_company_location_locality")
    private String jobCompanyLocationLocality;
    @JsonProperty("job_company_location_metro")
    private String jobCompanyLocationMetro;
    @JsonProperty("job_company_location_region")
    private String jobCompanyLocationRegion;
    @JsonProperty("job_company_location_geo")
    private String jobCompanyLocationGeo;
    @JsonProperty("job_company_location_street_address")
    private String jobCompanyLocationStreetAddress;
    @JsonProperty("job_company_location_address_line_2")
    private String jobCompanyLocationAddressLine2;
    @JsonProperty("job_company_location_postal_code")
    private String jobCompanyLocationPostalCode;
    @JsonProperty("job_company_location_country")
    private String jobCompanyLocationCountry;
    @JsonProperty("job_company_location_continent")
    private String jobCompanyLocationContinent;
    @JsonProperty("job_last_updated")
    private String jobLastUpdated;
    @JsonProperty("job_start_date")
    private String jobStartDate;
    @JsonProperty("location_name")
    private String locationName;
    @JsonProperty("location_locality")
    private String locationLocality;
    @JsonProperty("location_metro")
    private String locationMetro;
    @JsonProperty("location_region")
    private String locationRegion;
    @JsonProperty("location_country")
    private String locationCountry;
    @JsonProperty("location_continent")
    private String locationContinent;
    @JsonProperty("location_street_address")
    private Object locationStreetAddress;
    @JsonProperty("location_address_line_2")
    private Object locationAddressLine2;
    @JsonProperty("location_postal_code")
    private Object locationPostalCode;
    @JsonProperty("location_geo")
    private String locationGeo;
    @JsonProperty("location_last_updated")
    private String locationLastUpdated;
    @JsonProperty("phone_numbers")
    private List<String> phoneNumbers = null;
    @JsonProperty("emails")
    private List<Email> emails = null;
    @JsonProperty("interests")
    private List<String> interests = null;
    @JsonProperty("skills")
    private List<String> skills = null;
    @JsonProperty("location_names")
    private List<String> locationNames = null;
    @JsonProperty("regions")
    private List<String> regions = null;
    @JsonProperty("countries")
    private List<String> countries = null;
    @JsonProperty("street_addresses")
    private List<Object> streetAddresses = null;
    @JsonProperty("experience")
    private List<Experience> experience = null;
    @JsonProperty("education")
    private List<Education> education = null;
    @JsonProperty("profiles")
    private List<Profile> profiles = null;
    @JsonProperty("version_status")
    private VersionStatus versionStatus;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("full_name")
    public String getFullName() {
        return fullName;
    }

    @JsonProperty("full_name")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("middle_initial")
    public String getMiddleInitial() {
        return middleInitial;
    }

    @JsonProperty("middle_initial")
    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    @JsonProperty("middle_name")
    public String getMiddleName() {
        return middleName;
    }

    @JsonProperty("middle_name")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @JsonProperty("last_initial")
    public String getLastInitial() {
        return lastInitial;
    }

    @JsonProperty("last_initial")
    public void setLastInitial(String lastInitial) {
        this.lastInitial = lastInitial;
    }

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("gender")
    public String getGender() {
        return gender;
    }

    @JsonProperty("gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("birth_year")
    public Integer getBirthYear() {
        return birthYear;
    }

    @JsonProperty("birth_year")
    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    @JsonProperty("birth_date")
    public Object getBirthDate() {
        return birthDate;
    }

    @JsonProperty("birth_date")
    public void setBirthDate(Object birthDate) {
        this.birthDate = birthDate;
    }

    @JsonProperty("linkedin_url")
    public String getLinkedinUrl() {
        return linkedinUrl;
    }

    @JsonProperty("linkedin_url")
    public void setLinkedinUrl(String linkedinUrl) {
        this.linkedinUrl = linkedinUrl;
    }

    @JsonProperty("linkedin_username")
    public String getLinkedinUsername() {
        return linkedinUsername;
    }

    @JsonProperty("linkedin_username")
    public void setLinkedinUsername(String linkedinUsername) {
        this.linkedinUsername = linkedinUsername;
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

    @JsonProperty("facebook_username")
    public String getFacebookUsername() {
        return facebookUsername;
    }

    @JsonProperty("facebook_username")
    public void setFacebookUsername(String facebookUsername) {
        this.facebookUsername = facebookUsername;
    }

    @JsonProperty("facebook_id")
    public String getFacebookId() {
        return facebookId;
    }

    @JsonProperty("facebook_id")
    public void setFacebookId(String facebookId) {
        this.facebookId = facebookId;
    }

    @JsonProperty("twitter_url")
    public String getTwitterUrl() {
        return twitterUrl;
    }

    @JsonProperty("twitter_url")
    public void setTwitterUrl(String twitterUrl) {
        this.twitterUrl = twitterUrl;
    }

    @JsonProperty("twitter_username")
    public String getTwitterUsername() {
        return twitterUsername;
    }

    @JsonProperty("twitter_username")
    public void setTwitterUsername(String twitterUsername) {
        this.twitterUsername = twitterUsername;
    }

    @JsonProperty("github_url")
    public Object getGithubUrl() {
        return githubUrl;
    }

    @JsonProperty("github_url")
    public void setGithubUrl(Object githubUrl) {
        this.githubUrl = githubUrl;
    }

    @JsonProperty("github_username")
    public Object getGithubUsername() {
        return githubUsername;
    }

    @JsonProperty("github_username")
    public void setGithubUsername(Object githubUsername) {
        this.githubUsername = githubUsername;
    }

    @JsonProperty("work_email")
    public String getWorkEmail() {
        return workEmail;
    }

    @JsonProperty("work_email")
    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    @JsonProperty("personal_emails")
    public List<Object> getPersonalEmails() {
        return personalEmails;
    }

    @JsonProperty("personal_emails")
    public void setPersonalEmails(List<Object> personalEmails) {
        this.personalEmails = personalEmails;
    }

    @JsonProperty("mobile_phone")
    public String getMobilePhone() {
        return mobilePhone;
    }

    @JsonProperty("mobile_phone")
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    @JsonProperty("industry")
    public String getIndustry() {
        return industry;
    }

    @JsonProperty("industry")
    public void setIndustry(String industry) {
        this.industry = industry;
    }

    @JsonProperty("job_title")
    public String getJobTitle() {
        return jobTitle;
    }

    @JsonProperty("job_title")
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @JsonProperty("job_title_role")
    public Object getJobTitleRole() {
        return jobTitleRole;
    }

    @JsonProperty("job_title_role")
    public void setJobTitleRole(Object jobTitleRole) {
        this.jobTitleRole = jobTitleRole;
    }

    @JsonProperty("job_title_sub_role")
    public Object getJobTitleSubRole() {
        return jobTitleSubRole;
    }

    @JsonProperty("job_title_sub_role")
    public void setJobTitleSubRole(Object jobTitleSubRole) {
        this.jobTitleSubRole = jobTitleSubRole;
    }

    @JsonProperty("job_title_levels")
    public List<String> getJobTitleLevels() {
        return jobTitleLevels;
    }

    @JsonProperty("job_title_levels")
    public void setJobTitleLevels(List<String> jobTitleLevels) {
        this.jobTitleLevels = jobTitleLevels;
    }

    @JsonProperty("job_company_id")
    public String getJobCompanyId() {
        return jobCompanyId;
    }

    @JsonProperty("job_company_id")
    public void setJobCompanyId(String jobCompanyId) {
        this.jobCompanyId = jobCompanyId;
    }

    @JsonProperty("job_company_name")
    public String getJobCompanyName() {
        return jobCompanyName;
    }

    @JsonProperty("job_company_name")
    public void setJobCompanyName(String jobCompanyName) {
        this.jobCompanyName = jobCompanyName;
    }

    @JsonProperty("job_company_website")
    public String getJobCompanyWebsite() {
        return jobCompanyWebsite;
    }

    @JsonProperty("job_company_website")
    public void setJobCompanyWebsite(String jobCompanyWebsite) {
        this.jobCompanyWebsite = jobCompanyWebsite;
    }

    @JsonProperty("job_company_size")
    public String getJobCompanySize() {
        return jobCompanySize;
    }

    @JsonProperty("job_company_size")
    public void setJobCompanySize(String jobCompanySize) {
        this.jobCompanySize = jobCompanySize;
    }

    @JsonProperty("job_company_founded")
    public Integer getJobCompanyFounded() {
        return jobCompanyFounded;
    }

    @JsonProperty("job_company_founded")
    public void setJobCompanyFounded(Integer jobCompanyFounded) {
        this.jobCompanyFounded = jobCompanyFounded;
    }

    @JsonProperty("job_company_industry")
    public String getJobCompanyIndustry() {
        return jobCompanyIndustry;
    }

    @JsonProperty("job_company_industry")
    public void setJobCompanyIndustry(String jobCompanyIndustry) {
        this.jobCompanyIndustry = jobCompanyIndustry;
    }

    @JsonProperty("job_company_linkedin_url")
    public String getJobCompanyLinkedinUrl() {
        return jobCompanyLinkedinUrl;
    }

    @JsonProperty("job_company_linkedin_url")
    public void setJobCompanyLinkedinUrl(String jobCompanyLinkedinUrl) {
        this.jobCompanyLinkedinUrl = jobCompanyLinkedinUrl;
    }

    @JsonProperty("job_company_linkedin_id")
    public String getJobCompanyLinkedinId() {
        return jobCompanyLinkedinId;
    }

    @JsonProperty("job_company_linkedin_id")
    public void setJobCompanyLinkedinId(String jobCompanyLinkedinId) {
        this.jobCompanyLinkedinId = jobCompanyLinkedinId;
    }

    @JsonProperty("job_company_facebook_url")
    public String getJobCompanyFacebookUrl() {
        return jobCompanyFacebookUrl;
    }

    @JsonProperty("job_company_facebook_url")
    public void setJobCompanyFacebookUrl(String jobCompanyFacebookUrl) {
        this.jobCompanyFacebookUrl = jobCompanyFacebookUrl;
    }

    @JsonProperty("job_company_twitter_url")
    public Object getJobCompanyTwitterUrl() {
        return jobCompanyTwitterUrl;
    }

    @JsonProperty("job_company_twitter_url")
    public void setJobCompanyTwitterUrl(Object jobCompanyTwitterUrl) {
        this.jobCompanyTwitterUrl = jobCompanyTwitterUrl;
    }

    @JsonProperty("job_company_location_name")
    public String getJobCompanyLocationName() {
        return jobCompanyLocationName;
    }

    @JsonProperty("job_company_location_name")
    public void setJobCompanyLocationName(String jobCompanyLocationName) {
        this.jobCompanyLocationName = jobCompanyLocationName;
    }

    @JsonProperty("job_company_location_locality")
    public String getJobCompanyLocationLocality() {
        return jobCompanyLocationLocality;
    }

    @JsonProperty("job_company_location_locality")
    public void setJobCompanyLocationLocality(String jobCompanyLocationLocality) {
        this.jobCompanyLocationLocality = jobCompanyLocationLocality;
    }

    @JsonProperty("job_company_location_metro")
    public String getJobCompanyLocationMetro() {
        return jobCompanyLocationMetro;
    }

    @JsonProperty("job_company_location_metro")
    public void setJobCompanyLocationMetro(String jobCompanyLocationMetro) {
        this.jobCompanyLocationMetro = jobCompanyLocationMetro;
    }

    @JsonProperty("job_company_location_region")
    public String getJobCompanyLocationRegion() {
        return jobCompanyLocationRegion;
    }

    @JsonProperty("job_company_location_region")
    public void setJobCompanyLocationRegion(String jobCompanyLocationRegion) {
        this.jobCompanyLocationRegion = jobCompanyLocationRegion;
    }

    @JsonProperty("job_company_location_geo")
    public String getJobCompanyLocationGeo() {
        return jobCompanyLocationGeo;
    }

    @JsonProperty("job_company_location_geo")
    public void setJobCompanyLocationGeo(String jobCompanyLocationGeo) {
        this.jobCompanyLocationGeo = jobCompanyLocationGeo;
    }

    @JsonProperty("job_company_location_street_address")
    public String getJobCompanyLocationStreetAddress() {
        return jobCompanyLocationStreetAddress;
    }

    @JsonProperty("job_company_location_street_address")
    public void setJobCompanyLocationStreetAddress(String jobCompanyLocationStreetAddress) {
        this.jobCompanyLocationStreetAddress = jobCompanyLocationStreetAddress;
    }

    @JsonProperty("job_company_location_address_line_2")
    public String getJobCompanyLocationAddressLine2() {
        return jobCompanyLocationAddressLine2;
    }

    @JsonProperty("job_company_location_address_line_2")
    public void setJobCompanyLocationAddressLine2(String jobCompanyLocationAddressLine2) {
        this.jobCompanyLocationAddressLine2 = jobCompanyLocationAddressLine2;
    }

    @JsonProperty("job_company_location_postal_code")
    public String getJobCompanyLocationPostalCode() {
        return jobCompanyLocationPostalCode;
    }

    @JsonProperty("job_company_location_postal_code")
    public void setJobCompanyLocationPostalCode(String jobCompanyLocationPostalCode) {
        this.jobCompanyLocationPostalCode = jobCompanyLocationPostalCode;
    }

    @JsonProperty("job_company_location_country")
    public String getJobCompanyLocationCountry() {
        return jobCompanyLocationCountry;
    }

    @JsonProperty("job_company_location_country")
    public void setJobCompanyLocationCountry(String jobCompanyLocationCountry) {
        this.jobCompanyLocationCountry = jobCompanyLocationCountry;
    }

    @JsonProperty("job_company_location_continent")
    public String getJobCompanyLocationContinent() {
        return jobCompanyLocationContinent;
    }

    @JsonProperty("job_company_location_continent")
    public void setJobCompanyLocationContinent(String jobCompanyLocationContinent) {
        this.jobCompanyLocationContinent = jobCompanyLocationContinent;
    }

    @JsonProperty("job_last_updated")
    public String getJobLastUpdated() {
        return jobLastUpdated;
    }

    @JsonProperty("job_last_updated")
    public void setJobLastUpdated(String jobLastUpdated) {
        this.jobLastUpdated = jobLastUpdated;
    }

    @JsonProperty("job_start_date")
    public String getJobStartDate() {
        return jobStartDate;
    }

    @JsonProperty("job_start_date")
    public void setJobStartDate(String jobStartDate) {
        this.jobStartDate = jobStartDate;
    }

    @JsonProperty("location_name")
    public String getLocationName() {
        return locationName;
    }

    @JsonProperty("location_name")
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    @JsonProperty("location_locality")
    public String getLocationLocality() {
        return locationLocality;
    }

    @JsonProperty("location_locality")
    public void setLocationLocality(String locationLocality) {
        this.locationLocality = locationLocality;
    }

    @JsonProperty("location_metro")
    public String getLocationMetro() {
        return locationMetro;
    }

    @JsonProperty("location_metro")
    public void setLocationMetro(String locationMetro) {
        this.locationMetro = locationMetro;
    }

    @JsonProperty("location_region")
    public String getLocationRegion() {
        return locationRegion;
    }

    @JsonProperty("location_region")
    public void setLocationRegion(String locationRegion) {
        this.locationRegion = locationRegion;
    }

    @JsonProperty("location_country")
    public String getLocationCountry() {
        return locationCountry;
    }

    @JsonProperty("location_country")
    public void setLocationCountry(String locationCountry) {
        this.locationCountry = locationCountry;
    }

    @JsonProperty("location_continent")
    public String getLocationContinent() {
        return locationContinent;
    }

    @JsonProperty("location_continent")
    public void setLocationContinent(String locationContinent) {
        this.locationContinent = locationContinent;
    }

    @JsonProperty("location_street_address")
    public Object getLocationStreetAddress() {
        return locationStreetAddress;
    }

    @JsonProperty("location_street_address")
    public void setLocationStreetAddress(Object locationStreetAddress) {
        this.locationStreetAddress = locationStreetAddress;
    }

    @JsonProperty("location_address_line_2")
    public Object getLocationAddressLine2() {
        return locationAddressLine2;
    }

    @JsonProperty("location_address_line_2")
    public void setLocationAddressLine2(Object locationAddressLine2) {
        this.locationAddressLine2 = locationAddressLine2;
    }

    @JsonProperty("location_postal_code")
    public Object getLocationPostalCode() {
        return locationPostalCode;
    }

    @JsonProperty("location_postal_code")
    public void setLocationPostalCode(Object locationPostalCode) {
        this.locationPostalCode = locationPostalCode;
    }

    @JsonProperty("location_geo")
    public String getLocationGeo() {
        return locationGeo;
    }

    @JsonProperty("location_geo")
    public void setLocationGeo(String locationGeo) {
        this.locationGeo = locationGeo;
    }

    @JsonProperty("location_last_updated")
    public String getLocationLastUpdated() {
        return locationLastUpdated;
    }

    @JsonProperty("location_last_updated")
    public void setLocationLastUpdated(String locationLastUpdated) {
        this.locationLastUpdated = locationLastUpdated;
    }

    @JsonProperty("phone_numbers")
    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    @JsonProperty("phone_numbers")
    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @JsonProperty("emails")
    public List<Email> getEmails() {
        return emails;
    }

    @JsonProperty("emails")
    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    @JsonProperty("interests")
    public List<String> getInterests() {
        return interests;
    }

    @JsonProperty("interests")
    public void setInterests(List<String> interests) {
        this.interests = interests;
    }

    @JsonProperty("skills")
    public List<String> getSkills() {
        return skills;
    }

    @JsonProperty("skills")
    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    @JsonProperty("location_names")
    public List<String> getLocationNames() {
        return locationNames;
    }

    @JsonProperty("location_names")
    public void setLocationNames(List<String> locationNames) {
        this.locationNames = locationNames;
    }

    @JsonProperty("regions")
    public List<String> getRegions() {
        return regions;
    }

    @JsonProperty("regions")
    public void setRegions(List<String> regions) {
        this.regions = regions;
    }

    @JsonProperty("countries")
    public List<String> getCountries() {
        return countries;
    }

    @JsonProperty("countries")
    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    @JsonProperty("street_addresses")
    public List<Object> getStreetAddresses() {
        return streetAddresses;
    }

    @JsonProperty("street_addresses")
    public void setStreetAddresses(List<Object> streetAddresses) {
        this.streetAddresses = streetAddresses;
    }

    @JsonProperty("experience")
    public List<Experience> getExperience() {
        return experience;
    }

    @JsonProperty("experience")
    public void setExperience(List<Experience> experience) {
        this.experience = experience;
    }

    @JsonProperty("education")
    public List<Education> getEducation() {
        return education;
    }

    @JsonProperty("education")
    public void setEducation(List<Education> education) {
        this.education = education;
    }

    @JsonProperty("profiles")
    public List<Profile> getProfiles() {
        return profiles;
    }

    @JsonProperty("profiles")
    public void setProfiles(List<Profile> profiles) {
        this.profiles = profiles;
    }

    @JsonProperty("version_status")
    public VersionStatus getVersionStatus() {
        return versionStatus;
    }

    @JsonProperty("version_status")
    public void setVersionStatus(VersionStatus versionStatus) {
        this.versionStatus = versionStatus;
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
