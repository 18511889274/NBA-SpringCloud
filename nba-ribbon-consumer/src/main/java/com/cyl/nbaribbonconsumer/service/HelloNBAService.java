package com.cyl.nbaribbonconsumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloNBAService {
    @Autowired
    RestTemplate restTemplate;//restTemplate掉8802端口
    public String sayHello(){
        return restTemplate.getForObject("http://nba-ribbon-provider/hello?name=nba",String.class);//nba-ribbon-provider是eureka里的注册名
    }
}
