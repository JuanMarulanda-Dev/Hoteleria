package com.hotel.hoteleria.domain.repository;


import com.hotel.hoteleria.domain.dto.CustomerDto;
import com.hotel.hoteleria.persistence.entity.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> getAll();
    CustomerDto save(CustomerDto customer);
}
