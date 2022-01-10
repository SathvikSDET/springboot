package com.psa.flightcheckedin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.psa.flightcheckedin.dto.Reservation;
import com.psa.flightcheckedin.dto.ReservationUpdateRequest;
import com.psa.flightcheckedin.integration.ReservationRestfulClient;

@Controller
public class ReservationController {
	
	@Autowired
	private ReservationRestfulClient client;
	
	@RequestMapping("/")
	public String startcheckin() {
		return "checkin";
	}
	
	@RequestMapping("/processedcheckin")
	public String processedcheckin(@RequestParam ("id")long id,ModelMap m) {
		Reservation findReservation = client.findReservation(id);
		m.addAttribute("findReservation",findReservation);
		return "displayReservation";
	}
	@RequestMapping("/save")
	public String save(@RequestParam ("id")long id,@RequestParam ("numberOfBags")long numberOfBags,ModelMap m) {
		ReservationUpdateRequest request =new ReservationUpdateRequest();
		request.setId(id);
		request.setNumberOfBags(numberOfBags);
		request.setCheckedIn(true);
		client.updateReservation(request);
		
		return "confirmResrvation";
		
	}

}
