package com.itcast.springclouduserservicefeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringCloudUserServiceFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudUserServiceFeignApplication.class, args);
    }

}
