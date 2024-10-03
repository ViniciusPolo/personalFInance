package com.example.personalFinance;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import service.GetApi;

@SpringBootApplication
public class PersonalFinanceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PersonalFinanceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Começou certo agora");
		var getData = new GetApi();
		System.out.println(getData.GetData());
		System.out.println(getData.GetNumber());

	}
}
