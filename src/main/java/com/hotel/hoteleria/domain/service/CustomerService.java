package com.hotel.hoteleria.domain.service;

import com.hotel.hoteleria.domain.dto.CustomerDto;
import com.hotel.hoteleria.domain.dto.UserDto;
import com.hotel.hoteleria.domain.repository.CustomerRepository;
import com.hotel.hoteleria.persistence.User1Repository;
import com.hotel.hoteleria.persistence.mapper.CustomerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.function.Function;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    private final CustomerMapper customerMapper;

    public List<CustomerDto> getAll(){
        return  customerMapper.toCustomersDto(
                        customerRepository.getAll()
                );
    }

    public CustomerDto save(CustomerDto customer) {

        //Function<UserDto, UserDto> saveUser = user -> userRepository.save(user);
        //Function<CustomerDto, CustomerDto> saveCustomer = client -> customerRepository.save(client);

        //saveCustomer.compose(saveUser);
        //customerRepository.save(customer);

        return customerRepository.save(
                customer
        );
    }

}
