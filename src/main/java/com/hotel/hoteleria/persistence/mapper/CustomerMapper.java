package com.hotel.hoteleria.persistence.mapper;

import com.hotel.hoteleria.domain.dto.CustomerDto;
import com.hotel.hoteleria.persistence.entity.Customer;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface CustomerMapper {

    @Mappings({
            @Mapping(source = "id", target = "customerId"),
            @Mapping(source = "firstName", target = "firstName"),
            @Mapping(source = "lastName", target = "lastName"),
            @Mapping(source = "birthdate", target = "birthdate"),
            @Mapping(source = "status", target = "state"),
    })
    CustomerDto toCustomerDto(Customer customer);
    List<CustomerDto> toCustomersDto(List<Customer> customers);


    @InheritInverseConfiguration
    @Mapping(target = "reservations", ignore = true)
    Customer toCustomer(CustomerDto customer);

}
