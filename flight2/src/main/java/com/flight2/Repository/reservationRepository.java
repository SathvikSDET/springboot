package com.flight2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight2.entitiy.reservation;

public interface reservationRepository extends JpaRepository<reservation, Long> {

}
