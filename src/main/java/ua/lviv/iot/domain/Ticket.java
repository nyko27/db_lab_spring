package ua.lviv.iot.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "ticket", schema = "sky_scanner")
public class Ticket {

    public Ticket() {

    }

    private Integer id;
    private BigDecimal priceInUah;
    private Integer flightId;
    private Integer userProfileId;

    @ManyToOne
    @JoinColumn(name = "flight_id", referencedColumnName = "id", nullable = false)
    private Flight flightByFlightId;

    @ManyToOne
    @JoinColumn(name = "user_profile_id", referencedColumnName = "id", nullable = false)
    private UserProfile userProfileByUserProfileId;


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
    @Column(name = "price_in_uah")
    public BigDecimal getPriceInUah() {
        return priceInUah;
    }

    public void setPriceInUah(BigDecimal priceInUah) {
        this.priceInUah = priceInUah;
    }

    public Integer getFlightId() {
        return flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    public Integer getUserProfileId() {
        return userProfileId;
    }

    public void setUserProfileId(Integer userProfileId) {
        this.userProfileId = userProfileId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(id, ticket.id) && Objects.equals(priceInUah, ticket.priceInUah);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, priceInUah);
    }


    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", priceInUah=" + priceInUah +
                ", flightByFlightId=" + flightByFlightId +
                ", userProfileByUserProfileId=" + userProfileByUserProfileId +
                '}';
    }
}