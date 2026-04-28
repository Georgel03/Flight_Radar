package com.flight.radar.app.service;

import com.flight.radar.api.request.CitySearchRequestDto;
import com.flight.radar.app.service.model.request.CitySearchRequest;
import lombok.experimental.UtilityClass;

@UtilityClass
public class FlightSearchUtility {

    public CitySearchRequest convertToCitySearchRequest(CitySearchRequestDto requestDto) {
        return CitySearchRequest.builder()
                .arrivalLocation(requestDto.getArrivalLocationId())
                .departureLocation(requestDto.getDepartureLocationId())
                .build();
    }

}
