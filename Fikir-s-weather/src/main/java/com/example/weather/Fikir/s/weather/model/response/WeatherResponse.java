package com.example.weather.Fikir.s.weather.model.response;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
@Getter
@Setter
@ResponseBody
public class WeatherResponse {

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

    public Coord getCoord() {
        return coord;
    }

}
