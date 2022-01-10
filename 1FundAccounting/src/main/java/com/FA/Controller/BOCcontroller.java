package com.FA.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.FA.Repository.BOCrepo;
import com.FA.entity.BOC;

@Controller
public class BOCcontroller {
	
	@Autowired
	BOCrepo repo;
	
	@RequestMapping("/BOC")
	public String BOC() {
		return "BOC" ;
		}
	
	
	@RequestMapping("/bocReg")
	public String BOCReg(@ModelAttribute BOC BOC) {
		repo.save(BOC);
		
		return "login" ;
		}

	
	
	

}
