package com.hotel.hoteleria.domain.service;

import com.hotel.hoteleria.domain.dto.CustomerDto;
import com.hotel.hoteleria.domain.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;

    public List<CustomerDto> getAll(){
        return null;
    }

    public CustomerDto saver(CustomerDto customer){
        return null;
    }

}
