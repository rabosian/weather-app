package com.example.weatherapp.models;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Weather extends Timestamped{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private int highTemp;

    @Column(nullable = false)
    private int lowTemp;

    public Weather(WeatherRequestDto requestDto) {
        this.city = requestDto.getCity();
        this.highTemp = requestDto.getHighTemp();
        this.lowTemp = requestDto.getLowTemp();
    }

}
