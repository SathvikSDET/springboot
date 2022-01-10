package com.psa.flight.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psa.flight.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
