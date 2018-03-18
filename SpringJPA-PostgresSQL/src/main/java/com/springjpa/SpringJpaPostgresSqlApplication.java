package com.springjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springjpa.repo.CustomerRepository;



@SpringBootApplication
public class SpringJpaPostgresSqlApplication implements CommandLineRunner {

	@Autowired
	CustomerRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaPostgresSqlApplication.class, args);
	}
	@Override
	public void run(String... arg0) throws Exception {
		// clear all record if existed before do the tutorial with new data 
		repository.deleteAll();
	}
}
