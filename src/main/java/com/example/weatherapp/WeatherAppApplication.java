package com.example.weatherapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.Scheduled;


@EnableJpaAuditing
@SpringBootApplication
public class WeatherAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeatherAppApplication.class, args);
    }

}
