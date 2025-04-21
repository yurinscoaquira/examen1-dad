package com.mycj.example.mycjconfigserve;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MycjConfigServeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MycjConfigServeApplication.class, args);
    }

}
