package ua.lviv.iot.service;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.Airport;
import ua.lviv.iot.repository.AirportRepository;

@Service
public class AirportService extends AbstractService<Airport, Integer> {
    @Autowired
    private AirportRepository airportRepository;

    @Override
    public JpaRepository<Airport, Integer> getRepository() {
        return airportRepository;
    }

}