package com.hotel.hoteleria.persistence;

import com.hotel.hoteleria.domain.dto.UserDto;
import com.hotel.hoteleria.domain.repository.UserRepository;


import java.util.List;

public class User1Repository implements UserRepository {
    @Override
    public List<UserDto> getAll() {
        return null;
    }

    @Override
    public UserDto save(UserDto customer) {
        return null;
    }
}
