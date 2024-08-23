package br.com.joaoflix.joaoflix;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JoaoflixApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JoaoflixApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("funcionou");
	}
}
