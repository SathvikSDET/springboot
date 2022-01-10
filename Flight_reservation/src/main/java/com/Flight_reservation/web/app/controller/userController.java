package com.Flight_reservation.web.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Flight_reservation.web.app.FlightRepositorise.user1ReservationRepo;

import com.Flight_reservation.web.app.entity.user1;

@Controller
public class userController {
	
	@Autowired
	user1ReservationRepo userRepository;
	
	@RequestMapping("/showReg")
	public String showreg() {
		return"login/showReg";
	}
	
	@RequestMapping("/showRegsave")
	public String showregsave(@ModelAttribute ("user")user1 user,ModelMap m) {
		userRepository.save(user);
		m.addAttribute("msg", "data saved!!!!");
		return"login/showReg";
	}
	@RequestMapping("/showloginpage")
	public String showloginpage() {
		return"login/login";
	}
	@RequestMapping("/verify")
	public String verify(@RequestParam ("email")String email,@RequestParam ("password")String password,ModelMap m) {
System.out.println(email);
		try {
			
			Optional<user1> findByEmail = userRepository.findByEmail(email);
			System.out.println(findByEmail);
			if(findByEmail==null) {
			System.out.println(findByEmail);
			return "login/login";
			}
		}
		catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
//
//	if(user.getEmailid().equals(emailid)&&user.getPassword().equals(password)) {
//		return "findfligth";
//	 }
//		else {
//			m.addAttribute("error", "error in  saving!!!!");
//			return"login/login";
//		}
		return "findflight";
	
	}

	
	

}
