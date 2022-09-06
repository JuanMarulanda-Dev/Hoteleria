package com.hotel.hoteleria.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String email;

    private String password;

    @OneToOne(fetch = FetchType.EAGER, cascade = {CascadeType.ALL}, mappedBy = "user")
    private Customer customer;
}
