package com.crud.web.location.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crud.web.location.Repositrios.LocationRepositrios;
import com.crud.web.location.entites.Location;

@Controller
public class LocationController {
	
	
	@Autowired
	LocationRepositrios locationRepo;
	
	
	@RequestMapping("/showlocation")
	public String showlocation() {
		
		return "showlocation";
	}
	
	@RequestMapping("/saveLoc")
	public String show(@ModelAttribute ("loction")Location loction ,ModelMap modelmap) {
//		System.out.println(loction.getId());
//		System.out.println(loction.getCode());
//		System.out.println(loction.getName());
//		System.out.println(loction.getType());
		locationRepo.save(loction);
		modelmap.addAttribute("msg", "location saved!!!!");
		return "showlocation";
	}
	@RequestMapping("/getlocation")
	public String getLocation(ModelMap m) {
		List<Location> location = locationRepo.findAll();
		m.addAttribute("location",location);
		
		
		return "getloction";
	}
	
	@RequestMapping("/deletlocation")
	public String deletLocation(@RequestParam("id")long id,ModelMap m) {
		locationRepo.deleteById(id);
		List<Location> location = locationRepo.findAll();
		m.addAttribute("location",location);
		
		
		return "getloction";
	}
	@RequestMapping("/updatethelocation")
	public String updatelocation(@RequestParam("id")long id,ModelMap m) {
		Optional<Location> findById = locationRepo.findById(id);
		Location location = findById.get();
		m.addAttribute("id", location.getId());
		m.addAttribute("code", location.getCode());
		m.addAttribute("name", location.getName());
		m.addAttribute("type", location.getType());
		return "updatelocation";
	}
	
	@RequestMapping("/updateLoc")
	public String update(@ModelAttribute ("loction")Location loction ,ModelMap modelmap) {
		loction.setId(loction.getId());
		loction.setCode(loction.getCode());
		loction.setName(loction.getName());
		loction.setType(loction.getType());
		locationRepo.save(loction);

		modelmap.addAttribute("updatemsg", "updated succesfully");
		return "updatelocation";
	}


}
