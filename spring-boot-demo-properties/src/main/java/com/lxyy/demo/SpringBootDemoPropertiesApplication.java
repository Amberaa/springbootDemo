package com.lxyy.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@SpringBootApplication
public class SpringBootDemoPropertiesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoPropertiesApplication.class, args);
    }

}
