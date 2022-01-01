package com.API.endpoints;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.API.ENTITY.user;
import com.API.services.Find;

@RestController
@RequestMapping("/users/{id}")
public class Findby {
	
@Autowired
Find service; 

@GetMapping
@ResponseStatus(HttpStatus.OK)
public ResponseEntity<Optional<user>> listUser_whenGetUser(@PathVariable Long id) {
return ResponseEntity.ok().body(service.listUser(id));
}
}
