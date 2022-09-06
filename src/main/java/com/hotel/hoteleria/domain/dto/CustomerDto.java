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
    private UserDto user;
    private Date birthdate;
    private Boolean state;
}
