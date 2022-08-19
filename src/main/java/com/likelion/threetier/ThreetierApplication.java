package com.likelion.threetier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class ThreetierApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThreetierApplication.class, args);
	}

	@GetMapping
	public List<String> Test() {
		return List.of("Hello", "World");
	}
}
