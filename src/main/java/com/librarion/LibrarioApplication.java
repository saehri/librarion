package com.librarion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.librarion.*")
@EntityScan("com.librarion.*")
@EnableJpaRepositories(basePackages = "com.librarion.repository")
public class LibrarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibrarioApplication.class, args);

	}
}
