package sampleWeatherResponse;

import com.example.weather.Fikir.s.weather.model.response.*;

import java.util.List;

public class WeatherResponse {
    public WeatherResponse() {
    }

    private Coord coord;
    private List<WeatherInfo> weather;
    private String base;
    private Main main;
    private int visibility;
    private Wind wind;
    private Clouds clouds;
    private long dt;
    private Sys sys;
    private int timezone;
    private int id;
    private String name;
    private int cod;
}
