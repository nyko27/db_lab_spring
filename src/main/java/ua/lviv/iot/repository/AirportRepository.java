package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.Airport;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Integer> {
}