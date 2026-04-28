package com.flight.radar.app.service;

import com.flight.radar.app.service.model.response.CityResponse;
import com.flight.radar.app.service.model.request.CityRequest;

import java.util.List;

public interface CityService {

    List<CityResponse> findAll();

    void deleteCity(Long id);

    void addDetails(CityRequest request);
}
