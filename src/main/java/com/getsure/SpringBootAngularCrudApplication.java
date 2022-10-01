package com.getsure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.getsure"})
public class SpringBootAngularCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAngularCrudApplication.class, args);
	}

}
