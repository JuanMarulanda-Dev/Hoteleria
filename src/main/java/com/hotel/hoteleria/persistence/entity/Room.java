package com.hotel.hoteleria.persistence.entity;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "rooms")
public class Room {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    private String description;

    private int capacity;

    private Boolean status;

    //Relationships

    @OneToMany(mappedBy = "room", cascade = {CascadeType.ALL})
    private List<Reservation> reservations;
}
