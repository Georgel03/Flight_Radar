package com.flight.radar.app.service;

import com.flight.radar.api.request.CityRequestDto;
import com.flight.radar.api.response.CityResponseDto;
import com.flight.radar.app.repository.entity.CityEntity;
import com.flight.radar.app.service.model.request.CityRequest;
import com.flight.radar.app.service.model.response.CityResponse;
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


    public CityRequest convertToCityRequest(CityRequestDto requestDto) {
        return CityRequest.builder()
                .name(requestDto.getName())
                .build();
    }

    public CityEntity convertToCityEntity(CityRequest request){
        CityEntity cityEntity = new CityEntity();
        cityEntity.setCityName(request.getName());
        return cityEntity;}


    private CityResponse convertToCityResponse(CityEntity city) {
        return CityResponse.builder()
                .id(city.getId())
                .cityName(city.getCityName())
                .build();
    }
}
