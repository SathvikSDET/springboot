package com.crud.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.web.entities.Student;

public interface StudentRepositories extends JpaRepository<Student, Long> {

}
