package com.flight.radar.app.rest;

import com.flight.radar.api.exception.FlightException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class FlightExceptionHandler {

    @ExceptionHandler(FlightException.class)
    public ResponseEntity<Map<String, String>> handleFlightsException(FlightException ex) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(Map.of("error", ex.getMessage()));
    }
}