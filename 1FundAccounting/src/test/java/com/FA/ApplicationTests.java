package com.FA;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.FA.Repository.BOCrepo;
import com.FA.entity.BOC;



@SpringBootTest
class ApplicationTests {

	@Autowired
	BOCrepo boCrepo;
	
	@Test
	void contextLoads() {
		BOC b =new BOC();
		b.setEmail("abc");
		b.setFirstname("abcd");
		b.setLastname("sathish");
		b.setTypeofaccount("demo");
		b.setEmail("sedededd");
		
		boCrepo.save(b);
		
	}

}
