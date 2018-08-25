package com.example.demo001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Demo001Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo001Application.class, args);
    }
}
