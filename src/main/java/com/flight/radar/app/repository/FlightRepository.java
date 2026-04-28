package com.flight.radar.app.repository;
import com.flight.radar.app.repository.entity.FlightEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<FlightEntity, Integer> {

    List<FlightEntity> findAllByArrivalLocationAndDepartureLocation(int arrivalCityId, int departureCityId);
}
