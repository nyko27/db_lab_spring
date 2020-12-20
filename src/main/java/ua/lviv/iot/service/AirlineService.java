package ua.lviv.iot.service;

import ua.lviv.iot.repository.AirlineRepository;
import ua.lviv.iot.domain.Airline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class AirlineService extends AbstractService<Airline, Integer> {

    @Autowired
    private AirlineRepository airlineRepository;

    @Override
    public JpaRepository<Airline, Integer> getRepository() {
        return airlineRepository;
    }

}