package com.flight2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flight2.dto.Reservationrequest;
import com.flight2.entitiy.reservation;
import com.flight2.service.reservationService;
import com.flight2.util.EmailUtil;
import com.flight2.util.PdfGenrator;


@Controller
public class reservationController {
	private static String filePath="C:\\Users\\ADMIN\\Documents\\workspace-spring-tool-suite-4-4.12.0.RELEASE\\flight2\\pdfdoc";
	@Autowired
	reservationService reservationService;
	
	
	@RequestMapping("/confirmRegistration")
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
		pdf.generatePDF(filePath+reservation.getId()+".pdf", reservation.getPassenger().getFirstname(), reservation.getPassenger().getEmailid(), reservation.getPassenger().getPhone(), reservation.getFligth().getOperatingAirlines(), reservation.getFligth().getDateofdeparture(), reservation.getFligth().getDepartureCity(), reservation.getFligth().getArrivalCity());
		modelMap.addAttribute("reservationId", reservation.getId());
		EmailUtil util = new EmailUtil();
		String attachment = filePath+reservation.getId()+".pdf";
		util.sendItinerary(request.getEmailid(), attachment);
		return "finalConfirmation";
	}
	

}
