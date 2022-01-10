package com.FA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FA.entity.User;

public interface UeserRepo extends JpaRepository<User, Long> {
   public User findByUsername(String username);
}
