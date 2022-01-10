package com.psa.flight.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.psa.flight.entity.User;

public interface userRepository extends JpaRepository<User, Long> {

}
