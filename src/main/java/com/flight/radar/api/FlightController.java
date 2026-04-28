package com.flight.radar.api;

import com.flight.radar.api.dto.request.FlightRequestDto;
import com.flight.radar.api.dto.response.FlightResponseDto;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RequestMapping("flights")
public interface FlightController {

    @PostMapping
    ResponseEntity<FlightResponseDto> create(@Valid @RequestBody FlightRequestDto request);

}