package com.hotel.hoteleria.domain.service;

import com.hotel.hoteleria.persistence.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private UserMapper userMapper;
}
