package com.psa.flightcheckedin.integration;

import org.springframework.web.bind.annotation.RequestBody;

//import org.springframework.web.bind.annotation.RequestBody;

import com.psa.flightcheckedin.dto.Reservation;
import com.psa.flightcheckedin.dto.ReservationUpdateRequest;

public interface ReservationRestfulClient {
	public Reservation findReservation(long id);
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request);
}
