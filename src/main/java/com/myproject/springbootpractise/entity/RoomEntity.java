package com.myproject.springbootpractise.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Room")
@NoArgsConstructor
@AllArgsConstructor
public class RoomEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private Integer roomNumber;
    @NotNull
    private String price;

    public RoomEntity(@NotNull Integer roomNumber, @NotNull String price) {
        this.roomNumber = roomNumber;
        this.price = price;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
