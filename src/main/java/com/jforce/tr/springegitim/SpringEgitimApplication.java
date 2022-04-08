package com.jforce.tr.springegitim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.jforce.tr"} )
public class SpringEgitimApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEgitimApplication.class, args);
	}

}
