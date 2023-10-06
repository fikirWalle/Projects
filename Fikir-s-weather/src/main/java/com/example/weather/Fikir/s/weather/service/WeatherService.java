package com.example.weather.Fikir.s.weather.service;


import com.example.weather.Fikir.s.weather.model.request.WeatherRequest;
import com.example.weather.Fikir.s.weather.model.response.WeatherResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class WeatherService {

    @Value("${openweathermap.api.key}")
    private String apiKey; // Load your API key from application.properties or application.yml
    @Value("${countrycode}")
    private String countryCode;
    @Value("${OPEN_WEATHER_MAP_API}")
    private String weatherAPI;


    private RestTemplate restTemplate;

    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public WeatherResponse getWeatherByCityName(String cityName, String stateCode) {
        WeatherRequest request = new WeatherRequest(cityName, stateCode, countryCode, apiKey);
        Map<String, String> uriVariables = new HashMap<>();
        uriVariables.put("cityName", request.getQ());
        uriVariables.put("stateCode", request.getStatCode());
        uriVariables.put("countryCode", request.getCountryCode());
        uriVariables.put("apiKey", request.getAppid());
        return restTemplate.getForObject(weatherAPI, WeatherResponse.class, uriVariables);
    }


}