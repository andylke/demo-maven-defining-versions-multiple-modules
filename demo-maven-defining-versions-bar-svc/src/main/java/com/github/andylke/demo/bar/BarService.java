package com.github.andylke.demo.bar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.andylke.demo.bar.data.BarData;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class BarService {
	
	public static void main(String[] args) {
		SpringApplication.run(BarService.class, args);
	}

	@Autowired
	private BarData barData;
	
	@PostConstruct
	void postConstruct() {
		barData.print();
	}
}
