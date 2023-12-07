package com.weatherapi.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class WeatherService {
    private static final String CURRENT_WEATHER_URL = "http://api.openweathermap.org/data/2.5/weather?q={city}&appid={apiKey}";
    private static final String FORECAST_WEATHER_URL = "http://api.openweathermap.org/data/2.5/forecast?q={city}&appid={apiKey}";

    public String getCurrentWeather(String city, String apiKey) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(CURRENT_WEATHER_URL, String.class, city, apiKey);
        return response.getBody();
    }

    public String getForecastWeather(String city, String apiKey) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(FORECAST_WEATHER_URL, String.class, city, apiKey);
        return response.getBody();
    }
}
