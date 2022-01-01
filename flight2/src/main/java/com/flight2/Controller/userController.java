package com.flight2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight2.Repository.userRepository;
import com.flight2.entitiy.user;

@Controller
public class userController {
	
	@Autowired
	userRepository userRepository;
	@RequestMapping("/showReg")
	public String showreg() {
		return"login/showReg";
	}
	
	@RequestMapping("/showRegsave")
	public String showregsave(@ModelAttribute ("user")user user,ModelMap m) {
		userRepository.save(user);
		m.addAttribute("msg", "data saved!!!!");
		return"login/showReg";
	}
	@RequestMapping("/findflight")
	public String findflight() {
		return"findflight";
	}
	@RequestMapping("/showloginpage")
	public String showloginpage() {
		return"login/login";
	}
	@RequestMapping("/verify")
	public String verify(@RequestParam("emailid")String emailid,@RequestParam("password")String password,ModelMap m ) {
		user user = userRepository.findByEmailid(emailid);
		System.out.println(user);
		System.out.println(user.getEmailid().equals(emailid));
		System.out.println(user.getPassword().equals(password));
		
//	if(user!=null)	{
		if(user.getEmailid().equals(emailid)&&user.getPassword().equals(password)) {
			return "findflight";
		   }
		else {
			m.addAttribute("msg1", "invalid user");
			return"login/login";
		      }
//		}
//	else {
//		return"login/login";
//     	}
		
		
	}
}
