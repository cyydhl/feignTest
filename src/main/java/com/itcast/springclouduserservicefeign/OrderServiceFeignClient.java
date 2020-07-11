package com.itcast.springclouduserservicefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(value = "order-service",url = "http://localhost:8080")
public interface OrderServiceFeignClient {
    @GetMapping("/orders")
    String getAllOrder();
}
