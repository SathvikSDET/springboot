package com.flight2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flight2.entitiy.user;
@Repository
public interface userRepository extends JpaRepository<user, Long> {

	user findByEmailid(String emailid);

}
