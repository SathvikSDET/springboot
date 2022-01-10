package com.FA.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.FA.Repository.BOCrepo;
import com.FA.Repository.UeserRepo;
import com.FA.entity.BOC;
import com.FA.entity.User;

@Controller
@RequestMapping("/fundAccounting")
public class UserController {
	@Autowired
	UeserRepo userRepo;
	
	@RequestMapping("/newReg")
	public String ShowRegistraion(@ModelAttribute User user) {
		return "newReg";
	}
	
	@RequestMapping("/login")
	public String userRegistraion() {
		
		return "login";
	}
	
	@RequestMapping("/Reg")
	public String userRegistraion(@ModelAttribute User user) {
		userRepo.save(user);
		return "login" ;
		}
	
	@RequestMapping("/verify")
	public String verifyRegistraion(@RequestParam("username")String username,@RequestParam("password")String password,ModelMap m ) {
	User findByUsername = userRepo.findByUsername(username);
	if(findByUsername!=null) {
		if(findByUsername.getUsername().equals(username)&& findByUsername.getPassword().equals(password)) {
			return "Fund360";
		}
		else {
			m.addAttribute("Error", "invalid input pls reg to contioune");
			return "login";
		}
	}
	return "login";
		
	}
	
	
	@RequestMapping("/BOC")
	public String BOC() {
		
		return "BOC" ;
		}
	
	@Autowired
	BOCrepo repo;
	
	@RequestMapping("/bocReg")
	public String BOCReg(@ModelAttribute BOC BOC) {
		repo.save(BOC);
		
		return "login" ;
	}
	
	

}
