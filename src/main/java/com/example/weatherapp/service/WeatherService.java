package com.example.weatherapp.service;

import com.example.weatherapp.models.WeatherRepository;
import com.example.weatherapp.models.WeatherRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class WeatherService {
    private WeatherRepository weatherRepository;

//    @Transactional
//    public Long updateWeather(Long id, WeatherRequestDto requestDto) {
//
//    }
}
