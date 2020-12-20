package ua.lviv.iot.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "flight", schema = "sky_scanner")
public class Flight {

    public Flight() {

    }

    private Integer id;
    private String airplaneName;
    private Integer allowedBaggageInKilogrms;
    private Integer airlineId;
    private Integer arrivalAirportId;
    private Integer departureAirportId;

    @ManyToOne
    @JoinColumn(name = "airline_id", referencedColumnName = "id")
    private Airline airlineByAirlineId;

    @ManyToOne
    @JoinColumn(name = "arrival_airport_id", referencedColumnName = "id")
    private Airport arrivalAirportByArrivalAirportId;

    @ManyToOne
    @JoinColumn(name = "departure_airport_id", referencedColumnName = "id")
    private Airport departureAirportByDepartureAirportId;

    @OneToMany(mappedBy = "flight")
    private List<Ticket> ticketList;

    public Integer getAirlineId() {
        return airlineId;
    }

    public void setAirlineId(Integer airlineId) {
        this.airlineId = airlineId;
    }

    public Integer getArrivalAirportId() {
        return arrivalAirportId;
    }

    public void setArrivalAirportId(Integer arrivalAirportId) {
        this.arrivalAirportId = arrivalAirportId;
    }

    public Integer getDepartureAirportId() {
        return departureAirportId;
    }

    public void setDepartureAirportId(Integer departureAirportId) {
        this.departureAirportId = departureAirportId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "airplane_name")
    public String getAirplaneName() {
        return airplaneName;
    }

    public void setAirplaneName(String airplaneName) {
        this.airplaneName = airplaneName;
    }

    @Basic
    @Column(name = "allowed_baggage_in_kilogrms")
    public Integer getAllowedBaggageInKilogrms() {
        return allowedBaggageInKilogrms;
    }

    public void setAllowedBaggageInKilogrms(Integer allowedBaggageInKilogrms) {
        this.allowedBaggageInKilogrms = allowedBaggageInKilogrms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(id, flight.id) && Objects.equals(airplaneName, flight.airplaneName) && Objects.equals(allowedBaggageInKilogrms, flight.allowedBaggageInKilogrms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, airplaneName, allowedBaggageInKilogrms);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", airplaneName='" + airplaneName + '\'' +
                ", allowedBaggageInKilogrms=" + allowedBaggageInKilogrms +
                ", airline=" + airlineId +
                ", arrivalAirport=" + arrivalAirportId +
                ", departureAirport=" + departureAirportId +
                '}';
    }
}