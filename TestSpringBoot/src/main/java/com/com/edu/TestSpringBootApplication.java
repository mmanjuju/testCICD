package com.com.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringBootApplication.class, args);
		}
	
	@GetMapping
	public String hello() {
		return "오늘은 2024년 2월 23일이고 나는 시험보는 중( •̀ .̫ •́ )✧";

	}

}
