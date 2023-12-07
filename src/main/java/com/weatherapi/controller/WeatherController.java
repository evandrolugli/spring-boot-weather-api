package com.weatherapi.controller;

import com.weatherapi.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    @GetMapping("/weather/current/{city}")
    public String getCurrentWeather(@PathVariable String city) {
        String apiKey = "e2bb0070e680cf07a460609295c5d404"; // replace with your OpenWeatherMap API key
        return weatherService.getCurrentWeather(city, apiKey);
    }

    @GetMapping("/weather/forecast/{city}")
    public String getForecastWeather(@PathVariable String city) {
        String apiKey = "e2bb0070e680cf07a460609295c5d404"; // replace with your OpenWeatherMap API key
        return weatherService.getForecastWeather(city, apiKey);
    }
}
