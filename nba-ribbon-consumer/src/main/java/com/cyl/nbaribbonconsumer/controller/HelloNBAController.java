package com.cyl.nbaribbonconsumer.controller;

import com.cyl.nbaribbonconsumer.service.HelloNBAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloNBAController {
    @Autowired
    private HelloNBAService helloNBAService;
    @GetMapping("/hello")//get方式直接拿到参数  http://localhost:8802/hello?name=nba
//    @RequestMapping("/hello/{name}")//http://localhost:8802/hello/nba
//    public String sayHello(@PathVariable String name){
    public String sayHello(String name){
        return helloNBAService.sayHello() + "8803服务" + name;
    }
}
