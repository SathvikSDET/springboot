package com.Flight_reservation.web.app.FlightRepositorise;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Flight_reservation.web.app.entity.fligth;


public interface flightReservationRepo extends JpaRepository<fligth, Long> {

}
