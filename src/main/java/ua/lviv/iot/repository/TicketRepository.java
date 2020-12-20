package ua.lviv.iot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.domain.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {
}