package com.flight.radar.api.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FlightRequestDto {

    @NotBlank
    private String airplaneName;

    private String coordinates;

    @NotNull
    private LocalDateTime departureDate;

    @NotNull
    private LocalDateTime arrivalDate;

    private String direction;

    @Positive(message = "Costul trebuie să fie un numar pozitiv")
    private Double cost;

    @NotNull
    private Integer departureLocation;

    @NotNull
    private Integer arrivalLocation;

    @Positive(message = "Durata zborului nu poate negativa")
    private Integer duration;

    @NotNull
    private String status;
}