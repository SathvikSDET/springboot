package com.Flight_reservation.web.app.FlightRepositorise;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Flight_reservation.web.app.entity.user1;

@Repository("user1ReservationRepo")
public interface user1ReservationRepo extends JpaRepository<user1, Long> {

	public  Optional<user1>  findByEmail(String email);





}
