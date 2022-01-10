package com.Flight_reservation.web.app.FlightRepositorise;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Flight_reservation.web.app.entity.reservation;


public interface reservationReservationRepo extends JpaRepository<reservation, Long> {

}
