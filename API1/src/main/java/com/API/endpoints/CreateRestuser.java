package com.API.endpoints;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.API.ENTITY.user;
import com.API.Repository.UserRepository;
import com.API.services.Post;

@RestController
@RequestMapping(path = "/user")
public class CreateRestuser {
	
	
	
	@Autowired
	public Post post;
	@Autowired
	public UserRepository repo;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<user> createe(@RequestBody user user){
		user create = post.create(user);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(create.getId())
				.toUri();
		return ResponseEntity.created(uri).body(create);
		
	}

}
