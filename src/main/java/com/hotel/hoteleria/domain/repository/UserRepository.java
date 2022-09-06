package com.hotel.hoteleria.domain.repository;

import com.hotel.hoteleria.domain.dto.CustomerDto;
import com.hotel.hoteleria.domain.dto.UserDto;

import java.util.List;

public interface UserRepository {
    List<UserDto> getAll();
    UserDto save(UserDto customer);
}
