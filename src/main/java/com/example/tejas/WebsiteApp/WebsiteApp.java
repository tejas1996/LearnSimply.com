package com.example.tejas.WebsiteApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing

public class WebsiteApp {

	public static void main(String[] args) {
		SpringApplication.run(WebsiteApp.class, args);

		System.out.println("Yo there");

	}
}
