package com.azzure_deploment.azzure_apps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzzureAppsApplication {

	@GetMapping("/message")
	public String message(){
		return "Hey shashank you deployed succusfully in azzure !";
	}

	public static void main(String[] args) {
		SpringApplication.run(AzzureAppsApplication.class, args);
	}

}
