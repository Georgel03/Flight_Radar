package com.flight.radar.app;

import com.flight.radar.api.FlightSearchController;
import com.flight.radar.api.request.CitySearchRequestDto;
import com.flight.radar.api.response.FlightResponseDto;
import com.flight.radar.app.repository.entity.FlightEntity;
import com.flight.radar.app.service.FlightSearchService;
import com.flight.radar.app.service.FlightSearchUtility;
import com.flight.radar.app.service.model.response.FlightResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class FlightSearchControllerImpl implements FlightSearchController {
    private final FlightSearchService flightSearchService;

    @Override
    public List<FlightResponseDto> search(CitySearchRequestDto requestDto) {
        var request = FlightSearchUtility.convertToCitySearchRequest(requestDto);
        var result = flightSearchService.searchFlightsBasedOnCities(request);
        List<FlightResponseDto> resultList = new ArrayList<>();

        for (var  entity: result ) {
            FlightResponseDto flightResponse = new FlightResponseDto();
            flightResponse.setId(entity.getId());
            flightResponse.setAirplaneName(entity.getAirplaneName());
            flightResponse.setCoordonates(entity.getCoordonates());
            flightResponse.setArrivalDate(entity.getArrivalDate());
            flightResponse.setDirection(entity.getDirection());
            flightResponse.setCost(entity.getCost());
            flightResponse.setDepartureLocationId(entity.getDepartureLocation());
            flightResponse.setArrivalLocationId(entity.getArrivalLocation());
            flightResponse.setDuration(entity.getDuration());
            flightResponse.setStatus(entity.getStatus());
            resultList.add(flightResponse);
        }
        return resultList;
    }
}
