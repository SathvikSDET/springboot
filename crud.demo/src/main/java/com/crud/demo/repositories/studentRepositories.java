package com.crud.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.crud.demo.entities.student;

public interface studentRepositories extends JpaRepository<student, Long> {

}
