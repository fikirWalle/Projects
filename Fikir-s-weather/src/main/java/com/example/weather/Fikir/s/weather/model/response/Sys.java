package com.example.weather.Fikir.s.weather.model.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Sys {

   private int type;
    private int id;
     private String country;
     private long  sunrise;
      private long   sunset;
}
