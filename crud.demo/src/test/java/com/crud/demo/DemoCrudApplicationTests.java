package com.crud.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;

import com.crud.demo.entities.student;
import com.crud.demo.repositories.studentRepositories;


@SpringBootTest
class DemoCrudApplicationTests {
	
	@Autowired
	studentRepositories studentrepo;

	@Test
//	void insertstudents() {
//		student student=new student();
//		student.setFirstname("rani");
//		student.setLastname("sathish");
//		student.setCity("bangalore");
//		studentrepo.save(student);
//	}
	void delet() {
		List<student> findAll = studentrepo.findAll();
		for (student student : findAll) {
			System.out.println(student.getFirstname());
			System.out.println(student.getLastname());
			System.out.println(student.getCity());
			
		}
	}

}
