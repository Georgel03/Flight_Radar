package com.flight.radar.api.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FlightResponseDto {

    private Integer id;
    private String airplaneName;
    private String coordonates;
    private LocalDateTime arrivalDate;
    private String direction;
    private Double cost;
    private Integer departureLocationId;
    private Integer arrivalLocationId;
    private Integer duration;
    private String status;
}
