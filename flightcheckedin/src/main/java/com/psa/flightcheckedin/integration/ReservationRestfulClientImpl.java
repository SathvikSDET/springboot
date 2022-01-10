package com.psa.flightcheckedin.integration;


import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.psa.flightcheckedin.dto.Reservation;
import com.psa.flightcheckedin.dto.ReservationUpdateRequest;
@Component

public class ReservationRestfulClientImpl implements ReservationRestfulClient {

	@Override
	public Reservation findReservation(long id) {
		RestTemplate restTemplate=new RestTemplate();
		Reservation forObject = restTemplate.getForObject("http://localhost:8080/reservation/"+id, Reservation.class);
		
		return forObject;
	}

	@Override
	public Reservation updateReservation(ReservationUpdateRequest request) {
		RestTemplate restTemplate=new RestTemplate();
		Reservation forObject = restTemplate.postForObject("http://localhost:8080/reservation",request,Reservation.class);
		
		
		return forObject;
	}

}
