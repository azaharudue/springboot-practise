package com.myproject.springbootpractise.repository;

import com.myproject.springbootpractise.entity.RoomEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RoomRepository extends CrudRepository<RoomEntity, Long> {
    List<RoomEntity> findAllById(Long id);
}
