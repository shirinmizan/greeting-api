package com.example.greeting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.util.*;

//

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class GreetingApplication {

	public static void main(String[] args) {

		SpringApplication.run(GreetingApplication.class, args);
	}

//	@GetMapping("/welcome")
//	public String sayHi(){
//		return "Welcome to SpringBoot!";
//	}

}



