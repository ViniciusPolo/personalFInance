package com.example.personalFinance;

import main.Main;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonalFinanceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PersonalFinanceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var main = new Main();
		main.hello();
	}
}
