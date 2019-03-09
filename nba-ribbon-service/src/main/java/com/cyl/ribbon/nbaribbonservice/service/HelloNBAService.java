package com.cyl.ribbon.nbaribbonservice.service;

import org.springframework.stereotype.Service;

@Service
public class HelloNBAService {
    public String sayHello(){
        return "helloWorld"; // 提供一个hello World
    }
}
