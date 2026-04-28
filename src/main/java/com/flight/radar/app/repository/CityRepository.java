package com.flight.radar.app.repository;

import com.flight.radar.app.repository.entity.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<CityEntity, Long> {
}
