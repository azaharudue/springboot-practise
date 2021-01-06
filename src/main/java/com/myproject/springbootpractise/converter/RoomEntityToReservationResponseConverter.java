package com.myproject.springbootpractise.converter;

import com.myproject.springbootpractise.entity.RoomEntity;
import com.myproject.springbootpractise.model.Links;
import com.myproject.springbootpractise.model.Self;
import com.myproject.springbootpractise.model.response.ReservationResponse;
import com.myproject.springbootpractise.rest.ResourceConstants;
import org.springframework.core.convert.converter.Converter;


public class RoomEntityToReservationResponseConverter implements Converter<RoomEntity, ReservationResponse> {
    public ReservationResponse convert(RoomEntity roomEntity) {
        ReservationResponse reservationResponse = new ReservationResponse();
        reservationResponse.setRoomNumber(roomEntity.getRoomNumber());
        reservationResponse.setPrice(Integer.valueOf(roomEntity.getPrice()));
        Links links = new Links();
        Self self = new Self();
        self.setRef(ResourceConstants.ROOM_RESERVATION_V1 + "/" + roomEntity.getId());
        links.setSelf(self);
        reservationResponse.setLinks(links);
        return reservationResponse;
    }

}

