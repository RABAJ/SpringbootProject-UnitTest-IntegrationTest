package com.example.demo;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@Configuration
//@SpringBootApplication
//@ComponentScan(basePackages = {"com.example.demo.entity.*"})
//@EnableJpaRepositories(basePackages = "com.example.demo.repository.*")
//@EntityScan(basePackages = "com.example.demo.entity.*")
//@EnableAutoConfiguration(
//		exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
//@EnableJpaAuditing
public class IntegrationAndUnitTestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegrationAndUnitTestingApplication.class, args);
	}

}
