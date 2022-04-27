package com.example.clientregistryfound;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClientRegistryFoundApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientRegistryFoundApplication.class, args);
    }

}
