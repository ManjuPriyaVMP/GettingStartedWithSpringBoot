package com.springcloud.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductMainEntryPoint {

	public static void main(String[] args) {
		SpringApplication.run(ProductMainEntryPoint.class, args);
		String string = "Welcome to main service";
		System.out.println(string);

	}

}
