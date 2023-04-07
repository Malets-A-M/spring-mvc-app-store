package ru.malets.spring.store.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("ru.malets.spring.store")
public class SpringMvcAppStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcAppStoreApplication.class, args);
    }

}
