package com.project.web.location.LocationRepostories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.web.location.entities.Location;

public interface LocationRepostories extends JpaRepository<Location, Long> {

}
