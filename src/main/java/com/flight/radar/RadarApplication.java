package com.flight.radar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.flight")
public class RadarApplication {

	public static void main(String[] args) {
		SpringApplication.run(RadarApplication.class, args);
	}

}
