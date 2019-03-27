package com.example.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:/customer.xml")
public class DubboapiApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboapiApplication.class, args);
    }

}
