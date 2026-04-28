package com.flight.radar.app.rest;

import com.flight.radar.api.FlightController;
import com.flight.radar.api.dto.request.FlightRequestDto;
import com.flight.radar.api.dto.response.FlightResponseDto;
import com.flight.radar.app.service.FlightConverter;
import com.flight.radar.app.service.FlightService;
import com.flight.radar.app.service.model.request.FlightRequest;
import com.flight.radar.app.service.model.response.FlightResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FlightControllerImpl implements FlightController {

    private final FlightService flightsService;

    @Override
    public ResponseEntity<FlightResponseDto> create(FlightRequestDto request) {
        FlightRequest model = FlightConverter.convertToFlightRequest(request);
        FlightResponse created = flightsService.create(model);
        return ResponseEntity.ok(FlightConverter.covertToFlightResponseDto(created));
    }


}