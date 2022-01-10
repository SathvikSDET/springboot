package com.FA.expos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FA.Repository.BOCrepo;
import com.FA.entity.BOC;

@RestController
@RequestMapping("/Rest")
public class Rest {
	@Autowired
	BOCrepo repo;
	
	@GetMapping("/getBOCaccount/{id}")

	public BOC get(@PathVariable long id) {
		Optional<BOC> findById = repo.findById(id);
		BOC boc = findById.get();
		return boc ;
	}
	
	

}
