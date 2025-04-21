package com.mycj.example.mycjregistryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MycjRegistryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MycjRegistryServerApplication.class, args);
    }

}
