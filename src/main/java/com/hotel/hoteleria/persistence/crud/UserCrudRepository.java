package com.hotel.hoteleria.persistence.crud;

import com.hotel.hoteleria.persistence.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository extends CrudRepository<User, Long> {

}
