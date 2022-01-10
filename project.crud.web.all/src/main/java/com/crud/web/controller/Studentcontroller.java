package com.crud.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Studentcontroller {
	@RequestMapping("/show")
	public String home() {
		return"show";
	}

}
