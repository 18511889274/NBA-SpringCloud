package com.cyl.ribbon.nbaribbonservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient//注册服务
public class NbaRibbonServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NbaRibbonServiceApplication.class, args);
    }

    @Bean
    @LoadBalanced //表示开启负载均衡
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}