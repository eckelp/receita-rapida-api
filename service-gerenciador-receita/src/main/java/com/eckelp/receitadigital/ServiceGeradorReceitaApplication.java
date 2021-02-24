package com.eckelp.receitadigital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class ServiceGeradorReceitaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceGeradorReceitaApplication.class, args);
    }

}
