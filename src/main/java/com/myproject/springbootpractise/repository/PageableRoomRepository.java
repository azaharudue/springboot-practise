package com.myproject.springbootpractise.repository;

import com.myproject.springbootpractise.entity.RoomEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PageableRoomRepository extends PagingAndSortingRepository<RoomEntity, Long> {
     Page<RoomEntity> findAllById(Long id, Pageable page);

}
