package com.API.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.API.ENTITY.user;
import com.API.Repository.UserRepository;


@Service
public class Find {
	@Autowired
	UserRepository repository;
	public java.util.Optional<user> listUser(Long id) {

	return repository.findById(id);
	
	}
}
