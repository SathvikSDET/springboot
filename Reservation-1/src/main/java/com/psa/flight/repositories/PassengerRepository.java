package com.psa.flight.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psa.flight.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
