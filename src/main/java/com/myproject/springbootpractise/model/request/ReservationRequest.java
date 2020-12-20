package com.myproject.springbootpractise.model.request;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;

import static org.springframework.format.annotation.DateTimeFormat.*;

public class ReservationRequest {
    private Long id;
    @DateTimeFormat(iso = ISO.DATE)
    private LocalDate checkin;

    @DateTimeFormat(iso = ISO.DATE)
    private LocalDate checkout;

    public ReservationRequest() {
        super();
    }

    public ReservationRequest(Long id, LocalDate checkin, LocalDate checkout) {
        super();
        this.id = id;
        this.checkin = checkin;
        this.checkout = checkout;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
