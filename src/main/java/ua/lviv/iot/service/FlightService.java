package ua.lviv.iot.service;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.Flight;
import ua.lviv.iot.repository.FlightRepository;

@Service
public class FlightService extends AbstractService<Flight, Integer> {
    @Autowired
    private FlightRepository flightRepository;

    @Override
    public JpaRepository<Flight, Integer> getRepository() {
        return flightRepository;
    }

}