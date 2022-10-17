package com.amigoscode.apigw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApiGW {
    public static void main(String[] args) {
        SpringApplication.run(ApiGW.class,args);
    }
}