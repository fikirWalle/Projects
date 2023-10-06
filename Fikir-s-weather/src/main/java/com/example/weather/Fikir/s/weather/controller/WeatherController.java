package com.example.weather.Fikir.s.weather.controller;


import com.example.weather.Fikir.s.weather.model.request.WeatherRequest;
import com.example.weather.Fikir.s.weather.model.response.Exceptions.CityNotFoundException;
import com.example.weather.Fikir.s.weather.model.response.Exceptions.ErrorResponses;
import com.example.weather.Fikir.s.weather.model.response.Exceptions.StateNotFoundException;
import com.example.weather.Fikir.s.weather.model.response.WeatherResponse;
import com.example.weather.Fikir.s.weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.*;


@RestController
public class WeatherController {
    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @PostMapping("/api/weather")
    public ResponseEntity<?> getWeatherByCityName(@RequestBody WeatherRequest request) {
        try {
            // Use the request object to get the city name and other data
            String cityName = request.getQ().trim();
            String stateName = request.getStatCode();

            // Fetch weather data using the city name
            WeatherResponse weatherResponse = weatherService.getWeatherByCityName(cityName, stateName);

            if (weatherResponse != null) {
                return ResponseEntity.ok(weatherResponse);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (CityNotFoundException | StateNotFoundException ex) {
            // Handle the custom exceptions and return an error response
            ErrorResponses errorResponse = new ErrorResponses(ex.getMessage());
            return ResponseEntity.badRequest().body(errorResponse);
        }
    }
    @ExceptionHandler(CityNotFoundException.class)
    // Exception handler for CityNotFoundException
    public ResponseEntity<ErrorResponses> handleCityNotFoundException(CityNotFoundException ex) {
        return ResponseEntity.badRequest().body(new ErrorResponses(ex.getMessage()));
    }

    // Exception handler for StateNotFoundException

    @ExceptionHandler(StateNotFoundException.class)
    public ResponseEntity<ErrorResponses> handleStateNotFoundException(StateNotFoundException ex) {
        return ResponseEntity.badRequest().body(new ErrorResponses(ex.getMessage()));
    }
    }


