package com.javademoapp.springboot_war_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootWarAppApplication {

    @GetMapping("/greeting")
    public  String greeting()
    {
        return "Spring Boot war demo";
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWarAppApplication.class, args);
	}

}
