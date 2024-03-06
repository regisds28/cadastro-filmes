package com.filmes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.filmes.model")
public class CadastroFilmesApplication {

    public static void main(String[] args) {
        SpringApplication.run(CadastroFilmesApplication.class, args);
    }

}
