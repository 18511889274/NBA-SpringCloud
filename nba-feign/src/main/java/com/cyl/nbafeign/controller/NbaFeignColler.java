package com.cyl.nbafeign.controller;

import com.cyl.nbafeign.service.NbaFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NbaFeignColler {

    @Autowired
    NbaFeignService nbaFeignService;
    @RequestMapping("/nba")
    public String getNbaTeam(){
        return nbaFeignService.getNba()+"火箭总冠军";
    }
}
