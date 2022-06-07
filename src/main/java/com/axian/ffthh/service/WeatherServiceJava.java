package com.axian.ffthh.service;

import com.axian.ffthh.data.Forecast;
import com.axian.ffthh.data.WeatherRepoJava;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherServiceJava {

    private Logger logger = LoggerFactory.getLogger(WeatherServiceJava.class);

    @Autowired
    private WeatherRepoJava weatherRepoJava;

    public String getWeather(String zip) {
        Forecast forecast = this.weatherRepoJava.findOneByZip(zip);

        return forecast.getDescription();
    }
}
