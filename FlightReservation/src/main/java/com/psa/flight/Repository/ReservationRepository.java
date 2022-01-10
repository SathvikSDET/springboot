package com.psa.flight.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psa.flight.entity.Reservation;



public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
