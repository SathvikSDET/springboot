package com.flight2.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.flight2.entitiy.fligth;

public interface fligthRepository extends JpaRepository<fligth, Long> {
	
	@Query("from fligth  where departureCity=:departureCity and arrivalCity=:arrivalCity and dateofdeparture=:dateofdeparture")
	List<fligth> findFligth(@Param("departureCity")String from,@Param("arrivalCity")String to,@Param("dateofdeparture")Date dateofdeparture);

	

	
	
}
