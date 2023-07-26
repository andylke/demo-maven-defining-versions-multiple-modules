package com.github.andylke.demo.foo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.github.andylke.demo.foo.data.FooData;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class FooService {
	
	public static void main(String[] args) {
		SpringApplication.run(FooService.class, args);
	}

	@Autowired
	private FooData fooData;
	
	@PostConstruct
	void postConstruct() {
		fooData.print();
	}
}
