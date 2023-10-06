package com.example.weather.Fikir.s.weather.model.response.Exceptions;

public class ErrorResponses {
    private String message;

    public ErrorResponses(String message) {
        this.message = message;
    }

    // Getter and setter for the 'message' field
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}