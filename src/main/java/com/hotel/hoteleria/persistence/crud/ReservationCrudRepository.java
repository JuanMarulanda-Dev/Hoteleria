package com.hotel.hoteleria.persistence.crud;

import com.hotel.hoteleria.persistence.entity.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository<Reservation, Long> {

}
