package com.FA.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.FA.dto.BOC;
import com.FA.integration.RestImple;
import com.FA.integration.Restfulclint;


@Controller
public class BOCcontroller {
	@RequestMapping("/cons")
	public String BOCReg() {
		return "cons" ;
	}

	
	
	Restfulclint restfulclint =new RestImple();
	@RequestMapping("/find")
	public String BOCRegshow(@RequestParam ("id") long id,ModelMap m) {
		BOC findByFirstname = restfulclint.findById(id);
		m.addAttribute("findByFirstname", findByFirstname);
		return "displayall" ;
	}
	
}
