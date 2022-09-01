package com.hotel.hoteleria.persistence.crud;

import com.hotel.hoteleria.persistence.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerCrudRepository extends CrudRepository<Customer, Long> {

}
