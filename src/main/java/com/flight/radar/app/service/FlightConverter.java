package com.flight.radar.app.service;

import com.flight.radar.api.dto.request.FlightRequestDto;
import com.flight.radar.api.dto.response.FlightResponseDto;
import com.flight.radar.app.service.model.request.FlightRequest;
import com.flight.radar.app.service.model.response.FlightResponse;
import lombok.experimental.UtilityClass;

@UtilityClass
public class FlightConverter {

    public FlightRequest convertToFlightRequest(FlightRequestDto dto) {
        if (dto == null) {
            return null;
        }
        return FlightRequest.builder()
                .airplaneName(dto.getAirplaneName())
                .coordinates(dto.getCoordinates())
                .departureDate(dto.getDepartureDate())
                .arrivalDate(dto.getArrivalDate())
                .direction(dto.getDirection())
                .cost(dto.getCost())
                .departureLocation(dto.getDepartureLocation())
                .arrivalLocation(dto.getArrivalLocation())
                .duration(dto.getDuration())
                .status(dto.getStatus())
                .build();
    }

    public FlightResponseDto covertToFlightResponseDto(FlightResponse model) {
        if (model == null) {
            return null;
        }
        return FlightResponseDto.builder()
                .id(model.getId())
                .airplaneName(model.getAirplaneName())
                .coordinates(model.getCoordinates())
                .departureDate(model.getDepartureDate())
                .arrivalDate(model.getArrivalDate())
                .direction(model.getDirection())
                .cost(model.getCost())
                .departureLocation(model.getDepartureLocation())
                .arrivalLocation(model.getArrivalLocation())
                .duration(model.getDuration())
                .status(model.getStatus())
                .build();
    }
}
