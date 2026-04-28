package com.flight.radar.app.service.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FlightRequest {

    private String airplaneName;
    private String coordinates;
    private LocalDateTime departureDate;
    private LocalDateTime arrivalDate;
    private String direction;
    private Double cost;
    private Integer departureLocation;
    private Integer arrivalLocation;
    private Integer duration;
    private String status;
}