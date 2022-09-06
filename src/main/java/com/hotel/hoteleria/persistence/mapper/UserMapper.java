package com.hotel.hoteleria.persistence.mapper;

import com.hotel.hoteleria.domain.dto.UserDto;
import com.hotel.hoteleria.persistence.entity.User;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mappings({
            @Mapping(source = "id", target = "userId"),
            @Mapping(source = "email", target = "email"),
            @Mapping(source = "password", target = "password"),
            @Mapping(target = "passwordConfirm", ignore = true),
    })
    UserDto toUserDto(User user);

    @InheritInverseConfiguration
    @Mapping(target = "customer", ignore = true)
    User toUser(UserDto user);
}
