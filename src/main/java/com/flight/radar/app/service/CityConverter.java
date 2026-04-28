package com.flight.radar.app.service;

import com.flight.radar.api.response.CityResponseDto;
import com.flight.radar.app.repository.entity.CityEntity;
import com.flight.radar.app.service.model.CityResponse;
import lombok.experimental.UtilityClass;

import java.util.List;

@UtilityClass
public class CityConverter {
    public List<CityResponse> convertToCityResponseList(List<CityEntity> cities) {
        return cities.stream()
                .map(city -> convertToCityResponse(city))
                .toList();
    }

    public List<CityResponseDto> convertToCityResponseDtoList(List<CityResponse> cities) {
        return cities.stream()
                .map(city -> CityResponseDto.builder()
                        .id(city.getId())
                        .cityName(city.getCityName())
                        .build())
                .toList();
    }

    private CityResponse convertToCityResponse(CityEntity city) {
        return CityResponse.builder()
                .id(city.getId())
                .cityName(city.getCityName())
                .build();
    }
}
