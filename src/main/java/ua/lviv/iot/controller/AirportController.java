package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import ua.lviv.iot.domain.Airport;

import ua.lviv.iot.service.AirportService;
import ua.lviv.iot.service.GeneralServiceInterface;

@RestController
@RequestMapping("/airport")
public class AirportController extends AbstractController<Airport, Integer> {

    @Autowired
    AirportService airportService;

    @Override
    public GeneralServiceInterface<Airport, Integer> getService() {
        return airportService;
    }

}