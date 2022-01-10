package com.pro1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pro1.entity.reservation;


public interface reservationRepository extends JpaRepository<reservation, Long> {

}
