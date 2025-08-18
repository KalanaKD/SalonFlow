package com.kd.SalonFlow;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SalonFlowApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalonFlowApplication.class, args);
		System.out.println("hello database");
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
