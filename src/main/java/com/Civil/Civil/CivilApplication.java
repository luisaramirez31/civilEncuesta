package com.Civil.Civil;

import com.Civil.Civil.repository.UserRepository;
import com.Civil.Civil.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.Civil.Civil.*")
@ComponentScan(basePackages = { "com.Civil.Civil.*" })
@EntityScan("com.Civil.Civil.*")
@SpringBootApplication
public class CivilApplication{

	private UserRepository userRepository;
	private UserService userService;

	public CivilApplication(UserRepository userRepository, UserService userService) {
		this.userRepository = userRepository;
		this.userService = userService;
	}

	public static void main(String[] args) {
		SpringApplication.run(CivilApplication.class, args);
	}

}
