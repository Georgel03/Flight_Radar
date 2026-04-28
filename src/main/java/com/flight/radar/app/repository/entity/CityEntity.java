package com.flight.radar.app.repository.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "city")
public class CityEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "city_name")
    private String cityName;

    public Long getId() {
        return id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
