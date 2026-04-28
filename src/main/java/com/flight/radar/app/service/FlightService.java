package com.flight.radar.app.service;

import com.flight.radar.app.service.model.request.FlightRequest;
import com.flight.radar.app.service.model.response.FlightResponse;

import java.util.List;

public interface FlightService {

    FlightResponse create(FlightRequest request);
}