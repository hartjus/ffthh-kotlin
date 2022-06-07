package com.axian.ffthh.controllers;

public class WeatherRequestJava {
    private String zip;

    public String getZip() {
        if (zip != null) {
            return zip;
        } else {
            return "n/a";
        }

    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
