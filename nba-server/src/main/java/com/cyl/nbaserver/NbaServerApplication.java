package com.cyl.nbaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer//开启注册中心
@SpringBootApplication
public class NbaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NbaServerApplication.class, args);
    }

}
