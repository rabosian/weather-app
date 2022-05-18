package com.example.weatherapp.controller;

import com.example.weatherapp.models.WeatherRepository;
import com.example.weatherapp.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class WeatherController {
    private final WeatherRepository weatherRepository;
    private final WeatherService weatherService;

//    @GetMapping()
//    @PostMapping()
//    @PutMapping()
}
