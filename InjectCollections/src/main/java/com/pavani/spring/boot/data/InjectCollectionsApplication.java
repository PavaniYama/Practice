package com.pavani.spring.boot.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InjectCollectionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(InjectCollectionsApplication.class, args);
	}
	@Bean
	public List<String>courseList(){
		return Arrays.asList("java","sprinboot","python");
	}
}
