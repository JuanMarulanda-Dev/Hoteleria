package com.hotel.hoteleria.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class CustomerDto {
    private Long customerId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String passwordConfirm;
    private Date birthdate;
    private Boolean state;
}
