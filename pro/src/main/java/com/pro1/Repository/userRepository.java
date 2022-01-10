package com.pro1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pro1.entity.user;
@Repository
public interface userRepository extends JpaRepository<user, Long> {
	user findByEmail(String emailid);

}
