package com.myproject.springbootpractise.repository;

import com.myproject.springbootpractise.entity.RoomEntity;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<RoomEntity, Long> {

     RoomEntity findAllById(Long id);
}
