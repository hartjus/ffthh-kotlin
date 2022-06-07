package com.axian.ffthh.controllers;

import com.axian.ffthh.models.ResponseMessageJava;
import com.axian.ffthh.service.WeatherServiceJava;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("java")
public class WeatherControllerJava {
    private Logger logger = LoggerFactory.getLogger(WeatherControllerJava.class);

    @Autowired
    private WeatherServiceJava weatherServiceJava;

    @PostMapping("/")
    public ResponseMessageJava getWeather(@RequestBody WeatherRequestJava request) {

        ResponseMessageJava response = new ResponseMessageJava();

        String description = this.weatherServiceJava.getWeather(request.getZip());

        final String message = request.getZip() + ": Never going to give you up! Never going to let you down!";
//        final String message = request.getZip() + ": " + description;

        response.setMessage(message);
        response.setStatus("success");

        return response;
    }
}
