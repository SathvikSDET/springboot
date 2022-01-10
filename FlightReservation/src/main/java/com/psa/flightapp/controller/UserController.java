package com.psa.flightapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.psa.flight.Repository.userRepository;


@Controller
public class UserController {
	
	@Autowired
	userRepository userRepo;
	
	@RequestMapping("/showReg")
	public String showRegistrationPage() {
		return "login/newRegistration";
	}
	
	@RequestMapping("/showLogin")
	public String showLoginPage() {
		return "login/login";
	}
	
//	@RequestMapping(path = "/saveReg")
//	public String saveNewRegistration(@ModelAttribute("user") User user) {
//		userRepo.save(user);
//		return "login/login";
//	}
//	
//	@RequestMapping("/verifyLogin")
//	public String verifyLogin(@RequestParam("email") String email, @RequestParam("password") String password,ModelMap modelMap) {
//		User user = userRepo.findByEmail(email);
//		if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
//			return "searchFlights";
//		}else {
//			modelMap.addAttribute("error", "Invalid username/password");
//			return "login/login";
//		}
		
//	}
}
