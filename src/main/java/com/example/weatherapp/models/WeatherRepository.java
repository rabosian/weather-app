package com.example.weatherapp.models;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherRepository extends JpaRepository<Weather, Long> {
}
