package br.marlon.pontointeligente.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringApiRestCursoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringApiRestCursoApplication.class, args);
	}
}
