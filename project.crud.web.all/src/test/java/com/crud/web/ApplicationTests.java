package com.crud.web;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.crud.web.entities.Student;
import com.crud.web.repositories.StudentRepositories;

@SpringBootTest
class ApplicationTests {
	@Autowired
	StudentRepositories studentRepo;

//	@Test
//	void insert() {
//		Student s=new Student();
//		s.setFirstname("sathvik");
//		s.setCity("bangalore");
//		studentRepo.save(s);
//		
//	}
	@Test
	void fetch() {
		Optional<Student> findById = studentRepo.findById(1L);
		Student s=findById.get();
		System.out.println(s.getCity());
	}

}
