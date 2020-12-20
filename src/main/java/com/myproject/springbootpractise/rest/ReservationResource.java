package com.myproject.springbootpractise.rest;
import com.myproject.springbootpractise.model.request.ReservationRequest;
import com.myproject.springbootpractise.model.response.ReservationResponse;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import static org.springframework.web.bind.annotation.RequestMethod.DELETE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(ResourceConstants.ROOM_RESERVATION_V1)
public class ReservationResource {
    @RequestMapping(path = "", method = GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ReservationResponse> getAvailableRooms(
            @RequestParam(value="checkin")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate checkin,
            @RequestParam(value="checkin")
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)LocalDate checkOut){

        return  new ResponseEntity<>(new ReservationResponse(), HttpStatus.OK);
    }
    @RequestMapping(path = "",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ReservationResponse> createReservation(
            @RequestBody ReservationRequest  reservationRequest){
        return new ResponseEntity<>(new ReservationResponse(), HttpStatus.CREATED);
    }
    @RequestMapping(path = "",
            method = RequestMethod.PUT,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ReservationResponse> updateReservation(
            @RequestBody ReservationRequest  reservationRequest){
        return new ResponseEntity<>(new ReservationResponse(), HttpStatus.OK);
    }
    @RequestMapping(path = "/{reservationId}", method =  {DELETE,GET} )
    public  ResponseEntity<Void>  deleteReservation(
            @PathVariable(value = "reservationId") long reservationId
    ){
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
