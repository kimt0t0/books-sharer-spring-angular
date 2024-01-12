package com.kimdev.bookssharer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BooksSharerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooksSharerApplication.class, args);
	}

}
