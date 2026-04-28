package com.flight.radar.app.service;
import com.flight.radar.app.repository.CityRepository;
import com.flight.radar.app.service.model.response.CityResponse;
import com.flight.radar.app.service.model.request.CityRequest;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements CityService {
    private final CityRepository cityRepository;

    @Override
    public List<CityResponse> findAll() {
        var entities = cityRepository.findAll();
        return CityConverter.convertToCityResponseList(entities);
    }

    @Override
    public void deleteCity(Long id) {
            cityRepository.deleteById(id);
        }

    @Transactional
    @Override
    public void addDetails(CityRequest cityRequest) {
        var entity = CityConverter.convertToCityEntity(cityRequest);
        cityRepository.save(entity);
    }

    }

