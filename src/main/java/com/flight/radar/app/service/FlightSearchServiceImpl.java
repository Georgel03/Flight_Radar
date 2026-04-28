package com.flight.radar.app.service;

import com.flight.radar.api.response.FlightResponseDto;
import com.flight.radar.app.repository.FlightRepository;
import com.flight.radar.app.repository.entity.FlightEntity;
import com.flight.radar.app.service.model.request.CitySearchRequest;
import com.flight.radar.app.service.model.response.FlightResponse;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Builder
@Service
@RequiredArgsConstructor
public class FlightSearchServiceImpl implements FlightSearchService {

    private final FlightRepository flightRepository;


    @Override
    public List<FlightResponse> searchFlightsBasedOnCities(CitySearchRequest citySearchRequest){
            List<FlightEntity> entities = flightRepository.findAllByArrivalLocationAndDepartureLocation( citySearchRequest.getArrivalLocation(),citySearchRequest.getDepartureLocation());
            List<FlightResponse> rezultateFinale = new ArrayList<>();

            for (FlightEntity entity : entities) {
                FlightResponse flightResponse = new FlightResponse();
                flightResponse.setId(entity.getId());
                flightResponse.setAirplaneName(entity.getAirplaneName());
                flightResponse.setCoordonates(entity.getCoordinates());
                flightResponse.setArrivalDate(entity.getArrivalDate());
                flightResponse.setDirection(entity.getDirection());
                flightResponse.setCost(entity.getCost());
                flightResponse.setDepartureLocation(entity.getDepartureLocation());
                flightResponse.setArrivalLocation(entity.getArrivalLocation());
                flightResponse.setDuration(entity.getDuration());
                flightResponse.setStatus(entity.getStatus());
                rezultateFinale.add(flightResponse);
            }


            return rezultateFinale;
        }
    }

