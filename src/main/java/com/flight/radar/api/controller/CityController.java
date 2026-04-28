package com.flight.radar.api.controller;

import com.flight.radar.api.request.CityRequestDto;
import com.flight.radar.api.response.CityResponseDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("cities")
public interface CityController {

    @DeleteMapping("/id/{id}")
    void deleteCity(@PathVariable("id") Long id);

    @GetMapping
    List<CityResponseDto> getCities();

    @PostMapping("/add")
    void addDetails(@RequestBody CityRequestDto requestDto);
}
