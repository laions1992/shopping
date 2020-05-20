package com.jl.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan({"com.jl.shopping"})
public class ShoppingApplication {


	public static void main(String[] args) {
		SpringApplication.run(ShoppingApplication.class, args);
	}

}
