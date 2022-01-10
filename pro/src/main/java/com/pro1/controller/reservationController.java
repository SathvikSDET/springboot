package com.pro1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pro1.dto.Reservationrequest;
import com.pro1.entity.reservation;
import com.pro1.services.reservationService;
import com.pro1.util.EmailUtil;
import com.pro1.util.PdfGenrator;



@Controller
public class reservationController {
	private static String filePath="C:\\Users\\ADMIN\\Documents\\workspace-spring-tool-suite-4-4.12.0.RELEASE\\pdfdoc";
	@Autowired
	reservationService reservationService;
	
	
	@RequestMapping("/completreservation")
	public String completreservation(Reservationrequest request,ModelMap m) {
		
			System.out.println(request.getId());

		reservation bookFlight = reservationService.bookFligth(request);
		
		m.addAttribute("reservationid",bookFlight.getId());
		
		return "confirmreservation";
		
	}
	@RequestMapping("/doneRegistration")
	public String confirmRegistration(Reservationrequest request,ModelMap modelMap) {
		reservation reservation = reservationService.bookFligth(request);
		PdfGenrator pdf = new PdfGenrator();
		pdf.generatePDF(filePath+reservation.getId()+".pdf", reservation.getPassengerid().getFirstname(), reservation.getPassengerid().getEmail(), reservation.getPassengerid().getPhone(), reservation.getFligthid().getOperatingAirlines(), reservation.getFligthid().getDateofdeparture(), reservation.getFligthid().getDepartureCity(), reservation.getFligthid().getArrivalCity());
		modelMap.addAttribute("reservationId", reservation.getId());
		EmailUtil util = new EmailUtil();
		String attachment = filePath+reservation.getId()+".pdf";
		util.sendItinerary(request.getEmailid(), attachment);
		return "finalConfirmation";
	}
	

}
