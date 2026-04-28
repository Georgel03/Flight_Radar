package com.flight.radar.app.service.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CitySearchRequest {
    private int departureLocation;
    private int arrivalLocation;
}

