package com.psa.flight.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psa.flight.entity.Passenger;



public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
