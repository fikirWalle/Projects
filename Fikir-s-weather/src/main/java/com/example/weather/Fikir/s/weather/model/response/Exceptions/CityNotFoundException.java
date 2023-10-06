package com.example.weather.Fikir.s.weather.model.response.Exceptions;

public class CityNotFoundException extends RuntimeException {

    public CityNotFoundException(String message) {
        super(message);
    }
}
