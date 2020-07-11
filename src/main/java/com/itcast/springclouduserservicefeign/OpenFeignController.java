package com.itcast.springclouduserservicefeign;

import com.itcast.springclouduserservicefeign.OrderServiceFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class OpenFeignController {


    @Autowired
    OrderServiceFeignClient orderServiceFeignClient;

    @RequestMapping("/test")
    public String test(){
        return orderServiceFeignClient.getAllOrder();
    }
}
