package com.example.weather.Fikir.s.weather.model.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Main {

   private double temp;
    private double feels_like;
     private double temp_min;
     private double temp_max;
     private long pressure;
       private Integer humidity;
}
