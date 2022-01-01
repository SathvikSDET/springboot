package com.flight2.Controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flight2.Repository.fligthRepository;
import com.flight2.entitiy.fligth;

@Controller
public class fligthController {
	
	@Autowired
	fligthRepository fligthRepository;
	
	
	
	
	@RequestMapping("/find")
	public String find(@RequestParam("from")String from,@RequestParam("to")String to,@RequestParam("dateofdeparture")@DateTimeFormat(pattern ="MM-dd-yyyy") Date dateofdeparture,ModelMap m) {
		
		List<fligth> findfligth = fligthRepository.findFligth(from,to,dateofdeparture);
		m.addAttribute("findfligth",findfligth);
		return"displayflight";
	}
	
	@RequestMapping("/showCompletReservation")
	public String showCompletReservation(@RequestParam("fligthid")Long fligthid,ModelMap m) {
		Optional<fligth> findById = fligthRepository.findById(fligthid);
		fligth fligth = findById.get();
		m.addAttribute("fligth",fligth);
		
		return"showReservation";
	}
	
	
	

}
