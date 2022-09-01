package com.hotel.hoteleria.persistence.crud;

import com.hotel.hoteleria.persistence.entity.Room;
import org.springframework.data.repository.CrudRepository;

public interface RoomCrudRepository extends CrudRepository<Room, Long> {
}
