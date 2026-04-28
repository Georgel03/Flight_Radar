package com.flight.radar.app.service;

import com.flight.radar.api.dto.request.FlightRequestDto;
import com.flight.radar.api.dto.response.FlightResponseDto;
import com.flight.radar.app.repository.FlightRepository;
import com.flight.radar.app.repository.entity.FlightEntity;
import com.flight.radar.app.service.model.request.FlightRequest;
import com.flight.radar.app.service.model.response.FlightResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class FlightServiceImpl implements FlightService {

    private final FlightRepository flightsRepository;

    @Override
    @Transactional
    public FlightResponse create(FlightRequest request) {
        FlightEntity entity = FlightEntityMapperConverter.toEntity(request);
        return FlightEntityMapperConverter.toResponse(flightsRepository.save(entity));
    }
}