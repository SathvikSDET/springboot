package com.flight2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight2.entitiy.passenger;

public interface passengerRepository extends JpaRepository<passenger, Long> {

}
