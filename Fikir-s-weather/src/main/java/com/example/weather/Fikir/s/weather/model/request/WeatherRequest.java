package com.example.weather.Fikir.s.weather.model.request;

import lombok.Getter;
import lombok.Setter;


public class WeatherRequest {
    private String q; // City name
    private String statCode;
    private String countryCode;
    private String appid; // API key

    public WeatherRequest(String q, String statCode, String countryCode, String appid) {
        this.q = q;
        this.statCode = statCode;
        this.countryCode = countryCode;
        this.appid = appid;
    }


    // Getters and setters


    public String getStatCode() {
        return statCode;
    }

    public void setStatCode(String statCode) {
        this.statCode = statCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }
}