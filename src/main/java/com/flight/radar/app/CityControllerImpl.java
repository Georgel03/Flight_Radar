package com.flight.radar.app;
import com.flight.radar.api.controller.CityController;
import com.flight.radar.api.response.CityResponseDto;
import com.flight.radar.app.service.CityConverter;
import com.flight.radar.app.service.CityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class CityControllerImpl implements CityController {
   private final CityService cityService;

    @Override
    public void deleteCity(Long cityId) {
        cityService.deleteCity(cityId);
    }

    @Override
    public List<CityResponseDto> getCities() {
        var entities= cityService.findAll();
        return CityConverter.convertToCityResponseDtoList(entities);
    }
}
