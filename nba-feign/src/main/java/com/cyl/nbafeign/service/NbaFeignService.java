package com.cyl.nbafeign.service;

import com.cyl.nbafeign.rpc.GetNbaTeam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NbaFeignService {
    @Autowired
    GetNbaTeam getNbaTeam;
    public String getNba(){
        String type ="通过feign方式调用8803服务";
        return getNbaTeam.sayHello()+" "+type;
    }

}
