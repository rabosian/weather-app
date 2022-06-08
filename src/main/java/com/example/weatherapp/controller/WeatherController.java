package com.example.weatherapp.controller;

import com.example.weatherapp.models.Weather;
import com.example.weatherapp.models.WeatherRepository;
import com.example.weatherapp.models.WeatherRequestDto;
import com.example.weatherapp.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class WeatherController {
    private final WeatherRepository weatherRepository;
    private final WeatherService weatherService;

    @GetMapping("/api/weathers")
    public List<Weather> getWeathers() {
        return weatherRepository.findAll();
    }

    @PostMapping("/api/weathers")
    public Weather createWeather(@RequestBody WeatherRequestDto requestDto) {
        Weather w = new Weather(requestDto);
        return weatherRepository.save(w);
    }

    @DeleteMapping("/api/weathers/{id}")
    public Long deleteWeather(@PathVariable Long id) {
        weatherRepository.deleteById(id);
        return id;
    }

}
