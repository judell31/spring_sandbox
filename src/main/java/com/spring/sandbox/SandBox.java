package com.spring.sandbox;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = SandBox.class)
@EnableAsync
public class SandBox {

    public static void main(String[] args) {
        SpringApplication.run(SandBox.class, args);
    }
}
