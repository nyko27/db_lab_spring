package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.domain.Airline;
import ua.lviv.iot.service.AirlineService;
import ua.lviv.iot.service.GeneralServiceInterface;

@RestController
@RequestMapping("/airline")
public class AirlineController extends AbstractController<Airline, Integer> {

    @Autowired
    AirlineService airlineService;

    @Override
    public GeneralServiceInterface<Airline, Integer> getService() {
        return airlineService;
    }

}