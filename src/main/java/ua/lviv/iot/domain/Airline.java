package ua.lviv.iot.domain;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Airline {

    public Airline() {
    }

    private Integer id;
    private String airlineName;

    @OneToMany(mappedBy = "airlineByAirlineId")
    private Collection<Airport> airlineList;

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
    @Column(name = "airline_name")
    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Airline airline = (Airline) o;

        if (id != null ? !id.equals(airline.id) : airline.id != null) return false;
        if (airlineName != null ? !airlineName.equals(airline.airlineName) : airline.airlineName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (airlineName != null ? airlineName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "id=" + id +
                ", airlineName='" + airlineName +
                '}';
    }
}
