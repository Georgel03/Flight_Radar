package com.flight.radar.app.service;

import com.flight.radar.app.repository.entity.FlightEntity;
import com.flight.radar.app.service.model.request.FlightRequest;
import com.flight.radar.app.service.model.response.FlightResponse;
import lombok.experimental.UtilityClass;

@UtilityClass
public class FlightEntityMapperConverter {

    public FlightEntity toEntity(FlightRequest request) {
        FlightEntity entity = new FlightEntity();
        applyRequest(entity, request);
        return entity;
    }

    public void applyRequest(FlightEntity entity, FlightRequest request) {
        entity.setAirplaneName(request.getAirplaneName());
        entity.setCoordinates(request.getCoordinates());
        entity.setDepartureDate(request.getDepartureDate());
        entity.setArrivalDate(request.getArrivalDate());
        entity.setDirection(request.getDirection());
        entity.setCost(request.getCost());
        entity.setDepartureLocation(request.getDepartureLocation());
        entity.setArrivalLocation(request.getArrivalLocation());
        entity.setDuration(request.getDuration());
        entity.setStatus(request.getStatus());
    }

    public FlightResponse toResponse(FlightEntity entity) {
        return FlightResponse.builder()
                .id(entity.getId())
                .airplaneName(entity.getAirplaneName())
                .coordonates(entity.getCoordinates())
                .departureDate(entity.getDepartureDate())
                .arrivalDate(entity.getArrivalDate())
                .direction(entity.getDirection())
                .cost(entity.getCost())
                .departureLocation(entity.getDepartureLocation())
                .arrivalLocation(entity.getArrivalLocation())
                .duration(entity.getDuration())
                .status(entity.getStatus())
                .build();
    }
}