package ua.lviv.iot.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "user_profile", schema = "sky_scanner")
public class UserProfile {

    public UserProfile(){

    }

    private Integer id;
    private String userName;
    private String surname;

    @OneToMany(mappedBy = "user_profile")
    private List<Ticket> ticketList;

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
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "surname")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserProfile that = (UserProfile) o;
        return Objects.equals(id, that.id) && Objects.equals(userName, that.userName) && Objects.equals(surname, that.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, surname);
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}