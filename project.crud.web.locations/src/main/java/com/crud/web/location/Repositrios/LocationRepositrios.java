package com.crud.web.location.Repositrios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.web.location.entites.Location;

public interface LocationRepositrios extends JpaRepository<Location, Long> {

}
