package com.project.web.location.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LocationController {
	
	
	@RequestMapping("/showlocation")
	public String showlocation() {
		return "showlocation";
	}
	

}
