package com.hotel.hoteleria.persistence;

import com.hotel.hoteleria.domain.dto.CustomerDto;
import com.hotel.hoteleria.domain.repository.CustomerRepository;
import com.hotel.hoteleria.persistence.crud.CustomerCrudRepository;
import com.hotel.hoteleria.persistence.entity.Customer;
import com.hotel.hoteleria.persistence.mapper.CustomerMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class CutomerRepository implements CustomerRepository {

    private CustomerMapper customerMapper;

    private CustomerCrudRepository customerCrudRepository;

    @Override
    public List<Customer> getAll() {
        return (List<Customer>) customerCrudRepository.findAll();
    }

    @Override
    public CustomerDto save(CustomerDto customer) {
        Customer prueba = customerMapper.toCustomer(customer);
        return customerMapper.toCustomerDto(customerCrudRepository.save(prueba));
    }
}
