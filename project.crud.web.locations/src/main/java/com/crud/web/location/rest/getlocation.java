package com.crud.web.location.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.crud.web.location.Repositrios.LocationRepositrios;
import com.crud.web.location.entites.Location;

import java.util.*;



@RestController

public class getlocation {
	@Autowired
	LocationRepositrios repo;
@GetMapping()
@RequestMapping("/{id}")
@ResponseStatus(HttpStatus.OK)
public ResponseEntity<Location> get(@PathVariable ("id") long id) {
	Optional<Location> findById = repo.findById(id);
	Location location = findById.get();
	
	return ResponseEntity.ok().body(location) ;
}
	
	
	@RequestMapping("")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<List<Location>> gets() {
		
//		List<Location> findAll = repo.findAll();
		
		return ResponseEntity.ok().body(repo.findAll());
		
			}
	@RequestMapping("/users/{id}")
	public ResponseEntity<Location> updateUser_whenPutUser(@RequestBody Location Location, @PathVariable Long id) {
		return ResponseEntity.ok().body(service.updateUser(id, Location));
	}
}
}
