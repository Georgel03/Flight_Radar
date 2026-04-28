package com.flight.radar.api;
import com.flight.radar.api.request.CitySearchRequestDto;
import com.flight.radar.api.response.FlightResponseDto;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/flight/search")
public interface FlightSearchController {

    @PostMapping
    List<FlightResponseDto> search(@Valid @RequestBody CitySearchRequestDto requestDto);
}
