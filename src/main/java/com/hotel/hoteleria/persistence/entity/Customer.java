package com.hotel.hoteleria.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private Date birthdate;

    private Boolean status;

    //relationships

    @OneToOne(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user;

    @OneToMany(mappedBy = "customer", cascade = {CascadeType.ALL})
    private List<Reservation> reservations;

}
