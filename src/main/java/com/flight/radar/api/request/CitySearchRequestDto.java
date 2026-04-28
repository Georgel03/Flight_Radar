package com.flight.radar.api.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CitySearchRequestDto {
    private int departureLocationId;
    private int arrivalLocationId;

}

