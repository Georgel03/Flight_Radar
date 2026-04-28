package com.flight.radar.app.service;

import com.flight.radar.app.service.model.request.CitySearchRequest;
import com.flight.radar.app.service.model.response.FlightResponse;

import java.util.List;

public interface FlightSearchService {

    List<FlightResponse> searchFlightsBasedOnCities(CitySearchRequest citySearchRequest);
}
