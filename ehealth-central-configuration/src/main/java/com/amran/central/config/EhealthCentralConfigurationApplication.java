package com.amran.central.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
//@EnableDiscoveryClient
@SpringBootApplication
public class EhealthCentralConfigurationApplication {

    public static void main(String[] args) {
        SpringApplication.run(EhealthCentralConfigurationApplication.class, args);
    }

}
