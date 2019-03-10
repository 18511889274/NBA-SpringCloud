package com.cyl.nbafeign.rpc;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 编写访问rpc的方法，使用feign调用更加简便，添加@FeignClient注解即可，value的意思就是目标服务器，可以直接用yml中配置的application名称
 */
@FeignClient(value = "nab-ribbon-consumer")
public interface GetNbaTeam {
    @RequestMapping(value = "/hello?name=feign",method = RequestMethod.GET)
    public String sayHello();
}
