package com.pavani.spring.boot.data;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class InjectCollectionsApplicationTests {
	@Autowired
	List<String>courseList;
	

	@Test
	void contextLoads() {
		System.out.println(courseList);
	}

}
