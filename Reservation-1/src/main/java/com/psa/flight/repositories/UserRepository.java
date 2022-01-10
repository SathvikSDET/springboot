package com.psa.flight.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psa.flight.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
