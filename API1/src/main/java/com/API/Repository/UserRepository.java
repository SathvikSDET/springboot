package com.API.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.API.ENTITY.user;
@Repository
public interface UserRepository extends JpaRepository<user, Long> {

}
