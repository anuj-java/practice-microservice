package com.sample.ms.application.model;

/**
 * Created by akothiyal on 15/07/2018.
 */
public class Address {
    private String buildingName;
    private String streetName;
    private String state;
    private String country;
    private String postCode;

    public Address(String buildingName, String streetName, String state, String country, String postCode) {
        this.buildingName = buildingName;
        this.streetName = streetName;
        this.state = state;
        this.country = country;
        this.postCode = postCode;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "buildingName='" + buildingName + '\'' +
                ", streetName='" + streetName + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", postCode='" + postCode + '\'' +
                '}';
    }
}
