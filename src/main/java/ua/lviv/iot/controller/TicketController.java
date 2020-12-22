package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.domain.Ticket;
import ua.lviv.iot.service.TicketService;
import ua.lviv.iot.service.GeneralServiceInterface;

@RestController
@RequestMapping("/ticket")
public class TicketController extends AbstractController<Ticket, Integer> {

    @Autowired
    TicketService ticketService;

    @Override
    public GeneralServiceInterface<Ticket, Integer> getService() {
        return ticketService;
    }

}