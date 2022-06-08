package com.example.weatherapp.models;

import lombok.Getter;

@Getter
public class WeatherRequestDto {
    private String city;
    private int highTemp;
    private int lowTemp;
}
