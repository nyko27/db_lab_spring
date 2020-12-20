package ua.lviv.iot.service;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.domain.Ticket;
import ua.lviv.iot.repository.TicketRepository;

@Service
public class TicketService extends AbstractService<Ticket, Integer> {
    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public JpaRepository<Ticket, Integer> getRepository() {
        return ticketRepository;
    }

}