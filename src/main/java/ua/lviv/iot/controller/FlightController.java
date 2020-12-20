package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.domain.Flight;
import ua.lviv.iot.service.FlightService;
import ua.lviv.iot.service.GeneralServiceInterface;

@RestController
@RequestMapping("/flight")
public class FlightController extends AbstractController<Flight, Integer> {

    @Autowired
    FlightService flightService;

    @Override
    public GeneralServiceInterface<Flight, Integer> getService() {
        return flightService;
    }

}