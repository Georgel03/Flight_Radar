package com.flight.radar.app.service;

import com.flight.radar.app.service.model.CityResponse;

import java.util.List;

public interface CityService {

    List<CityResponse> findAll();

    void deleteCity(Long id);
}
