package com.API.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.API.ENTITY.user;
import com.API.Repository.UserRepository;

@Service
public class Post {
	@Autowired
	UserRepository userRepo;
	
	public user create(user user) {
		return userRepo.save(user);
	}

}
