package org.hangover;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HangOverApplication {
	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(HangOverApplication.class);
	    app.run(args);
	}

}
